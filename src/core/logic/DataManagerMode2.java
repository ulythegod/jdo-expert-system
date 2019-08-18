package core.logic;

import core.data.*;
import core.data.storage.StorageManager;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Author: Skosyreva Maria
 * Date: 20.08.2016
 * Time: 10:49
 *
 * Класс содержит методы получения данных и знаний для реализации бизнес-логики
 * модуля Формирования пакетов адаптивных технологий
 * в Режиме 2 - Обработка поля севооборота и Режиме 3 - Обработка севооборота;
 * является наследником DataManager
 */
public class DataManagerMode2 extends DataManager {
    private String status_finished;
    private String status_unfinished;

    /**
     *
     * @param sm Объект, позволяющий оперировать запросами к базе данных
     * @param status_finished Статус "Завершено" (м.б.другое название в зависимости от языка)
     * @param status_unfinished Статус "Не завершено" (м.б.другое название в зависимости от языка)
     */

    public DataManagerMode2(StorageManager sm, String status_finished, String status_unfinished) {
        super(sm);
        this.status_finished = status_finished;
        this.status_unfinished = status_unfinished;
    }

    /**
     * Возвращает обозначение статуса "Завершено"
     * @return Статус "Завершено"
     */
    public String getStatus_finished() {
        return status_finished;
    }

    /**
     * Возвращает обозначение статуса "Не завершено"
     * @return Статус "Не завершено"
     */
    public String getStatus_unfinished() {
        return status_unfinished;
    }
    /*Получаем необработанные в выбранном решении c/o хозяйства*/

    /**
     * Возвращает коллекцию объектов "Севообороты хозяйства", для севооборотов в которой
     * в заданном решении ещё не созданы результаты.
     * Вызывается в Режиме 3 - Обработка севооборота
     * @param solution Решение по хозяйству
     * @return Коллекция севооборотов хозяйства
     */
    public Collection<CropRotationOfAgriculture> getUnprocessedCropRotationsMode3(SolutionMode2 solution){
        ArrayList<CropRotationOfAgriculture> rotsUnproc = new ArrayList<CropRotationOfAgriculture>();

        Collection<ResultCropRotationMode2> resCRs = sm.findByField(ResultCropRotationMode2.class, "solution", solution, "==");
        for(ResultCropRotationMode2 resCR : resCRs){
            if(resCR.getStatus().equals(status_unfinished)) {
                if(resCR.getResultsMode2().size() == 0)
                    rotsUnproc.add(resCR.getCropRotationOfAgriculture());
            }
        }

        return rotsUnproc;
    }

    /**
     * Возвращает коллекцию объектов "Поле хозяйства", для полей в которой
     * в заданном решении ещё не созданы результаты.
     * @param solution Решение по хозяйству
     * @param cr Севооборот хозяйства (null в Режиме 2 - Обработка поля севооборота)
     * @return Коллекция полей хозяйства
     */
    public Collection<AgricultureField> getUnprocessedFields(SolutionMode2 solution, CropRotationOfAgriculture cr){
        ArrayList<AgricultureField> fieldsUnproc = new ArrayList<AgricultureField>();

        Collection<ResultCropRotationMode2> resCRs = sm.findByField(ResultCropRotationMode2.class, "solution", solution, "==");
        if(cr == null) { //если вызывается из Режима 2
            for(ResultCropRotationMode2 resCR : resCRs){
                if(resCR.getStatus().equals(status_unfinished)){   //перебираем только незавершенные с/о - в завершенных точно нет необр.полей
                    Collection<ResultMode2> fieldsProc = resCR.getResultsMode2();
                    Collection<AgricultureField> fieldsAll = getCropRotationFields(resCR.getCropRotationOfAgriculture());
                    ArrayList<AgricultureField> fProc = new ArrayList<AgricultureField>();
                    for(ResultMode2 r : fieldsProc)
                        fProc.add(r.getAgricultureField());
                    for(AgricultureField f: fieldsAll)
                        if(!fProc.contains(f))
                            fieldsUnproc.add(f);
                }
            }
            return fieldsUnproc;
        }
        //В Режиме 3 не нужно перебирать все незавер.с/о, нужен только тот, что на входе
        ResultCropRotationMode2 resCR = null;
        for(ResultCropRotationMode2 r : resCRs){
            if(r.getCropRotationOfAgriculture().equals(cr)){
                resCR = r;
                break;
            }
        }
        Collection<ResultMode2> fieldsProc = sm.findByField(ResultMode2.class, "resultCropRotation", resCR, "==");
        Collection<AgricultureField> fieldsAll = getCropRotationFields(cr);
        ArrayList<AgricultureField> fProc = new ArrayList<AgricultureField>();
        for(ResultMode2 r : fieldsProc)
            fProc.add(r.getAgricultureField());
        for(AgricultureField f: fieldsAll)
            if(!fProc.contains(f))
                fieldsUnproc.add(f);
        return fieldsUnproc;
    }

    /**
     * Выполняет проверку активности заданного севооборота:
     * севооборот - активен, если дата его начала + длительность не меньше текущей даты
     * @param cropRotation Севооборот хозяйства
     * @return true - севооборот активен; false - севооборот неактивен
     */
    public static boolean isActiveCropRotation(CropRotationOfAgriculture cropRotation){
        String today = new SimpleDateFormat("yyyy").format(new Date());
        int startYear = cropRotation.getStartYearCropRotationOfAgriculture();
        int length = cropRotation.getCropRotation().getLengthOfTheCycleCropRotation();
        if((startYear + length) >= Integer.parseInt(today))
            return true;
        return false;

    }

    /**
     * Возвращает коллекцию объектов "Севообороты хозяйства", в которой все севообороты активны
     * @param agriculture Хозяйство
     * @return Коллекция севооборотов хозяйства
     */
    public Collection<CropRotationOfAgriculture> getActiveCropRotations(Agricultures agriculture){
        /*Получаем все севообороты хозяйства*/
        Collection<CropRotationOfAgriculture> cropRotations = sm.findByField(CropRotationOfAgriculture.class, "agriculture", agriculture, "==");
        /*Выбираем активные севообороты*/
        ArrayList<CropRotationOfAgriculture> activeCR = new ArrayList<CropRotationOfAgriculture>();
        for(CropRotationOfAgriculture cr : cropRotations)
            if(isActiveCropRotation(cr))
                activeCR.add(cr);
        return activeCR;
    }

    /**
     * Возвращает объект "Севооборот хозяйства" по идентификатору из списка доступных севооборотов
     * @param r Коллекция севооборотов хозяйства
     * @param value Идентификатор севооборота
     * @return Севооборот хозяйства
     */
    public static CropRotationOfAgriculture getCropRotationAgriculture(Collection<CropRotationOfAgriculture> r, Object value){
        for(CropRotationOfAgriculture cr : r)
            if(Integer.toString(cr.getCropRotationOfAgricultureId()).equals(value))
                return cr;
        return null;
    }

    /**
     * Возвращает значение площади (в гектарах), которую занимают поля, входящие в севооборот
     * @param fields Коллекция полей хозяйства
     * @return Площадь (га)
     */
    public static float getAreaCropRotation(Collection<AgricultureField> fields){
        float area = 0;
        for(AgricultureField f : fields)
            area += f.getArea();
        return area;
    }

    /**
     * Возвращает объект "Севооборот хозяйства", к которому относится заданное поле
     * @param field Поле хозяйства
     * @return Севооборот хозяйства
     */
    public CropRotationOfAgriculture getCropRotationOfField(AgricultureField field){
        Collection<CropRotationOfAgriculture_2_AgricultureField> rToF = sm.findByField(CropRotationOfAgriculture_2_AgricultureField.class,
                "agricultureField", field, "==");

        for(CropRotationOfAgriculture_2_AgricultureField r : rToF ) {
            if(isActiveCropRotation(r.getCropRotationOfAgriculture()))
                return r.getCropRotationOfAgriculture();
        }
        return null;
    }

    /**
     * Возвращает коллекцию объектов "Поля хозяйства", в которой поля входят в состав заданного севооборота
     * @param cropRotation Севооборот хозяйства
     * @return Коллекция полей хозяйства
     */
    public Collection<AgricultureField> getCropRotationFields(CropRotationOfAgriculture cropRotation){
        Collection<CropRotationOfAgriculture_2_AgricultureField> rToF =  sm.findByField(CropRotationOfAgriculture_2_AgricultureField.class,
                "cropRotationOfAgriculture", cropRotation, "==");
        ArrayList<AgricultureField> fields = new ArrayList<AgricultureField>();
        for(CropRotationOfAgriculture_2_AgricultureField f : rToF)
            fields.add(f.getAgricultureField());
        return fields;
    }

    /**
     * Возвращает объект "Тип почвы", который является основным для заданных полей
     * (т.е. характерен для большинства полей в наборе)
     * @param fields Поля хозяйства с основным типом почвы
     * @param othersFields Поля хозяйства с неосновным типом почвы
     * @return Основной тип почвы
     */
    public static TypeOfSoil getTypesSoilOfFields(Collection<AgricultureField> fields, Collection<AgricultureField> othersFields){
        /*Выделяем уникальные типы земли на участках*/
        HashSet<TypeOfSoil> uniqueTypesSoil = new HashSet<TypeOfSoil>();
        for(AgricultureField f : fields)
            uniqueTypesSoil.add(f.getTypeOfSoil());
        /*Считаем, какой из типов земли встречается чаще - это будет основной тип земли для всего севооборота*/
        int count = 0, max = 0; TypeOfSoil mainTypeSoil = null;
        for(TypeOfSoil t : uniqueTypesSoil){
            for(AgricultureField f : fields) {
                if (f.getTypeOfSoil().equals(t))
                    count++;
            }
            if(count > max){
                max = count;
                count = 0;
                mainTypeSoil = t;
            }
        }
        /*Формируем список полей, для который тип земли отличен от основного
        * Проверка нужна, если в с/о более 1 уникального типа земли*/
        if(uniqueTypesSoil.size() > 1){
            for(AgricultureField f : fields)
                if(!f.getTypeOfSoil().equals(mainTypeSoil))
                    othersFields.add(f);
        }
        return mainTypeSoil;
    }


    /**
     * Возврашает коллекцию объектов "Предшественники" по схеме севооборота
     * @param cropRotation Севооборот хозяйства
     * @param year Год расчёта
     * @return Коллекция предшественников
     */
    public Collection<Predecessor> getPredecessors(CropRotationOfAgriculture cropRotation, int year) {

        List<CropRotationToGroupOfCropsToYear> schema = (List)sm.findByField(CropRotationToGroupOfCropsToYear.class, "cropRotation", cropRotation.getCropRotation(), "==");
        int startYear = cropRotation.getStartYearCropRotationOfAgriculture();
        int length = schema.get(0).getCropRotation().getLengthOfTheCycleCropRotation();

        int number = year - startYear - 1;
        if(year == startYear)
            number = length - 1;
        while(number >= length)
            number -= length;
        HashSet<Predecessor> predecessors = new HashSet<Predecessor>();
        Collection<Crop> crops = schema.get(number).getGroupOfCrops().getCrop();
        for(Crop c : crops)
            predecessors.add(c.getPredecessor());
        return predecessors;
    }

    /**
     * Возврашает коллекцию объектов "Сорта" по схеме севооборота и доступные хозяйству
     * @param cropRotation Севооборот хозяйства
     * @param year Год расчёта
     * @param agriculture Хозяйство
     * @return Коллекция сортов
     */
    public Collection<GradeOfCrop> getGradesOfCrops(CropRotationOfAgriculture cropRotation, int year, Agricultures agriculture) {
        Collection<GradeOfCrop_2_Agriculture> gradesAgr = sm.findByField(GradeOfCrop_2_Agriculture.class, "agriculture", agriculture, "==");

        List<CropRotationToGroupOfCropsToYear> schema = (List)sm.findByField(CropRotationToGroupOfCropsToYear.class, "cropRotation", cropRotation.getCropRotation(), "==");
        int startYear = cropRotation.getStartYearCropRotationOfAgriculture();
        int length = schema.get(0).getCropRotation().getLengthOfTheCycleCropRotation();

        int number = year - startYear;
        while(number >= length)
            number -= length;

        Collection<Crop> crops = schema.get(number).getGroupOfCrops().getCrop();
        ArrayList<GradeOfCrop> result = new ArrayList<GradeOfCrop>();
        for(Crop c : crops) {
            Collection<GradeOfCrop> grades= c.getGradeOfCrop();
            for(GradeOfCrop grade : grades)
                for(GradeOfCrop_2_Agriculture gradeA : gradesAgr)
                    if(grade.equals(gradeA.getGradeOfCrop()))
                        result.add(gradeA.getGradeOfCrop());
        }
        return result;
    }

    /**
     * Возвращает коллекцию объектов "Решения по хозяйству" для заданного хозяйства
     * @param agriculture Хозяйство
     * @return Коллекция решений по хозяйству
     */
    public Collection<SolutionMode2> getSolutionsAgriculture(Agricultures agriculture){
        return sm.findByField(SolutionMode2.class, "agriculture", agriculture, "==");
    }

    /**
     * Возвращает коллекцию объектов "Решения по хозяйству" для активной земельной базы хозяйства
     * @param landBase Земельная база
     * @return Коллекция решений по хозяйству
     */
    public Collection<SolutionMode2> getSolutionsAgriculture(LandBase landBase){
        return sm.findByField(SolutionMode2.class, "landBase", landBase, "==");
    }
    /**
     * Возвращает коллекцию объектов "Решения для хозяйства", где решения имеют статус незавершенных
     * @param agriculture Хозяйство
     * @return Коллекция решений по хозяйству
     */
    public Collection<SolutionMode2> getUnfineshedSolutionsMode2(Agricultures agriculture){
        Collection<SolutionMode2> solutions = sm.findByField(SolutionMode2.class, "agriculture", agriculture, "==");
        ArrayList<SolutionMode2> result = new ArrayList<SolutionMode2>();
        for(SolutionMode2 s : solutions)
            if(s.getStatus().equals(status_unfinished))
                result.add(s);
        return result;
    }

    /**
     * Возвращает коллекцию объектов "Решения для хозяйства" из активной земельной базы,
     * где решения имеют статус незавершенных
     * @param landBase Земельная база
     * @return Коллекция решений по хозяйству
     */
    public Collection<SolutionMode2> getUnfineshedSolutionsMode2(LandBase landBase){
        Collection<SolutionMode2> solutions = sm.findByField(SolutionMode2.class, "landBase", landBase, "==");
        ArrayList<SolutionMode2> result = new ArrayList<SolutionMode2>();
        for(SolutionMode2 s : solutions)
            if(s.getStatus().equals(status_unfinished))
                result.add(s);
        return result;

    }

    /**
     *  Возвращает объект "Решение по хозяйству" по идентификатору из списка решений хозяйства
     * @param solutions Коллекция решений по хозяйству
     * @param value Идентификатор решения
     * @return Решение по хозяйству
     */
    public SolutionMode2 getSolutionMode2(Collection<SolutionMode2> solutions, String value){
        for(SolutionMode2 s : solutions)
            if(Integer.toString(s.getSolutionMode2Id()).equals(value))
                return s;
        return null;
    }

    /**
     * Выполняет подсчёт затрат по разрабатываемому результату для поля (в рублях) в
     * @param r Результат для поля (режим 1)
     * @param kInf Коэффициент инфляции
     * @param costSeeds стоимость семян (руб/га)
     * @param costMainPr стоимость основной обработки (руб/га)
     * @param costPresPr стоимость предпосевной обработки (руб/га)
     * @param costCare стоимость ухода за посевами (руб/га)
     * @param costHarv стоимость уборки (руб/га)
     * @param costFert стоимость применения удобрений (руб/га)
     * @param costProdFert стоимость сырья для удобрения (руб/га)
     * @param costChem стоимость химической защиты (руб/га)
     * @param costMatChem стоимость сырья для химической защиты (руб/га)
     */
    public void countCostsMode2(ResultMode2 r, float kInf, float costSeeds, float costMainPr, float costPresPr, float costCare,
                                float costHarv, float costFert, float costProdFert, float costChem, float costMatChem){
        float area = r.getAgricultureField().getArea();
        r.setkInf(kInf);
            /*ФАКТИЧЕСКИЙ ВЫБОР*/
        /*Стоимость семян*/
        r.setSeedsCost(costSeeds * kInf * area);
        /*Стоимость основной обработки*/
        r.setMainPCost(costMainPr * kInf * area);
        /*Стоимость предпосевной обработки*/
        r.setPrePCost(costPresPr * kInf * area);
        /*Стоимость ухода*/
        r.setCareCost(costCare * kInf * area);
        /*Стоимость уборки*/
        r.setHarvCost(costHarv * kInf * area);
        /*Стоимость удобрения*/
        r.setFertCost(costFert * kInf * area);
            /*на интенсивном и нормальном уровнях к затратам прибавляются доп.стоимости*/
        r.setFertCost(r.getFertCost() + costProdFert * kInf * area);
        /*Стоимость химической защиты*/
        r.setChemCost(costChem * kInf * area);
        r.setChemCost(r.getChemCost() + costMatChem * kInf * area);

        /*Суммируем затраты*/
        r.setCosts(r.getSeedsCost() + r.getMainPCost() + r.getPrePCost() + r.getCareCost() + r.getHarvCost() + r.getFertCost() + r.getChemCost());

            /*СТАНДАРТНАЯ ТЕХНОЛОГИЯ*/
        StandartTechnology s = r.getSt();
        Collection<CostOfSeed> costsSeedsSt = s.getGradeOfCrop().getCostOfSeed();
        for(CostOfSeed cost : costsSeedsSt)
            r.setSeedsCostSt(cost.getCostOfSeed() * kInf * area);
        /*Стоимость основной обработки*/
        Collection<CostOfMainProcessing> costsMainPSt = s.getMainProcessing().getCostOfMainProcessing();
        for(CostOfMainProcessing cost : costsMainPSt)
            r.setMainPCostSt(cost.getCostOfMainProcessing() * kInf * area);
        /*Стоимость предпосевной обработки*/
        Collection<CostOfPreseedingProcessingAndSowing> costsPrePSt = s.getPreseedingProcessingAndSowing().getCostOfPreseedingProcessingAndSowing();
        for(CostOfPreseedingProcessingAndSowing cost : costsPrePSt)
            r.setPrePCostSt(cost.getCostOfPreseedingProcessingAndSowing() * kInf * area);
        /*Стоимость ухода*/
        Collection<CostOfCareOfCrops> costsCareSt = s.getCareOfCrops().getCostOfCareOfCrops();
        for(CostOfCareOfCrops cost : costsCareSt)
            r.setCareCostSt(cost.getCostOfCareOfCrops() * kInf * area);
        /*Стоимость уборки*/
        Collection<CostOfHarvesting> costsHarvSt = s.getHarvesting().getCostOfHarvesting();
        for(CostOfHarvesting cost : costsHarvSt)
            r.setHarvCostSt(cost.getCostOfHarvesting() * kInf * area);
        /*Стоимость удобрения*/
        Collection<CostOfApplicationOfFertilizers> costsFertSt = s.getApplicationOfFertilizers().getCostOfApplicationOfFertilizers();
        Collection<CostOnProductionFertilizer> costsProductionSt = s.getGradeOfCrop().getCostOnProductionFertilizer();
        for(CostOfApplicationOfFertilizers cost : costsFertSt) {
            r.setFertCostSt(cost.getCostOfApplicationOfFertilizers() * kInf * area);
            break;
        }
            /*на интенсивном и нормальном уровнях к затратам прибавляются доп.стоимости*/
        for(CostOnProductionFertilizer cost : costsProductionSt){
            if(s.getLevelOfIntensification().getLevelOfIntensificationId() == 2)
                r.setFertCostSt(r.getFertCostSt() + cost.getCostOfFertilizerAtNormalLevel() * kInf * area);
            if(s.getLevelOfIntensification().getLevelOfIntensificationId() == 3)
                r.setFertCostSt(r.getFertCostSt() + cost.getCostOfFertilizerAtIntensiveLevel() * kInf * area);
        }
        /*Стоимость химической защиты*/
        Collection<CostOfChemicalProtectionOfCrops> costsChemSt = s.getChemicalProtectionOfCrops().getCostOfChemicalProtectionOfCrops();
        Collection<CostOfRawMaterialForChemicalProtection> costsMaterialSt = s.getChemicalProtectionOfCrops().getCostOfRawMaterialForChemicalProtection();
        for(CostOfChemicalProtectionOfCrops cost : costsChemSt)
            r.setChemCostSt(cost.getCostOfChemicalProtectionOfCrops() * kInf * area);;
        for(CostOfRawMaterialForChemicalProtection cost : costsMaterialSt)
            r.setChemCostSt(r.getChemCostSt() + cost.getCostOfRawMaterialForChemicalProtection() * kInf * area);

        /*Суммируем затраты*/
        r.setCostsSt(r.getSeedsCostSt() + r.getMainPCostSt() + r.getPrePCostSt() + r.getCareCostSt() + r.getHarvCostSt() + r.getFertCostSt() + r.getChemCostSt());
    }


    /**
     * Выполняет обновление результата для севооборота в таблице results_crop_rotations базы данных
     * при добавлении нового результата для поля в составе этого севооборота.
     * Вызывается в Режиме 2 - Обработка поля севооборота
     * @param resultCR Результат для севооборота
     * @param r Результат для поля
     */
    public void updateResultCropRotationMode2(ResultCropRotationMode2 resultCR, ResultMode2 r){
        String[] strings = {"prod", "income", "costs", "prodSt", "incomeSt", "costsSt",
                "status", "fieldsProc", "fieldsUnproc", "resultsMode2"};

        ResultCropRotationMode2 resultNew = new ResultCropRotationMode2();
        resultNew.setFieldsProc(resultCR.getFieldsProc() + Integer.toString(r.getAgricultureField().getFieldNumber()) + " ");

       /* Collection<ResultMode2> resultsFields = resultCR.getResultsMode2();
        ArrayList<ResultMode2> newResultsFields = new ArrayList<ResultMode2>();
        for(ResultMode2 rF : resultsFields)
            newResultsFields.add(rF);
        newResultsFields.add(r);
        resultNew.setResultsMode2(newResultsFields);*/
        Collection<ResultMode2> newResultsFields = sm.findByField(ResultMode2.class, "resultCropRotation", resultCR, "==");
        resultNew.setResultsMode2(newResultsFields);

        ArrayList<AgricultureField> fieldsProc = new ArrayList<AgricultureField>();
        for(ResultMode2 res : newResultsFields)
            fieldsProc.add(res.getAgricultureField());

        Collection<AgricultureField> fields = getCropRotationFields(resultCR.getCropRotationOfAgriculture());
        for(AgricultureField f : fields)
            if((!fieldsProc.contains(f) && (!f.equals(r.getAgricultureField()))))
                resultNew.setFieldsUnproc(resultNew.getFieldsUnproc() + Integer.toString(f.getFieldNumber()) + " ");

        resultNew.setCropRotationOfAgriculture(resultCR.getCropRotationOfAgriculture());
        resultNew.setProd(resultCR.getProd() + r.getProd());
        resultNew.setIncome(resultCR.getIncome() + r.getIncome());
        resultNew.setCosts(resultCR.getCosts() + r.getCosts());
        resultNew.setProdSt(resultCR.getProdSt() + r.getProdSt());
        resultNew.setIncomeSt(resultCR.getIncomeSt() + r.getIncomeSt());
        resultNew.setCostsSt(resultCR.getCostsSt() + r.getCostsSt());
        System.out.println("CHECK STATUS:\n\tfieldsProc: " + newResultsFields.size() + "\n\tfieldsAll:" + resultCR.getFieldsAll());
        if(newResultsFields.size() == resultCR.getFieldsAll())
            resultNew.setStatus(status_finished);
        else
            resultNew.setStatus(status_unfinished);

        sm.update(resultCR, resultNew, strings);
    }

    /**
     * Выполняет сохранение результата для севооборота в таблице results_crop_rotations базы данных
     * @param resultCR Результат по севообороту
     * @param fields Коллекция результатов для полей в севообороте
     */
    public void updateResultCropRotationMode3(ResultCropRotationMode2 resultCR, Collection<ResultMode2> fields){
        String [] params = {"prod", "income", "costs", "prodSt", "incomeSt", "costsSt",
                "area", "fieldsAll", "fieldsProc", "fieldsUnproc", "status", "resultsMode2"};
        ResultCropRotationMode2 r = new ResultCropRotationMode2(resultCR.getCropRotationOfAgriculture(), resultCR.getSolution(), status_unfinished);
        String fieldsProc = "";

        for(ResultMode2 f : fields){
            fieldsProc += f.getAgricultureField().getFieldNumber() + " ";

            r.setProd(r.getProd() + f.getProd());
            r.setIncome(r.getIncome() + f.getIncome());
            r.setCosts(r.getCosts() + f.getCosts());

            r.setProdSt(r.getProdSt() + f.getProdSt());
            r.setIncomeSt(r.getIncomeSt() + f.getIncomeSt());
            r.setCostsSt(r.getCostsSt() + f.getCostsSt());

        }
        r.setArea(resultCR.getArea());
        r.setFieldsAll(resultCR.getFieldsAll());
        r.setFieldsProc(fieldsProc);
        r.setFieldsUnproc(resultCR.getFieldsUnproc());
        System.out.println("CHECK STATUS:\n\tfieldsProc: " + fields.size() + "\n\tfieldsAll:" + resultCR.getFieldsAll());
        if(fields.size() == resultCR.getFieldsAll())
            r.setStatus(status_finished);
        r.setResultsMode2(fields);

        sm.update(resultCR, r, params);

    }

    /**
     * Выполняет обновление результата для севооборота в таблице results_crop_rotations базы данных
     * при добавлении новых результатов для поля в составе этого севооборота.
     * Вызывается в Режиме 3 - Обработка севооборота - Дополнение
     * @param resultCR
     * @param newFields
     * @param otherFields
     */
    public void updateResultCropRotationMode3Edit(ResultCropRotationMode2 resultCR, Collection<ResultMode2> newFields, Collection<AgricultureField> otherFields){
        String [] params = {"prod", "income", "costs", "prodSt", "incomeSt", "costsSt",
                "fieldsProc", "fieldsUnproc", "status", "resultsMode2"};
        ResultCropRotationMode2 r = new ResultCropRotationMode2(resultCR.getCropRotationOfAgriculture(), resultCR.getSolution(), status_unfinished);
        String fieldsProc = "", fieldsUnproc = "";
        for(AgricultureField f : otherFields)
            fieldsUnproc += f.getFieldNumber() + " ";
        for(ResultMode2 f : newFields){
            fieldsProc += f.getAgricultureField().getFieldNumber() + " ";

            r.setProd(r.getProd() + f.getProd());
            r.setIncome(r.getIncome() + f.getIncome());
            r.setCosts(r.getCosts() + f.getCosts());

            r.setProdSt(r.getProdSt() + f.getProdSt());
            r.setIncomeSt(r.getIncomeSt() + f.getIncomeSt());
            r.setCostsSt(r.getCostsSt() + f.getCostsSt());

        }
        r.setFieldsProc(resultCR.getFieldsProc() + " " + fieldsProc);
        r.setFieldsUnproc(fieldsUnproc);

        /*ArrayList<ResultMode2> resultsFields = new ArrayList<ResultMode2>();
        Collection<ResultMode2> oldFields = sm.findByField(ResultMode2.class,
                "resultCropRotation", resultCR, "==");
        for (ResultMode2 f : oldFields)
            resultsFields.add(f);
        for(ResultMode2 f : newFields)
            resultsFields.add(f);*/
        Collection<ResultMode2> resultsFields = sm.findByField(ResultMode2.class,
                "resultCropRotation", resultCR, "==");
        r.setResultsMode2(resultsFields);
        System.out.println("CHECK STATUS:\n\tfieldsProc: " + resultsFields.size() + "\n\tfieldsAll:" + resultCR.getFieldsAll());
        if(resultsFields.size() == resultCR.getFieldsAll())
            r.setStatus(status_finished);
        sm.update(resultCR, r, params);

    }

    /**
     * Выполняет обновление решения по хозяйству в таблицу solutions_mode2 базы данных
     * при добавлении нового результата по севообороту.
     * @param solution Решение по хозяйству
     * @param r Результат по севообороту
     */
    public void updateSolution(SolutionMode2 solution, ResultCropRotationMode2 r){
        String[] strings = {"prod", "income", "costs", "prodSt", "incomeSt", "costsSt", "status", "resultsCropRotation"};
        SolutionMode2 solutionNew = new SolutionMode2(status_unfinished);

        Collection<ResultCropRotationMode2> resCRs = sm.findByField(ResultCropRotationMode2.class,
                "solution", solution, "==");
        ArrayList<ResultCropRotationMode2> newResCRs = new ArrayList<ResultCropRotationMode2>();
        for (ResultCropRotationMode2 rCR : resCRs) {
            if (rCR.getResultCropRotationMode2Id() == r.getResultCropRotationMode2Id()) {
                newResCRs.add(r);
                continue;
            }
            newResCRs.add(rCR);
        }
        solutionNew.setResultsCropRotation(newResCRs);

        solutionNew.setProd(solution.getProd() + r.getProd());
        solutionNew.setIncome(solution.getIncome() + r.getIncome());
        solutionNew.setCosts(solution.getCosts() + r.getCosts());
        solutionNew.setProdSt(solution.getProdSt() + r.getProdSt());
        solutionNew.setIncomeSt(solution.getIncomeSt() + r.getIncomeSt());
        solutionNew.setCostsSt(solution.getCostsSt() + r.getCostsSt());

        /*Если хотя бы один с/о не завершен, то и всё решение - не завершено*/
        for(ResultCropRotationMode2 cR : newResCRs) {
            if(cR.getStatus().equals(status_unfinished))
                break;
            solutionNew.setStatus(status_finished);
        }
        sm.update(solution, solutionNew, strings);
    }

    /**
     * Выполняет сохранение созданного результата для поля хозяйства в таблицу results_mode2 базы данных
     * @param result Результат для поля
     * @param kInf Коэффициент инфляции
     * @param costSeeds стоимость семян (руб/га)
     * @param costMainPr стоимость основной обработки (руб/га)
     * @param costPresPr стоимость предпосевной обработки (руб/га)
     * @param costCare стоимость ухода за посевами (руб/га)
     * @param costHarv стоимость уборки (руб/га)
     * @param costFert стоимость применения удобрений (руб/га)
     * @param costProdFert стоимость сырья для удобрения (руб/га)
     * @param costChem стоимость химической защиты (руб/га)
     * @param costMatChem стоимость сырья для химической защиты (руб/га)
     */
    public void saveResultMode2(ResultMode2 result, float kInf, float costSeeds, float costMainPr, float costPresPr, float costCare,
                                float costHarv, float costFert, float costProdFert, float costChem, float costMatChem){

        countCostsMode2(result, kInf, costSeeds, costMainPr, costPresPr, costCare, costHarv, costFert, costProdFert, costChem, costMatChem);
        sm.create(result);
    }

    /**
     * Выполняет удаление результатов по хозяйству из таблицы solutions_mode2 базы данных
     * @param solutions Коллекция решений по хозяйству
     */
    public void deleteSolutionsMode2(Collection<SolutionMode2> solutions){
        for(SolutionMode2 solution : solutions){
            Collection<ResultCropRotationMode2> resultsCR = sm.findByField(ResultCropRotationMode2.class,
                    "solution", solution, "==");
            for(ResultCropRotationMode2 resultCR : resultsCR){
                Collection<ResultMode2> results = sm.findByField(ResultMode2.class,
                        "resultCropRotation", resultCR, "==");
                for(ResultMode2 result : results)
                    sm.delete(result);
                sm.delete(resultCR);
            }
            sm.delete(solution);
        }

    }
}

package core.logic;

import core.data.*;
import core.data.storage.StorageManager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;


/**
 * Author: Skosyreva Maria
 * Date: 20.08.2016
 * Time: 10:40
 *
 * Класс содержит методы получения данных и знаний для реализации бизнес-логики
 * модуля Формирования пакетов адаптивных технологий в Режиме 1 - Обработка поля;
 * является наследником DataManager
 */
public class DataManagerMode1 extends DataManager {

    /**
     * Конструктор метода
     * @param sm Объект, позовляющий оперировать запросами к базе данных
     */
    public DataManagerMode1(StorageManager sm) {
        super(sm);
    }

    /*Получаем все сохраненные результаты для текущего хозяйства*/

    /**
     * Возвращает коллекцию объектов "Результат для поля - режим 1"
     * - содержит все сохранённые результаты по полями хозяйства
     * @param agriculture Хозяйство
     * @return Коллекция результатов по полям (режим 1)
     */
    public Collection<ResultMode1> getResultsAgriculture(Agricultures agriculture){
        ArrayList<ResultMode1> results = new ArrayList<ResultMode1>();
        Collection<AgricultureField> fields = sm.findByField(AgricultureField.class, "agriculture", agriculture, "==");

        for(AgricultureField field : fields){
            List<ResultMode1> result = (List)sm.findByField(ResultMode1.class, "agricultureField", field, "==");
            if(result.size() != 0)
                for(ResultMode1 r : result)
                    results.add(r);
        }
        return results;
    }

    /**
     * Возвращает коллекцию объектов "Результат для поля - режим 1"
     * - содержит все сохранённые результаты по полями хозяйства активной земельной базы
     * @param landBase Земельная база
     * @return Коллекция результатов по полям (режим 1)
     */
    public Collection<ResultMode1> getResultsAgriculture(LandBase landBase) {
        return sm.findByField(ResultMode1.class, "landBase", landBase, "==");
    }


    /*Получаем выбранный результат из списка всех*/

    /**
     * Возвращает объект "Результат для поля - режим 1" по идентификатору из списка всех резульатов по полям хозяйства
     * @param r Коллекция всех результатов по полям хозяйства
     * @param value Идентификатор результата
     * @return Результат для поля (режим 1)
     */
    public ResultMode1 getResultMode1(Collection<ResultMode1> r, Object value){
        for(ResultMode1 res : r)
            if(Integer.toString(res.getResultMode1Id()).equals(value))
                return res;
        return null;
    }

    /**
     * Возвращает коллекцию объектов "Предшественники"
     * @return Коллекция предшественников
     */
    public Collection<Predecessor> getAllPredecessors(){
        return sm.findAll(Predecessor.class);
    }

    /**
     * Возвращает объект "Предшественник" по схеме севооборота.
     * Вызывается, если был задан параметр "Предшественник неизвестен"
     * @param cropRotation Севооборот
     * @param groupOfCrops Группа культуры
     * @return Предшественник
     */
    public Predecessor getPredecessor(CropRotation cropRotation, GroupOfCrops groupOfCrops){
        List<CropRotationToGroupOfCropsToYear> schema = (List)sm.findByField(CropRotationToGroupOfCropsToYear.class, "cropRotation", cropRotation, "==");
        int number = 0, lenght = 0;

        for(CropRotationToGroupOfCropsToYear s: schema)
            if(s.getGroupOfCrops().equals(groupOfCrops)) {
                number = s.getNumber();
                lenght = s.getCropRotation().getLengthOfTheCycleCropRotation();
                break;
            }
        GroupOfCrops predGroup = null;
        if(number == 1)
            predGroup = schema.get(lenght - 1).getGroupOfCrops();
        else
            predGroup = schema.get(number - 2).getGroupOfCrops();

        Collection<Crop> predCrops = predGroup.getCrop();
        for(Crop crop : predCrops)
            return crop.getPredecessor();
        return null;
    }

    /**
     * Возвращает коллекцию объектов "Группа культур", которая доступна хозяйству
     * @param agriculture Хозяйство
     * @return Коллекция групп культр
     */
    public Collection<GroupOfCrops> getGroupsOfCrops(Agricultures agriculture){
        Collection<GroupOfCrops_2_Agriculture> groupsAgr = sm.findByField(GroupOfCrops_2_Agriculture.class, "agriculture", agriculture, "==");
        HashSet<GroupOfCrops> result = new HashSet<GroupOfCrops>();
        for(GroupOfCrops_2_Agriculture grA : groupsAgr)
            result.add(grA.getGroupOfCrops());
        return result;
    }

    /**
     * Возвращает объект "Группа культуры" по идентификатору из списка доступных хозяйству групп культур
     * @param r Коллекция групп культур
     * @param value Идентификатор группы культуры
     * @return Группа культуры
     */
    public GroupOfCrops getGroupOfCrops(Collection<GroupOfCrops> r, Object value){
        for(GroupOfCrops g : r)
            if(Integer.toString(g.getGroupOfCropsId()).equals(value))
                return g;
        return null;
    }

    /**
     * Возвращает объект "Группа культуры" по схеме севооборота и доступный хозяйству
     * Вызывается, если был задан параметр "Вхождение в севооборот - жёсткое"
     * @param cropRotation Севооборот
     * @param predecessor Предшественник
     * @param agriculture Хозяйство
     * @return Группа культуры
     */
    public GroupOfCrops getGroupOfCrops(CropRotation cropRotation, Predecessor predecessor, Agricultures agriculture){
        Collection<GroupOfCrops_2_Agriculture> gropsAgr = sm.findByField(GroupOfCrops_2_Agriculture.class, "agriculture", agriculture, "==");
        HashSet<GroupOfCrops> groupsOfCrops = new HashSet<GroupOfCrops>();
        for(GroupOfCrops_2_Agriculture g : gropsAgr)
            groupsOfCrops.add(g.getGroupOfCrops());

        List<CropRotationToGroupOfCropsToYear> schema = (List)sm.findByField(CropRotationToGroupOfCropsToYear.class, "cropRotation", cropRotation, "==");
        int number = 0, lenght = 0;

        for(CropRotationToGroupOfCropsToYear s: schema)
            if(s.getGroupOfCrops().equals(predecessor.getCrop().getGroupOfCrops())) {
                if (groupsOfCrops.contains(s.getGroupOfCrops())) {
                    number = s.getNumber();
                    lenght = s.getCropRotation().getLengthOfTheCycleCropRotation();
                    break;
                }
            }
        if(number == lenght)
            return schema.get(0).getGroupOfCrops();
        return schema.get(number).getGroupOfCrops();
    }

    /**
     * Возвращает коллекцию объектов "Севооборот" с учётом правил базы знаний
     * @param typeOfSoil Тип почвы
     * @param groupOfCrops Группа культуры
     * @return Коллекция севооборотов
     */
    public Collection<CropRotation> getCropRotations(TypeOfSoil typeOfSoil, GroupOfCrops groupOfCrops) {
        String[] fieldName = {"typeOfSoil", "groupOfCrops"};
        Object[] value = {typeOfSoil, groupOfCrops};
        String[] condition = {"==", "=="};

        Collection<CropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoil> r4 = sm.findByField(CropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoil.class,
                fieldName, value, condition);
        HashSet<CropRotation> result = new HashSet<CropRotation>();
        for(CropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoil r : r4){
            CropRotation cR = r.getCropRotation();
            result.add(cR);
        }
        return result;
    }

    /**
     * Возвращает объект "Севооборот" по идентификатору из списка доступных севооборотов
     * @param r4 Коллекция севооборотов
     * @param value Идентификатор севооборота
     * @return Севооборот
     */
    public CropRotation getCropRotation(Collection<CropRotation> r4, Object value){
        for(CropRotation c : r4)
            if(Integer.toString(c.getCropRotationId()).equals(value))
                return c;
        return null;
    }

    /**
     * Возвращает коллекцию объектов "Сорт", доступную хозяйству
     * @param groupOfCrops Группа культуры
     * @param agriculture Хозяйство
     * @return Коллекция сортов
     */
    public Collection<GradeOfCrop> getGradesOfCrops(GroupOfCrops groupOfCrops, Agricultures agriculture){
        Collection<GradeOfCrop_2_Agriculture> gradesAgr = sm.findByField(GradeOfCrop_2_Agriculture.class, "agriculture", agriculture, "==");

        HashSet<GradeOfCrop> result = new HashSet<GradeOfCrop>();

        Collection<Crop> crops = groupOfCrops.getCrop();
        for(Crop crop : crops){
            Collection<GradeOfCrop> grades = crop.getGradeOfCrop();
            for (GradeOfCrop grade : grades)
                for (GradeOfCrop_2_Agriculture gradeA : gradesAgr)
                    if (grade.equals(gradeA.getGradeOfCrop()))
                        result.add(gradeA.getGradeOfCrop());
        }
        return result;
    }

    /**
     * Выполняет подсчёт затрат по разрабатываемому результату для поля (в рублях).
     * Оценка записывается в поле costs объекта класса ResultMode1.
     * Также выполняется поиск стандартной технологии и соответсвующий подсчёт затрат
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
    public void countCostsMode1(ResultMode1 r, float kInf, float costSeeds, float costMainPr, float costPresPr, float costCare,
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
     * Выполняет сохранение созданного результата по полю хозяйства (режим 1) в таблицу results_mode1 базы данных
     * @param result Результат по полю
     */
    public void saveResultMode1(ResultMode1 result){
        sm.create(result);
    }

    /**
     * Выполняет удаление результатов по полю хозяйства из таблицы results_mode1 базы данных
     * @param results Коллекция результатов по полям (режим 1)
     */
    public void deleteResultMode1(Collection<ResultMode1> results){
        for(ResultMode1 result : results)
            sm.delete(result);
    }

}

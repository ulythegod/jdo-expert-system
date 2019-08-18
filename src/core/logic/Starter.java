package core.logic;

import core.data.*;
import core.data.storage.*;
import core.data.storage.init.LoadData;

import java.text.SimpleDateFormat;
import java.util.*;


import java.io.IOException;

/**
 * Author: Skosyreva Maria
 * Date: 17.08.2016
 * Time: 17:30
 */
public class Starter {

    /**
     * Построение решения в Режиме 1 - Обработка поля
     * @param dm Объект для работы с данными
     */
    public static void getSolutionMode1(DataManagerMode1 dm){
        /*Задаем искомые значения - для удобства отладки*/
        String testAgriculture = "2"; //хозяйство
        String testLandBase = "2"; //земельная база
        String nameResult = "тест_" + new SimpleDateFormat("dd-MM-yyyy HH:mm").format(new Date());
        String date = new SimpleDateFormat("dd-MM-yyyy HH:mm").format(new Date());
        boolean testYield = true; //базовая урожайность; true - экспериментальная, false - расчетная
        String testField = "11"; //поле
        boolean knowPred = true; //знание предшественника
        String testPred="16";//предшественник (если не знаем - не инициализируем)
        boolean inCrop = true;//вхождение в с/о: мягкое - true, жесткое - false
        String testGroupCrop = "1";//группа последователя (если вхождение жесткое - не инициализируем)
        String testCropRotation = "4";//севооборот
        String testGrade = "5";//сорт
        String testLevel = "2"; //уровень интенсификации
        String testMainProc = "3"; //основная обработка
        String testPresProc = "24";//предпосевная обработка
        String testCareCrop = "3"; //уход
        String testHarv = "1";//уборка
        String testFert = "13"; //удобрения
        String testChemPr = "1"; //хим.защита


        /*Получаем хозяйство*/
        Agricultures agriculture1 = dm.getAgriculture(testAgriculture);
         /*Получаем активную земельную базу*/
        LandBase landBase1 = dm.getLandBase(testLandBase);

        /*Получаем все поля активной земельной базы*/
        Collection<AgricultureField> fields = dm.getAllFields(landBase1);
        if(fields == null){
            System.out.println("null");
            return;
        }
        for(AgricultureField o : fields)
            System.out.println("Поле №" + o.getFieldNumber());

        /*Выбираем поле*/
        AgricultureField field = dm.getAgricultureField(fields, testField);
        /*По выбраному полю инициализируем тип земли и площадь*/
        TypeOfSoil typeOfSoil1 = field.getTypeOfSoil();
        System.out.println("\tТип земли: " + typeOfSoil1.getCodeTypeOfSoil() + " " + typeOfSoil1.getGroupOfTypesOfSoils().getNameGroupOfTypesOfSoils() + " " + typeOfSoil1.getNameTypeSoil());
        float area = field.getArea();
        System.out.println("\tПлощадь: " + area);

        Collection<Predecessor> r2;
        Predecessor predecessor1 = null;
        if(knowPred) {
            /*Предшественник известен. Выводим всех предшественников: код и наименование*/
            r2 = dm.getAllPredecessors();
            if (r2 == null) {
                System.out.println("null");
                return;
            }
        /*Обрабатываем выбор, выводим выбранный код и группу культур предшественника*/
            predecessor1 = dm.getPredecessor(r2, testPred);
            System.out.println("Предшественник: " + predecessor1.getPredecessorId() + " " + predecessor1.getCrop().getNameCrop());
        }

        Collection<GroupOfCrops> r3 = null;
        GroupOfCrops groupOfCrops1 = null;
        if(inCrop) {
        /*Вхождение в севооборот: Мягкое. Выводим доступные группы культур последователей*/
            r3 =  dm.getGroupsOfCrops(agriculture1);
            if (r3 == null) {
                System.out.println("null");
                return;
            }
            for(GroupOfCrops o : r3)
                System.out.println(o.getCodeGroupOfCrops() + " " + o.getNameGroupOfCrops());
        /*обрабатываем выбор, выводим выбранный код*/
            groupOfCrops1 = dm.getGroupOfCrops(r3, testGroupCrop);
            System.out.println("Группа культуры последователя: " + groupOfCrops1.getCodeGroupOfCrops() + " " + groupOfCrops1.getNameGroupOfCrops());
        }

        /*Выводим список севооборотов в зависимости от типа земли и группы культуры предшественника: код и название*/
        //если предш.неизвестен - в зависимости от культуры последователя
        Collection<CropRotation> r4 = null;
        if(knowPred)
            r4 = dm.getCropRotations(typeOfSoil1, predecessor1.getCrop().getGroupOfCrops());
        else
            r4 = dm.getCropRotations(typeOfSoil1, groupOfCrops1);
        if(r4 == null) {
            System.out.println("null");
            return;
        }
        for(CropRotation o : r4)
            System.out.println(o.getCodeCropRotation() + " " + o.getDescriptionCropRotation());
        /*Обрабатываем выбор, выводим выбранный код и схему севооборота*/
        CropRotation cropRotation1 = dm.getCropRotation(r4, testCropRotation);
        System.out.println("Севооборот: " + cropRotation1.getCodeCropRotation() + " " + cropRotation1.getNameCropRotation());

        /*Если предшественник неизвестен, инициализируем его подходящей кульутрой из схемы выбранного севооборота*/
        if(!knowPred) {
            predecessor1 = dm.getPredecessor(cropRotation1, groupOfCrops1);
            System.out.println("\tПредшественник (по схеме):" + predecessor1.getPredecessorId() + " " + predecessor1.getCrop().getNameCrop());
        }
        /*Если жесткое вхождение в с/о, то инициализируем группу последователя подходящей из схемы выбранного севооборота*/
        if(!inCrop) {
            groupOfCrops1 = dm.getGroupOfCrops(cropRotation1, predecessor1, agriculture1);
            System.out.println("\tГруппа культуры последователя (по схеме): " + groupOfCrops1.getCodeGroupOfCrops() + " " + groupOfCrops1.getNameGroupOfCrops());
            System.out.println("\tid: " + groupOfCrops1.getGroupOfCropsId());
        }

        /*Выводим сорта в зависимости от группы культур последователя: код, наименование*/
        Collection<GradeOfCrop> r5 = dm.getGradesOfCrops(groupOfCrops1, agriculture1);
        if(r5 == null){
            System.out.println("null");
            return;
        }
        for(GradeOfCrop o : r5)
            System.out.println(o.getCodeGradeOfCrop() + " " + o.getCrop().getNameCrop() + " " + o.getNameGradeOfCrops());
        /*Обрабатываем выбор,выводим выбранный код, стоимость на 1 га и на всю площадь*/
        GradeOfCrop gradeOfCrop1 = dm.getGradeOfCrop(r5, testGrade);
        System.out.println("Сорт: " + gradeOfCrop1.getCodeGradeOfCrop() + " " + gradeOfCrop1.getCrop().getNameCrop() + " " + gradeOfCrop1.getNameGradeOfCrops());
        /*Получаем цены на семена*/
        Collection<CostOfSeed> cr5 = dm.getCostsOfSeed(gradeOfCrop1, agriculture1);
        for(CostOfSeed c : cr5)
            System.out.println("\t" + c.getCostOfSeed() + " ");
        /*обрабатываем выбор цены*/
        Iterator<CostOfSeed> iterCS = cr5.iterator();
        float costSeed = 0;
        String testCostSeed = Integer.toString(iterCS.next().getCostOfSeedId()); //req.getParameter("costSeed1");
        System.out.println("testCostSeed = " + testCostSeed);
        if(testCostSeed != null)
            costSeed = dm.getCostOfSeed(cr5, testCostSeed);
        System.out.println("\tстоимость семян на гектар: " + costSeed);

        /*Выводим уровни интенсификации в зависимости от сорта и типа земли: код, название*/
        Collection<LevelOfIntensification> r6 = dm.getLevelsOfIntensification(typeOfSoil1, gradeOfCrop1);
        if(r6 == null){
            System.out.println("null");
            return;
        }
        for(LevelOfIntensification o : r6)
            System.out.println(o.getLevelOfIntensificationId() + " " + o.getNameLevelOfIntensification());
        /*Обрабатываем выбор, выводим выбранный код и название*/
        LevelOfIntensification levelOfIntensification1 = dm.getLevelOfIntensification(r6, testLevel);
        System.out.println("Уровень интенсификации: " + levelOfIntensification1.getLevelOfIntensificationId() + " " + levelOfIntensification1.getNameLevelOfIntensification());

        /*Выводим виды основной обработки почв в зависимости от типа земли, уровня интен., культуры и предшественника: код, название*/
        Collection<MainProcessing>r7 = dm.getMainProcessings(typeOfSoil1, levelOfIntensification1, gradeOfCrop1.getCrop(), predecessor1, agriculture1);
        if(r7 == null){
            System.out.println("null");
            return;
        }
        for(MainProcessing o : r7)
            System.out.println(o.getMainProcessingId() + " " + o.getDescriptionMainProcessing());
        /*Обрабатываем выбор: выводим выбранный код*/
        MainProcessing mainProcessing1 = dm.getMainProcessing(r7, testMainProc);
        System.out.println("Основная обработка: " + mainProcessing1.getMainProcessingId() + " " + mainProcessing1.getDescriptionMainProcessing());
        /*Получаем стоимость осн.обработки*/
        Collection<CostOfMainProcessing> cr7 = dm.getCostsOfMainProcessing(mainProcessing1, agriculture1);
        for(CostOfMainProcessing c : cr7)
            System.out.println("\t" + c.getCostOfMainProcessing());
        /*Обрабатываем выбор цены*/
        Iterator<CostOfMainProcessing> iterCMP = cr7.iterator();
        float costMainPr = 0;
        String testCostMainPr = Integer.toString(iterCMP.next().getCostOfMainProcessingId()); //req.getParameter("costMainProc1");
        if(testCostMainPr != null)
            costMainPr = dm.getCostOfMainProcessing(cr7, testCostMainPr);
        System.out.println("\tстоимость осн.обработки на гектар: " + costMainPr);

        /*Выводим виды предпосевной обработки в зависимости от типа земли, уровня инт., культуры, предш. и осн.обр*/
        Collection<PreseedingProcessingAndSowing> r8 = null;
        r8 = dm.getPreseedingProcessings(typeOfSoil1, levelOfIntensification1, gradeOfCrop1.getCrop(), predecessor1, mainProcessing1, agriculture1);
        if(r8 == null){
            System.out.println("null");
            return;
        }
        for(PreseedingProcessingAndSowing o : r8)
            System.out.println(o.getCodePreseedingProcessingAndSowing() + " " + o.getDescriptionPreseedingProcessingAndSowing());
        /*Обрабатываем выбор: выводим выбранный код; стоимость за 1 га и на всю площадь; общие затраты на 1 га и на площадь на данный момент*/
        PreseedingProcessingAndSowing preseedingProcessing1 = dm.getPreseedingProcessingAndSowing(r8, testPresProc);
        System.out.println("Предпосевная обработка: " + preseedingProcessing1.getCodePreseedingProcessingAndSowing() + " " + preseedingProcessing1.getDescriptionPreseedingProcessingAndSowing());
        /*Получаем цены предп.обр*/
        Collection<CostOfPreseedingProcessingAndSowing> cr8 = dm.getCostsOfPreseedingProcessingAndSowing(preseedingProcessing1, agriculture1);
        for(CostOfPreseedingProcessingAndSowing c : cr8)
            System.out.println("\t" + c.getCostOfPreseedingProcessingAndSowing());
        /*обрабатываем выбор цены*/
        Iterator<CostOfPreseedingProcessingAndSowing> iterPP = cr8.iterator();
        float costPresPr = 0;
        String testCostPresPr = Integer.toString(iterPP.next().getCostOfPreseedingProcessingAndSowingId());
        if(testCostPresPr != null)
            costPresPr = dm.getCostOfPreseedingProcessing(cr8, testCostPresPr);
        System.out.println("\tстоимость предп.обработки на гектар: " + costPresPr);

        /*Выводим уход за посевами в зависимости от уровня инт., сорта: код и наименование*/
        Collection<CareOfCrops> r9 = dm.getCaresOfCrops(levelOfIntensification1, gradeOfCrop1.getCrop(), agriculture1);
        if(r9 == null){
            System.out.println("null");
            return;
        }
        for(CareOfCrops o : r9)
            System.out.println(o.getCareOfCropsId() + " " + o.getDescriptionCareOfCrops());
        /*Обрабатываем выбор: выводим выбранный код; стоимость за 1 га и на всю площадь; общие затраты на 1 га и на площадь на данный момент*/
        CareOfCrops careOfCrops1 = dm.getCareOfCrops(r9, testCareCrop);
        System.out.println("Уход: " + careOfCrops1.getCareOfCropsId() + " " + careOfCrops1.getDescriptionCareOfCrops());
         /*Получаем цены ухода*/
        Collection<CostOfCareOfCrops> cr9 = dm.getCostsOfCareCrops(careOfCrops1, agriculture1);
        for(CostOfCareOfCrops c : cr9)
            System.out.println("\t" + c.getCostOfCareOfCrops());
        /*обрабатываем выбор цены*/
        Iterator<CostOfCareOfCrops> iterCC = cr9.iterator();
        float costCareCrop = 0;
        String testCostCareCrop = Integer.toString(iterCC.next().getCostOfCareOfCropsId());
        if(testCostCareCrop != null)
            costCareCrop = dm.getCostOfCareOfCrops(cr9, testCostCareCrop);
        System.out.println("\tстоимость ухода на гектар: " + costCareCrop);

        /*Выводим виды уборки  зависимости от уровня инт., культуры: код, наименование*/
        Collection<Harvesting>r10 = dm.getHarvestings(levelOfIntensification1, gradeOfCrop1.getCrop(), agriculture1);
        if(r10 == null){
            System.out.println("null");
            return;
        }
        for(Harvesting o : r10)
            System.out.println(o.getCodeHarvesting() + " " + o.getDescriptionHarvesting());
        /*Обрабатываем выбор*/
        Harvesting harvesting1 = dm.getHarvesting(r10, testHarv);
        System.out.println("Уборка: " + harvesting1.getCodeHarvesting() + " " + harvesting1.getDescriptionHarvesting());
         /*Получаем цены уборки*/
        Collection<CostOfHarvesting> cr10 = dm.getCostsOfHarvesting(harvesting1, agriculture1);
        for(CostOfHarvesting c : cr10)
            System.out.println("\t" + c.getCostOfHarvesting());
        /*обрабатываем выбор цены*/
        Iterator<CostOfHarvesting> iterH = cr10.iterator();
        float costHarv = 0;
        String testCostHarv = Integer.toString(iterH.next().getCostOfHarvestingId());
        if(testCostHarv != null)
            costHarv = dm.getCostOfHarvesting(cr10, testCostHarv);
        System.out.println("\tстоимость уборки на гектар: " + costHarv);


        /*Выводим системы применения удобрений в зависимости от уровня интен. и сорта*/
        Collection<ApplicationOfFertilizers> r11 = dm.getFertilizers(typeOfSoil1, levelOfIntensification1, gradeOfCrop1.getCrop(), agriculture1);
        if(r11 == null){
            System.out.println("null");
            return;
        }
        for(ApplicationOfFertilizers o : r11)
            System.out.println(o.getCodeApplicationOfFertilizers() + " " + o.getDescriptionApplicationOfFertilizers());
        /*Обрабатываем выбор*/
        ApplicationOfFertilizers applicationOfFertilizers1 = dm.getFertilizer(r11, testFert);
        System.out.println("Система удобрений: " + applicationOfFertilizers1.getCodeApplicationOfFertilizers() + " " + applicationOfFertilizers1.getDescriptionApplicationOfFertilizers());
        /*Получаем цены удобрений*/
        Collection<CostOfApplicationOfFertilizers> cr11 = dm.getCostsOfApplicationOfFertilizers(applicationOfFertilizers1, agriculture1);
        for(CostOfApplicationOfFertilizers c : cr11)
            System.out.println("\t" + c.getCostOfApplicationOfFertilizers());
        /*обрабатываем выбор цены*/
        Iterator<CostOfApplicationOfFertilizers> iterCAF = cr11.iterator();
        float costFert = 0;
        String testCostFert = Integer.toString(iterCAF.next().getCostOfApplicationOfFertilizersId());
        if(testCostFert != null)
            costFert = dm.getCostOfApplicationOfFertilizer(cr11, testCostFert);
        System.out.println("\tстоимость удобрений на гектар: " + costFert);
        float costProdFert = 0;
        Collection<CostOnProductionFertilizer> cpr11 = null;
        if(levelOfIntensification1.getLevelOfIntensificationId() != 1) {
         /*Получаем цены сырья удобрений*/
            cpr11 = dm.getCostOnProductionFertilizer(gradeOfCrop1, agriculture1);
            if (levelOfIntensification1.getLevelOfIntensificationId() == 2)
                for (CostOnProductionFertilizer c : cpr11)
                    System.out.println("\t" + c.getCostOfFertilizerAtNormalLevel());
            if (levelOfIntensification1.getLevelOfIntensificationId() == 3)
                for (CostOnProductionFertilizer c : cpr11)
                    System.out.println("\t" + c.getCostOfFertilizerAtIntensiveLevel());
            /*обрабатываем выбор цены*/
            Iterator<CostOnProductionFertilizer> iterCPF = cpr11.iterator();
            String testCostProdFert = Integer.toString(iterCPF.next().getCostOnProductionFertilizerId());
            if(testCostProdFert != null)
                costProdFert = dm.getCostProductionFertilizer(cpr11, testCostProdFert, levelOfIntensification1);
            System.out.println("\tстоимость сырья на гектар: " + costProdFert);
        }

        /*Выводим виды хим.защиты в зависимости от типа земли, уровня интенсификации, культуры: код, наименование*/
        Collection<ChemicalProtectionOfCrops>r12 = dm.getChemicalProtections(typeOfSoil1, levelOfIntensification1, gradeOfCrop1.getCrop(), agriculture1);
        if(r12 == null){
            System.out.println("null");
            return;
        }
        for(ChemicalProtectionOfCrops o : r12)
            System.out.println(o.getCodeChemicalProtectionOfCrops() + " " + o.getDescriptionChemicalProtectionOfCrops());
        /*Обрабатываем выбор*/
        ChemicalProtectionOfCrops chemicalProtectionOfCrops1 = dm.getChemicalProtection(r12, testChemPr);
        System.out.println("Химическая защита: " + chemicalProtectionOfCrops1.getCodeChemicalProtectionOfCrops() + " " + chemicalProtectionOfCrops1.getDescriptionChemicalProtectionOfCrops());
       /*Получаем цены хим.защиты*/
        Collection<CostOfChemicalProtectionOfCrops> cr12 = dm.getCostsOfChemicalProtectionOfCrops(chemicalProtectionOfCrops1, agriculture1);
        for(CostOfChemicalProtectionOfCrops c : cr12)
            System.out.println("\t" + c.getCostOfChemicalProtectionOfCrops());
        /*обрабатываем выбор цены*/
        Iterator<CostOfChemicalProtectionOfCrops> iterCCP = cr12.iterator();
        float costChemPr = 0;
        String testCostChemPr = Integer.toString(iterCCP.next().getCostOfChemicalProtectionOfCropsId());
        if(testCostChemPr != null)
            costChemPr = dm.getCostOfChemicalProtection(cr12, testCostChemPr);
        System.out.println("\tстоимость хим.защиты на гектар: " + costChemPr);
        /*Получаем цены материалов хим.защиты*/
        Collection<CostOfRawMaterialForChemicalProtection> cmr12 = dm.getCostsOfRawMaterialForChemicalProtection(chemicalProtectionOfCrops1, agriculture1);
        for(CostOfRawMaterialForChemicalProtection c : cmr12)
            System.out.println("\t" + c.getCostOfRawMaterialForChemicalProtection());
        /*обрабатываем выбор цены*/
        Iterator<CostOfRawMaterialForChemicalProtection> iterCRC = cmr12.iterator();
        float costMatChem = 0;
        String testCostMatChem = Integer.toString(iterCRC.next().getCostOfRawMaterialForChemicalProtectionId());
        if(testCostMatChem != null)
            costMatChem = dm.getCostOfRawMaterialForChemicalProtection(cmr12, testCostMatChem);
        System.out.println("\tстоимость материалов на гектар: " + costMatChem);

                    /*ОБРАБОТКА ВЫБРАННЫХ ПАРАМЕТРОВ*/
        /*Коэффициент инфляции*/
        float kInf = dm.getCoefficientOfInflation(agriculture1).getValue();
        /*Считаем урожайность*/
        float productivity = dm.countProductivity(testYield, typeOfSoil1, levelOfIntensification1, gradeOfCrop1.getCrop(), gradeOfCrop1,
                predecessor1, mainProcessing1, preseedingProcessing1, careOfCrops1, harvesting1,
                chemicalProtectionOfCrops1);
        System.out.println("Урожайность = " + productivity + " ц/га");
        float productivity_area = productivity * area;
        System.out.println("Урожай с площади = " + productivity_area + " га");
        //Доход от продажи
        float income_from_sale = dm.countKIncome(levelOfIntensification1, gradeOfCrop1);
        income_from_sale *= productivity_area * kInf;
        System.out.println("Доход = " + income_from_sale + " руб. (" + income_from_sale / area + " руб/га)");

         /*Получаем стандартную технологию для выбранного сорта и уровня*/
        StandartTechnology st = dm.getStandartTechnology(gradeOfCrop1, levelOfIntensification1);
            /*Результаты по стандартной технологии*/
        /*Считаем урожайность*/
        float productivitySt = dm.countProductivity(testYield, typeOfSoil1, levelOfIntensification1, gradeOfCrop1.getCrop(), gradeOfCrop1,
                predecessor1, st.getMainProcessing(), st.getPreseedingProcessingAndSowing(), st.getCareOfCrops(),
                st.getHarvesting(), st.getChemicalProtectionOfCrops());
        System.out.println("Урожайность (станд.т.) = " + productivitySt + " ц/га");
        float productivity_areaSt = productivitySt * area;
        System.out.println("Урожай с площади (станд.т.) = " + productivity_areaSt + " ц");
        /*Доход от продажи*/
        float income_from_saleSt = dm.countKIncome(levelOfIntensification1, gradeOfCrop1);
        income_from_saleSt *= productivity_areaSt * kInf;
        System.out.println("Доход (станд.т.) = " + income_from_saleSt + " руб. (" + income_from_saleSt / area + " руб/га)");

        /*Создаем новый объект, содержащий результат по только что обработанному полю и сохраняем его в БД*/
       /*Записываем результат в БД*/
        ResultMode1 result1 = new ResultMode1(nameResult, date, field, landBase1, predecessor1, cropRotation1, gradeOfCrop1, levelOfIntensification1,
                mainProcessing1, preseedingProcessing1, careOfCrops1, harvesting1, applicationOfFertilizers1, chemicalProtectionOfCrops1,
                productivity, income_from_sale, st, productivitySt, income_from_saleSt);

        /*Считаем затраты по фактическому выбору и стандартной технологии*/
        dm.countCostsMode1(result1, kInf, costSeed, costMainPr, costPresPr, costCareCrop, costHarv, costFert, costProdFert, costChemPr, costMatChem);
        /*Сохраняем в БД*/
        dm.saveResultMode1(result1);

        //Затраты
        System.out.println("Затраты = " + result1.getCosts() + " руб. (" + result1.getCosts() / area + " руб/га)");
        //Прибыль
        float gain = income_from_sale - result1.getCosts();
        System.out.println("Прибыль = " + gain + " руб. (" + gain / area + " руб/га)");
        //Затраты по станадартной технологии
        System.out.println("Затраты (станд.т.) = " + result1.getCostsSt() + " руб. (" + result1.getCostsSt()/area + " руб/га)");
        //Прибыль по станадартной технологии
        float gainSt = income_from_saleSt - result1.getCostsSt();
        System.out.println("Прибыль (станд.т.) = " + gainSt + " руб. (" + gainSt / area + " руб/га)");
    }

    /**
     * Построение решения в Режиме 2 - Обработка поля севооборота
     * @param dm Объект для работы с данными
     */
    public static void getSolutionMode2(DataManagerMode2 dm){

        String testAgriculture = "2"; //хозяйство
        String testLandBase = "2"; //земельная база

         /*Получаем текущее хозяйство*/
        Agricultures agriculture2 = dm.getAgriculture(testAgriculture);
        /*Получаем активную земельную базу*/
        LandBase landBase2 = dm.getLandBase(testLandBase);

        /*Формируем список сохраненных и еще не завершенных решений*/
        /*Collection<SolutionMode2> solutions = dm.getUnfineshedSolutionsMode2(agriculture1);
        System.out.println("Незавершненные решения:");
        for(SolutionMode2 s : solutions)
            System.out.println("\t" + s.getNameSolution());
        String solutionId = "1";
        /*Получаем выбранное решение*/
        /*SolutionMode2 solution2 = dm.getSolutionMode2(Integer.parseInt(solutionId));
        String nameSolution = solution2.getNameSolution();
        System.out.println("Выбрано решение:" + solutionId + " " + nameSolution);*/


        /*Задаем искомые значения - для удобства отладки*/
        String testField = "9"; //номер участка
        boolean testYield = true; //базовая урожайность; true - экспериментальная, false - расчетная
        String testYear = "2019"; //расчётный год
        String testPred = "7";//предшественник
        String testGrade = "20";//сорт
        String testLevel = "2"; //уровень интенсификации
        String testMainProc = "1"; //основная обработка
        String testPresProc = "2";//предпосевная обработка
        String testCareCrop = "2"; //уход
        String testHarv = "3";//уборка
        String testFert = "1"; //удобрения
        String testChemPr = "1"; //хим.защита

        CropRotationOfAgriculture cropRotationOfAgriculture1; //севооборот выбранного участка
        int startYear; //год начала севооборота
        int year; //расчётный год

        /*Получаем все необработанные в текущем решении поля активной земельной базы хозяйства*/
        Collection<AgricultureField> r1 = dm.getAllFields(landBase2); //dm.getUnprocessedFieldsMode2(solution2);
        if (r1 == null) {
            System.out.println("null");
            return;
        }
        for(AgricultureField r : r1)
            System.out.println("Поле №" + r.getFieldNumber());

        /*Выбираем поле*/
        AgricultureField field1 = dm.getAgricultureField(r1, testField);
        /*По выбраному полю инициализируем тип земли, площадь и севооборот*/
        TypeOfSoil typeOfSoil1 = field1.getTypeOfSoil();
        float area = field1.getArea();
        cropRotationOfAgriculture1 = dm.getCropRotationOfField(field1);
        startYear = cropRotationOfAgriculture1.getStartYearCropRotationOfAgriculture();
        System.out.println("\tПлощадь: " + area);
        System.out.println("\tТип земли: " + typeOfSoil1.getCodeTypeOfSoil() + " " + typeOfSoil1.getGroupOfTypesOfSoils().getNameGroupOfTypesOfSoils() + " "
                + typeOfSoil1.getNameTypeSoil());
        System.out.println("\tСевооборот: " + cropRotationOfAgriculture1.getCodeCropRotationOfAgriculture() + " " + cropRotationOfAgriculture1.getCropRotation().getNameCropRotation());
        System.out.println("\tГод начала: " + startYear);

        /*Обрабатываем выбор года*/
        year = Integer.parseInt(testYear);
        System.out.println("Расчётный год: " + year);

        /*Выводим всех допустимых предшественников для текущего с/о в данный год*/
        Collection<Predecessor> r2 = dm.getPredecessors(cropRotationOfAgriculture1, year);
        if (r2 == null) {
            System.out.println("null");
            return;
        }
        for (Predecessor o : r2)
            System.out.println(o.getCrop().getCodeCrop() + " " + o.getCrop().getNameCrop());
        /*Обрабатываем выбор: выводим выбранный код и группу культур предшественника*/
        Predecessor predecessor1 = dm.getPredecessor(r2, testPred);
        System.out.println("Предшественник: " + predecessor1.getCrop().getCodeCrop() + " " + predecessor1.getCrop().getGroupOfCrops().getNameGroupOfCrops());

        /*Выводим все допустимые сорта для текущего с/о в данный год*/
        Collection<GradeOfCrop> r3 = dm.getGradesOfCrops(cropRotationOfAgriculture1, year, agriculture2);
        if (r3 == null) {
            System.out.println("null");
            return;
        }
        for (GradeOfCrop o : r3)
            System.out.println(o.getCodeGradeOfCrop() + " " + o.getCrop().getNameCrop() + " " + o.getNameGradeOfCrops());
        /*Обрабатываем выбор: выводим код, наименование культуры и сорта*/
        GradeOfCrop gradeOfCrop1 = dm.getGradeOfCrop(r3, testGrade);
        System.out.println("Сорт: " + gradeOfCrop1.getCodeGradeOfCrop() + " " + gradeOfCrop1.getCrop().getNameCrop() + " " + gradeOfCrop1.getNameGradeOfCrops());
        /*Получаем цены на семена*/
        Collection<CostOfSeed> cr3 = dm.getCostsOfSeed(gradeOfCrop1, agriculture2);
        for(CostOfSeed c : cr3)
            System.out.println("\t" + c.getCostOfSeed() + " ");
        /*обрабатываем выбор цены*/
        Iterator<CostOfSeed> iterCS = cr3.iterator();
        float costSeed = 0;
        String testCostSeed = Integer.toString(iterCS.next().getCostOfSeedId());
        if(testCostSeed != null)
            costSeed = dm.getCostOfSeed(cr3, testCostSeed);
        System.out.println("\tстоимость семян на гектар: " + costSeed);

        /*Выводим уровни интенсификации в зависимости от типа земли и сорта*/
        Collection<LevelOfIntensification> r4 = dm.getLevelsOfIntensification(typeOfSoil1, gradeOfCrop1);
        if(r4 == null){
            System.out.println("null");
            return;
        }
        for(LevelOfIntensification o : r4)
            System.out.println(o.getLevelOfIntensificationId() + " " + o.getNameLevelOfIntensification());
        /*Обрабатываем выбор: выводим выбранный код и название*/
        LevelOfIntensification levelOfIntensification1 = dm.getLevelOfIntensification(r4, testLevel);
        System.out.println("Уровень интенсификации: " + levelOfIntensification1.getLevelOfIntensificationId() + " " + levelOfIntensification1.getNameLevelOfIntensification());

        /*Выводим виды основной обработки почв в зависимости от типа земли, уровня интен., культуры и предшественника*/
        Collection<MainProcessing>r5 = dm.getMainProcessings(typeOfSoil1, levelOfIntensification1, gradeOfCrop1.getCrop(), predecessor1, agriculture2);
        if(r5 == null){
            System.out.println("null");
            return;
        }
        for(MainProcessing o : r5)
            System.out.println(o.getMainProcessingId() + " " + o.getDescriptionMainProcessing());
        /*Обрабатываем выбор: выводим код и название*/
        MainProcessing mainProcessing1 = dm.getMainProcessing(r5, testMainProc);
        System.out.println("Основная обработка: " + mainProcessing1.getMainProcessingId() + " " + mainProcessing1.getDescriptionMainProcessing());
        /*Получаем стоимость осн.обработки*/
        Collection<CostOfMainProcessing> cr5 = dm.getCostsOfMainProcessing(mainProcessing1, agriculture2);
        for(CostOfMainProcessing c : cr5)
            System.out.println("\t" + c.getCostOfMainProcessing());
        /*Обрабатываем выбор цены*/
        Iterator<CostOfMainProcessing> iterCMP = cr5.iterator();
        float costMainPr = 0;
        String testCostMainPr = Integer.toString(iterCMP.next().getCostOfMainProcessingId());
        if(testCostMainPr != null)
            costMainPr = dm.getCostOfMainProcessing(cr5, testCostMainPr);
        System.out.println("\tстоимость осн.обработки на гектар: " + costMainPr);

        /*Выводим виды предпосевной обработки в зависимости от типа земли, уровня инт., культуры, предш. и осн.обр*/
        Collection<PreseedingProcessingAndSowing> r6 = dm.getPreseedingProcessings(typeOfSoil1, levelOfIntensification1, gradeOfCrop1.getCrop(), predecessor1, mainProcessing1, agriculture2);
        if(r6 == null){
            System.out.println("null");
            return;
        }
        for(PreseedingProcessingAndSowing o : r6)
            System.out.println(o.getCodePreseedingProcessingAndSowing() + " " + o.getDescriptionPreseedingProcessingAndSowing());
        /*Обрабатываем выбор: выводим выбранный код и название*/
        PreseedingProcessingAndSowing preseedingProcessing1 = dm.getPreseedingProcessingAndSowing(r6, testPresProc);
        System.out.println("Предпосевная обработка: " + preseedingProcessing1.getCodePreseedingProcessingAndSowing() + " " + preseedingProcessing1.getDescriptionPreseedingProcessingAndSowing());
    /*Получаем цены предп.обр*/
        Collection<CostOfPreseedingProcessingAndSowing> cr6 = dm.getCostsOfPreseedingProcessingAndSowing(preseedingProcessing1, agriculture2);
        for(CostOfPreseedingProcessingAndSowing c : cr6)
            System.out.println("\t" + c.getCostOfPreseedingProcessingAndSowing());
        /*обрабатываем выбор цены*/
        Iterator<CostOfPreseedingProcessingAndSowing> iterPP = cr6.iterator();
        float costPresPr = 0;
        String testCostPresPr = Integer.toString( iterPP.next().getCostOfPreseedingProcessingAndSowingId());
        if(testCostPresPr != null)
            costPresPr = dm.getCostOfPreseedingProcessing(cr6, testCostPresPr);
        System.out.println("\tстоимость предп.обработки на гектар: " + costPresPr);

        /*Выводим уход за посевами в зависимости от уровня инт., сорта*/
        Collection<CareOfCrops> r7 = dm.getCaresOfCrops(levelOfIntensification1, gradeOfCrop1.getCrop(), agriculture2);
        if(r7 == null){
            System.out.println("null");
            return;
        }
        for(CareOfCrops o : r7)
            System.out.println(o.getCareOfCropsId() + " " + o.getDescriptionCareOfCrops());
        /*Обрабатываем выбор: выводим выбранный код и название*/
        CareOfCrops careOfCrops1 = dm.getCareOfCrops(r7, testCareCrop);
        System.out.println("Уход: " + careOfCrops1.getCareOfCropsId() + " " + careOfCrops1.getDescriptionCareOfCrops());
        /*Получаем цены ухода*/
        Collection<CostOfCareOfCrops> cr7 = dm.getCostsOfCareCrops(careOfCrops1, agriculture2);
        for(CostOfCareOfCrops c : cr7)
            System.out.println("\t" + c.getCostOfCareOfCrops());
        /*обрабатываем выбор цены*/
        Iterator<CostOfCareOfCrops> iterCC = cr7.iterator();
        float costCareCrop = 0;
        String testCostCareCrop = Integer.toString(iterCC.next().getCostOfCareOfCropsId());
        if(testCostCareCrop != null)
            costCareCrop = dm.getCostOfCareOfCrops(cr7, testCostCareCrop);
        System.out.println("\tстоимость ухода на гектар: " + costCareCrop);

        /*Выводим виды уборки в зависимости от уровня инт., культуры: код, наименование*/
        Collection<Harvesting>r8 = dm.getHarvestings(levelOfIntensification1, gradeOfCrop1.getCrop(), agriculture2);
        if(r8 == null){
            System.out.println("null");
            return;
        }
        for(Harvesting o : r8)
            System.out.println(o.getCodeHarvesting() + " " + o.getDescriptionHarvesting());
        /*Обрабатываем выбор: выводим код и название*/
        Harvesting harvesting1 = dm.getHarvesting(r8, testHarv);
        System.out.println("Уборка: " + harvesting1.getCodeHarvesting() + " " + harvesting1.getDescriptionHarvesting());
        /*Получаем цены уборки*/
        Collection<CostOfHarvesting> cr8 = dm.getCostsOfHarvesting(harvesting1, agriculture2);
        for(CostOfHarvesting c : cr8)
            System.out.println("\t" + c.getCostOfHarvesting());
        /*обрабатываем выбор цены*/
        Iterator<CostOfHarvesting> iterH = cr8.iterator();
        float costHarv = 0;
        String testCostHarv = Integer.toString(iterH.next().getCostOfHarvestingId());
        if(testCostHarv != null)
            costHarv = dm.getCostOfHarvesting(cr8, testCostHarv);
        System.out.println("\tстоимость уборки на гектар: " + costHarv);

        /*Выводим системы применения удобрений в зависимости от уровня интен. и сорта*/
        Collection<ApplicationOfFertilizers> r9 = dm.getFertilizers(typeOfSoil1, levelOfIntensification1, gradeOfCrop1.getCrop(), agriculture2);
        if(r9 == null){
            System.out.println("null");
            return;
        }
        for(ApplicationOfFertilizers o : r9)
            System.out.println(o.getCodeApplicationOfFertilizers() + " " + o.getDescriptionApplicationOfFertilizers());
        /*Обрабатываем выбор: выводим код и название*/
        ApplicationOfFertilizers applicationOfFertilizers1 = dm.getFertilizer(r9, testFert);
        System.out.println("Система удобрений: " + applicationOfFertilizers1.getCodeApplicationOfFertilizers() + " " + applicationOfFertilizers1.getDescriptionApplicationOfFertilizers());
        /*Получаем цены удобрений*/
        Collection<CostOfApplicationOfFertilizers> cr9 = dm.getCostsOfApplicationOfFertilizers(applicationOfFertilizers1, agriculture2);
        for(CostOfApplicationOfFertilizers c : cr9)
            System.out.println("\t" + c.getCostOfApplicationOfFertilizers());
        /*обрабатываем выбор цены*/
        Iterator<CostOfApplicationOfFertilizers> iterCAF = cr9.iterator();
        float costFert = 0;
        String testCostFert = Integer.toString(iterCAF.next().getCostOfApplicationOfFertilizersId());
        if(testCostFert != null)
            costFert = dm.getCostOfApplicationOfFertilizer(cr9, testCostFert);
        System.out.println("\tстоимость удобрений на гектар: " + costFert);
        float costProdFert = 0;
        if(levelOfIntensification1.getLevelOfIntensificationId() != 1) {
         /*Получаем цены сырья удобрений*/
            Collection<CostOnProductionFertilizer> cpr9 = dm.getCostOnProductionFertilizer(gradeOfCrop1, agriculture2);
            if (levelOfIntensification1.getLevelOfIntensificationId() == 2)
                for (CostOnProductionFertilizer c : cpr9)
                    System.out.println("\t" + c.getCostOfFertilizerAtNormalLevel());
            if (levelOfIntensification1.getLevelOfIntensificationId() == 3)
                for (CostOnProductionFertilizer c : cpr9)
                    System.out.println("\t" + c.getCostOfFertilizerAtIntensiveLevel());
            /*обрабатываем выбор цены*/
            Iterator<CostOnProductionFertilizer> iterCPF = cpr9.iterator();
            String testCostProdFert = Integer.toString(iterCPF.next().getCostOnProductionFertilizerId());
            if(testCostProdFert != null)
                costProdFert = dm.getCostProductionFertilizer(cpr9, testCostProdFert, levelOfIntensification1);
            System.out.println("\tстоимость сырья на гектар: " + costProdFert);
        }


        /*Выводим виды хим.защиты в зависимости от типа земли, уровня интенсификации, культуры: код, наименование*/
        Collection<ChemicalProtectionOfCrops>r10 = dm.getChemicalProtections(typeOfSoil1, levelOfIntensification1, gradeOfCrop1.getCrop(), agriculture2);
        if(r10 == null){
            System.out.println("null");
            return;
        }
        for(ChemicalProtectionOfCrops o : r10)
            System.out.println(o.getCodeChemicalProtectionOfCrops() + " " + o.getDescriptionChemicalProtectionOfCrops());
        /*Обрабатываем выбор: выводим код и название*/
        ChemicalProtectionOfCrops chemicalProtectionOfCrops1 = dm.getChemicalProtection(r10, testChemPr);
        System.out.println("Химическая защита: " + chemicalProtectionOfCrops1.getCodeChemicalProtectionOfCrops() + " " + chemicalProtectionOfCrops1.getDescriptionChemicalProtectionOfCrops());
        /*Получаем цены хим.защиты*/
        Collection<CostOfChemicalProtectionOfCrops> cr10 = dm.getCostsOfChemicalProtectionOfCrops(chemicalProtectionOfCrops1, agriculture2);
        for(CostOfChemicalProtectionOfCrops c : cr10)
            System.out.println("\t" + c.getCostOfChemicalProtectionOfCrops());
        /*обрабатываем выбор цены*/
        Iterator<CostOfChemicalProtectionOfCrops> iterCCP = cr10.iterator();
        float costChemPr = 0;
        String testCostChemPr = Integer.toString(iterCCP.next().getCostOfChemicalProtectionOfCropsId());
        if(testCostChemPr != null)
            costChemPr = dm.getCostOfChemicalProtection(cr10, testCostChemPr);
        System.out.println("\tстоимость хим.защиты на гектар: " + costChemPr);
        /*Получаем цены материалов хим.защиты*/
        Collection<CostOfRawMaterialForChemicalProtection> cmr10 = dm.getCostsOfRawMaterialForChemicalProtection(chemicalProtectionOfCrops1, agriculture2);
        for(CostOfRawMaterialForChemicalProtection c : cmr10)
            System.out.println("\t" + c.getCostOfRawMaterialForChemicalProtection());
        /*обрабатываем выбор цены*/
        Iterator<CostOfRawMaterialForChemicalProtection> iterCRC = cmr10.iterator();
        float costMatChem = 0;
        String testCostMatChem = Integer.toString(iterCRC.next().getCostOfRawMaterialForChemicalProtectionId());
        if(testCostMatChem != null)
            costMatChem = dm.getCostOfRawMaterialForChemicalProtection(cmr10, testCostMatChem);
        System.out.println("\tстоимость материалов на гектар: " + costMatChem);

                        /*ОБРАБОТКА ВЫБРАННЫХ ПАРАМЕТРОВ*/
        /*Коэффициент инфляции*/
        float KInf = dm.getCoefficientOfInflation(agriculture2).getValue();
        /*Считаем урожайность*/
        float productivity = dm.countProductivity(testYield, typeOfSoil1, levelOfIntensification1, gradeOfCrop1.getCrop(), gradeOfCrop1,
                predecessor1, mainProcessing1, preseedingProcessing1, careOfCrops1, harvesting1,
                chemicalProtectionOfCrops1);
        System.out.println("Урожайность = " + productivity + " ц/га");
        float productivity_area = productivity * area;
        System.out.println("Урожай с площади = " + productivity_area + " га");
        /*Доход от продажи*/
        float income_from_sale = dm.countKIncome(levelOfIntensification1, gradeOfCrop1);
        income_from_sale *= productivity_area * KInf;
        System.out.println("Доход = " + income_from_sale + " руб. (" + income_from_sale / area + " руб/га)");

        /*Получаем стандартную технологию для выбранного сорта и уровня*/
        StandartTechnology st = dm.getStandartTechnology(gradeOfCrop1, levelOfIntensification1);
            /*Результаты по стандартной технологии*/
        /*Считаем урожайность*/
        float productivitySt = dm.countProductivity(testYield, typeOfSoil1, levelOfIntensification1, gradeOfCrop1.getCrop(), gradeOfCrop1,
                predecessor1, st.getMainProcessing(), st.getPreseedingProcessingAndSowing(), st.getCareOfCrops(),
                st.getHarvesting(), st.getChemicalProtectionOfCrops());
        System.out.println("Урожайность (станд.т.) = " + productivitySt + " ц/га");
        float productivity_areaSt = productivitySt * area;
        System.out.println("Урожай с площади (станд.т.) = " + productivity_areaSt + " ц");
        /*Доход от продажи*/
        float income_from_saleSt = dm.countKIncome(levelOfIntensification1, gradeOfCrop1);
        income_from_saleSt *= productivity_areaSt * KInf;
        System.out.println("Доход (станд.т.) = " + income_from_saleSt + " руб. (" + income_from_saleSt / area + " руб/га)");

        /*Создаем новое решение
        SolutionMode2 solution2 = new SolutionMode2(nameSolution, new SimpleDateFormat("dd.MM.yyyy HH:mm").format(new Date()), year, agriculture1);
        float areaAgr = 0;
        //для всех активных с/о создаем результаты, привязанные к текущему решению
        Collection<CropRotationOfAgriculture> activeCRs = dm.getActiveCropRotations(agriculture1);
        ArrayList<ResultCropRotationMode2> resultsCRs = new ArrayList<ResultCropRotationMode2>();
        ResultCropRotationMode2 resCR2 = null;
        ResultMode2 result2 = null;
        for(CropRotationOfAgriculture cr : activeCRs) {
            //заполняем результаты по с/о
            ResultCropRotationMode2 r = new ResultCropRotationMode2(cr, solution2);
            float areaCR = 0; int fieldsAll = 0;
            Collection<AgricultureField> fields = dm.getCropRotationFields(cr);
            ArrayList<ResultMode2> resFields = new ArrayList<ResultMode2>();
            for(AgricultureField f : fields) {
                areaCR += f.getArea();
                fieldsAll++;
                if(f.equals(field1)) {
                    result2 = new ResultMode2(r, field1, predecessor1, cropRotationOfAgriculture1, gradeOfCrop1, levelOfIntensification1,
                            mainProcessing1, preseedingProcessing1, careOfCrops1, harvesting1, applicationOfFertilizers1, chemicalProtectionOfCrops1,
                            productivity_area, income_from_sale, st, productivity_areaSt, income_from_saleSt);
                    resFields.add(result2);
                    continue;
                }
                r.setFieldsUnproc(r.getFieldsUnproc() + Integer.toString(f.getFieldNumber()) + " ");
            }
            r.setArea(areaCR);
            r.setFieldsAll(fieldsAll);
            r.setResultsMode2(resFields);
            resultsCRs.add(r);
            if(cr.equals(cropRotationOfAgriculture1))
                resCR2 = r;
            areaAgr += areaCR;
        }
        solution2.setArea(areaAgr);
        solution2.setResultsCropRotation(resultsCRs);

        /*Сохраняем всё в БД
        dm.saveResultMode2(result2);
        dm.updateResultCropRotationMode2(resCR2, result2);
        dm.updateSolutionMode2(solution2, resCR2);*/

        /****КОНТРОЛЬ****
        System.out.println("sol1: prod = " + solution2.getProd() + " costs = " + solution2.getCosts());
        System.out.println("Затраты = " + result2.getCosts() + " руб. (" + result2.getCosts() / area + " руб/га)");
        float gain = income_from_sale - result2.getCosts();
        System.out.println("Прибыль = " + gain + " руб. (" + gain / area + " руб/га)");
        System.out.println("Затраты (станд.т.) = " + result2.getCostsSt() + " руб. (" + result2.getCostsSt()/area + " руб/га)");
        float gainSt = income_from_saleSt - result2.getCostsSt();
        System.out.println("Прибыль (станд.т.) = " + gainSt + " руб. (" + gainSt / area + " руб/га)");*/
/*
        Collection<ResultCropRotationMode2> resultsCRs = solution2.getResultsCropRotation();
        ResultCropRotationMode2 resCR2 = null;
        ResultMode2 result2 = null;
        for(ResultCropRotationMode2 cr : resultsCRs) {
            Collection<AgricultureField> fields = dm.getCropRotationFields(cr.getCropRotationOfAgriculture());
            for(AgricultureField f : fields) {
                if(f.equals(field1)) {
                    result2 = new ResultMode2(cr, field1, predecessor1, cropRotationOfAgriculture1, gradeOfCrop1, levelOfIntensification1,
                            mainProcessing1, preseedingProcessing1, careOfCrops1, harvesting1, applicationOfFertilizers1, chemicalProtectionOfCrops1,
                            productivity_area, income_from_sale, st, productivity_areaSt, income_from_saleSt);
                    continue;
                }
            }
            if(cr.getCropRotationOfAgriculture().equals(cropRotationOfAgriculture1))
                resCR2 = cr;
        }*/

        /*Сохраняем всё в БД
        dm.saveResultMode2(result2);
        dm.updateResultCropRotationMode2(resCR2, result2);
        dm.updateSolutionMode2(solution2, resCR2);

*/
    }

    public static void getSolutionMode3(DataManagerMode2 dm){
        /*Получаем хозяйства*/
        String testAgriculture = "1";
        Agricultures agriculture1 = dm.getAgriculture(testAgriculture);

         /*Формируем список сохраненных и еще не завершенных решений*/
        Collection<SolutionMode2> solutions = dm.getUnfineshedSolutionsMode2(agriculture1);
        /*System.out.println("Незавершенные решения: \n");
        for(SolutionMode3 s : solutions)
            System.out.println("\t" + s.getNameSolution());

        String solutionId = "1";
        /*Получаем выбранное решение*/
        /*SolutionMode3 solution3 = dm.getSolutionMode3(Integer.parseInt(solutionId));
        String nameSolution = solution3.getNameSolution();
        System.out.println("Выбрано решение:" + solutionId + " " + nameSolution); */


        float area; //площадь полей в севообороте
        int startYear; //год начала севооборота
        int year; //расчётный год

        /*Задаем искомые значения - для удобства отладки*/
        String nameSolution = "тест_" + new SimpleDateFormat("dd.MM.HH.mm").format(new Date());
        boolean testYield = true; //базовая урожайность; true - экспериментальная, false - расчетная
        String testRotation = "30";
        String testYear = "2018"; //расчётный год
        String testPred = "17";//предшественник
        String testGrade = "20";//сорт
        String testLevel = "2"; //уровень интенсификации
        String testMainProc = "1"; //основная обработка
        String testPresProc = "1";//предпосевная обработка
        String testCareCrop = "2"; //уход
        String testHarv = "3";//уборка
        String testFert = "1"; //удобрения
        String testChemPr = "1"; //хим.защита

        /*Получаем все активные севообороты хозяйства*/
        Collection<CropRotationOfAgriculture> r1 = dm.getActiveCropRotations(agriculture1);
        if(r1 == null) {
            System.out.println("null");
            return;
        }
        System.out.println("Активные севообороты:");
        for(CropRotationOfAgriculture r : r1)
            System.out.println("\t" + r.getCodeCropRotationOfAgriculture() + " " + r.getCropRotationOfAgricultureId());

        /*Получаем все необработанные в текущем решении с/о хозяйства*
        Collection<CropRotationOfAgriculture> r1 = dm.getUnprocessedCropRotationsMode3(solution3);
        if(r1 == null) {
            System.out.println("null");
            return;
        }
        System.out.println("Необработанные севообороты:");
        for(CropRotationOfAgriculture r : r1)
            System.out.println("\t" + r.getCodeCropRotationOfAgriculture() + " " + r.getCropRotationOfAgricultureId());

        /*Обрабатываем выбор*/
        CropRotationOfAgriculture cropRotationOfAgriculture1 = dm.getCropRotationAgriculture(r1, testRotation);
        System.out.println("Выбран севооборот: " + cropRotationOfAgriculture1.getCodeCropRotationOfAgriculture());
        Collection<AgricultureField> fields = dm.getCropRotationFields(cropRotationOfAgriculture1);
        area = dm.getAreaCropRotation(fields);
        System.out.println("\tплощадь: " + area);
        startYear = cropRotationOfAgriculture1.getStartYearCropRotationOfAgriculture();
        System.out.println("\tгод начала: " + startYear);

        /*Проверяем тип земли полей в составе с/о, выделяем основной;
            если есть тип, отличный от основного, то такие поля помещаем в отдельную коллекцию*/
        ArrayList<AgricultureField> othersFields = new ArrayList<AgricultureField>();
        TypeOfSoil typeOfSoil1 = dm.getTypesSoilOfFields(fields, othersFields);
        System.out.println("\tосновной тип земли полей: " + typeOfSoil1.getNameTypeSoil());
        if(othersFields.size() > 0)
            for(AgricultureField f : othersFields)
                System.out.println("\tПоля с другим типом земли: " + f.getFieldNumber());

        /*Обрабатываем выбор года*/
        year = Integer.parseInt(testYear);
        System.out.println("Расчётный год: " + year);

        /*Выводим всех допустимых предшественников для текущего с/о в данный год*/
        Collection<Predecessor> r2 = dm.getPredecessors(cropRotationOfAgriculture1, year);
        if (r2 == null) {
            System.out.println("null");
            return;
        }
        for (Predecessor o : r2)
            System.out.println(o.getCrop().getCodeCrop() + " " + o.getCrop().getNameCrop());
        /*Обрабатываем выбор: выводим выбранный код и группу культур предшественника*/
        Predecessor predecessor1 = dm.getPredecessor(r2, testPred);
        System.out.println("Предшественник: " + predecessor1.getCrop().getCodeCrop() + " " + predecessor1.getCrop().getGroupOfCrops().getNameGroupOfCrops());

        /*Выводим все допустимые сорта для текущего с/о в данный год*/
        Collection<GradeOfCrop> r3 = dm.getGradesOfCrops(cropRotationOfAgriculture1, year, agriculture1);
        if (r3 == null) {
            System.out.println("null");
            return;
        }
        for (GradeOfCrop o : r3)
            System.out.println(o.getCodeGradeOfCrop() + " " + o.getCrop().getNameCrop() + " " + o.getNameGradeOfCrops());
        /*Обрабатываем выбор: выводим код, наименование культуры и сорта*/
        GradeOfCrop gradeOfCrop1 = dm.getGradeOfCrop(r3, testGrade);
        System.out.println("Сорт: " + gradeOfCrop1.getCodeGradeOfCrop() + " " + gradeOfCrop1.getCrop().getNameCrop() + " " + gradeOfCrop1.getNameGradeOfCrops());

        /*Выводим уровни интенсификации в зависимости от типа земли и сорта*/
        Collection<LevelOfIntensification> r4 = dm.getLevelsOfIntensification(typeOfSoil1, gradeOfCrop1);
        if(r4 == null){
            System.out.println("null");
            return;
        }
        for(LevelOfIntensification o : r4)
            System.out.println(o.getLevelOfIntensificationId() + " " + o.getNameLevelOfIntensification());
        /*Обрабатываем выбор: выводим выбранный код и название*/
        LevelOfIntensification levelOfIntensification1 = dm.getLevelOfIntensification(r4, testLevel);
        System.out.println("Уровень интенсификации: " + levelOfIntensification1.getLevelOfIntensificationId() + " " + levelOfIntensification1.getNameLevelOfIntensification());

        /*Выводим виды основной обработки почв в зависимости от типа земли, уровня интен., культуры и предшественника*/
        Collection<MainProcessing>r5 = dm.getMainProcessings(typeOfSoil1, levelOfIntensification1, gradeOfCrop1.getCrop(), predecessor1, agriculture1);
        if(r5 == null){
            System.out.println("null");
            return;
        }
        for(MainProcessing o : r5)
            System.out.println(o.getMainProcessingId() + " " + o.getDescriptionMainProcessing());
        /*Обрабатываем выбор: выводим код и название*/
        MainProcessing mainProcessing1 = dm.getMainProcessing(r5, testMainProc);
        System.out.println("Основная обработка: " + mainProcessing1.getMainProcessingId() + " " + mainProcessing1.getDescriptionMainProcessing());

        /*Выводим виды предпосевной обработки в зависимости от типа земли, уровня инт., культуры, предш. и осн.обр*/
        Collection<PreseedingProcessingAndSowing> r6 = null;
        r6 = dm.getPreseedingProcessings(typeOfSoil1, levelOfIntensification1, gradeOfCrop1.getCrop(), predecessor1, mainProcessing1, agriculture1);
        if(r6 == null){
            System.out.println("null");
            return;
        }
        for(PreseedingProcessingAndSowing o : r6)
            System.out.println(o.getCodePreseedingProcessingAndSowing() + " " + o.getDescriptionPreseedingProcessingAndSowing());
        /*Обрабатываем выбор: выводим выбранный код и название*/
        PreseedingProcessingAndSowing preseedingProcessing1 = dm.getPreseedingProcessingAndSowing(r6, testPresProc);
        System.out.println("Предпосевная обработка: " + preseedingProcessing1.getCodePreseedingProcessingAndSowing() + " " + preseedingProcessing1.getDescriptionPreseedingProcessingAndSowing());
        /*Выводим уход за посевами в зависимости от уровня инт., сорта*/
        Collection<CareOfCrops> r7 = dm.getCaresOfCrops(levelOfIntensification1, gradeOfCrop1.getCrop(), agriculture1);
        if(r7 == null){
            System.out.println("null");
            return;
        }
        for(CareOfCrops o : r7)
            System.out.println(o.getCareOfCropsId() + " " + o.getDescriptionCareOfCrops());
        /*Обрабатываем выбор: выводим выбранный код и название*/
        CareOfCrops careOfCrops1 = dm.getCareOfCrops(r7, testCareCrop);
        System.out.println("Уход: " + careOfCrops1.getCareOfCropsId() + " " + careOfCrops1.getDescriptionCareOfCrops());

        /*Выводим виды уборки в зависимости от уровня инт., культуры: код, наименование*/
        Collection<Harvesting>r8 = dm.getHarvestings(levelOfIntensification1, gradeOfCrop1.getCrop(), agriculture1);
        if(r8 == null){
            System.out.println("null");
            return;
        }
        for(Harvesting o : r8)
            System.out.println(o.getCodeHarvesting() + " " + o.getDescriptionHarvesting());
        /*Обрабатываем выбор: выводим код и название*/
        Harvesting harvesting1 = dm.getHarvesting(r8, testHarv);
        System.out.println("Уборка: " + harvesting1.getCodeHarvesting() + " " + harvesting1.getDescriptionHarvesting());

        /*Выводим системы применения удобрений в зависимости от уровня интен. и сорта*/
        Collection<ApplicationOfFertilizers> r9 = dm.getFertilizers(typeOfSoil1, levelOfIntensification1, gradeOfCrop1.getCrop(), agriculture1);
        if(r9 == null){
            System.out.println("null");
            return;
        }
        for(ApplicationOfFertilizers o : r9)
            System.out.println(o.getCodeApplicationOfFertilizers() + " " + o.getDescriptionApplicationOfFertilizers());
        /*Обрабатываем выбор: выводим код и название*/
        ApplicationOfFertilizers applicationOfFertilizers1 = dm.getFertilizer(r9, testFert);
        System.out.println("Система удобрений: " + applicationOfFertilizers1.getCodeApplicationOfFertilizers() + " " + applicationOfFertilizers1.getDescriptionApplicationOfFertilizers());

        /*Выводим виды хим.защиты в зависимости от типа земли, уровня интенсификации, культуры: код, наименование*/
        Collection<ChemicalProtectionOfCrops>r10 = dm.getChemicalProtections(typeOfSoil1, levelOfIntensification1, gradeOfCrop1.getCrop(), agriculture1);
        if(r10 == null){
            System.out.println("null");
            return;
        }
        for(ChemicalProtectionOfCrops o : r10)
            System.out.println(o.getCodeChemicalProtectionOfCrops() + " " + o.getDescriptionChemicalProtectionOfCrops());
        /*Обрабатываем выбор: выводим код и название*/
        ChemicalProtectionOfCrops chemicalProtectionOfCrops1 = dm.getChemicalProtection(r10, testChemPr);
        System.out.println("Химическая защита: " + chemicalProtectionOfCrops1.getCodeChemicalProtectionOfCrops() + " " + chemicalProtectionOfCrops1.getDescriptionChemicalProtectionOfCrops());

               /*Создаем новое решение*
        SolutionMode2 solution3 = new SolutionMode2(nameSolution, new SimpleDateFormat("dd.MM.yyyy HH:mm").format(new Date()), year, agriculture1);
        float areaAgr = 0;
        ResultCropRotationMode2 resultCR3 = null;
        /*Создаем результат для всех активных с/о хозяйства*
        ArrayList<ResultCropRotationMode2> resultsCRs = new ArrayList<ResultCropRotationMode2>();
        ArrayList<ResultMode2> resFields = new ArrayList<ResultMode2>();
        for(CropRotationOfAgriculture cr : r1){
            ResultCropRotationMode3 r = null;

            if(cr.equals(cropRotationOfAgriculture1)){
                StandartTechnology st = dm.getStandartTechnology(gradeOfCrop1, levelOfIntensification1);
                r = new ResultCropRotationMode2(solution3, cr, predecessor1, gradeOfCrop1, levelOfIntensification1, mainProcessing1,
                        preseedingProcessing1, careOfCrops1, harvesting1, applicationOfFertilizers1, chemicalProtectionOfCrops1, st);

                Collection<AgricultureField> crFields = dm.getCropRotationFields(cr);
                for(AgricultureField crF : crFields) {
                    /*ОБРАБОТКА ВЫБРАННЫХ ПАРАМЕТРОВ ДЛЯ УЧАСТКА*
                    float productivity = dm.countProductivity(testYield, typeOfSoil1, levelOfIntensification1, gradeOfCrop1.getCrop(), gradeOfCrop1,
                            predecessor1, mainProcessing1, preseedingProcessing1, careOfCrops1, harvesting1,
                            chemicalProtectionOfCrops1);
                    float productivity_area = productivity * crF.getArea();
                    float income_from_sale = dm.countKIncome(levelOfIntensification1, gradeOfCrop1);
                    income_from_sale *= productivity_area * KInf;
                    float productivitySt = dm.countProductivity(testYield, typeOfSoil1, levelOfIntensification1, gradeOfCrop1.getCrop(), gradeOfCrop1,
                            predecessor1, st.getMainProcessing(), st.getPreseedingProcessingAndSowing(), st.getCareOfCrops(),
                            st.getHarvesting(), st.getChemicalProtectionOfCrops());
                    float productivity_areaSt = productivitySt * crF.getArea();
                    float income_from_saleSt = dm.countKIncome(levelOfIntensification1, gradeOfCrop1);
                    income_from_saleSt *= productivity_areaSt * KInf;

                    ResultMode3 result3 = new ResultMode3(r, crF, predecessor1, cr, gradeOfCrop1, levelOfIntensification1, mainProcessing1,
                            preseedingProcessing1, careOfCrops1, harvesting1, applicationOfFertilizers1, chemicalProtectionOfCrops1,
                            productivity_area, income_from_sale, st, productivity_areaSt, income_from_saleSt, false);
                    resFields.add(result3);
                    areaAgr += crF.getArea();
                }
                resultsCRs.add(r);
                resultCR3 = r;
                continue;
            }

            r = new ResultCropRotationMode3(cr, solution3);
            float areaCR = 0;
            Collection<AgricultureField> crFields = dm.getCropRotationFields(cr); //поля в с/о
            int fieldsAll = crFields.size();
            for(AgricultureField crF : crFields)
                areaCR += crF.getArea();

            r.setArea(areaCR);
            r.setFieldsAll(fieldsAll);
            resultsCRs.add(r);
            areaAgr += r.getArea();
        }

        solution3.setResultsCropRotation(resultsCRs);
        solution3.setArea(areaAgr);

        for(ResultMode3 r : resFields)
            dm.saveResultMode3(r);
        dm.updateResultCropRotationMode3(resultCR3, resFields);
        dm.updateSolutionMode3(solution3, resultCR3);*/

        /*ОБРАБОТКА ВЫБРАННЫХ ПАРАМЕТРОВ*/
        /*Получаем результаты по активным с/о хозяйства*
        Collection<ResultCropRotationMode3> resultsCRs = solution3.getResultsCropRotation();
        ResultCropRotationMode3 resultCR3 = null;
        ArrayList<ResultMode3> resFields = new ArrayList<ResultMode3>();
        for(ResultCropRotationMode3 cr : resultsCRs){
            if(cr.getCropRotationOfAgriculture().equals(cropRotationOfAgriculture1)){
                StandartTechnology st = dm.getStandartTechnology(gradeOfCrop1, levelOfIntensification1);

                dm.setTechnologiesCropRotation(cr, predecessor1, gradeOfCrop1, levelOfIntensification1, mainProcessing1,
                        preseedingProcessing1, careOfCrops1, harvesting1, applicationOfFertilizers1, chemicalProtectionOfCrops1, st);

                Collection<AgricultureField> crFields = dm.getCropRotationFields(cr.getCropRotationOfAgriculture());
                for(AgricultureField crF : crFields) {
                    /*ОБРАБОТКА ВЫБРАННЫХ ПАРАМЕТРОВ ДЛЯ УЧАСТКА*
                    float productivity = dm.countProductivity(testYield, typeOfSoil1, levelOfIntensification1, gradeOfCrop1.getCrop(), gradeOfCrop1,
                            predecessor1, mainProcessing1, preseedingProcessing1, careOfCrops1, harvesting1,
                            chemicalProtectionOfCrops1);
                    float productivity_area = productivity * crF.getArea();
                    float income_from_sale = dm.countKIncome(levelOfIntensification1, gradeOfCrop1);
                    income_from_sale *= productivity_area * KInf;
                    float productivitySt = dm.countProductivity(testYield, typeOfSoil1, levelOfIntensification1, gradeOfCrop1.getCrop(), gradeOfCrop1,
                            predecessor1, st.getMainProcessing(), st.getPreseedingProcessingAndSowing(), st.getCareOfCrops(),
                            st.getHarvesting(), st.getChemicalProtectionOfCrops());
                    float productivity_areaSt = productivitySt * crF.getArea();
                    float income_from_saleSt = dm.countKIncome(levelOfIntensification1, gradeOfCrop1);
                    income_from_saleSt *= productivity_areaSt * KInf;

                    ResultMode3 result3 = new ResultMode3(cr, crF, predecessor1, cr.getCropRotationOfAgriculture(), gradeOfCrop1, levelOfIntensification1, mainProcessing1,
                            preseedingProcessing1, careOfCrops1, harvesting1, applicationOfFertilizers1, chemicalProtectionOfCrops1,
                            productivity_area, income_from_sale, st, productivity_areaSt, income_from_saleSt, false);
                    resFields.add(result3);
                }
                resultCR3 = cr;
                break;
            }
        }

        for(ResultMode3 r : resFields)
            dm.saveResultMode3(r);
        dm.updateResultCropRotationMode3(resultCR3, resFields);
        dm.updateSolutionMode3(solution3, resultCR3);

            /*ВЫГРУЗКА РЕЗУЛЬТАТОВ В ТАБЛИЦЫ*
        resultsCRs = solution3.getResultsCropRotation();

        String agrRotsProc = "", agrRotsUnproc = "";
        for(ResultCropRotationMode3 rCR : resultsCRs){
            if(rCR.getStatus().equals("Завершено"))
                agrRotsProc += rCR.getName() + " ";
            else
                agrRotsUnproc += rCR.getName() + " ";
        }
        System.out.println("agrRotsProc: " + agrRotsProc); //список заверш. с/о
        System.out.println("agrRotsUnproc: " + agrRotsUnproc); //список незаверш. с/о
*/
    }

    public static void main(String [] args){
        try {
            LoadData.loadJdoProperties();
            StorageManager sm = StorageManagerFactory.getStorageManager();

            DataManagerMode1 dm1 = new DataManagerMode1(sm);
            System.out.println("dm1 != null is " + (dm1 != null));

            DataManagerMode2 dm2 = new DataManagerMode2(sm, "Завершено", "Не завершено");
            System.out.println("dm2 != null is " + (dm2 != null));

           // methodForCount(sm, dm2);
            getSolutionMode1(dm1);

           // getSolutionMode2(dm2);

           // getSolutionMode3(dm2);



        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

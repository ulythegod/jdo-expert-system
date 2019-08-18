package core.logic;

import core.data.*;
import core.data.storage.StorageManager;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Author: Skosyreva Maria
 * Date: 17.08.2016
 * Time: 17:31
 *
 * Класс содержит методы получения данных и знаний для реализации бизнес-логики
 * модуля Формирования пакетов адаптивных технологий (методы - общие для всех 3х режимов раздела),
 * а также для режима Электронных карт
 */

public class DataManager {
    protected StorageManager sm = null;
    /**
     * @param sm Объект, позовляющий оперировать запросами к базе данных
     */
    public DataManager(StorageManager sm) {
        this.sm = sm;
    }

    /**
     * Возвращает объект "Хозяйство" по заданному идентификатору
     * @param idAgriculture Идентификатор хозяйства
     * @return Хозяйство
     */
    public Agricultures getAgriculture(String idAgriculture) {
        return (Agricultures)sm.findById(new AgriculturesId(idAgriculture));
    }

    /**
     * Возвращает объект "Земельная база" по заданному идентификатору
     * @param idLandBase Идентификатор земельной базы
     * @return Земельная база
     */
    public LandBase getLandBase(String idLandBase) {
        return (LandBase)sm.findById(new LandBaseId(idLandBase));
    }

    /**
     * Возвращает коллекцию всех полей хозяйства
     * @param agriculture Хозяйство
     * @return Коллекция полей хозяйства
     */
    public Collection<AgricultureField> getAllFields(Agricultures agriculture){
        return sm.findByField(AgricultureField.class, "agriculture", agriculture, "==");
    }

    /**
     * Возвращает коллекцию всех полей хозяйства активной земельной базы
     * @param landBase Земельная база
     * @return Коллекция полей хозяйства
     */
    public Collection<AgricultureField> getAllFields(LandBase landBase) {
        Collection<LandBase_2_AgricultureField> fieldsOfLandBase = sm.findByField(LandBase_2_AgricultureField.class,
                "landBase", landBase, "==");
        ArrayList<AgricultureField> fields = new ArrayList<AgricultureField>();
        for(LandBase_2_AgricultureField fLB : fieldsOfLandBase)
            fields.add(fLB.getAgricultureField());
        return fields;
    }
    /**
     * Возвращает объект "Поле хозяйства" по идентификатору из списка доступных хозяйству полей
     * @param r Поля хозяйства
     * @param value Идентификатор поля
     * @return Поле хозяйства
     */
    public AgricultureField getAgricultureField(Collection<AgricultureField> r, Object value){
        for(AgricultureField f : r)
            if(Integer.toString(f.getAgricultureFieldId()).equals(value))
             return f;
        return null;
    }

    /**
     * Обновляет данные о типе почвы поля
     * @param oldField Обновляемое поле
     * @param typeOfSoil Новый тип почвы
     */
    public void saveAgricultureField(AgricultureField oldField, TypeOfSoil typeOfSoil) {
        System.out.println("saveAgrField with typeSoil");
        /*Обновляем/задаём тип почвы для поля*/
        String [] params = {"typeOfSoil"};
        AgricultureField newField = new AgricultureField();
        newField.setTypeOfSoil(typeOfSoil);
        sm.update(oldField, newField, params);
        System.out.println("UPDATE typeSoil of field №" + oldField.getFieldNumber());

        /*Если такого типа почвы не было в хозяйстве - добавляем в связку*/
        Agricultures agr = oldField.getAgriculture();
        Collection<TypeOfSoil_2_Agriculture> typeSoilAgr = agr.getTypeOfSoils();
        for(TypeOfSoil_2_Agriculture type : typeSoilAgr)
            if(type.getTypeOfSoil().equals(typeOfSoil))
                return;
        TypeOfSoil_2_Agriculture newTypeSoilOfAgr = new TypeOfSoil_2_Agriculture();
        newTypeSoilOfAgr.setAgriculture(agr);
        newTypeSoilOfAgr.setTypeOfSoil(typeOfSoil);
        newTypeSoilOfAgr.setColor(typeOfSoil.getColor());
        sm.create(newTypeSoilOfAgr);
        System.out.println("Add new typeOfSoil of agriculture");

    }

    public void saveAgricultureField(AgricultureField field) {
        System.out.println("Method: saveAgrField");
        if(field.getAgricultureFieldId() < 0){
            System.out.println("save agricultureField: "+ field.getAgricultureFieldId());
            sm.create(field);
            System.out.println("CREATE, id = " + field.getAgricultureFieldId());
            return;
        }
        AgricultureField oldField = (AgricultureField)sm.findById(new AgricultureFieldId(String.valueOf(field.getAgricultureFieldId())));
        String [] params = {"fieldNumber", "area", "color"};
        if(field.getArea() == 0)
            params = new String[]{"fieldNumber", "color"};
        if(field.getFieldNumber() == 0)
            params = new String[]{"area", "color"};
        sm.update(oldField, field, params);
        System.out.println("agrField updated, id = " + field.getAgricultureFieldId());
    }

    /**
     * Возвращает коллекцию культур на заданном поле (в текущем и предыдущем году)
     * @param field Поле хозяйства
     * @return Коллекция из связок вида "поле-культура-год"
     */
    public Collection<Crop_2_AgricultureField_2_Year> getCropsOfAgricultureField(AgricultureField field) {
        return sm.findByField(Crop_2_AgricultureField_2_Year.class, "agricultureField", field, "==");
    }



    /**
     * Возвращает коллекцию всех типов почв в базе знаний
     * @return Типы почв
     */
    public Collection<TypeOfSoil> getAllTypeSoils() {
        return sm.findAll(TypeOfSoil.class);
    }

    /**
     * Возвращает объект "Предшественник" по идентификатору из списка доступных хозяйству предшественников
     * @param r Коллекция предшественников
     * @param value Идентификатор предшественника
     * @return Предшественник
     */
    public Predecessor getPredecessor(Collection<Predecessor> r, Object value){
        for(Predecessor p : r)
            if (Integer.toString(p.getPredecessorId()).equals(value))
                return p;
        return null;
    }

    public Collection<Crop> getAllCrops(){
        return sm.findAll(Crop.class);
    }

    /**
     * Возвращает объект "Сорт" по идентификатору из списка доступных хозяйству сортов
     * @param r Коллекция сортов
     * @param value Идентификатор сорта
     * @return Сорт
     */
    public GradeOfCrop getGradeOfCrop(Collection<GradeOfCrop> r, Object value){
        for(GradeOfCrop g : r)
            if(Integer.toString(g.getGradeOfCropId()).equals(value))
                return g;
        return null;
    }

    /**
     * Возвращает коллекцию объектов "Стоимость семян" для сорта в хозяйстве (на различные даты)
     * @param gradeOfCrop Сорт
     * @param agriculture Хозяйство
     * @return Коллекция цен на семена
     */
    public Collection<CostOfSeed> getCostsOfSeed(GradeOfCrop gradeOfCrop, Agricultures agriculture){
        String[] fieldName = {"gradeOfCrop", "agriculture"};
        Object[] value = {gradeOfCrop, agriculture};
        String[] condition = {"==", "=="};
        return sm.findByField(CostOfSeed.class, fieldName, value, condition);
    }

    /**
     * Возвращает значение стоимости семян по идентификатору из списка всех цен сорта в хозяйстве
     * @param r Коллекция цен на семена
     * @param value Идентификатор стоимости
     * @return Стоимость семян (руб/га)
     */
    public float getCostOfSeed(Collection<CostOfSeed> r, Object value){
        for(CostOfSeed c : r)
            if(Integer.toString(c.getCostOfSeedId()).equals(value))
                return c.getCostOfSeed();
        return 0;
    }

    /**
     * Возвращает коллекцию объектов "Уровень интенсификации" с учётом правил базы знаний
     * @param typeOfSoil Тип почвы
     * @param gradeOfCrop Сорт
     * @return Коллекция уровней интенсификации
     */
    public Collection<LevelOfIntensification> getLevelsOfIntensification(TypeOfSoil typeOfSoil, GradeOfCrop gradeOfCrop){
        String[] fieldName = {"typeOfSoil", "gradeOfCrop"};
        Object[] value = {typeOfSoil, gradeOfCrop};
        String[] condition = {"==", "=="};
        Collection<GradeOfCrop_2_LevelOfIntensification_2_TypeOfSoil> levels = sm.findByField(GradeOfCrop_2_LevelOfIntensification_2_TypeOfSoil.class, fieldName, value, condition);

        Collection<StandartTechnology> st = sm.findByField(StandartTechnology.class, "gradeOfCrop", gradeOfCrop, "==");
        HashSet<LevelOfIntensification> levelSt = new HashSet<LevelOfIntensification>();
        for(StandartTechnology l : st)
            levelSt.add(l.getLevelOfIntensification());

        ArrayList<LevelOfIntensification> result = new ArrayList<LevelOfIntensification>();
        for (GradeOfCrop_2_LevelOfIntensification_2_TypeOfSoil l : levels)
            if(levelSt.contains(l.getLevelOfIntensification()))
                result.add(l.getLevelOfIntensification());
        return result;
    }

    /**
     * Возвращает объект "Уровень интенсификации" по идентификатору из списка доступных хозяйству уровней интенсификации
     * @param r Коллекция уровней интенсификации
     * @param value Идентификатор уровня интенсификации
     * @return Уровень интенсификации
     */
    public LevelOfIntensification getLevelOfIntensification(Collection<LevelOfIntensification> r, Object value){
        for(LevelOfIntensification l : r)
            if(Integer.toString(l.getLevelOfIntensificationId()).equals(value))
                return l;
        return null;
    }

    /**
     * Возвращает коллекцию объектов "Основная обработка" с учётом правил базы знаний и доступных хозяйству
     * @param typeOfSoil Тип почвы
     * @param level Уровень интенсификации
     * @param crop Культура
     * @param predecessor Предшественник
     * @param agriculture Хозяйство
     * @return Коллекция операций основной обработки
     */
    public Collection<MainProcessing> getMainProcessings(TypeOfSoil typeOfSoil, LevelOfIntensification level, Crop crop, Predecessor predecessor,  Agricultures agriculture){
        //доступные для хозяйства операции основной обработки
        Collection<MainProcessing_2_Agriculture> mpsAgr = sm.findByField(MainProcessing_2_Agriculture.class, "agriculture", agriculture, "==");
        //доступные операции основной обработки из базы знаний
        String[] fieldName = {"typeOfSoil", "levelOfIntensification", "crop", "predecessor"};
        Object[] value = {typeOfSoil, level, crop, predecessor};
        String[] condition = {"==", "==", "==", "=="};
        Collection<MainProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_F1_2_F2> mps =
                sm.findByField(MainProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_F1_2_F2.class, fieldName, value, condition);

        HashSet<MainProcessing> result = new HashSet<MainProcessing>();
        for(MainProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_F1_2_F2 mp : mps){
            for(MainProcessing_2_Agriculture mpA : mpsAgr)
                if(mp.getMainProcessing().equals(mpA.getMainProcessing()))
                    result.add(mpA.getMainProcessing());
        }
        return result;
    }

    /**
     * Возвращает объект "Основная обработка" по идентификатору из списка доступных хозяйству операций основной обработки
     * @param r Коллекция операций основной обработки
     * @param value Идентификатор основной обработки
     * @return Основная обработка
     */
    public MainProcessing getMainProcessing(Collection<MainProcessing> r, Object value){
        for(MainProcessing m : r)
            if(Integer.toString(m.getMainProcessingId()).equals(value))
                return m;
        return null;
    }

    /**
     * Возвращает коллекцию объектов "Стоимость основной обработки" в хозяйстве для заданной основной обработки (на различные даты)
     * @param mainProcessing Основная обработка
     * @param agriculture Хозяйство
     * @return Коллекция цен на основную обработку
     */
    public Collection<CostOfMainProcessing> getCostsOfMainProcessing(MainProcessing mainProcessing, Agricultures agriculture){
        String[] fieldName = {"mainProcessing", "agriculture"};
        Object[] value = {mainProcessing, agriculture};
        String[] condition = {"==", "=="};
        return sm.findByField(CostOfMainProcessing.class, fieldName, value, condition);
    }

    /**
     * Возвращает значение объекта "Стоимость основной обработки" по идентификатору из списка всех
     * цен на заданную операцию в хозяйстве
     * @param r Коллекция цен на основную обработку
     * @param value Идентификатор стоимости основной обработки
     * @return Значение стоимости основной обработки (руб/га)
     */
    public float getCostOfMainProcessing(Collection<CostOfMainProcessing> r, Object value){
        for(CostOfMainProcessing c : r)
            if(Integer.toString(c.getCostOfMainProcessingId()).equals(value))
                return c.getCostOfMainProcessing();
        return 0;
    }

    /**
     * Возвращает коллекцию объектов "Предпосевная обработка"  с учётом правил базы знаний и доступных хозяйству
     * @param typeOfSoil Тип почвы
     * @param level Уровень интенсификации
     * @param crop Культура
     * @param predecessor Предшественник
     * @param mainProc Основная обработка
     * @param agriculture Хозяйство
     * @return Коллеция операций предпосевной обработки
     */
    public Collection<PreseedingProcessingAndSowing> getPreseedingProcessings(
            TypeOfSoil typeOfSoil, LevelOfIntensification level, Crop crop, Predecessor predecessor, MainProcessing mainProc, Agricultures agriculture){
        //доступные для хозяйства операции
        Collection<PreseedingProcessing_2_Agriculture> ppsAgr = sm.findByField(PreseedingProcessing_2_Agriculture.class, "agriculture", agriculture, "==");
        //доступные операции предпосевной обработки из базы знаний
        String[] fieldName = {"typeOfSoil", "levelOfIntensification", "crop", "predecessor", "mainProcessing"};
        Object[] value = {typeOfSoil, level, crop, predecessor, mainProc};
        String[] condition = {"==", "==", "==", "==", "=="};
        Collection<PreseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2> pps =
                sm.findByField(PreseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2.class, fieldName, value, condition);

        HashSet<PreseedingProcessingAndSowing> result = new HashSet<PreseedingProcessingAndSowing>();
        for(PreseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2 pp : pps)
            for(PreseedingProcessing_2_Agriculture ppA : ppsAgr)
                if(pp.getPreseedingProcessingAndSowing().equals(ppA.getPreseedingProcessingAndSowing()))
                    result.add(ppA.getPreseedingProcessingAndSowing());
        return result;
    }

    /**
     * Возвращает объект "Предпосевная обработка" по идентификатору из списка доступных хозяйству
     * операций предпосевной обработки
     * @param r Коллекция операций предпосевной обработки
     * @param value Идентификатор предпосевной обработки
     * @return Предпосевная обработка
     */
    public static PreseedingProcessingAndSowing getPreseedingProcessingAndSowing(Collection<PreseedingProcessingAndSowing> r, Object value){
        for(PreseedingProcessingAndSowing p : r)
            if(Integer.toString(p.getPreseedingProcessingAndSowingId()).equals(value))
                return p;
        return null;
    }

    /**
     * Возвращает коллекцию объектов "Стоимость предпосевной обработки" в хозяйстве
     * для заданной предпосевной обработки (на различные даты)
     * @param preseedingProcessing Предпосевная обработка
     * @param agriculture Хозяйство
     * @return Коллеция цен на предпосевную обработку
     */
    public Collection<CostOfPreseedingProcessingAndSowing> getCostsOfPreseedingProcessingAndSowing(PreseedingProcessingAndSowing preseedingProcessing, Agricultures agriculture){
        String[] fieldName = {"preseedingProcessingAndSowing ", "agriculture"};
        Object[] value = {preseedingProcessing, agriculture};
        String[] condition = {"==", "=="};
        return sm.findByField(CostOfPreseedingProcessingAndSowing.class, fieldName, value, condition);
    }

    /**
     * Возвращает значение объекта "Стоимость предпосевной обработки" по идентификатору из списка всех
     * цен на заданную операцию в хозяйстве
     * @param r Коллеция операций предпосевной обработки
     * @param value Идентификатор стоимости предпосевной обработки
     * @return Стоимость предпосевной обработки (руб/га)
     */
    public float getCostOfPreseedingProcessing(Collection<CostOfPreseedingProcessingAndSowing> r, Object value){
        for(CostOfPreseedingProcessingAndSowing c : r)
            if(Integer.toString(c.getCostOfPreseedingProcessingAndSowingId()).equals(value))
                return c.getCostOfPreseedingProcessingAndSowing();
        return 0;
    }

    /**
     * Возвращает коллекцию объектов "Уход за посевами" с учётом правил базы знаний и доступных хозяйству
     * @param level Уровень интенсификации
     * @param crop Культура
     * @param agriculture Хозяйство
     * @return Коллекция операций ухода за посевами
     */
    public Collection<CareOfCrops> getCaresOfCrops(LevelOfIntensification level, Crop crop, Agricultures agriculture){
        //доступные для хозяйства операции
        Collection<CareOfCrops_2_Agriculture> ccsAgr = sm.findByField(CareOfCrops_2_Agriculture.class, "agriculture", agriculture, "==");
        //доступные операции из базы знаний
        String[] fieldName = {"levelOfIntensification", "crop" };
        Object[] value = {level, crop};
        String[] condition = {"==", "=="};
        Collection<CareOfCrops_2_LevelOfIntensification_2_Crop_2_F1_2_F2> ccs =
                sm.findByField(CareOfCrops_2_LevelOfIntensification_2_Crop_2_F1_2_F2.class, fieldName, value, condition);

        HashSet<CareOfCrops> result = new HashSet<CareOfCrops>();
        for(CareOfCrops_2_LevelOfIntensification_2_Crop_2_F1_2_F2 cc : ccs)
            for(CareOfCrops_2_Agriculture ccA : ccsAgr)
                if(cc.getCareOfCrops().equals(ccA.getCareOfCrops()))
                    result.add(ccA.getCareOfCrops());
        return result;
    }

    /**
     * Возвращает объект "Уход за посевами" по идентификатору из списка доступных хозяйству операций ухода за посевами
     * @param r Коллекция операций ухода за посевами
     * @param value Идентификатор ухода за посевами
     * @return Уход за посевами
     */
    public CareOfCrops getCareOfCrops(Collection<CareOfCrops> r, Object value){
        for(CareOfCrops c : r)
            if(Integer.toString(c.getCareOfCropsId()).equals(value))
                return c;
        return null;
    }

    /**
     * * Возвращает коллекцию объектов "Стоимость ухода за посевами" в хозяйстве
     * для заданного ухода за посевами(на различные даты)
     * @param careOfCrops Уход за посевами
     * @param agriculture Хозяйство
     * @return Коллекция цен на уход за посевами
     */
    public Collection<CostOfCareOfCrops> getCostsOfCareCrops(CareOfCrops careOfCrops, Agricultures agriculture){
        String[] fieldName = {"careOfCrops ", "agriculture"};
        Object[] value = {careOfCrops, agriculture};
        String[] condition = {"==", "=="};
        return sm.findByField(CostOfCareOfCrops.class, fieldName, value, condition);
    }

    /**
     * Возвращает значение объекта "Стоимость ухода за посевами" по идентификатору из списка всех
     * цен на заданную операцию в хозяйстве
     * @param r Коллекция цен на операцию ухода за посевами
     * @param value Идентификатор стоимости ухода за посевами
     * @return Стоимость ухода за посевами (руб/га)
     */
    public float getCostOfCareOfCrops(Collection<CostOfCareOfCrops> r, Object value){
        for(CostOfCareOfCrops c : r)
            if(Integer.toString(c.getCostOfCareOfCropsId()).equals(value))
                return c.getCostOfCareOfCrops();
        return 0;
    }

    /**
     * Возвращает коллекцию объектов "Уборка"  с учётом правил базы знаний и доступных хозяйству
     * @param level Уровень интенсификации
     * @param crop Культура
     * @param agriculture Хозяйство
     * @return Коллекция операций уборки
     */
    public Collection<Harvesting> getHarvestings(LevelOfIntensification level, Crop crop, Agricultures agriculture){
        //доступные хозяйству операции
        Collection<Harvesting_2_Agriculture> hsAgr = sm.findByField(Harvesting_2_Agriculture.class, "agriculture", agriculture, "==");
        //доступные операции из базы знаний
        String[] fieldName = {"levelOfIntensification", "crop" };
        Object[] value = {level, crop};
        String[] condition = {"==", "=="};
        Collection<Harvesting_2_LevelOfIntensification_2_Crop_2_Factor> hs =
                sm.findByField(Harvesting_2_LevelOfIntensification_2_Crop_2_Factor.class, fieldName, value, condition);

        HashSet<Harvesting> result = new HashSet<Harvesting>();
        for(Harvesting_2_LevelOfIntensification_2_Crop_2_Factor h : hs)
            for(Harvesting_2_Agriculture ha : hsAgr)
                if(h.getHarvesting().equals(ha.getHarvesting()))
                    result.add(ha.getHarvesting());
        return result;
    }

    /**
     * Возвращает объект "Уборка" по идентификатору из списка доступных хозяйству операций уборки
     * @param r Коллекция операций уборки
     * @param value Идентификатор уборки
     * @return Уборка
     */
    public Harvesting getHarvesting(Collection<Harvesting> r, Object value){
        for(Harvesting h : r)
            if(Integer.toString(h.getHarvestingId()).equals(value))
                return h;
        return null;
    }

    /**
     * * Возвращает коллекцию объектов "Стоимость уборки" в хозяйстве для заданной уборки (на различные даты)
     * @param harvesting Уборка
     * @param agriculture Хозяйство
     * @return Коллекция цен за уборку
     */
    public Collection<CostOfHarvesting> getCostsOfHarvesting(Harvesting harvesting, Agricultures agriculture){
        String[] fieldName = {"harvesting ", "agriculture"};
        Object[] value = {harvesting, agriculture};
        String[] condition = {"==", "=="};
        return sm.findByField(CostOfHarvesting.class, fieldName, value, condition);
    }

    /**
     * Возвращает значение объекта "Стоимость уборки" по идентификатору из списка всех
     * цен на заданную операцию в хозяйстве
     * @param r Коллекция цен на операцию уборки
     * @param value Идентификатор стоимости уборки
     * @return Стоимость уборки (руб/га)
     */
    public float getCostOfHarvesting(Collection<CostOfHarvesting> r, Object value){
        for(CostOfHarvesting c : r)
            if(Integer.toString(c.getCostOfHarvestingId()).equals(value))
                return c.getCostOfHarvesting();
        return 0;
    }

    /**
     * Возвращает коллекцию объектов "Применение удобрений"  с учётом правил базы знаний и доступных хозяйству
     * @param typeOfSoil Тип почвы
     * @param level Уровень интенсификации
     * @param crop Культура
     * @param agriculture Хозяйство
     * @return Коллекция операций применения удобрений
     */
    public Collection<ApplicationOfFertilizers> getFertilizers(TypeOfSoil typeOfSoil, LevelOfIntensification level, Crop crop, Agricultures agriculture){
        //доступные хозяйству операции
        Collection<ApplicationOfFertilizers_2_Agriculture> afsAgr = sm.findByField(ApplicationOfFertilizers_2_Agriculture.class, "agriculture", agriculture, "==");
        //доступные операции из базы знаний
        String[] fieldName = {"typeOfSoil", "levelOfIntensification", "crop"};
        Object[] value = {typeOfSoil, level, crop};
        String[] condition = {"==", "==", "=="};
        Collection<ApplicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_Crop> afs =
                sm.findByField(ApplicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_Crop.class, fieldName, value, condition);

        HashSet<ApplicationOfFertilizers> result = new HashSet<ApplicationOfFertilizers>();
        for(ApplicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_Crop af : afs)
            for(ApplicationOfFertilizers_2_Agriculture afA : afsAgr)
                if(af.getApplicationOfFertilizers().equals(afA.getApplicationOfFertilizers()))
                    result.add(afA.getApplicationOfFertilizers());
        return result;
    }

    /**
     * Возвращает объект "Применение удобрений" по идентификатору из списка доступных хозяйству операций применения удобрений
     * @param r Коллекция операция применения удобнений
     * @param value Идентификатор операции применения удобрений
     * @return Применение удобрений
     */
    public ApplicationOfFertilizers getFertilizer(Collection<ApplicationOfFertilizers> r, Object value){
        for(ApplicationOfFertilizers a : r)
            if(Integer.toString(a.getApplicationOfFertilizersId()).equals(value))
                return a;
        return null;
    }

    /**
     * * Возвращает коллекцию объектов "Стоимость применения удобрений" в хозяйстве
     * для заданного применения удобрений (на различные даты)
     * @param applicationOfFertilizers Применение удобрений
     * @param agriculture Хозяйство
     * @return Коллекция цен на применение удобрений
     */
    public Collection<CostOfApplicationOfFertilizers> getCostsOfApplicationOfFertilizers(ApplicationOfFertilizers applicationOfFertilizers, Agricultures agriculture){
        String[] fieldName = {"applicationOfFertilizers ", "agriculture"};
        Object[] value = {applicationOfFertilizers, agriculture};
        String[] condition = {"==", "=="};
        return sm.findByField(CostOfApplicationOfFertilizers.class, fieldName, value, condition);
    }
    /**
     * * Возвращает коллекцию объектов "Стоимость сырья удобрения" в хозяйстве
     * для заданного применения удобрений (на различные даты)
     * @param gradeOfCrop Сорт
     * @param agriculture Хозяйство
     * @return Коллекция цен на сырьё удобрения
     */
    public Collection<CostOnProductionFertilizer> getCostOnProductionFertilizer(GradeOfCrop gradeOfCrop, Agricultures agriculture){
        String[] fieldName = {"gradeOfCrop ", "agriculture"};
        Object[] value = {gradeOfCrop, agriculture};
        String[] condition = {"==", "=="};
        return sm.findByField(CostOnProductionFertilizer.class, fieldName, value, condition);
    }

    /**
     * Возвращает значение объекта "Стоимость применения удобрений" по идентификатору из списка всех
     * цен на заданную операцию в хозяйстве
     * @param r Коллекция цен операции применения удобрений
     * @param value Идентификатор стоимости применения удобрений
     * @return Стоимость применения удобрений (руб/га)
     */
    public float getCostOfApplicationOfFertilizer(Collection<CostOfApplicationOfFertilizers> r, Object value){
       for(CostOfApplicationOfFertilizers c : r)
           if (Integer.toString(c.getCostOfApplicationOfFertilizersId()).equals(value))
               return c.getCostOfApplicationOfFertilizers();
        return 0;
    }

    /**
     * Возвращает значение объекта "Стоимость сырья для удобрения" по идентификатору из списка всех
     * цен на заданную операцию в хозяйстве
     * @param r Коллекция цен на сырьё для удобрения
     * @param value Идентификатор стоимости сырья для удобрения
     * @param level Уровень интенсификации
     * @return Стоимость сырья для удобрения (руб/га)
     */
    public float getCostProductionFertilizer(Collection<CostOnProductionFertilizer> r, Object value, LevelOfIntensification level){
        for(CostOnProductionFertilizer c : r)
            if(Integer.toString(c.getCostOnProductionFertilizerId()).equals(value)){
                if(level.getLevelOfIntensificationId() == 2)
                    return c.getCostOfFertilizerAtNormalLevel();
                if(level.getLevelOfIntensificationId() == 3)
                    return c.getCostOfFertilizerAtIntensiveLevel();
            }
        return 0;
    }

    /**
     * Возвращает объект "Стоимость сырья для удобрения" для получения коэффициента доходности
     * @param fieldName Название сорта
     * @param value Сорт
     * @return Коэффициент доходности
     */

    /**
     * Возвращает коллекцию объектов "Химическая защита"  с учётом правил базы знаний и доступных хозяйству
     * @param typeOfSoil Тип почвы
     * @param level Уровень интенсификации
     * @param crop Культура
     * @param agriculture Хозяйство
     * @return Коллекция операций химической защиты
     */
    public Collection<ChemicalProtectionOfCrops> getChemicalProtections(TypeOfSoil typeOfSoil, LevelOfIntensification level, Crop crop, Agricultures agriculture){
        //доступные хозяйству операции
        Collection<ChemicalProtection_2_Agriculture> chsAgr = sm.findByField(ChemicalProtection_2_Agriculture.class, "agriculture", agriculture, "==");
        //доступные операции из базы знаний
        String[] fieldName = {"typeOfSoil", "levelOfIntensification", "crop"};
        Object[] value = {typeOfSoil, level, crop};
        String[] condition = {"==", "==", "=="};
        Collection<ChemicalProtectionOfCrops_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_F1_2_F2> chs =
                sm.findByField(ChemicalProtectionOfCrops_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_F1_2_F2.class, fieldName, value, condition);

        HashSet<ChemicalProtectionOfCrops> result = new HashSet<ChemicalProtectionOfCrops>();
        for(ChemicalProtectionOfCrops_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_F1_2_F2 ch : chs)
            for(ChemicalProtection_2_Agriculture chA : chsAgr)
                if(ch.getChemicalProtectionOfCrops().equals(chA.getChemicalProtectionOfCrops()))
                    result.add(chA.getChemicalProtectionOfCrops());
        return result;
    }

    /**
     * Возвращает объект "Химическая защита" по идентификатору из списка доступных хозяйству операций химической защиты
     * @param r Коллекция операций химической защиты
     * @param value Идентификатор химической защиты
     * @return Химическая защита
     */
    public ChemicalProtectionOfCrops getChemicalProtection(Collection<ChemicalProtectionOfCrops> r, Object value){
        for(ChemicalProtectionOfCrops c : r)
            if(Integer.toString(c.getChemicalProtectionOfCropsId()).equals(value))
                return c;
        return null;
    }

    /**
     * Возвращает коллекцию объектов "Стоимость химической защиты" в хозяйстве
     * для заданной химической защиты (на различные даты)
     * @param ChemicalProtectionOfCrops Химическая защита
     * @param agriculture Хозяйство
     * @return Коллекция цен на химическую защиту
     */
    public Collection<CostOfChemicalProtectionOfCrops> getCostsOfChemicalProtectionOfCrops(ChemicalProtectionOfCrops ChemicalProtectionOfCrops, Agricultures agriculture){
        String[] fieldName = {"chemicalProtectionOfCrops ", "agriculture"};
        Object[] value = {ChemicalProtectionOfCrops, agriculture};
        String[] condition = {"==", "=="};
        return sm.findByField(CostOfChemicalProtectionOfCrops.class, fieldName, value, condition);
    }

    /**
     * Возвращает коллекцию объектов "Стоимость сырья для химической защиты" в хозяйстве
     * для заданной химической защиты(на различные даты)
     * @param ChemicalProtectionOfCrops Химическая защита
     * @param agriculture Хозяйство
     * @return Коллекция цен на сырьё для химической защиты
     */
    public Collection<CostOfRawMaterialForChemicalProtection> getCostsOfRawMaterialForChemicalProtection(ChemicalProtectionOfCrops ChemicalProtectionOfCrops, Agricultures agriculture){
        String[] fieldName = {"chemicalProtectionOfCrops ", "agriculture"};
        Object[] value = {ChemicalProtectionOfCrops, agriculture};
        String[] condition = {"==", "=="};
        return sm.findByField(CostOfRawMaterialForChemicalProtection.class, fieldName, value, condition);
    }

    /**
     * Возвращает значение объекта "Стоимость химической защиты" по идентификатору из списка всех
     * цен на заданную операцию в хозяйстве
     * @param r Коллекция цен на химическую защиту
     * @param value Идентификатор стоимости химической защиты
     * @return Стоимость химической защиты (руб/га)
     */
    public float getCostOfChemicalProtection(Collection<CostOfChemicalProtectionOfCrops> r, Object value){
        for(CostOfChemicalProtectionOfCrops c : r)
            if(Integer.toString(c.getCostOfChemicalProtectionOfCropsId()).equals(value))
                return c.getCostOfChemicalProtectionOfCrops();
        return 0;
    }

    /**
     * Возвращает значение объекта "Стоимость сырья для химической защиты" по идентификатору из списка всех
     * цен на сырьё для заданной операции в хозяйстве
     * @param r Коллекция цен на сырьё для химической защиты
     * @param value Идентификатор стоимости химической защиты
     * @return Стоимость сырья для химической защиты (руб/га)
     */
    public float getCostOfRawMaterialForChemicalProtection(Collection<CostOfRawMaterialForChemicalProtection> r, Object value){
        for(CostOfRawMaterialForChemicalProtection c : r)
            if(Integer.toString(c.getCostOfRawMaterialForChemicalProtectionId()).equals(value))
                return c.getCostOfRawMaterialForChemicalProtection();
        return 0;
    }

    /**
     * Возвращает факторы основной обработки Ka3, Kf3, которые используются при вычислении урожайности
     * @param typeOfSoil Тип почвы
     * @param level Уровень интенсификации
     * @param crop Культура
     * @param predecessor Предшественник
     * @param mainPr Основная обработка
     * @return Факторы основой обработки
     */
    public MainProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_F1_2_F2 getKa3Kf3(TypeOfSoil typeOfSoil, LevelOfIntensification level, Crop crop, Predecessor predecessor, MainProcessing mainPr){

        String[] fieldName = {"typeOfSoil", "levelOfIntensification", "crop", "predecessor", "mainProcessing"};
        Object[] value = {typeOfSoil, level, crop, predecessor, mainPr};
        String[] condition = {"==", "==", "==", "==", "=="};
        List<MainProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_F1_2_F2> result =
                (List)sm.findByField(MainProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_F1_2_F2.class, fieldName, value, condition);
        if(result.size() > 0)
            return result.get(0);
        return null;
    }

    /**
     * Возвращает факторы предпосевной обработки Ka4, Kf4, которые используются при вычислении урожайности
     * @param typeOfSoil Тип почвы
     * @param level Уровень интенсификации
     * @param crop Культура
     * @param predecessor Предшественник
     * @param mainPr Основная обработка
     * @param presPr Предпосевная обработка
     * @return Факторы предпосевной обработки
     */
    public PreseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2 getKa4Kf4(TypeOfSoil typeOfSoil, LevelOfIntensification level, Crop crop, Predecessor predecessor, MainProcessing mainPr, PreseedingProcessingAndSowing presPr){

        String[] fieldName = {"typeOfSoil", "levelOfIntensification", "crop", "predecessor", "mainProcessing", "preseedingProcessingAndSowing"};
        Object[] value = {typeOfSoil, level, crop, predecessor, mainPr, presPr};
        String[] condition = {"==", "==", "==", "==", "==", "=="};

        List<PreseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2> result =
                (List)sm.findByField(PreseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2.class, fieldName, value, condition);
        if(result.size() > 0)
            return result.get(0);
        return null;
    }

    /**
     * Возвращает факторы ухода за посевами Ka5, Kf5, которые используются при вычислении урожайности
     * @param level Уровень интенсификации
     * @param crop Культура
     * @param careCrop Уход за посевами
     * @return Факторы ухода за посевами
     */
    public CareOfCrops_2_LevelOfIntensification_2_Crop_2_F1_2_F2 getKa5Kf5(LevelOfIntensification level, Crop crop, CareOfCrops careCrop){

        String[] fieldName = {"levelOfIntensification", "crop", "careOfCrops"};
        Object[] value = {level, crop, careCrop};
        String[] condition = {"==", "==", "=="};

        List<CareOfCrops_2_LevelOfIntensification_2_Crop_2_F1_2_F2> result =
                (List)sm.findByField(CareOfCrops_2_LevelOfIntensification_2_Crop_2_F1_2_F2.class, fieldName, value, condition);
        if(result.size() > 0)
            return result.get(0);
        return null;
    }

    /**
     * Возвращает фактор химической защиты Kf7, который используется при вычислении урожайности
     * @param typeOfSoil Тип почвы
     * @param level Уровень интенсификации
     * @param crop Культура
     * @param chemProt Химическая защита
     * @return Фактор химической защиты
     */
    public ChemicalProtectionOfCrops_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_F1_2_F2 getKf7(TypeOfSoil typeOfSoil, LevelOfIntensification level, Crop crop, ChemicalProtectionOfCrops chemProt){

        String[] fieldName = {"typeOfSoil", "levelOfIntensification", "crop", "chemicalProtectionOfCrops"};
        Object[] value = {typeOfSoil, level, crop, chemProt};
        String[] condition = {"==", "==", "==", "=="};

        List<ChemicalProtectionOfCrops_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_F1_2_F2> result = (List)sm.findByField(ChemicalProtectionOfCrops_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_F1_2_F2.class, fieldName, value, condition);
        if(result.size() > 0)
            return result.get(0);
        return null;
    }

    /**
     * Возвращает фактор уборки Kа7, который используется при вычислении урожайности
     * @param level Уровень интенсификации
     * @param crop Культура
     * @param harv Уборка
     * @return Фактор уборки
     */
    public Harvesting_2_LevelOfIntensification_2_Crop_2_Factor getKa6(LevelOfIntensification level, Crop crop, Harvesting harv){

        String[] fieldName = {"levelOfIntensification", "crop", "harvesting"};
        Object[] value = {level, crop, harv};
        String[] condition = {"==", "==", "=="};

        List<Harvesting_2_LevelOfIntensification_2_Crop_2_Factor> result = (List)sm.findByField(Harvesting_2_LevelOfIntensification_2_Crop_2_Factor.class, fieldName, value, condition);
        if(result.size() > 0)
            return result.get(0);
        return null;
    }

    /**
     * Возвращает поправочный коэффициент на предшественника К2, который используется при вычислении урожайности
     * @param crop Культура
     * @param pred Предшественник
     * @param level Уровень интенсификации
     * @return Поправочный коэффициент на предшественника
     */
    public LevelOfIntensificationToCropsToPredecessors getK2(Crop crop, Predecessor pred, LevelOfIntensification level){

        String[] fieldName = {"crop", "predecessor", "levelOfIntensification"};
        Object[] value = {crop, pred, level};
        String[] condition = {"==", "==", "=="};
        List<LevelOfIntensificationToCropsToPredecessors> result = (List)sm.findByField(LevelOfIntensificationToCropsToPredecessors.class,
                fieldName, value, condition);
        if(result.size() > 0)
            return result.get(0);
        return null;
    }

    /**
     * Возвращает объект "Экспериментальная урожайность", значение которого используется при вычислении урожайности
     * @param typeOfSoil Тип почвы
     * @param level Уровень интенсификации
     * @param crop Культура
     * @return Экспериментальная урожайность
     */
    public Productivity getProductivity(TypeOfSoil typeOfSoil, LevelOfIntensification level, Crop crop){

        String[] fieldName = {"typeOfSoil", "levelOfIntensification", "crop"};
        Object[] value = {typeOfSoil, level, crop};
        String[] condition = {"==", "==", "=="};

        List<Productivity> result = (List) sm.findByField(Productivity.class, fieldName, value, condition);
        if(result.size() > 0)
            return result.get(0);
        return null;
    }

    /**
     * Возвращает объект "Расчётная урожайность", значение которого используется при вычислении урожайности
     * @@param typeOfSoil Тип почвы
     * @param level Уровень интенсификации
     * @param crop Культура
     * @return Расчётная урожайность
     */
    public ProductivityCalculation getProductivityCalc(TypeOfSoil typeOfSoil, LevelOfIntensification level, Crop crop){

        String[] fieldName = {"typeOfSoil", "levelOfIntensification", "crop"};
        Object[] value = {typeOfSoil, level, crop};
        String[] condition = {"==", "==", "=="};

        List<ProductivityCalculation> result = (List) sm.findByField(ProductivityCalculation.class, fieldName, value, condition);
        if(result.size() > 0)
            return result.get(0);
        return null;
    }

    /**
     * Выполняет подсчёт значения урожайности (центнеров на гектар) для заданных параметров
     * @param yield Урожайность
     * @param typeOfSoil Тип почвы
     * @param level Уровень интенсификации
     * @param crop Культура
     * @param grade Сорт
     * @param predecessor Предшественник
     * @param mainPr Основная обработка
     * @param preseedingPr Предпосевная обработка
     * @param careOfCrops Уход за посевами
     * @param harvesting Уборка
     * @param protection Химическая защита
     * @return Оценка урожайности (ц/га)
     */
    public  float countProductivity(boolean yield, TypeOfSoil typeOfSoil, LevelOfIntensification level, Crop crop, GradeOfCrop grade, Predecessor predecessor,
                                          MainProcessing mainPr, PreseedingProcessingAndSowing preseedingPr, CareOfCrops careOfCrops,
                                          Harvesting harvesting, ChemicalProtectionOfCrops protection){
        /*Для некоторых сочетаний параметров в таблице может отсутствовать значение коэффициента -
        * в таком случае используются значения по умолчанию (сделано так, как в Агрокон)*/
        float Ka3 = 1;
        float Kf3 = 1;
        MainProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_F1_2_F2 mp = getKa3Kf3(typeOfSoil, level, crop, predecessor, mainPr);
        if(mp != null) {
            Ka3 = mp.getFactor1();
            Kf3 = mp.getFactor2();
        }
        System.out.println("*** Ka3= " + Ka3 + " Kf3 = " + Kf3);

        float Ka4 = 1;
        float Kf4 = 1;
        PreseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2 pp = getKa4Kf4(typeOfSoil, level, crop, predecessor, mainPr, preseedingPr);
        if(pp != null) {
            Ka4 = pp.getFactor1();
            Kf4 = pp.getFactor2();
        }
        System.out.println("*** Ka4 = " + Ka4 + " Kf4 = " + Kf4);

        float Ka5 = 1;
        float Kf5 = 1;
        CareOfCrops_2_LevelOfIntensification_2_Crop_2_F1_2_F2 cc = getKa5Kf5(level, crop, careOfCrops);
        if(cc != null) {
            Ka5 = cc.getFactor1();
            Kf5 = cc.getFactor2();
        }
        System.out.println("*** Ka5 = " + Ka5 + " Kf5 = " + Kf5);

        float Kf8 = Kf3 * Kf4 * Kf5;

        float Kf7 = 1;
        ChemicalProtectionOfCrops_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_F1_2_F2 cp = getKf7(typeOfSoil, level, crop, protection);
        if(cp != null) {
            if (Kf8 <= 1)
                Kf7 = cp.getFactor1();
            else
                Kf7 = cp.getFactor2();
        }
        System.out.println("*** Kf8 = " + Kf8 + " Kf7 = " + Kf7);

        float Kfc = Kf8 * Kf7;
        System.out.println("*** Kfc = " + Kfc);

        float K2 = (float)0.95;
        LevelOfIntensificationToCropsToPredecessors lcp = getK2(crop, predecessor, level);
        if(lcp != null)
            K2 = lcp.getFactor();
        System.out.println("*** K2 = " + K2);

        float K1 = grade.getFactorToProductivityGradeOfCrop();
        System.out.println("*** K1 = " + K1);

        float Ka6 = 1;
        Harvesting_2_LevelOfIntensification_2_Crop_2_Factor h = getKa6(level, crop, harvesting);
        if(h != null)
            Ka6 = h.getFactor();
        System.out.println("*** Ka6 = " + Ka6);

        float Ur_baz = 0;
        if(yield){
            Productivity p = getProductivity(typeOfSoil, level, crop);
            if(p != null)
                Ur_baz = p.getProductivity();
        }
        else {
            ProductivityCalculation p = getProductivityCalc(typeOfSoil, level, crop);
            if(p != null)
                Ur_baz = p.getProductivity();
        }

        System.out.println("*** Ur_baz = " + Ur_baz);

        float Ur_ras = ((Ur_baz * K1 * K2) + ((Ur_baz * K1 * K2) * (Ka3 + Ka4 + Ka5 - 3))) * (Kfc * Ka6);
        System.out.println("*** Ur_ras = " + Ur_ras);
        float productivity = Ur_ras/Ka6;
        return productivity;
    }

    /**
     * Возвращает значение коэффициента доходности, который используется при расчёте оценки дохода
     * @param level Уровень интенсификации
     * @param grade Сорт
     * @return Коэффициент доходности
     */
    public  float countKIncome(LevelOfIntensification level, GradeOfCrop grade){
        List<CostOnProductionFertilizer> costs = (List)sm.findByField(CostOnProductionFertilizer.class, "gradeOfCrop", grade, "==");
        CostOnProductionFertilizer costProduction = costs.get(0);
        float st = 0;
        if(level.getLevelOfIntensificationId() == 1)
            st =  costProduction.getCostOfProductionAtExtensiveLevel();
        if(level.getLevelOfIntensificationId() == 2)
            st = costProduction.getCostOfProductionAtNormalLevel();
        if(level.getLevelOfIntensificationId() == 3)
            st = costProduction.getCostOfProductionAtIntensiveLevel();
        System.out.println("** St = " + st);
        return st;
    }

    /**
     * Возвращает последний заданный в хозяйстве коэффициент инфляции
     * @param agriculture Хозяйство
     * @return Коэффициент инфляции
     */
    public CoefficientOfInflation getCoefficientOfInflation (Agricultures agriculture) {
        Collection<CoefficientOfInflation> result = sm.findByField(CoefficientOfInflation.class, "agriculture", agriculture, "==");
        ArrayList<CoefficientOfInflation> resSorted = new ArrayList<CoefficientOfInflation>();
        for(CoefficientOfInflation r : result)
            resSorted.add(r);
        Collections.sort(resSorted, new Comparator<CoefficientOfInflation>() {
            public int compare(CoefficientOfInflation a, CoefficientOfInflation b) {
                try {
                    DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
                    Date dateA = format.parse(a.getDateCreate());
                    Date dateB = format.parse(b.getDateCreate());
                    return dateB.compareTo(dateA);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                return 0;
            }
        });
        return resSorted.get(0);
    }


    /**
     * Возвращает объект "Стандартная технология"
     * @param grade Сорт
     * @param level Уровень интенсификации
     * @return Стандартная технология
     */
    public StandartTechnology getStandartTechnology(GradeOfCrop grade, LevelOfIntensification level){
        String[] fieldName = {"levelOfIntensification", "gradeOfCrop"};
        Object[] value = {level, grade};
        String[] condition = {"==", "=="};
        List<StandartTechnology> result = (List) sm.findByField(StandartTechnology.class, fieldName, value, condition);
        return result.get(0);
    }

}

package core.logic;

import core.data.*;
import core.data.storage.StorageManager;

import javax.jdo.*;
import java.util.*;

/**
 * Author: Julia Skorobogatova
 * Date: 05.05.2019
 * Time: 8.17
 *
 * Класс содержит методы получения данных и знаний для реализации бизнес-логики
 * модуля Расчет доз удобрений
 * вляется наследником DataManager
 */

public class DataManagerModeFertilizers extends DataManager {

    /**
     * Конструктор класса
     * @param sm Объект, позовляющий оперировать запросами к базе данных
     */
    public DataManagerModeFertilizers(StorageManager sm){super(sm);};

    /**
     * Выполняет сохранение созданного результата по полю хозяйства в таблицу results_fertilizers базы данных
     * @param result Результат по полю
     */
    public void saveResultFertilizers(ResultsFertilizers result){
        sm.create(result);
    }

    /**
     * Выполняет сохранение созданного результата по полю хозяйства в таблицу application_of_fertilizers_2_microelement_2_results_fertilizer базы данных
     * @param result Результат по полю
     */
    public void saveApplicationOfFertilizers_2_Microelement_2_ResultsFertilizers(ApplicationOfFertilizers_2_Microelements_2_ResultsFertilizers result){
        sm.create(result);
    }

    /**
     * Выполняет удаление результатов по полю хозяйства из таблицы application_of_fertilizers_2_microelement_2_results_fertilizer базы данных
     * @param results Коллекция результатов по полям
     */
    public void deleteApplicationOfFertilizers_2_Microelement_2_ResultsFertilizers(Collection<ApplicationOfFertilizers_2_Microelements_2_ResultsFertilizers > results){
        for(ApplicationOfFertilizers_2_Microelements_2_ResultsFertilizers result : results)
            sm.delete(result);
    }

    public ResultsFertilizers getResultsFertilizers(Collection<ResultsFertilizers> r, Object value){
        for(ResultsFertilizers  res : r)
            if(Integer.toString(res.getResultsFertilizersId()).equals(value))
                return res;
        return null;
    }

    public void deleteResultsFertilizers(Collection<ResultsFertilizers> results){
        for(ResultsFertilizers result : results)
            sm.delete(result);
    }

    /*Возвращает все микроэлементы из таблицы microelement*/
    public Collection<Microelement> findAllMicroelements() throws RuntimeException {
        return sm.findAll(Microelement.class);
    }

    public Collection<AgricultureField> findAllFields() throws RuntimeException {
        return sm.findAll(AgricultureField.class);
    }

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

    public Collection<ResultMode1> findAllResultsMode1() throws RuntimeException {
        return sm.findAll(ResultMode1.class);
    }

    public Collection<ApplicationOfFertilizers> findAllApplicationsOfFertilizers() throws RuntimeException {
        return sm.findAll(ApplicationOfFertilizers.class);
    }


    public Collection<ResultsFertilizers> findAllResultsFertilizers() throws RuntimeException {
        return sm.findAll(ResultsFertilizers.class);
    }

    public Collection<ApplicationOfFertilizers_2_Microelement> findAllApplicationOfFertilizers_2_Microelement() throws RuntimeException {
        return sm.findAll(ApplicationOfFertilizers_2_Microelement.class);
    }

    public Collection<ApplicationOfFertilizers_2_Microelements_2_ResultsFertilizers> findAllApplicationOfFertilizers_2_Microelement_2_ResultsFertilizers() throws RuntimeException {
        return sm.findAll(ApplicationOfFertilizers_2_Microelements_2_ResultsFertilizers.class);
    }

    public Collection<RemovalOfMicroelement> findAllRemovalOfMicroelement() throws RuntimeException {
        return sm.findAll(RemovalOfMicroelement.class);
    }

    public Collection<CoefficientOfUsingMicroelementFromFert> findAllCoefficientOfUsingMicroelementFromFert() throws RuntimeException {
        return sm.findAll(CoefficientOfUsingMicroelementFromFert.class);
    }

    public Collection<CoefficientOfUsingMicroelementFromSoil> findAllCoefficientOfUsingMicroelementFromSoil() throws RuntimeException {
        return sm.findAll(CoefficientOfUsingMicroelementFromSoil.class);
    }

//    public Collection<Month> findAllMonth() throws RuntimeException {
//        return sm.findAll(Month.class);
//    }
//
//    public Collection<CorrectionResult> findAllCorrectionResult() throws RuntimeException {
//        return sm.findAll(CorrectionResult.class);
//    }


}

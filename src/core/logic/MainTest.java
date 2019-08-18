package core.logic;

import core.data.*;
import core.data.storage.StorageManager;
import core.data.storage.StorageManagerFactory;
import core.data.storage.init.LoadData;

import java.io.IOException;
import java.util.Collection;

public class MainTest {

    public static void main(String [] args) throws IOException {
        LoadData.loadJdoProperties();
        StorageManager sm = StorageManagerFactory.getStorageManager();
        DataManagerModeFertilizers dmf = new DataManagerModeFertilizers(sm);
        System.out.println("dmf != null is " + (dmf != null));

        Collection<Microelement> microelements = dmf.findAllMicroelements();
        Collection<ResultMode1> resultMode1s = dmf.findAllResultsMode1();
        Collection<ApplicationOfFertilizers> applicationOfFertilizers = dmf.findAllApplicationsOfFertilizers();
        Collection<ResultsFertilizers> resultsFertilizers = dmf.findAllResultsFertilizers();
        Collection<ApplicationOfFertilizers_2_Microelement> applicationOfFertilizers_2_microelements = dmf.findAllApplicationOfFertilizers_2_Microelement();
        Collection<ApplicationOfFertilizers_2_Microelements_2_ResultsFertilizers> applicationOfFertilizers_2_microelements_2_resultsFertilizers = dmf.findAllApplicationOfFertilizers_2_Microelement_2_ResultsFertilizers();
        Collection<RemovalOfMicroelement> removalOfMicroelements = dmf.findAllRemovalOfMicroelement();
        Collection<CoefficientOfUsingMicroelementFromFert> coefficientOfUsingMicroelementFromFerts = dmf.findAllCoefficientOfUsingMicroelementFromFert();
        Collection<CoefficientOfUsingMicroelementFromSoil> coefficientOfUsingMicroelementFromSoils = dmf.findAllCoefficientOfUsingMicroelementFromSoil();
        Collection<AgricultureField> fields = dmf.findAllFields();

        for (Microelement m: microelements)
            System.out.println(m.getMicroelementName()+" "+m.getMicroelementId());
    }
}

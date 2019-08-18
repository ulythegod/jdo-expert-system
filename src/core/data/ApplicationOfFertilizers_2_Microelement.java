package core.data;

import java.util.*;

public class ApplicationOfFertilizers_2_Microelement {

    private int applicationOfFertilizers_2_MicroelementId;
    private Microelement microelement;
    private ApplicationOfFertilizers applicationOfFertilizers;
    private Collection applicationOfFertilizers_2_microelements_2_resultsFertilizers = new HashSet();


    public ApplicationOfFertilizers_2_Microelement(){};

    public int getApplicationOfFertilizers_2_MicroelementId() {
        return applicationOfFertilizers_2_MicroelementId;
    }

    public void setApplicationOfFertilizers_2_MicroelementId(int applicationOfFertilizers_2_MicroelementId) {
        this.applicationOfFertilizers_2_MicroelementId = applicationOfFertilizers_2_MicroelementId;
    }

    public Microelement getMicroelement() {
        return microelement;
    }

    public void setMicroelement(Microelement microelement) {
        this.microelement = microelement;
    }

    public ApplicationOfFertilizers getApplicationOfFertilizers() {
        return applicationOfFertilizers;
    }

    public void setApplicationOfFertilizers(ApplicationOfFertilizers applicationOfFertilizers) {
        this.applicationOfFertilizers = applicationOfFertilizers;
    }

    public Collection getApplicationOfFertilizers_2_microelements_2_resultsFertilizers() {
        return applicationOfFertilizers_2_microelements_2_resultsFertilizers;
    }

    public void setApplicationOfFertilizers_2_microelements_2_resultsFertilizers(Collection applicationOfFertilizers_2_microelements_2_resultsFertilizers) {
        this.applicationOfFertilizers_2_microelements_2_resultsFertilizers = applicationOfFertilizers_2_microelements_2_resultsFertilizers;
    }
}

package core.data;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

public class CostOfApplicationOfFertilizers {

    private int costOfApplicationOfFertilizersId;
    private ApplicationOfFertilizers applicationOfFertilizers;
    private float costOfApplicationOfFertilizers;
    private Agricultures agriculture;
    private String date;

    public CostOfApplicationOfFertilizers() {
    }

    public Agricultures getAgriculture() {
        return agriculture;
    }

    public void setAgriculture(Agricultures agriculture) {
        this.agriculture = agriculture;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ApplicationOfFertilizers getApplicationOfFertilizers() {
        return applicationOfFertilizers;
    }

    public void setApplicationOfFertilizers(ApplicationOfFertilizers applicationOfFertilizers) {
        this.applicationOfFertilizers = applicationOfFertilizers;
    }


    public float getCostOfApplicationOfFertilizers() {
        return costOfApplicationOfFertilizers;
    }

    public void setCostOfApplicationOfFertilizers(float costOfApplicationOfFertilizers) {
        this.costOfApplicationOfFertilizers = costOfApplicationOfFertilizers;
    }

    public int getCostOfApplicationOfFertilizersId() {
        return costOfApplicationOfFertilizersId;
    }

    public void setCostOfApplicationOfFertilizersId(int costOfApplicationOfFertilizersId) {
        this.costOfApplicationOfFertilizersId = costOfApplicationOfFertilizersId;
    }

}

package core.data;

import java.util.Collection;
import java.util.HashSet;

public class CostOfHarvesting {

    private int costOfHarvestingId;
    private Harvesting harvesting;
    private float costOfHarvesting;
    private Agricultures agriculture;
    private String date;


    public CostOfHarvesting() {
    }

    public float getCostOfHarvesting() {
        return costOfHarvesting;
    }

    public void setCostOfHarvesting(float costOfHarvesting) {
        this.costOfHarvesting = costOfHarvesting;
    }

    public int getCostOfHarvestingId() {
        return costOfHarvestingId;
    }

    public void setCostOfHarvestingId(int costOfHarvestingId) {
        this.costOfHarvestingId = costOfHarvestingId;
    }

    public Harvesting getHarvesting() {
        return harvesting;
    }

    public void setHarvesting(Harvesting harvesting) {
        this.harvesting = harvesting;
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
}

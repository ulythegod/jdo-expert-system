package core.data;

import java.util.Collection;
import java.util.HashSet;

public class CostOfPreseedingProcessingAndSowing {

    private int costOfPreseedingProcessingAndSowingId;
    private PreseedingProcessingAndSowing preseedingProcessingAndSowing;
    private float costOfPreseedingProcessingAndSowing;
    private Agricultures agriculture;
    private String date;

    public CostOfPreseedingProcessingAndSowing() {
    }

    public float getCostOfPreseedingProcessingAndSowing() {
        return costOfPreseedingProcessingAndSowing;
    }

    public void setCostOfPreseedingProcessingAndSowing(float costOfPreseedingProcessingAndSowing) {
        this.costOfPreseedingProcessingAndSowing = costOfPreseedingProcessingAndSowing;
    }

    public int getCostOfPreseedingProcessingAndSowingId() {
        return costOfPreseedingProcessingAndSowingId;
    }

    public void setCostOfPreseedingProcessingAndSowingId(int costOfPreseedingProcessingAndSowingId) {
        this.costOfPreseedingProcessingAndSowingId = costOfPreseedingProcessingAndSowingId;
    }


    public PreseedingProcessingAndSowing getPreseedingProcessingAndSowing() {
        return preseedingProcessingAndSowing;
    }

    public void setPreseedingProcessingAndSowing(PreseedingProcessingAndSowing preseedingProcessingAndSowing) {
        this.preseedingProcessingAndSowing = preseedingProcessingAndSowing;
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

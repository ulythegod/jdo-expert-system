package core.data;

import java.util.Collection;
import java.util.HashSet;

public class CostOfMainProcessing {

    private int costOfMainProcessingId;
    private MainProcessing mainProcessing;
    private float costOfMainProcessing;
    private Agricultures agriculture;
    private String date;

    public CostOfMainProcessing() {
    }

    public float getCostOfMainProcessing() {
        return costOfMainProcessing;
    }

    public void setCostOfMainProcessing(float costOfMainProcessing) {
        this.costOfMainProcessing = costOfMainProcessing;
    }

    public int getCostOfMainProcessingId() {
        return costOfMainProcessingId;
    }

    public void setCostOfMainProcessingId(int costOfMainProcessingId) {
        this.costOfMainProcessingId = costOfMainProcessingId;
    }

    public MainProcessing getMainProcessing() {
        return mainProcessing;
    }

    public void setMainProcessing(MainProcessing mainProcessing) {
        this.mainProcessing = mainProcessing;
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

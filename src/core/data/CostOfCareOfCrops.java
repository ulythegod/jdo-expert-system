package core.data;

import java.util.Collection;
import java.util.HashSet;

public class CostOfCareOfCrops {

    private int costOfCareOfCropsId;
    private CareOfCrops careOfCrops;
    private float costOfCareOfCrops;
    private Agricultures agriculture;
    private String date;


    public CostOfCareOfCrops() {
    }

    public CareOfCrops getCareOfCrops() {
        return careOfCrops;
    }

    public void setCareOfCrops(CareOfCrops careOfCrops) {
        this.careOfCrops = careOfCrops; //����������, ���� careOfCrops = careOfCrops
    }


    public float getCostOfCareOfCrops() {
        return costOfCareOfCrops;
    }

    public void setCostOfCareOfCrops(float costOfCareOfCrops) {
        this.costOfCareOfCrops = costOfCareOfCrops;
    }

    public int getCostOfCareOfCropsId() {
        return costOfCareOfCropsId;
    }

    public void setCostOfCareOfCropsId(int costOfCareOfCropsId) {
        this.costOfCareOfCropsId = costOfCareOfCropsId;
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

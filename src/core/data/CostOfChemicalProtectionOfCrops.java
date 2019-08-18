package core.data;

import java.util.Collection;
import java.util.HashSet;

public class CostOfChemicalProtectionOfCrops {

    private int costOfChemicalProtectionOfCropsId;
    private ChemicalProtectionOfCrops chemicalProtectionOfCrops;
    private float costOfChemicalProtectionOfCrops;
    private Agricultures agriculture;
    private String date;

    public CostOfChemicalProtectionOfCrops() {
    }

    public ChemicalProtectionOfCrops getChemicalProtectionOfCrops() {
        return chemicalProtectionOfCrops;
    }

    public void setChemicalProtectionOfCrops(ChemicalProtectionOfCrops chemicalProtectionOfCrops) {
        this.chemicalProtectionOfCrops = chemicalProtectionOfCrops;
    }


    public float getCostOfChemicalProtectionOfCrops() {
        return costOfChemicalProtectionOfCrops;
    }

    public void setCostOfChemicalProtectionOfCrops(float costOfChemicalProtectionOfCrops) {
        this.costOfChemicalProtectionOfCrops = costOfChemicalProtectionOfCrops;
    }

    public int getCostOfChemicalProtectionOfCropsId() {
        return costOfChemicalProtectionOfCropsId;
    }

    public void setCostOfChemicalProtectionOfCropsId(int costOfChemicalProtectionOfCropsId) {
        this.costOfChemicalProtectionOfCropsId = costOfChemicalProtectionOfCropsId;
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

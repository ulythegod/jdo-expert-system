package core.data;

public class CostOfRawMaterialForChemicalProtection {

    private int costOfRawMaterialForChemicalProtectionId;
    private ChemicalProtectionOfCrops chemicalProtectionOfCrops;
    private float costOfRawMaterialForChemicalProtection;
    private Agricultures agriculture;
    private String date;

    public CostOfRawMaterialForChemicalProtection() {
    }

    public ChemicalProtectionOfCrops getChemicalProtectionOfCrops() {
        return chemicalProtectionOfCrops;
    }

    public void setChemicalProtectionOfCrops(ChemicalProtectionOfCrops chemicalProtectionOfCrops) {
        this.chemicalProtectionOfCrops = chemicalProtectionOfCrops;
    }

    public float getCostOfRawMaterialForChemicalProtection() {
        return costOfRawMaterialForChemicalProtection;
    }

    public void setCostOfRawMaterialForChemicalProtection(float costOfRawMaterialForChemicalProtection) {
        this.costOfRawMaterialForChemicalProtection = costOfRawMaterialForChemicalProtection;
    }

    public int getCostOfRawMaterialForChemicalProtectionId() {
        return costOfRawMaterialForChemicalProtectionId;
    }

    public void setCostOfRawMaterialForChemicalProtectionId(int costOfRawMaterialForChemicalProtectionId) {
        this.costOfRawMaterialForChemicalProtectionId = costOfRawMaterialForChemicalProtectionId;
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

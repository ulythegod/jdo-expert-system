package core.data;

/**
 * Author: Skosyreva Maria
 * Date: 24.05.2016
 * Time: 19:39
 */
public class ChemicalProtection_2_Agriculture {
    private int chemicalProtection_2_AgricultureId;
    private ChemicalProtectionOfCrops chemicalProtectionOfCrops;
    private Agricultures agriculture;

    public ChemicalProtection_2_Agriculture() {
    }

    public int getChemicalProtection_2_AgricultureId() {
        return chemicalProtection_2_AgricultureId;
    }

    public void setChemicalProtection_2_AgricultureId(int chemicalProtection_2_AgricultureId) {
        this.chemicalProtection_2_AgricultureId = chemicalProtection_2_AgricultureId;
    }

    public ChemicalProtectionOfCrops getChemicalProtectionOfCrops() {
        return chemicalProtectionOfCrops;
    }

    public void setChemicalProtectionOfCrops(ChemicalProtectionOfCrops chemicalProtectionOfCrops) {
        this.chemicalProtectionOfCrops = chemicalProtectionOfCrops;
    }

    public Agricultures getAgriculture() {
        return agriculture;
    }

    public void setAgriculture(Agricultures agriculture) {
        this.agriculture = agriculture;
    }
}

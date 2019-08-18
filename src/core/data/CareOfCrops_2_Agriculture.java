package core.data;

/**
 * Author: Skosyreva Maria
 * Date: 24.05.2016
 * Time: 19:27
 */
public class CareOfCrops_2_Agriculture {
    private int careOfCrops_2_AgricultureId;
    private CareOfCrops careOfCrops;
    private Agricultures agriculture;

    public CareOfCrops_2_Agriculture() {
    }

    public int getCareOfCrops_2_AgricultureId() {
        return careOfCrops_2_AgricultureId;
    }

    public void setCareOfCrops_2_AgricultureId(int careOfCrops_2_AgricultureId) {
        this.careOfCrops_2_AgricultureId = careOfCrops_2_AgricultureId;
    }

    public CareOfCrops getCareOfCrops() {
        return careOfCrops;
    }

    public void setCareOfCrops(CareOfCrops careOfCrops) {
        this.careOfCrops = careOfCrops;
    }

    public Agricultures getAgriculture() {
        return agriculture;
    }

    public void setAgriculture(Agricultures agriculture) {
        this.agriculture = agriculture;
    }
}

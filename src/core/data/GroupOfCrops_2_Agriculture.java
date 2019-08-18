package core.data;

/**
 * Author: Skosyreva Maria
 * Date: 24.05.2016
 * Time: 19:11
 */
public class GroupOfCrops_2_Agriculture {
    private int groupOfCrops_2_AgricultureId;
    private GroupOfCrops groupOfCrops;
    private Agricultures agriculture;

    public GroupOfCrops_2_Agriculture() {
    }

    public int getGroupOfCrops_2_AgricultureId() {
        return groupOfCrops_2_AgricultureId;
    }

    public void setGroupOfCrops_2_AgricultureId(int groupOfCrops_2_AgricultureId) {
        this.groupOfCrops_2_AgricultureId = groupOfCrops_2_AgricultureId;
    }

    public GroupOfCrops getGroupOfCrops() {
        return groupOfCrops;
    }

    public void setGroupOfCrops(GroupOfCrops groupOfCrops) {
        this.groupOfCrops = groupOfCrops;
    }

    public Agricultures getAgriculture() {
        return agriculture;
    }

    public void setAgriculture(Agricultures agriculture) {
        this.agriculture = agriculture;
    }
}

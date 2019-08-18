package core.data;

/**
 * Author: Skosyreva Maria
 * Date: 24.05.2016
 * Time: 19:34
 */
public class Harvesting_2_Agriculture {
    private int harvesting_2_AgricultureId;
    private Harvesting harvesting;
    private Agricultures agriculture;

    public Harvesting_2_Agriculture() {
    }

    public int getHarvesting_2_AgricultureId() {
        return harvesting_2_AgricultureId;
    }

    public void setHarvesting_2_AgricultureId(int harvesting_2_AgricultureId) {
        this.harvesting_2_AgricultureId = harvesting_2_AgricultureId;
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
}

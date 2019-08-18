package core.data;

/**
 * Author: Skosyreva Maria
 * Date: 24.05.2016
 * Time: 19:37
 */
public class ApplicationOfFertilizers_2_Agriculture {
    private int applicationOfFertilizers_2_AgricultureId;
    private ApplicationOfFertilizers applicationOfFertilizers;
    private Agricultures agriculture;

    public ApplicationOfFertilizers_2_Agriculture() {
    }

    public int getApplicationOfFertilizers_2_AgricultureId() {
        return applicationOfFertilizers_2_AgricultureId;
    }

    public void setApplicationOfFertilizers_2_AgricultureId(int applicationOfFertilizers_2_AgricultureId) {
        this.applicationOfFertilizers_2_AgricultureId = applicationOfFertilizers_2_AgricultureId;
    }

    public ApplicationOfFertilizers getApplicationOfFertilizers() {
        return applicationOfFertilizers;
    }

    public void setApplicationOfFertilizers(ApplicationOfFertilizers applicationOfFertilizers) {
        this.applicationOfFertilizers = applicationOfFertilizers;
    }

    public Agricultures getAgriculture() {
        return agriculture;
    }

    public void setAgriculture(Agricultures agriculture) {
        this.agriculture = agriculture;
    }
}

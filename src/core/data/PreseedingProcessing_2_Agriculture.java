package core.data;

/**
 * Author: Skosyreva Maria
 * Date: 24.05.2016
 * Time: 19:25
 */
public class PreseedingProcessing_2_Agriculture {
    private int preseedingProcessing_2_AgricultureId;
    private PreseedingProcessingAndSowing preseedingProcessingAndSowing;
    private Agricultures agriculture;

    public PreseedingProcessing_2_Agriculture() {
    }

    public int getPreseedingProcessing_2_AgricultureId() {
        return preseedingProcessing_2_AgricultureId;
    }

    public void setPreseedingProcessing_2_AgricultureId(int preseedingProcessing_2_AgricultureId) {
        this.preseedingProcessing_2_AgricultureId = preseedingProcessing_2_AgricultureId;
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
}

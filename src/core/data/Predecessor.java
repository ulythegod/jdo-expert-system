package core.data;

import java.util.*;

public class Predecessor {
    private int predecessorId;
    private Crop crop;
    private Collection mainProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_F1_2_F2 = new HashSet();
    private Collection preseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2 = new HashSet();
    private Collection resultsFertilizers = new HashSet();

    public Predecessor() {
    }


    public Collection getMainProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_F1_2_F2() {
        return mainProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_F1_2_F2;
    }

    public void setMainProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_F1_2_F2(Collection mainProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_F1_2_F2) {
        this.mainProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_F1_2_F2 = mainProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_F1_2_F2;
    }


    public int getPredecessorId() {
        return predecessorId;
    }

    public void setPredecessorId(int predecessorId) {
        this.predecessorId = predecessorId;
    }

    public Crop getCrop() {
        return crop;
    }

    public void setCrop(Crop crop) {
        this.crop = crop;
    }

    public Collection getPreseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2() {
        return preseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2;
    }

    public void setPreseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2(Collection preseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2) {
        this.preseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2 = preseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2;
    }

    public Collection getResultsFertilizers() {
        return resultsFertilizers;
    }

    public void setResultsFertilizers(Collection resultsFertilizers) {
        this.resultsFertilizers = resultsFertilizers;
    }
}

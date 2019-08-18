package core.data;


import java.util.*;

public class PreseedingProcessingAndSowing {
    private int preseedingProcessingAndSowingId;
    private String codePreseedingProcessingAndSowing;
    private String descriptionPreseedingProcessingAndSowing;
    private boolean isKB;
    private boolean isUD;
    private Collection costOfPreseedingProcessingAndSowing = new HashSet();
    private Collection standartTechnology = new HashSet();
    private Collection preseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2 = new HashSet();


    public PreseedingProcessingAndSowing() {
    }

    public int getPreseedingProcessingAndSowingId() {
        return preseedingProcessingAndSowingId;
    }

    public void setPreseedingProcessingAndSowingId(int preseedingProcessingAndSowingId) {
        this.preseedingProcessingAndSowingId = preseedingProcessingAndSowingId;
    }

    public String getCodePreseedingProcessingAndSowing() {
        return codePreseedingProcessingAndSowing;
    }

    public void setCodePreseedingProcessingAndSowing(String codePreseedingProcessingAndSowing) {
        this.codePreseedingProcessingAndSowing = codePreseedingProcessingAndSowing;
    }

    public String getDescriptionPreseedingProcessingAndSowing() {
        return descriptionPreseedingProcessingAndSowing;
    }

    public void setDescriptionPreseedingProcessingAndSowing(String descriptionPreseedingProcessingAndSowing) {
        this.descriptionPreseedingProcessingAndSowing = descriptionPreseedingProcessingAndSowing;
    }

    public boolean isKB() {
        return isKB;
    }

    public void setIsKB(boolean isKB) {
        this.isKB = isKB;
    }

    public boolean isUD() {
        return isUD;
    }

    public void setIsUD(boolean isUD) {
        this.isUD = isUD;
    }

    public Collection getCostOfPreseedingProcessingAndSowing() {
        return costOfPreseedingProcessingAndSowing;
    }

    public void setCostOfPreseedingProcessingAndSowing(Collection costOfPreseedingProcessingAndSowing) {
        this.costOfPreseedingProcessingAndSowing = costOfPreseedingProcessingAndSowing;
    }

    public Collection getPreseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2() {
        return preseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2;
    }

    public void setPreseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2(Collection preseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2) {
        this.preseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2 = preseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2;
    }

    public Collection getStandartTechnology() {
        return standartTechnology;
    }

    public void setStandartTechnology(Collection standartTechnology) {
        this.standartTechnology = standartTechnology;
    }
}

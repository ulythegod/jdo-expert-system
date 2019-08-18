package core.data;

import java.util.*;

public class MainProcessing {
    private int mainProcessingId;
    private String codeMainProcessing;
    private String descriptionMainProcessing;
    private boolean isKB;
    private boolean isUD;
    private Collection costOfMainProcessing = new HashSet();
    private Collection preseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2 = new HashSet();
    private Collection standartTechnology = new HashSet();
    private Collection mainProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_F1_2_F2 = new HashSet();

    public MainProcessing() {
    }

    public int getMainProcessingId() {
        return mainProcessingId;
    }

    public void setMainProcessingId(int mainProcessingId) {
        this.mainProcessingId = mainProcessingId;
    }

    public String getCodeMainProcessing() {
        return codeMainProcessing;
    }

    public void setCodeMainProcessing(String codeMainProcessing) {
        this.codeMainProcessing = codeMainProcessing;
    }

    public String getDescriptionMainProcessing() {
        return descriptionMainProcessing;
    }

    public void setDescriptionMainProcessing(String descriptionMainProcessing) {
        this.descriptionMainProcessing = descriptionMainProcessing;
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

    public Collection getCostOfMainProcessing() {
        return costOfMainProcessing;
    }

    public void setCostOfMainProcessing(Collection costOfMainProcessing) {
        this.costOfMainProcessing = costOfMainProcessing;
    }

    public Collection getPreseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2() {
        return preseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2;
    }

    public void setPreseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2(Collection preseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2) {
        this.preseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2 = preseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2;
    }

    public Collection getMainProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_F1_2_F2() {
        return mainProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_F1_2_F2;
    }

    public void setMainProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_F1_2_F2(Collection mainProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_F1_2_F2) {
        this.mainProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_F1_2_F2 = mainProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_F1_2_F2;
    }

    public Collection getStandartTechnology() {
        return standartTechnology;
    }

    public void setStandartTechnology(Collection standartTechnology) {
        this.standartTechnology = standartTechnology;
    }
}

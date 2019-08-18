package core.data;

import java.util.*;
public class CareOfCrops {
    private int careOfCropsId;
    private String codeCareOfCrops;
    private String descriptionCareOfCrops;
    private Collection costOfCareOfCrops = new HashSet();
    private Collection standartTechnology = new HashSet();
    private Collection careOfCrops_2_LevelOfIntensification_2_Crop_2_F1_2_F2 = new HashSet();
    private boolean isKB;
    private boolean isUD;

    public CareOfCrops() {
    }

    public int getCareOfCropsId() {
        return careOfCropsId;
    }

    public void setCareOfCropsId(int careOfCropsId) {
        this.careOfCropsId = careOfCropsId;
    }

    public String getCodeCareOfCrops() {
        return codeCareOfCrops;
    }

    public void setCodeCareOfCrops(String codeCareOfCrops) {
        this.codeCareOfCrops = codeCareOfCrops;
    }

    public String getDescriptionCareOfCrops() {
        return descriptionCareOfCrops;
    }

    public void setDescriptionCareOfCrops(String descriptionCareOfCrops) {
        this.descriptionCareOfCrops = descriptionCareOfCrops;
    }

    public Collection getCareOfCrops_2_LevelOfIntensification_2_Crop_2_F1_2_F2() {
        return careOfCrops_2_LevelOfIntensification_2_Crop_2_F1_2_F2;
    }

    public void setCareOfCrops_2_LevelOfIntensification_2_Crop_2_F1_2_F2(Collection careOfCrops_2_LevelOfIntensification_2_Crop_2_F1_2_F2) {
        this.careOfCrops_2_LevelOfIntensification_2_Crop_2_F1_2_F2 = careOfCrops_2_LevelOfIntensification_2_Crop_2_F1_2_F2;
    }

    public Collection getCostOfCareOfCrops() {
        return costOfCareOfCrops;
    }

    public void setCostOfCareOfCrops(Collection costOfCareOfCrops) {
        this.costOfCareOfCrops = costOfCareOfCrops;
    }

    public Collection getStandartTechnology() {
        return standartTechnology;
    }

    public void setStandartTechnology(Collection standartTechnology) {
        this.standartTechnology = standartTechnology;
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
}

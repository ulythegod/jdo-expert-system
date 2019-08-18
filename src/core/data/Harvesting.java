package core.data;

import java.util.*;

public class Harvesting {
    private int harvestingId;
    private String codeHarvesting;
    private String descriptionHarvesting;
    private Collection costOfHarvesting = new HashSet();
    private Collection standartTechnology = new HashSet();
    private Collection harvesting_2_LevelOfIntensification_2_Crop_2_Factor = new HashSet();

    public Harvesting() {
    }

    public int getHarvestingId() {
        return harvestingId;
    }

    public void setHarvestingId(int harvestingId) {
        this.harvestingId = harvestingId;
    }

    public String getCodeHarvesting() {
        return codeHarvesting;
    }

    public void setCodeHarvesting(String codeHarvesting) {
        this.codeHarvesting = codeHarvesting;
    }

    public String getDescriptionHarvesting() {
        return descriptionHarvesting;
    }

    public void setDescriptionHarvesting(String descriptionHarvesting) {
        this.descriptionHarvesting = descriptionHarvesting;
    }

    public Collection getHarvesting_2_LevelOfIntensification_2_Crop_2_Factor() {
        return harvesting_2_LevelOfIntensification_2_Crop_2_Factor;
    }

    public void setHarvesting_2_LevelOfIntensification_2_Crop_2_Factor(Collection harvesting_2_LevelOfIntensification_2_Crop_2_Factor) {
        this.harvesting_2_LevelOfIntensification_2_Crop_2_Factor = harvesting_2_LevelOfIntensification_2_Crop_2_Factor;
    }

    public Collection getCostOfHarvesting() {
        return costOfHarvesting;
    }

    public void setCostOfHarvesting(Collection costOfHarvesting) {
        this.costOfHarvesting = costOfHarvesting;
    }

    public Collection getStandartTechnology() {
        return standartTechnology;
    }

    public void setStandartTechnology(Collection standartTechnology) {
        this.standartTechnology = standartTechnology;
    }
}

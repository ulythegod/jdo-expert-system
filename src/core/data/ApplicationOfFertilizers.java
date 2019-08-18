package core.data;

import java.util.*;

public class ApplicationOfFertilizers {
    private int applicationOfFertilizersId;
    private String codeApplicationOfFertilizers;
    private String descriptionApplicationOfFertilizers;
    private Collection applicationOfFertilizers_2_LevelOfIntensification = new HashSet();
    private Collection costOfApplicationOfFertilizers = new HashSet();
	private Collection standartTechnology = new HashSet();
    private Collection applicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_Crop = new HashSet();
    private Collection<ApplicationOfFertilizers_2_Microelement> applicationOfFertilizers_2_Microelement = new HashSet();
    private Collection resultsFertilizers = new HashSet();

    public ApplicationOfFertilizers() {
    }

    public int getApplicationOfFertilizersId() {
        return applicationOfFertilizersId;
    }

    public void setApplicationOfFertilizersId(int applicationOfFertilizersId) {
        this.applicationOfFertilizersId = applicationOfFertilizersId;
    }

    public String getCodeApplicationOfFertilizers() {
        return codeApplicationOfFertilizers;
    }

    public void setCodeApplicationOfFertilizers(String codeApplicationOfFertilizers) {
        this.codeApplicationOfFertilizers = codeApplicationOfFertilizers;
    }

    public String getDescriptionApplicationOfFertilizers() {
        return descriptionApplicationOfFertilizers;
    }

    public void setDescriptionApplicationOfFertilizers(String descriptionApplicationOfFertilizers) {
        this.descriptionApplicationOfFertilizers = descriptionApplicationOfFertilizers;
    }

    public Collection getApplicationOfFertilizers_2_LevelOfIntensification() {
        return applicationOfFertilizers_2_LevelOfIntensification;
    }

    public void setApplicationOfFertilizers_2_LevelOfIntensification(Collection applicationOfFertilizers_2_LevelOfIntensification) {
        this.applicationOfFertilizers_2_LevelOfIntensification = applicationOfFertilizers_2_LevelOfIntensification;
    }

    public Collection getCostOfApplicationOfFertilizers() {
        return costOfApplicationOfFertilizers;
    }

    public void setCostOfApplicationOfFertilizers(Collection costOfApplicationOfFertilizers) {
        this.costOfApplicationOfFertilizers = costOfApplicationOfFertilizers;
    }

    public Collection getApplicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_Crop() {
        return applicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_Crop;
    }

    public void setApplicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_Crop(Collection applicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_Crop) {
        this.applicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_Crop = applicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_Crop;
    }

    public Collection getStandartTechnology() {
        return standartTechnology;
    }

    public void setStandartTechnology(Collection standartTechnology) {
        this.standartTechnology = standartTechnology;
    }

    public Collection<ApplicationOfFertilizers_2_Microelement> getApplicationOfFertilizers_2_Microelement() {
        return applicationOfFertilizers_2_Microelement;
    }

    public void setApplicationOfFertilizers_2_Microelement(Collection applicationOfFertilizers_2_Microelement) {
        this.applicationOfFertilizers_2_Microelement = applicationOfFertilizers_2_Microelement;
    }

    public Collection getResultsFertilizers() {
        return resultsFertilizers;
    }

    public void setResultsFertilizers(Collection resultsFertilizers) {
        this.resultsFertilizers = resultsFertilizers;
    }
}

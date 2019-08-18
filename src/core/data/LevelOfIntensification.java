package core.data;


import java.util.Collection;
import java.util.HashSet;

public class LevelOfIntensification {
    private int levelOfIntensificationId;
    private String codeLevelOfIntensification;
    private String nameLevelOfIntensification;
    private String descriptionLevelOfIntensification;
    private Collection applicationOfFertilizers_2_LevelOfIntensification = new HashSet();
    private Collection applicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_Crop = new HashSet();
    private Collection careOfCrops_2_LevelOfIntensification_2_Crop_2_F1_2_F2 = new HashSet();
    private Collection chemicalProtectionOfCrops_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_F1_2_F2 = new HashSet();
    private Collection harvesting_2_LevelOfIntensification_2_Crop_2_Factor = new HashSet();
    private Collection mainProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_F1_2_F2 = new HashSet();
    private Collection preseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2 = new HashSet();
    private Collection cropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoil = new HashSet();
    private Collection levelOfIntensificationAndRecommendations = new HashSet();
    private Collection productivity = new HashSet();
    private Collection productivityCalculation = new HashSet();
    private Collection standartTechnology = new HashSet();
    private Collection gradeOfCrop_2_LevelOfIntensification_2_TypeOfSoil = new HashSet();
    private Collection typeOfSoil_2_LevelOfIntensification = new HashSet();

    public LevelOfIntensification() {
    }

    public String getCodeLevelOfIntensification() {
        return codeLevelOfIntensification;
    }

    public void setCodeLevelOfIntensification(String codeLevelOfIntensification) {
        this.codeLevelOfIntensification = codeLevelOfIntensification;
    }

    public Collection getGradeOfCrop_2_LevelOfIntensification_2_TypeOfSoil() {
        return gradeOfCrop_2_LevelOfIntensification_2_TypeOfSoil;
    }

    public void setGradeOfCrop_2_LevelOfIntensification_2_TypeOfSoil(Collection gradeOfCrop_2_LevelOfIntensification_2_TypeOfSoil) {
        this.gradeOfCrop_2_LevelOfIntensification_2_TypeOfSoil = gradeOfCrop_2_LevelOfIntensification_2_TypeOfSoil;
    }

    public Collection getApplicationOfFertilizers_2_LevelOfIntensification() {
        return applicationOfFertilizers_2_LevelOfIntensification;
    }

    public void setApplicationOfFertilizers_2_LevelOfIntensification(Collection applicationOfFertilizers_2_LevelOfIntensification) {
        this.applicationOfFertilizers_2_LevelOfIntensification = applicationOfFertilizers_2_LevelOfIntensification;
    }

    public Collection getApplicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_Crop() {
        return applicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_Crop;
    }

    public void setApplicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_Crop(Collection applicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_Crop) {
        this.applicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_Crop = applicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_Crop;
    }

    public Collection getCareOfCrops_2_LevelOfIntensification_2_Crop_2_F1_2_F2() {
        return careOfCrops_2_LevelOfIntensification_2_Crop_2_F1_2_F2;
    }

    public void setCareOfCrops_2_LevelOfIntensification_2_Crop_2_F1_2_F2(Collection careOfCrops_2_LevelOfIntensification_2_Crop_2_F1_2_F2) {
        this.careOfCrops_2_LevelOfIntensification_2_Crop_2_F1_2_F2 = careOfCrops_2_LevelOfIntensification_2_Crop_2_F1_2_F2;
    }

    public Collection getChemicalProtectionOfCrops_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_F1_2_F2() {
        return chemicalProtectionOfCrops_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_F1_2_F2;
    }

    public void setChemicalProtectionOfCrops_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_F1_2_F2(Collection chemicalProtectionOfCrops_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_F1_2_F2) {
        this.chemicalProtectionOfCrops_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_F1_2_F2 = chemicalProtectionOfCrops_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_F1_2_F2;
    }

    public Collection getCropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoil() {
        return cropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoil;
    }

    public void setCropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoil(Collection cropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoil) {
        this.cropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoil = cropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoil;
    }

    public String getDescriptionLevelOfIntensification() {
        return descriptionLevelOfIntensification;
    }

    public void setDescriptionLevelOfIntensification(String descriptionLevelOfIntensification) {
        this.descriptionLevelOfIntensification = descriptionLevelOfIntensification;
    }

    public Collection getHarvesting_2_LevelOfIntensification_2_Crop_2_Factor() {
        return harvesting_2_LevelOfIntensification_2_Crop_2_Factor;
    }

    public void setHarvesting_2_LevelOfIntensification_2_Crop_2_Factor(Collection harvesting_2_LevelOfIntensification_2_Crop_2_Factor) {
        this.harvesting_2_LevelOfIntensification_2_Crop_2_Factor = harvesting_2_LevelOfIntensification_2_Crop_2_Factor;
    }

    public Collection getLevelOfIntensificationAndRecommendations() {
        return levelOfIntensificationAndRecommendations;
    }

    public void setLevelOfIntensificationAndRecommendations(Collection levelOfIntensificationAndRecommendations) {
        this.levelOfIntensificationAndRecommendations = levelOfIntensificationAndRecommendations;
    }

    public int getLevelOfIntensificationId() {
        return levelOfIntensificationId;
    }

    public void setLevelOfIntensificationId(int levelOfIntensificationId) {
        this.levelOfIntensificationId = levelOfIntensificationId;
    }

    public Collection getMainProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_F1_2_F2() {
        return mainProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_F1_2_F2;
    }

    public void setMainProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_F1_2_F2(Collection mainProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_F1_2_F2) {
        this.mainProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_F1_2_F2 = mainProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_F1_2_F2;
    }

    public String getNameLevelOfIntensification() {
        return nameLevelOfIntensification;
    }

    public void setNameLevelOfIntensification(String nameLevelOfIntensification) {
        this.nameLevelOfIntensification = nameLevelOfIntensification;
    }

    public Collection getPreseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2() {
        return preseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2;
    }

    public void setPreseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2(Collection preseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2) {
        this.preseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2 = preseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2;
    }

    public Collection getTypeOfSoil_2_LevelOfIntensification() {
        return typeOfSoil_2_LevelOfIntensification;
    }

    public void setTypeOfSoil_2_LevelOfIntensification(Collection typeOfSoil_2_LevelOfIntensification) {
        this.typeOfSoil_2_LevelOfIntensification = typeOfSoil_2_LevelOfIntensification;
    }

    public Collection getProductivity() {
        return productivity;
    }

    public void setProductivity(Collection productivity) {
        this.productivity = productivity;
    }

    public Collection getProductivityCalculation() {
        return productivityCalculation;
    }

    public void setProductivityCalculation(Collection productivityCalculation) {
        this.productivityCalculation = productivityCalculation;
    }

    public Collection getStandartTechnology() {
        return standartTechnology;
    }

    public void setStandartTechnology(Collection standartTechnology) {
        this.standartTechnology = standartTechnology;
    }
}

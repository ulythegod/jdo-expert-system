package core.data;

import java.security.acl.Group;
import java.util.Collection;
import java.util.HashSet;

public class Crop {
    private int cropId;
    private String nameCrop;
    private String codeCrop;
    private GroupOfCrops groupOfCrops;
    private GroupOfCropForCoeff groupOfCropsForCoeff;
    private String color;
    private String pattern;
    private boolean isKB;
    private boolean isUD;
    private Collection applicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_Crop = new HashSet();
    private Collection careOfCrops_2_LevelOfIntensification_2_Crop_2_F1_2_F2 = new HashSet();
    private Collection chemicalProtectionOfCrops_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_F1_2_F2 = new HashSet();
    private Collection levelOfIntensificationToCropsToPredecessor = new HashSet();
    private Collection harvesting_2_LevelOfIntensification_2_Crop_2_Factor = new HashSet();
    private Collection mainProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_F1_2_F2 = new HashSet();
    private Collection preseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2 = new HashSet();
    private Collection gradeOfCrop = new HashSet();
    private Collection productivity = new HashSet();
    private Collection productivityCalculation = new HashSet();
    private transient Predecessor predecessor;
    private Collection removalOfMicroelement = new HashSet();
    private Collection resultsFertilizers = new HashSet();

    public Crop() {
    }

    public int getCropId() {
        return cropId;
    }

    public void setCropId(int cropId) {
        this.cropId = cropId;
    }

    public String getNameCrop() {
        return nameCrop;
    }

    public void setNameCrop(String nameCrop) {
        this.nameCrop = nameCrop;
    }

    public String getCodeCrop() {
        return codeCrop;
    }

    public void setCodeCrop(String codeCrop) {
        this.codeCrop = codeCrop;
    }

    public GroupOfCrops getGroupOfCrops() {
        return groupOfCrops;
    }

    public void setGroupOfCrops(GroupOfCrops groupOfCrops) {
        this.groupOfCrops = groupOfCrops;
    }

    public GroupOfCropForCoeff getGroupOfCropsForCoeff() {
        return groupOfCropsForCoeff;
    }

    public void setGroupOfCropsForCoeff(GroupOfCropForCoeff groupOfCropsForCoeff) {
        this.groupOfCropsForCoeff = groupOfCropsForCoeff;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
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

    public Collection getLevelOfIntensificationToCropsToPredecessor() {
        return levelOfIntensificationToCropsToPredecessor;
    }

    public void setLevelOfIntensificationToCropsToPredecessor(Collection levelOfIntensificationToCropsToPredecessor) {
        this.levelOfIntensificationToCropsToPredecessor = levelOfIntensificationToCropsToPredecessor;
    }

    public Collection getHarvesting_2_LevelOfIntensification_2_Crop_2_Factor() {
        return harvesting_2_LevelOfIntensification_2_Crop_2_Factor;
    }

    public void setHarvesting_2_LevelOfIntensification_2_Crop_2_Factor(Collection harvesting_2_LevelOfIntensification_2_Crop_2_Factor) {
        this.harvesting_2_LevelOfIntensification_2_Crop_2_Factor = harvesting_2_LevelOfIntensification_2_Crop_2_Factor;
    }

    public Collection getMainProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_F1_2_F2() {
        return mainProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_F1_2_F2;
    }

    public void setMainProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_F1_2_F2(Collection mainProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_F1_2_F2) {
        this.mainProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_F1_2_F2 = mainProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_F1_2_F2;
    }

    public Collection getPreseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2() {
        return preseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2;
    }

    public void setPreseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2(Collection preseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2) {
        this.preseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2 = preseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2;
    }

    public Collection getGradeOfCrop() {
        return gradeOfCrop;
    }

    public void setGradeOfCrop(Collection gradeOfCrop) {
        this.gradeOfCrop = gradeOfCrop;
    }

    public Collection getProductivity() {
        return productivity;
    }

    public void setProductivity(Collection productivity) {
        this.productivity = productivity;
    }

    public Predecessor getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Predecessor predecessor) {
        this.predecessor = predecessor;
    }

    public Collection getProductivityCalculation() {
        return productivityCalculation;
    }

    public void setProductivityCalculation(Collection productivityCalculation) {
        this.productivityCalculation = productivityCalculation;
    }

    public Collection getRemovalOfMicroelement() {
        return removalOfMicroelement;
    }

    public void setRemovalOfMicroelement(Collection removalOfMicroelement) {
        this.removalOfMicroelement = removalOfMicroelement;
    }

    public Collection getResultsFertilizers() {
        return resultsFertilizers;
    }

    public void setResultsFertilizers(Collection resultsFertilizers) {
        this.resultsFertilizers = resultsFertilizers;
    }
}

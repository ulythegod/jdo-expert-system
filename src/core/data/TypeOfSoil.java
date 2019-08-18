package core.data;


import java.util.*;


public class TypeOfSoil {
    private int typeOfSoilId;
    private String codeTypeOfSoil;
    private String nameTypeSoil;
    private GroupOfTypesOfSoils groupOfTypesOfSoils;
    private CategoryOfTypesOfSoils categoryOfTypesOfSoils;
    private boolean isKB;
    private boolean isUD;
    private String color;
    private transient Collection agricultureField = new HashSet();
    private Collection applicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_Crop = new HashSet();
    private Collection chemicalProtectionOfCrops_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_F1_2_F2 = new HashSet();
    private Collection mainProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_F1_2_F2 = new HashSet();
    private Collection preseedingProcessing_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_Predecessor_2_MainProcessing_2_F1_2_F2 = new HashSet();
    private Collection cropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoil = new HashSet();
    private Collection productivity = new HashSet();
    private Collection productivityCalculation = new HashSet();
    private Collection typeOfSoilAndRecommendations = new HashSet();
    private Collection gradeOfCrop_2_LevelOfIntensification_2_TypeOfSoil = new HashSet();
    private Collection typeOfSoil_2_LevelOfIntensification = new HashSet();
    private Collection humusMineralizationCoefficient_2_TypeOfSoil_2_GroupsOfCrops = new HashSet();

    public TypeOfSoil() {
    }

    public TypeOfSoil(int typeOfSoilId, String codeTypeOfSoil, String nameTypeSoil) {
        this.typeOfSoilId = typeOfSoilId;
        this.codeTypeOfSoil = codeTypeOfSoil;
        this.nameTypeSoil = nameTypeSoil;
    }

    public int getTypeOfSoilId() {
        return typeOfSoilId;
    }

    public void setTypeOfSoilId(int typeOfSoilId) {
        this.typeOfSoilId = typeOfSoilId;
    }

    public String getCodeTypeOfSoil() {
        return codeTypeOfSoil;
    }

    public void setCodeTypeOfSoil(String codeTypeOfSoil) {
        this.codeTypeOfSoil = codeTypeOfSoil;
    }

    public String getNameTypeSoil() {
        return nameTypeSoil;
    }

    public void setNameTypeSoil(String nameTypeSoil) {
        this.nameTypeSoil = nameTypeSoil;
    }

    public GroupOfTypesOfSoils getGroupOfTypesOfSoils() {
        return groupOfTypesOfSoils;
    }

    public void setGroupOfTypesOfSoils(GroupOfTypesOfSoils groupOfTypesOfSoils) {
        this.groupOfTypesOfSoils = groupOfTypesOfSoils;
    }

    public CategoryOfTypesOfSoils getCategoryOfTypesOfSoils() {
        return categoryOfTypesOfSoils;
    }

    public void setCategoryOfTypesOfSoils(CategoryOfTypesOfSoils categoryOfTypesOfSoils) {
        this.categoryOfTypesOfSoils = categoryOfTypesOfSoils;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Collection getAgricultureField() {
        return agricultureField;
    }

    public void setAgricultureField(Collection agricultureField) {
        this.agricultureField = agricultureField;
    }

    public Collection getApplicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_Crop() {
        return applicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_Crop;
    }

    public void setApplicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_Crop(Collection applicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_Crop) {
        this.applicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_Crop = applicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_Crop;
    }

    public Collection getChemicalProtectionOfCrops_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_F1_2_F2() {
        return chemicalProtectionOfCrops_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_F1_2_F2;
    }

    public void setChemicalProtectionOfCrops_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_F1_2_F2(Collection chemicalProtectionOfCrops_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_F1_2_F2) {
        this.chemicalProtectionOfCrops_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_F1_2_F2 = chemicalProtectionOfCrops_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_F1_2_F2;
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

    public Collection getCropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoil() {
        return cropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoil;
    }

    public void setCropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoil(Collection cropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoil) {
        this.cropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoil = cropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoil;
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

    public Collection getTypeOfSoilAndRecommendations() {
        return typeOfSoilAndRecommendations;
    }

    public void setTypeOfSoilAndRecommendations(Collection typeOfSoilAndRecommendations) {
        this.typeOfSoilAndRecommendations = typeOfSoilAndRecommendations;
    }

    public Collection getGradeOfCrop_2_LevelOfIntensification_2_TypeOfSoil() {
        return gradeOfCrop_2_LevelOfIntensification_2_TypeOfSoil;
    }

    public void setGradeOfCrop_2_LevelOfIntensification_2_TypeOfSoil(Collection gradeOfCrop_2_LevelOfIntensification_2_TypeOfSoil) {
        this.gradeOfCrop_2_LevelOfIntensification_2_TypeOfSoil = gradeOfCrop_2_LevelOfIntensification_2_TypeOfSoil;
    }

    public Collection getTypeOfSoil_2_LevelOfIntensification() {
        return typeOfSoil_2_LevelOfIntensification;
    }

    public void setTypeOfSoil_2_LevelOfIntensification(Collection typeOfSoil_2_LevelOfIntensification) {
        this.typeOfSoil_2_LevelOfIntensification = typeOfSoil_2_LevelOfIntensification;
    }

    public Collection getHumusMineralizationCoefficient_2_TypeOfSoil_2_GroupsOfCrops() {
        return humusMineralizationCoefficient_2_TypeOfSoil_2_GroupsOfCrops;
    }

    public void setHumusMineralizationCoefficient_2_TypeOfSoil_2_GroupsOfCrops(Collection humusMineralizationCoefficient_2_TypeOfSoil_2_GroupsOfCrops) {
        this.humusMineralizationCoefficient_2_TypeOfSoil_2_GroupsOfCrops = humusMineralizationCoefficient_2_TypeOfSoil_2_GroupsOfCrops;
    }
}

package core.data;

import java.util.Collection;
import java.util.HashSet;

public class GradeOfCrop {
    private int gradeOfCropId;
    private String codeGradeOfCrop;
    private String nameGradeOfCrops;
    private Crop crop;
    private int factorToProductivityGradeOfCrop;
    private boolean isKB;
    private boolean isUD;
    private Collection costOfSeed = new HashSet();
    private Collection costOnProductionFertilizer = new HashSet();
    private Collection gradeOfCrop_2_LevelOfIntensification_2_TypeOfSoil = new HashSet();
    private Collection standartTechnology = new HashSet();

    public GradeOfCrop() {
    }

    public int getGradeOfCropId() {
        return gradeOfCropId;
    }

    public void setGradeOfCropId(int gradeOfCropId) {
        this.gradeOfCropId = gradeOfCropId;
    }

    public String getCodeGradeOfCrop() {
        return codeGradeOfCrop;
    }

    public void setCodeGradeOfCrop(String codeGradeOfCrop) {
        this.codeGradeOfCrop = codeGradeOfCrop;
    }

    public String getNameGradeOfCrops() {
        return nameGradeOfCrops;
    }

    public void setNameGradeOfCrops(String nameGradeOfCrops) {
        this.nameGradeOfCrops = nameGradeOfCrops;
    }

    public Crop getCrop() {
        return crop;
    }

    public void setCrop(Crop crop) {
        this.crop = crop;
    }

    public int getFactorToProductivityGradeOfCrop() {
        return factorToProductivityGradeOfCrop;
    }

    public void setFactorToProductivityGradeOfCrop(int factorToProductivityGradeOfCrop) {
        this.factorToProductivityGradeOfCrop = factorToProductivityGradeOfCrop;
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

    public Collection getCostOfSeed() {
        return costOfSeed;
    }

    public void setCostOfSeed(Collection costOfSeed) {
        this.costOfSeed = costOfSeed;
    }

    public Collection getCostOnProductionFertilizer() {
        return costOnProductionFertilizer;
    }

    public void setCostOnProductionFertilizer(Collection costOnProductionFertilizer) {
        this.costOnProductionFertilizer = costOnProductionFertilizer;
    }

    public Collection getGradeOfCrop_2_LevelOfIntensification_2_TypeOfSoil() {
        return gradeOfCrop_2_LevelOfIntensification_2_TypeOfSoil;
    }

    public void setGradeOfCrop_2_LevelOfIntensification_2_TypeOfSoil(Collection gradeOfCrop_2_LevelOfIntensification_2_TypeOfSoil) {
        this.gradeOfCrop_2_LevelOfIntensification_2_TypeOfSoil = gradeOfCrop_2_LevelOfIntensification_2_TypeOfSoil;
    }

    public Collection getStandartTechnology() {
        return standartTechnology;
    }

    public void setStandartTechnology(Collection standartTechnology) {
        this.standartTechnology = standartTechnology;
    }
}

package core.data;

import java.util.Collection;
import java.util.HashSet;

public class CropRotation {

    private int cropRotationId;
    private String codeCropRotation;
    private String nameCropRotation;
    private ViewOfCropRotation viewOfCropRotation;
    private int lengthOfTheCycleCropRotation;
    private String descriptionCropRotation;
    private String adapterSemihydromorphic;
    private String adapterIntensification;
    private String factorInTheRiskOfErosion;
    private Collection cropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoil = new HashSet();
    private Collection cropRotationOfAgriculture = new HashSet();
    private Collection cropRotationToGroupOfCropsToYear = new HashSet();

    public CropRotation() {
    }

    public Collection getCropRotationToGroupOfCropsToYear() {
        return cropRotationToGroupOfCropsToYear;
    }

    public void setCropRotationToGroupOfCropsToYear(Collection cropRotationToGroupOfCropsToYear) {
        this.cropRotationToGroupOfCropsToYear = cropRotationToGroupOfCropsToYear;
    }

    public String getAdapterIntensification() {
        return adapterIntensification;
    }

    public void setAdapterIntensification(String adapterIntensification) {
        this.adapterIntensification = adapterIntensification;
    }

    public String getAdapterSemihydromorphic() {
        return adapterSemihydromorphic;
    }

    public void setAdapterSemihydromorphic(String adapterSemihydromorphic) {
        this.adapterSemihydromorphic = adapterSemihydromorphic;
    }

    public String getCodeCropRotation() {
        return codeCropRotation;
    }

    public void setCodeCropRotation(String codeCropRotation) {
        this.codeCropRotation = codeCropRotation;
    }

    public Collection getCropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoil() {
        return cropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoil;
    }

    public void setCropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoil(Collection cropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoil) {
        this.cropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoil = cropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoil;
    }

    public int getCropRotationId() {
        return cropRotationId;
    }

    public void setCropRotationId(int cropRotationId) {
        this.cropRotationId = cropRotationId;
    }

    public Collection getCropRotationOfAgriculture() {
        return cropRotationOfAgriculture;
    }

    public void setCropRotationOfAgriculture(Collection cropRotationOfAgriculture) {
        this.cropRotationOfAgriculture = cropRotationOfAgriculture;
    }

    public String getDescriptionCropRotation() {
        return descriptionCropRotation;
    }

    public void setDescriptionCropRotation(String descriptionCropRotation) {
        this.descriptionCropRotation = descriptionCropRotation;
    }

    public String getFactorInTheRiskOfErosion() {
        return factorInTheRiskOfErosion;
    }

    public void setFactorInTheRiskOfErosion(String factorInTheRiskOfErosion) {
        this.factorInTheRiskOfErosion = factorInTheRiskOfErosion;
    }

    public int getLengthOfTheCycleCropRotation() {
        return lengthOfTheCycleCropRotation;
    }

    public void setLengthOfTheCycleCropRotation(int lengthOfTheCycleCropRotation) {
        this.lengthOfTheCycleCropRotation = lengthOfTheCycleCropRotation;
    }

    public String getNameCropRotation() {
        return nameCropRotation;
    }

    public void setNameCropRotation(String nameCropRotation) {
        this.nameCropRotation = nameCropRotation;
    }

    public ViewOfCropRotation getViewOfCropRotation() {
        return viewOfCropRotation;
    }

    public void setViewOfCropRotation(ViewOfCropRotation viewOfCropRotation) {
        this.viewOfCropRotation = viewOfCropRotation;
    }
}

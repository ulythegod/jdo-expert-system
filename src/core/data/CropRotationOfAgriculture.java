package core.data;

import java.util.Collection;
import java.util.HashSet;

public class CropRotationOfAgriculture {

    private int cropRotationOfAgricultureId;
    private String codeCropRotationOfAgriculture;
    private CropRotation cropRotation;
    private int startYearCropRotationOfAgriculture;
    private Agricultures agriculture;
    private Collection cropRotationOfAgriculture_2_AgricultureField = new HashSet();

    public CropRotationOfAgriculture() {
    }

    public Agricultures getAgriculture() {
        return agriculture;
    }

    public void setAgriculture(Agricultures agriculture) {
        this.agriculture = agriculture;
    }

    public Collection getCropRotationOfAgriculture_2_AgricultureField() {
        return cropRotationOfAgriculture_2_AgricultureField;
    }

    public void setCropRotationOfAgriculture_2_AgricultureField(Collection cropRotationOfAgriculture_2_AgricultureField) {
        this.cropRotationOfAgriculture_2_AgricultureField = cropRotationOfAgriculture_2_AgricultureField;
    }

    public String getCodeCropRotationOfAgriculture() {
        return codeCropRotationOfAgriculture;
    }

    public void setCodeCropRotationOfAgriculture(String codeCropRotationOfAgriculture) {
        this.codeCropRotationOfAgriculture = codeCropRotationOfAgriculture;
    }

    public CropRotation getCropRotation() {
        return cropRotation;
    }

    public void setCropRotation(CropRotation cropRotation) {
        this.cropRotation = cropRotation;
    }

    public int getCropRotationOfAgricultureId() {
        return cropRotationOfAgricultureId;
    }

    public void setCropRotationOfAgricultureId(int cropRotationOfAgricultureId) {
        this.cropRotationOfAgricultureId = cropRotationOfAgricultureId;
    }

    public int getStartYearCropRotationOfAgriculture() {
        return startYearCropRotationOfAgriculture;
    }

    public void setStartYearCropRotationOfAgriculture(int startYearCropRotationOfAgriculture) {
        this.startYearCropRotationOfAgriculture = startYearCropRotationOfAgriculture;
    }

}

package core.data;

/**
 * Author: Skosyreva Maria
 * Date: 06.04.2016
 * Time: 17:22
 */
public class CropRotationOfAgriculture_2_AgricultureField {
    private int cropRotationOfAgriculture_2_AgricultureFieldId;
    private CropRotationOfAgriculture cropRotationOfAgriculture;
    private AgricultureField agricultureField;

    public CropRotationOfAgriculture_2_AgricultureField() {
    }

    public int getCropRotationOfAgriculture_2_AgricultureFieldId() {
        return cropRotationOfAgriculture_2_AgricultureFieldId;
    }

    public void setCropRotationOfAgriculture_2_AgricultureFieldId(int cropRotationOfAgriculture_2_AgricultureFieldId) {
        this.cropRotationOfAgriculture_2_AgricultureFieldId = cropRotationOfAgriculture_2_AgricultureFieldId;
    }

    public CropRotationOfAgriculture getCropRotationOfAgriculture() {
        return cropRotationOfAgriculture;
    }

    public void setCropRotationOfAgriculture(CropRotationOfAgriculture cropRotationOfAgriculture) {
        this.cropRotationOfAgriculture = cropRotationOfAgriculture;
    }

    public AgricultureField getAgricultureField() {
        return agricultureField;
    }

    public void setAgricultureField(AgricultureField agricultureField) {
        this.agricultureField = agricultureField;
    }
}

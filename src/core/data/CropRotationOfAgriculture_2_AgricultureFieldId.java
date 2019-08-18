package core.data;

/**
 * Author: Skosyreva Maria
 * Date: 06.04.2016
 * Time: 17:22
 */
public class CropRotationOfAgriculture_2_AgricultureFieldId {
    static Class c = CropRotationOfAgriculture_2_AgricultureField.class;
    public int cropRotationOfAgriculture_2_AgricultureFieldId;

    public CropRotationOfAgriculture_2_AgricultureFieldId() {
    }

    public CropRotationOfAgriculture_2_AgricultureFieldId(String fromString) {
        cropRotationOfAgriculture_2_AgricultureFieldId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(cropRotationOfAgriculture_2_AgricultureFieldId);
    }

    public int hashCode() {
        return cropRotationOfAgriculture_2_AgricultureFieldId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof CropRotationOfAgriculture_2_AgricultureFieldId))
            return false;
        CropRotationOfAgriculture_2_AgricultureFieldId other = (CropRotationOfAgriculture_2_AgricultureFieldId) obj;
        return (cropRotationOfAgriculture_2_AgricultureFieldId == other.cropRotationOfAgriculture_2_AgricultureFieldId);
    }
}

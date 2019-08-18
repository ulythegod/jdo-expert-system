package core.data;

public class CropRotationOfAgricultureId {

    static Class c = CropRotationOfAgriculture.class;
    public int cropRotationOfAgricultureId;

    public CropRotationOfAgricultureId() {
    }

    public CropRotationOfAgricultureId(String fromString) {
        cropRotationOfAgricultureId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(cropRotationOfAgricultureId);
    }

    public int hashCode() {
        return cropRotationOfAgricultureId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof CropRotationOfAgricultureId))
            return false;
        CropRotationOfAgricultureId other = (CropRotationOfAgricultureId) obj;
        return (cropRotationOfAgricultureId == other.cropRotationOfAgricultureId);
    }

}

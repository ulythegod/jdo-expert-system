package core.data;

public class CropRotationId {

    static Class c = CropRotation.class;
    public int cropRotationId;

    public CropRotationId() {
    }

    public CropRotationId(String fromString) {
        cropRotationId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(cropRotationId);
    }

    public int hashCode() {
        return cropRotationId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof CropRotationId))
            return false;
        CropRotationId other = (CropRotationId) obj;
        return (cropRotationId == other.cropRotationId);
    }

}

package core.data;

public class CropId {

    static Class c = Crop.class;
    public int cropId;

    public CropId() {
    }

    public CropId(String fromString) {
        cropId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(cropId);
    }

    public int hashCode() {
        return cropId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof CropId))
            return false;
        CropId other = (CropId) obj;
        return (cropId == other.cropId);
    }

}

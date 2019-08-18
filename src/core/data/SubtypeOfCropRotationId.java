package core.data;

public class SubtypeOfCropRotationId {

    static Class c = SubtypeOfCropRotation.class;
    public int subtypeOfCropRotationId;

    public SubtypeOfCropRotationId() {
    }

    public SubtypeOfCropRotationId(String fromString) {
        subtypeOfCropRotationId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(subtypeOfCropRotationId);
    }

    public int hashCode() {
        return subtypeOfCropRotationId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof SubtypeOfCropRotationId))
            return false;
        SubtypeOfCropRotationId other = (SubtypeOfCropRotationId) obj;
        return (subtypeOfCropRotationId == other.subtypeOfCropRotationId);
    }

}

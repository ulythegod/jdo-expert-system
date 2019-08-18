package core.data;

public class SubtypeOfCropRotation_2_ViewOfCropRotationId {
    static Class c = SubtypeOfCropRotation_2_ViewOfCropRotation.class;
    public int subtypeOfCropRotation_2_ViewOfCropRotationId;

    public SubtypeOfCropRotation_2_ViewOfCropRotationId() {
    }

    public SubtypeOfCropRotation_2_ViewOfCropRotationId(String fromString) {
        subtypeOfCropRotation_2_ViewOfCropRotationId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(subtypeOfCropRotation_2_ViewOfCropRotationId);
    }

    public int hashCode() {
        return subtypeOfCropRotation_2_ViewOfCropRotationId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof ProductivityId))
            return false;
        SubtypeOfCropRotation_2_ViewOfCropRotationId other = (SubtypeOfCropRotation_2_ViewOfCropRotationId) obj;
        return (subtypeOfCropRotation_2_ViewOfCropRotationId == other.subtypeOfCropRotation_2_ViewOfCropRotationId);
    }


}

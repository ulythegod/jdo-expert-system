package core.data;

public class ViewOfCropRotationId {

    static Class c = ViewOfCropRotation.class;
    public int viewOfCropRotationId;

    public ViewOfCropRotationId() {
    }

    public ViewOfCropRotationId(String fromString) {
        viewOfCropRotationId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(viewOfCropRotationId);
    }

    public int hashCode() {
        return viewOfCropRotationId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof ViewOfCropRotationId))
            return false;
        ViewOfCropRotationId other = (ViewOfCropRotationId) obj;
        return (viewOfCropRotationId == other.viewOfCropRotationId);
    }

}

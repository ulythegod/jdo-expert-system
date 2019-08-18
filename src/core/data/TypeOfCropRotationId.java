package core.data;

public class TypeOfCropRotationId {

    static Class c = TypeOfCropRotation.class;
    public int typeOfCropRotationId;

    public TypeOfCropRotationId() {
    }

    public TypeOfCropRotationId(String fromString) {
        typeOfCropRotationId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(typeOfCropRotationId);
    }

    public int hashCode() {
        return typeOfCropRotationId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof TypeOfCropRotationId))
            return false;
        TypeOfCropRotationId other = (TypeOfCropRotationId) obj;
        return (typeOfCropRotationId == other.typeOfCropRotationId);
    }

}

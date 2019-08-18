package core.data;

public class TypeOfSoilId {

    static Class c = TypeOfSoil.class;
    public int typeOfSoilId;

    public TypeOfSoilId() {
    }

    public TypeOfSoilId(String fromString) {
        typeOfSoilId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(typeOfSoilId);
    }

    public int hashCode() {
        return typeOfSoilId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof TypeOfSoilId))
            return false;
        TypeOfSoilId other = (TypeOfSoilId) obj;
        return (typeOfSoilId == other.typeOfSoilId);
    }

}

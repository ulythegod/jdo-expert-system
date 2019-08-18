package core.data;

/**
 * Author: Skosyreva Maria
 * Date: 24.05.2016
 * Time: 19:21
 */
public class TypeOfSoil_2_AgricultureId {
    static Class c = TypeOfSoil_2_AgricultureId.class;
    public int typeOfSoil_2_AgricultureId;

    public TypeOfSoil_2_AgricultureId() {
    }

    public TypeOfSoil_2_AgricultureId(String fromString) {
        typeOfSoil_2_AgricultureId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(typeOfSoil_2_AgricultureId);
    }

    public int hashCode() {
        return typeOfSoil_2_AgricultureId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof TypeOfSoil_2_AgricultureId))
            return false;
        TypeOfSoil_2_AgricultureId other = (TypeOfSoil_2_AgricultureId) obj;
        return (typeOfSoil_2_AgricultureId == other.typeOfSoil_2_AgricultureId);
    }
}

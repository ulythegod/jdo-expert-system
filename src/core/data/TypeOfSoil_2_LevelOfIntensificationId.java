package core.data;

/**
 * Created with IntelliJ IDEA.
 * User: Влада
 * Date: 21.05.13
 * Time: 22:32
 * To change this template use File | Settings | File Templates.
 */
public class TypeOfSoil_2_LevelOfIntensificationId {

    static Class c = TypeOfSoil_2_LevelOfIntensification.class;
    public int typeOfSoil_2_LevelOfIntensificationId;

    public TypeOfSoil_2_LevelOfIntensificationId() {
    }

    public TypeOfSoil_2_LevelOfIntensificationId(String fromString) {
        typeOfSoil_2_LevelOfIntensificationId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(typeOfSoil_2_LevelOfIntensificationId);
    }

    public int hashCode() {
        return typeOfSoil_2_LevelOfIntensificationId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof TypeOfSoil_2_LevelOfIntensificationId))
            return false;
        TypeOfSoil_2_LevelOfIntensificationId other = (TypeOfSoil_2_LevelOfIntensificationId) obj;
        return (typeOfSoil_2_LevelOfIntensificationId == other.typeOfSoil_2_LevelOfIntensificationId);
    }

}

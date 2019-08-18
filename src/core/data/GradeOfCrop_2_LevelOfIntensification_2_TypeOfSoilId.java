package core.data;

/**
 * Created with IntelliJ IDEA.
 * User: Влада
 * Date: 21.05.13
 * Time: 22:03
 * To change this template use File | Settings | File Templates.
 */
public class GradeOfCrop_2_LevelOfIntensification_2_TypeOfSoilId {

    static Class c = GradeOfCrop_2_LevelOfIntensification_2_TypeOfSoil.class;
    public int gradeOfCrop_2_LevelOfIntensification_2_TypeOfSoilId;

    public GradeOfCrop_2_LevelOfIntensification_2_TypeOfSoilId() {
    }

    public GradeOfCrop_2_LevelOfIntensification_2_TypeOfSoilId(String fromString) {
        gradeOfCrop_2_LevelOfIntensification_2_TypeOfSoilId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(gradeOfCrop_2_LevelOfIntensification_2_TypeOfSoilId);
    }

    public int hashCode() {
        return gradeOfCrop_2_LevelOfIntensification_2_TypeOfSoilId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof GradeOfCrop_2_LevelOfIntensification_2_TypeOfSoilId))
            return false;
        GradeOfCrop_2_LevelOfIntensification_2_TypeOfSoilId other = (GradeOfCrop_2_LevelOfIntensification_2_TypeOfSoilId) obj;
        return (gradeOfCrop_2_LevelOfIntensification_2_TypeOfSoilId == other.gradeOfCrop_2_LevelOfIntensification_2_TypeOfSoilId);
    }

}

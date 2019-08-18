package core.data;

/**
 * Author: Skosyreva Maria
 * Date: 24.05.2016
 * Time: 19:18
 */
public class GradeOfCrop_2_AgricultureId {
    static Class c = GradeOfCrop_2_AgricultureId.class;
    public int gradeOfCrop_2_AgricultureId;

    public GradeOfCrop_2_AgricultureId() {
    }

    public GradeOfCrop_2_AgricultureId(String fromString) {
        gradeOfCrop_2_AgricultureId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(gradeOfCrop_2_AgricultureId);
    }

    public int hashCode() {
        return gradeOfCrop_2_AgricultureId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof GradeOfCrop_2_AgricultureId))
            return false;
        GradeOfCrop_2_AgricultureId other = (GradeOfCrop_2_AgricultureId) obj;
        return (gradeOfCrop_2_AgricultureId == other.gradeOfCrop_2_AgricultureId);
    }
}

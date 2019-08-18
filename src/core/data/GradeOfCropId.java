package core.data;

public class GradeOfCropId {

    static Class c = GradeOfCrop.class;
    public int gradeOfCropId;

    public GradeOfCropId() {
    }

    public GradeOfCropId(String fromString) {
        gradeOfCropId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(gradeOfCropId);
    }

    public int hashCode() {
        return gradeOfCropId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof GradeOfCropId))
            return false;
        GradeOfCropId other = (GradeOfCropId) obj;
        return (gradeOfCropId == other.gradeOfCropId);
    }

}

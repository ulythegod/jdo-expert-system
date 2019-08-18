package core.data;

public class GradeOfCropAndRecommendationsId {

    static Class c = GradeOfCropAndRecommendations.class;
    public int gradeOfCropAndRecommendationsId;

    public GradeOfCropAndRecommendationsId() {
    }

    public GradeOfCropAndRecommendationsId(String fromString) {
        gradeOfCropAndRecommendationsId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(gradeOfCropAndRecommendationsId);
    }

    public int hashCode() {
        return gradeOfCropAndRecommendationsId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof GradeOfCropAndRecommendationsId))
            return false;
        GradeOfCropAndRecommendationsId other = (GradeOfCropAndRecommendationsId) obj;
        return (gradeOfCropAndRecommendationsId == other.gradeOfCropAndRecommendationsId);
    }

}

package core.data;

public class GradeOfCropAndRecommendations {

    private int gradeOfCropAndRecommendationsId;
    private GradeOfCrop gradeOfCrop;
    private int factorToProductivityGradeOfCrop;
    private String recommendationsOnLevelsOfIntensificationForGradeOfCrop;
    private String recommendationsOnTypesOfSoilsForGradeOfCrop;

    public GradeOfCropAndRecommendations() {
    }

    public int getFactorToProductivityGradeOfCrop() {
        return factorToProductivityGradeOfCrop;
    }

    public void setFactorToProductivityGradeOfCrop(int factorToProductivityGradeOfCrop) {
        this.factorToProductivityGradeOfCrop = factorToProductivityGradeOfCrop;
    }

    public GradeOfCrop getGradeOfCrop() {
        return gradeOfCrop;
    }

    public void setGradeOfCrop(GradeOfCrop gradeOfCrop) {
        this.gradeOfCrop = gradeOfCrop;
    }

    public int getGradeOfCropAndRecommendationsId() {
        return gradeOfCropAndRecommendationsId;
    }

    public void setGradeOfCropAndRecommendationsId(int gradeOfCropAndRecommendationsId) {
        this.gradeOfCropAndRecommendationsId = gradeOfCropAndRecommendationsId;
    }

    public String getRecommendationsOnLevelsOfIntensificationForGradeOfCrop() {
        return recommendationsOnLevelsOfIntensificationForGradeOfCrop;
    }

    public void setRecommendationsOnLevelsOfIntensificationForGradeOfCrop(String recommendationsOnLevelsOfIntensificationForGradeOfCrop) {
        this.recommendationsOnLevelsOfIntensificationForGradeOfCrop = recommendationsOnLevelsOfIntensificationForGradeOfCrop;
    }

    public String getRecommendationsOnTypesOfSoilsForGradeOfCrop() {
        return recommendationsOnTypesOfSoilsForGradeOfCrop;
    }

    public void setRecommendationsOnTypesOfSoilsForGradeOfCrop(String recommendationsOnTypesOfSoilsForGradeOfCrop) {
        this.recommendationsOnTypesOfSoilsForGradeOfCrop = recommendationsOnTypesOfSoilsForGradeOfCrop;
    }
}

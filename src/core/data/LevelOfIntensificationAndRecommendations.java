package core.data;

public class LevelOfIntensificationAndRecommendations {

    private int levelOfIntensificationAndRecommendationsId;
    private LevelOfIntensification levelOfIntensification;
    private String restrictionsOnTypeOfSoilForLevelOfIntensification;

    public LevelOfIntensificationAndRecommendations() {
    }

    public LevelOfIntensification getLevelOfIntensification() {
        return levelOfIntensification;
    }

    public void setLevelOfIntensification(LevelOfIntensification levelOfIntensification) {
        this.levelOfIntensification = levelOfIntensification;
    }

    public int getLevelOfIntensificationAndRecommendationsId() {
        return levelOfIntensificationAndRecommendationsId;
    }

    public void setLevelOfIntensificationAndRecommendationsId(int levelOfIntensificationAndRecommendationsId) {
        this.levelOfIntensificationAndRecommendationsId = levelOfIntensificationAndRecommendationsId;
    }


    public String getRestrictionsOnTypeOfSoilForLevelOfIntensification() {
        return restrictionsOnTypeOfSoilForLevelOfIntensification;
    }

    public void setRestrictionsOnTypeOfSoilForLevelOfIntensification(String restrictionsOnTypeOfSoilForLevelOfIntensification) {
        this.restrictionsOnTypeOfSoilForLevelOfIntensification = restrictionsOnTypeOfSoilForLevelOfIntensification;
    }

}

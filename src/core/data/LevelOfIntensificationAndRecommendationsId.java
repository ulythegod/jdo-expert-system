package core.data;

public class LevelOfIntensificationAndRecommendationsId {

    static Class c = LevelOfIntensificationAndRecommendations.class;
    public int levelOfIntensificationAndRecommendationsId;

    public LevelOfIntensificationAndRecommendationsId() {
    }

    public LevelOfIntensificationAndRecommendationsId(String fromString) {
        levelOfIntensificationAndRecommendationsId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(levelOfIntensificationAndRecommendationsId);
    }

    public int hashCode() {
        return levelOfIntensificationAndRecommendationsId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof LevelOfIntensificationAndRecommendationsId))
            return false;
        LevelOfIntensificationAndRecommendationsId other = (LevelOfIntensificationAndRecommendationsId) obj;
        return (levelOfIntensificationAndRecommendationsId == other.levelOfIntensificationAndRecommendationsId);
    }

}

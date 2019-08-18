package core.data;

public class LevelOfIntensificationId {


    public int levelOfIntensificationId;

    public LevelOfIntensificationId() {
    }

    public LevelOfIntensificationId(String fromString) {
        levelOfIntensificationId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(levelOfIntensificationId);
    }

    public int hashCode() {
        return levelOfIntensificationId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof LevelOfIntensificationId))
            return false;
        LevelOfIntensificationId other = (LevelOfIntensificationId) obj;
        return (levelOfIntensificationId == other.levelOfIntensificationId);
    }

}

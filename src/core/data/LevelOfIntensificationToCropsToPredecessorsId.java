package core.data;

/**
 * Author: Skosyreva Maria
 * Date: 05.04.2016
 * Time: 19:21
 */
public class LevelOfIntensificationToCropsToPredecessorsId {
    static Class c = LevelOfIntensificationToCropsToPredecessors.class;
    public int levelOfIntensificationToCropsToPredecessorsId;

    public LevelOfIntensificationToCropsToPredecessorsId() {
    }

    public LevelOfIntensificationToCropsToPredecessorsId(String fromString) {
        levelOfIntensificationToCropsToPredecessorsId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(levelOfIntensificationToCropsToPredecessorsId);
    }

    public int hashCode() {
        return levelOfIntensificationToCropsToPredecessorsId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof LevelOfIntensificationToCropsToPredecessorsId))
            return false;
        LevelOfIntensificationToCropsToPredecessorsId other = (LevelOfIntensificationToCropsToPredecessorsId) obj;
        return (levelOfIntensificationToCropsToPredecessorsId == other.levelOfIntensificationToCropsToPredecessorsId);
    }

}

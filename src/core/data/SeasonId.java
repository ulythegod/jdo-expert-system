package core.data;

public class SeasonId {

    static Class c = SeasonId.class;
    public int seasonId;

    public SeasonId() {
    }

    public SeasonId(String fromString) {
        seasonId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(seasonId);
    }

    public int hashCode() {
        return seasonId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof SeasonId))
            return false;
        SeasonId other = (SeasonId) obj;
        return (seasonId == other.seasonId);
    }

}

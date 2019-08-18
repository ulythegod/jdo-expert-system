package core.data;

/**
 * Author: Skosyreva Maria
 * Date: 24.05.2016
 * Time: 19:36
 */
public class Harvesting_2_AgricultureId {
    static Class c = Harvesting_2_AgricultureId.class;
    public int harvesting_2_AgricultureId;

    public Harvesting_2_AgricultureId() {
    }

    public Harvesting_2_AgricultureId(String fromString) {
        harvesting_2_AgricultureId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(harvesting_2_AgricultureId);
    }

    public int hashCode() {
        return harvesting_2_AgricultureId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof Harvesting_2_AgricultureId))
            return false;
        Harvesting_2_AgricultureId other = (Harvesting_2_AgricultureId) obj;
        return (harvesting_2_AgricultureId == other.harvesting_2_AgricultureId);
    }
}

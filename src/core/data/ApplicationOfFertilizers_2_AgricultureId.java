package core.data;

/**
 * Author: Skosyreva Maria
 * Date: 24.05.2016
 * Time: 19:38
 */
public class ApplicationOfFertilizers_2_AgricultureId {
    static Class c = ApplicationOfFertilizers_2_AgricultureId.class;
    public int applicationOfFertilizers_2_AgricultureId;

    public ApplicationOfFertilizers_2_AgricultureId() {
    }

    public ApplicationOfFertilizers_2_AgricultureId(String fromString) {
        applicationOfFertilizers_2_AgricultureId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(applicationOfFertilizers_2_AgricultureId);
    }

    public int hashCode() {
        return applicationOfFertilizers_2_AgricultureId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof ApplicationOfFertilizers_2_AgricultureId))
            return false;
        ApplicationOfFertilizers_2_AgricultureId other = (ApplicationOfFertilizers_2_AgricultureId) obj;
        return (applicationOfFertilizers_2_AgricultureId == other.applicationOfFertilizers_2_AgricultureId);
    }
}

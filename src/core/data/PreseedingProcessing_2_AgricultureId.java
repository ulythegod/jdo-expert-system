package core.data;

/**
 * Author: Skosyreva Maria
 * Date: 24.05.2016
 * Time: 19:26
 */
public class PreseedingProcessing_2_AgricultureId {
    static Class c = PreseedingProcessing_2_AgricultureId.class;
    public int preseedingProcessing_2_AgricultureId;

    public PreseedingProcessing_2_AgricultureId() {
    }

    public PreseedingProcessing_2_AgricultureId(String fromString) {
        preseedingProcessing_2_AgricultureId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(preseedingProcessing_2_AgricultureId);
    }

    public int hashCode() {
        return preseedingProcessing_2_AgricultureId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof PreseedingProcessing_2_AgricultureId))
            return false;
        PreseedingProcessing_2_AgricultureId other = (PreseedingProcessing_2_AgricultureId) obj;
        return (preseedingProcessing_2_AgricultureId == other.preseedingProcessing_2_AgricultureId);
    }
}

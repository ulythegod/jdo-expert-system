package core.data;

/**
 * Author: Skosyreva Maria
 * Date: 24.05.2016
 * Time: 19:23
 */
public class MainProcessing_2_AgricultureId {
    static Class c = MainProcessing_2_AgricultureId.class;
    public int mainProcessing_2_AgricultureId;

    public MainProcessing_2_AgricultureId() {
    }

    public MainProcessing_2_AgricultureId(String fromString) {
       mainProcessing_2_AgricultureId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(mainProcessing_2_AgricultureId);
    }

    public int hashCode() {
        return mainProcessing_2_AgricultureId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof MainProcessing_2_AgricultureId))
            return false;
        MainProcessing_2_AgricultureId other = (MainProcessing_2_AgricultureId) obj;
        return (mainProcessing_2_AgricultureId == other.mainProcessing_2_AgricultureId);
    }
}

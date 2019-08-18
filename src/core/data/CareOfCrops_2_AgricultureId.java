package core.data;

/**
 * Author: Skosyreva Maria
 * Date: 24.05.2016
 * Time: 19:28
 */
public class CareOfCrops_2_AgricultureId {
    static Class c = CareOfCrops_2_AgricultureId.class;
    public int careOfCrops_2_AgricultureId;

    public CareOfCrops_2_AgricultureId() {
    }

    public CareOfCrops_2_AgricultureId(String fromString) {
        careOfCrops_2_AgricultureId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(careOfCrops_2_AgricultureId);
    }

    public int hashCode() {
        return careOfCrops_2_AgricultureId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof CareOfCrops_2_AgricultureId))
            return false;
        CareOfCrops_2_AgricultureId other = (CareOfCrops_2_AgricultureId) obj;
        return (careOfCrops_2_AgricultureId == other.careOfCrops_2_AgricultureId);
    }
}

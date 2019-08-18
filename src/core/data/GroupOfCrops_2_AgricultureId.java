package core.data;

/**
 * Author: Skosyreva Maria
 * Date: 24.05.2016
 * Time: 19:13
 */
public class GroupOfCrops_2_AgricultureId {
    static Class c = GroupOfCrops_2_AgricultureId.class;
    public int groupOfCrops_2_AgricultureId;

    public GroupOfCrops_2_AgricultureId() {
    }

    public GroupOfCrops_2_AgricultureId(String fromString) {
        groupOfCrops_2_AgricultureId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(groupOfCrops_2_AgricultureId);
    }

    public int hashCode() {
        return groupOfCrops_2_AgricultureId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof GroupOfCrops_2_AgricultureId))
            return false;
        GroupOfCrops_2_AgricultureId other = (GroupOfCrops_2_AgricultureId) obj;
        return (groupOfCrops_2_AgricultureId == other.groupOfCrops_2_AgricultureId);
    }
}

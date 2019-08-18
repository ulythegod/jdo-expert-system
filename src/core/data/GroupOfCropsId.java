package core.data;

public class GroupOfCropsId {

    static Class c = GroupOfCrops.class;
    public int groupOfCropsId;

    public GroupOfCropsId() {
    }

    public GroupOfCropsId(String fromString) {
        groupOfCropsId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(groupOfCropsId);
    }

    public int hashCode() {
        return groupOfCropsId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof GroupOfCropsId))
            return false;
        GroupOfCropsId other = (GroupOfCropsId) obj;
        return (groupOfCropsId == other.groupOfCropsId);
    }

}

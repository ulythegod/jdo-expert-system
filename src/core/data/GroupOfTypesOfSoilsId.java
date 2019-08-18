package core.data;

public class GroupOfTypesOfSoilsId {


    public int groupOfTypesOfSoilsId;

    public GroupOfTypesOfSoilsId() {
    }

    public GroupOfTypesOfSoilsId(String fromString) {
        groupOfTypesOfSoilsId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(groupOfTypesOfSoilsId);
    }

    public int hashCode() {
        return groupOfTypesOfSoilsId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof GroupOfTypesOfSoilsId))
            return false;
        GroupOfTypesOfSoilsId other = (GroupOfTypesOfSoilsId) obj;
        return (groupOfTypesOfSoilsId == other.groupOfTypesOfSoilsId);
    }

}

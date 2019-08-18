package core.data;

public class GroupMicroelementsId {

    static Class c = GroupMicroelements.class;
    public int idGroup;

    public GroupMicroelementsId() {
    }

    public GroupMicroelementsId(String fromString) {
        idGroup = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(idGroup);
    }

    public int hashCode() {
        return idGroup;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof GroupMicroelementsId))
            return false;
        GroupMicroelementsId other = (GroupMicroelementsId) obj;
        return (idGroup == other.idGroup);
    }

}

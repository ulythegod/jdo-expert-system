package core.data;

public class UserDataToBaseDataId {

    static Class c = UserDataToBaseData.class;
    public int id;

    public UserDataToBaseDataId() {
    }

    public UserDataToBaseDataId(String fromString) {
        id = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(id);
    }

    public int hashCode() {
        return id;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof UserDataToBaseDataId))
            return false;
        UserDataToBaseDataId other = (UserDataToBaseDataId) obj;
        return (id == other.id);
    }

}

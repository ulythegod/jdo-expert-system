package core.data;

public class UserId {

    static Class c = User.class;
    public int userId;

    public UserId() {
    }

    public UserId(String fromString) {
        userId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(userId);
    }

    public int hashCode() {
        return userId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof UserId))
            return false;
        UserId other = (UserId) obj;
        return (userId == other.userId);
    }

}

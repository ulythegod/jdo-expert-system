package core.data;

public class AgriculturesId {

    static Class c = Agricultures.class;
    public int agricultureId;

    public AgriculturesId() {
    }

    public AgriculturesId(String fromString) {
        agricultureId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(agricultureId);
    }

    public int hashCode() {
        return agricultureId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof AgriculturesId))
            return false;
        AgriculturesId other = (AgriculturesId) obj;
        return (agricultureId == other.agricultureId);
    }

}

package core.data;

public class AgricultureFieldId {

    static Class c = AgricultureField.class;
    public int agricultureFieldId;

    public AgricultureFieldId() {
    }

    public AgricultureFieldId(String fromString) {
        agricultureFieldId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(agricultureFieldId);
    }

    public int hashCode() {
        return agricultureFieldId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof AgricultureFieldId))
            return false;
        AgricultureFieldId other = (AgricultureFieldId) obj;
        return (agricultureFieldId == other.agricultureFieldId);
    }

}

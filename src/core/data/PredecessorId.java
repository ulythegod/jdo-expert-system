package core.data;

public class PredecessorId {

    static Class c = Predecessor.class;
    public int predecessorId;

    public PredecessorId() {
    }

    public PredecessorId(String fromString) {
        predecessorId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(predecessorId);
    }

    public int hashCode() {
        return predecessorId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof PredecessorId))
            return false;
        PredecessorId other = (PredecessorId) obj;
        return (predecessorId == other.predecessorId);
    }

}

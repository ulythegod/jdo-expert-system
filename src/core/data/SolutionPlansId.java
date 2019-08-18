package core.data;

public class SolutionPlansId {
    static Class c = SolutionPlans.class;
    public int id;

    public SolutionPlansId() {
    }

    public SolutionPlansId(String fromString) {
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

        if (!(obj instanceof SolutionPlansId))
            return false;
        SolutionPlansId other = (SolutionPlansId) obj;
        return (id == other.id);
    }
}

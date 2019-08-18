package core.data;

public class ApplicationOfFertilizersId {

    static Class c = ApplicationOfFertilizers.class;
    public int applicationOfFertilizersId;

    public ApplicationOfFertilizersId() {
    }

    public ApplicationOfFertilizersId(String fromString) {
        applicationOfFertilizersId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(applicationOfFertilizersId);
    }

    public int hashCode() {
        return applicationOfFertilizersId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof ApplicationOfFertilizersId))
            return false;
        ApplicationOfFertilizersId other = (ApplicationOfFertilizersId) obj;
        return (applicationOfFertilizersId == other.applicationOfFertilizersId);
    }

}


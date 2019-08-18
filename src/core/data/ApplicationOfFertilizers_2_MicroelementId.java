package core.data;

public class ApplicationOfFertilizers_2_MicroelementId {

    public int applicationOfFertilizers_2_MicroelementId;

    public ApplicationOfFertilizers_2_MicroelementId(){};

    public ApplicationOfFertilizers_2_MicroelementId(String from){
        applicationOfFertilizers_2_MicroelementId = Integer.parseInt(from);
    }

    public String toString() {
        return String.valueOf(applicationOfFertilizers_2_MicroelementId);
    }

    public int hashCode() {
        return applicationOfFertilizers_2_MicroelementId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof ApplicationOfFertilizers_2_MicroelementId))
            return false;
        ApplicationOfFertilizers_2_MicroelementId other = (ApplicationOfFertilizers_2_MicroelementId) obj;
        return (applicationOfFertilizers_2_MicroelementId == other.applicationOfFertilizers_2_MicroelementId);
    }
}

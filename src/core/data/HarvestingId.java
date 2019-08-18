package core.data;

public class HarvestingId {

    static Class c = Harvesting.class;
    public int harvestingId;

    public HarvestingId() {
    }

    public HarvestingId(String fromString) {
        harvestingId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(harvestingId);
    }

    public int hashCode() {
        return harvestingId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof HarvestingId))
            return false;
        HarvestingId other = (HarvestingId) obj;
        return (harvestingId == other.harvestingId);
    }

}

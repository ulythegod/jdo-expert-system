package core.data;

public class CostOfHarvestingId {

    static Class c = CostOfHarvesting.class;
    public int costOfHarvestingId;

    public CostOfHarvestingId() {
    }

    public CostOfHarvestingId(String fromString) {
        costOfHarvestingId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(costOfHarvestingId);
    }

    public int hashCode() {
        return costOfHarvestingId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof CostOfHarvestingId))
            return false;
        CostOfHarvestingId other = (CostOfHarvestingId) obj;
        return (costOfHarvestingId == other.costOfHarvestingId);
    }

}

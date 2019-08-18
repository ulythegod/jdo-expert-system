package core.data;

public class CostOfSeedId {

    static Class c = CostOfSeed.class;
    public int costOfSeedId;

    public CostOfSeedId() {
    }

    public CostOfSeedId(String fromString) {
        costOfSeedId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(costOfSeedId);
    }

    public int hashCode() {
        return costOfSeedId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof CostOfSeedId))
            return false;
        CostOfSeedId other = (CostOfSeedId) obj;
        return (costOfSeedId == other.costOfSeedId);
    }

}

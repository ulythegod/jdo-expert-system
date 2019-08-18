package core.data;

public class CostOfApplicationOfFertilizersId {

    static Class c = CostOfApplicationOfFertilizers.class;
    public int costOfApplicationOfFertilizersId;

    public CostOfApplicationOfFertilizersId() {
    }

    public CostOfApplicationOfFertilizersId(String fromString) {
        costOfApplicationOfFertilizersId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(costOfApplicationOfFertilizersId);
    }

    public int hashCode() {
        return costOfApplicationOfFertilizersId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof CostOfApplicationOfFertilizersId))
            return false;
        CostOfApplicationOfFertilizersId other = (CostOfApplicationOfFertilizersId) obj;
        return (costOfApplicationOfFertilizersId == other.costOfApplicationOfFertilizersId);
    }

}

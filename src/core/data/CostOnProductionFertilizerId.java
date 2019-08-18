package core.data;

public class CostOnProductionFertilizerId {

    static Class c = CostOnProductionFertilizer.class;
    public int costOnProductionFertilizerId;

    public CostOnProductionFertilizerId() {
    }

    public CostOnProductionFertilizerId(String fromString) {
        costOnProductionFertilizerId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(costOnProductionFertilizerId);
    }

    public int hashCode() {
        return costOnProductionFertilizerId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof CostOnProductionFertilizerId))
            return false;
        CostOnProductionFertilizerId other = (CostOnProductionFertilizerId) obj;
        return (costOnProductionFertilizerId == other.costOnProductionFertilizerId);
    }

}

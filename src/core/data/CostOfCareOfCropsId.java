package core.data;

public class CostOfCareOfCropsId {

    static Class c = CostOfCareOfCrops.class;
    public int costOfCareOfCropsId;

    public CostOfCareOfCropsId() {
    }

    public CostOfCareOfCropsId(String fromString) {
        costOfCareOfCropsId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(costOfCareOfCropsId);
    }

    public int hashCode() {
        return costOfCareOfCropsId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof CostOfCareOfCropsId))
            return false;
        CostOfCareOfCropsId other = (CostOfCareOfCropsId) obj;
        return (costOfCareOfCropsId == other.costOfCareOfCropsId);
    }

}

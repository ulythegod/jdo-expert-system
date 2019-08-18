package core.data;

public class CostOfPreseedingProcessingAndSowingId {

    static Class c = CostOfPreseedingProcessingAndSowing.class;
    public int costOfPreseedingProcessingAndSowingId;

    public CostOfPreseedingProcessingAndSowingId() {
    }

    public CostOfPreseedingProcessingAndSowingId(String fromString) {
        costOfPreseedingProcessingAndSowingId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(costOfPreseedingProcessingAndSowingId);
    }

    public int hashCode() {
        return costOfPreseedingProcessingAndSowingId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof CostOfPreseedingProcessingAndSowingId))
            return false;
        CostOfPreseedingProcessingAndSowingId other = (CostOfPreseedingProcessingAndSowingId) obj;
        return (costOfPreseedingProcessingAndSowingId == other.costOfPreseedingProcessingAndSowingId);
    }

}

package core.data;

public class CostOfMainProcessingId {

    static Class c = CostOfMainProcessing.class;
    public int costOfMainProcessingId;

    public CostOfMainProcessingId() {
    }

    public CostOfMainProcessingId(String fromString) {
        costOfMainProcessingId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(costOfMainProcessingId);
    }

    public int hashCode() {
        return costOfMainProcessingId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof CostOfMainProcessingId))
            return false;
        CostOfMainProcessingId other = (CostOfMainProcessingId) obj;
        return (costOfMainProcessingId == other.costOfMainProcessingId);
    }

}

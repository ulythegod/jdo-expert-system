package core.data;

public class PreseedingProcessingAndSowingId {

    static Class c = PreseedingProcessingAndSowing.class;
    public int preseedingProcessingAndSowingId;

    public PreseedingProcessingAndSowingId() {
    }

    public PreseedingProcessingAndSowingId(String fromString) {
        preseedingProcessingAndSowingId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(preseedingProcessingAndSowingId);
    }

    public int hashCode() {
        return preseedingProcessingAndSowingId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof PreseedingProcessingAndSowingId))
            return false;
        PreseedingProcessingAndSowingId other = (PreseedingProcessingAndSowingId) obj;
        return (preseedingProcessingAndSowingId == other.preseedingProcessingAndSowingId);
    }

}

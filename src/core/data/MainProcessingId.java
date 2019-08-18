package core.data;

public class MainProcessingId {

    static Class c = MainProcessing.class;
    public int mainProcessingId;

    public MainProcessingId() {
    }

    public MainProcessingId(String fromString) {
        mainProcessingId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(mainProcessingId);
    }

    public int hashCode() {
        return mainProcessingId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof MainProcessingId))
            return false;
        MainProcessingId other = (MainProcessingId) obj;
        return (mainProcessingId == other.mainProcessingId);
    }

}

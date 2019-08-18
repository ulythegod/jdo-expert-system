package core.data;

public class MicroelementId {

    public int microelementId;

    public MicroelementId(){}

    public MicroelementId(String from){

        microelementId = Integer.parseInt(from);
    }

    public String toString() {
        return String.valueOf(microelementId);
    }

    public int hashCode() {
        return microelementId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof MicroelementId))
            return false;
        MicroelementId other = (MicroelementId) obj;
        return (microelementId == other.microelementId);
    }
}

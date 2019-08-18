package core.data;

public class RemovalOfMicroelementId {

    public int removalOfMicroelementId;

    public RemovalOfMicroelementId(){};

    public RemovalOfMicroelementId(String from){

        removalOfMicroelementId= Integer.parseInt(from);
    }

    public String toString() {
        return String.valueOf(removalOfMicroelementId);
    }

    public int hashCode() {
        return removalOfMicroelementId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof RemovalOfMicroelementId))
            return false;
        RemovalOfMicroelementId other = (RemovalOfMicroelementId) obj;
        return (removalOfMicroelementId == other.removalOfMicroelementId);
    }
}

package core.data;

public class MetaDataId {

    public int idMetaData;

    public MetaDataId(){}

    public MetaDataId(String from){

        idMetaData = Integer.parseInt(from);
    }

    public String toString() {
        return String.valueOf(idMetaData);
    }

    public int hashCode() {
        return idMetaData;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof MetaDataId))
            return false;
        MetaDataId other = (MetaDataId) obj;
        return (idMetaData == other.idMetaData);
    }
}

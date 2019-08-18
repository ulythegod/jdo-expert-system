package core.data;

/**
 * Author: Skosyreva Maria
 * Date: 19.11.2017
 * Time: 8:26
 */
public class LandBaseId {
    static Class c = LandBase.class;
    public int landBaseId;

    public LandBaseId() {
    }

    public LandBaseId(String fromString) {
        this.landBaseId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(this.landBaseId);
    }

    public int hashCode() {
        return this.landBaseId;
    }

    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        } else if(!(obj instanceof LandBaseId)) {
            return false;
        } else {
            LandBaseId other = (LandBaseId)obj;
            return this.landBaseId == other.landBaseId;
        }
    }
}

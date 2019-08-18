package core.data;

/**
 * Author: Skosyreva Maria
 * Date: 19.11.2017
 * Time: 8:26
 */
public class LandBase_2_AgricultureFieldId {
    static Class c = LandBase_2_AgricultureField.class;
    public int landBase_2_AgricultureFieldId;

    public LandBase_2_AgricultureFieldId() {
    }

    public LandBase_2_AgricultureFieldId(String fromString) {
        this.landBase_2_AgricultureFieldId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(this.landBase_2_AgricultureFieldId);
    }

    public int hashCode() {
        return this.landBase_2_AgricultureFieldId;
    }

    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        } else if(!(obj instanceof LandBase_2_AgricultureFieldId)) {
            return false;
        } else {
            LandBase_2_AgricultureFieldId other = (LandBase_2_AgricultureFieldId)obj;
            return this.landBase_2_AgricultureFieldId == other.landBase_2_AgricultureFieldId;
        }
    }
}

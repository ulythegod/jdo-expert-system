package core.data;

/**
 * Author: Skosyreva Maria
 * Date: 24.05.2016
 * Time: 19:16
 */
public class Crop_2_AgricultureId {
    static Class c = Crop_2_AgricultureId.class;
    public int crop_2_AgricultureId;

    public Crop_2_AgricultureId() {
    }

    public Crop_2_AgricultureId(String fromString) {
        crop_2_AgricultureId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(crop_2_AgricultureId);
    }

    public int hashCode() {
        return crop_2_AgricultureId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof Crop_2_AgricultureId))
            return false;
        Crop_2_AgricultureId other = (Crop_2_AgricultureId) obj;
        return (crop_2_AgricultureId == other.crop_2_AgricultureId);
    }
}

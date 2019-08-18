package core.data;

/**
 * Created by user on 16.11.2017.
 */
public class Crop_2_AgricultureField_2_YearId {
    static Class c = Crop_2_AgricultureField_2_YearId.class;
    public int crop_2_AgricultureField_2_YearId;

    public Crop_2_AgricultureField_2_YearId() {
    }

    public Crop_2_AgricultureField_2_YearId(String fromString) {
        crop_2_AgricultureField_2_YearId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(crop_2_AgricultureField_2_YearId);
    }

    public int hashCode() {
        return crop_2_AgricultureField_2_YearId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof Crop_2_AgricultureField_2_YearId))
            return false;
        Crop_2_AgricultureField_2_YearId other = (Crop_2_AgricultureField_2_YearId) obj;
        return (crop_2_AgricultureField_2_YearId == other.crop_2_AgricultureField_2_YearId);
    }
}

package core.data;

public class Harvesting_2_LevelOfIntensification_2_Crop_2_FactorId {

    static Class c = Harvesting_2_LevelOfIntensification_2_Crop_2_Factor.class;
    public int harvesting_2_LevelOfIntensification_2_Crop_2_FactorId;

    public Harvesting_2_LevelOfIntensification_2_Crop_2_FactorId() {
    }

    public Harvesting_2_LevelOfIntensification_2_Crop_2_FactorId(String fromString) {
        harvesting_2_LevelOfIntensification_2_Crop_2_FactorId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(harvesting_2_LevelOfIntensification_2_Crop_2_FactorId);
    }

    public int hashCode() {
        return harvesting_2_LevelOfIntensification_2_Crop_2_FactorId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof Harvesting_2_LevelOfIntensification_2_Crop_2_FactorId))
            return false;
        Harvesting_2_LevelOfIntensification_2_Crop_2_FactorId other = (Harvesting_2_LevelOfIntensification_2_Crop_2_FactorId) obj;
        return (harvesting_2_LevelOfIntensification_2_Crop_2_FactorId == other.harvesting_2_LevelOfIntensification_2_Crop_2_FactorId);
    }

}

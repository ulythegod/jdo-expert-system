package core.data;

public class CropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoilId {

    static Class c = CropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoil.class;
    public int cropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoilId;

    public CropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoilId() {
    }

    public CropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoilId(String fromString) {
        cropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoilId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(cropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoilId);
    }

    public int hashCode() {
        return cropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoilId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof CropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoilId))
            return false;
        CropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoilId other = (CropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoilId) obj;
        return (cropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoilId == other.cropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoilId);
    }

}

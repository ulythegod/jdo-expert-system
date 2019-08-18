package core.data;

public class ApplicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_CropId {

    static Class c = ApplicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_Crop.class;
    public int applicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_CropId;

    public ApplicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_CropId() {
    }

    public ApplicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_CropId(String fromString) {
        applicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_CropId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(applicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_CropId);
    }

    public int hashCode() {
        return applicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_CropId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof ApplicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_CropId))
            return false;
        ApplicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_CropId other = (ApplicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_CropId) obj;
        return (applicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_CropId == other.applicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_CropId);
    }


}

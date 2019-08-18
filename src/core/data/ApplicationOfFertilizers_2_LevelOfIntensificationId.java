package core.data;

public class ApplicationOfFertilizers_2_LevelOfIntensificationId {

    static Class c = ApplicationOfFertilizers_2_LevelOfIntensification.class;
    public int applicationOfFertilizers_2_LevelOfIntensificationId;

    public ApplicationOfFertilizers_2_LevelOfIntensificationId() {
    }

    public ApplicationOfFertilizers_2_LevelOfIntensificationId(String fromString) {
        applicationOfFertilizers_2_LevelOfIntensificationId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(applicationOfFertilizers_2_LevelOfIntensificationId);
    }

    public int hashCode() {
        return applicationOfFertilizers_2_LevelOfIntensificationId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicationOfFertilizers_2_LevelOfIntensificationId))
            return false;
        ApplicationOfFertilizers_2_LevelOfIntensificationId other = (ApplicationOfFertilizers_2_LevelOfIntensificationId) obj;
        return (applicationOfFertilizers_2_LevelOfIntensificationId == other.applicationOfFertilizers_2_LevelOfIntensificationId);
    }


}

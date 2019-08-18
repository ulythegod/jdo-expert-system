package core.data;

/**
 * Author: <Irina><Mikheyeva>
 * Date: 20.05.2016
 * Time: 18:32
 */
public class CropRotationToGroupOfCropsToYearId {
    static Class c = CropRotationToGroupOfCropsToYear.class;
    public int cropRotationToGroupOfCropsToYearId;

    public CropRotationToGroupOfCropsToYearId() {
    }

    public CropRotationToGroupOfCropsToYearId(String fromString) {
        cropRotationToGroupOfCropsToYearId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(cropRotationToGroupOfCropsToYearId);
    }

    public int hashCode() {
        return cropRotationToGroupOfCropsToYearId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof CropRotationToGroupOfCropsToYearId))
            return false;
        CropRotationToGroupOfCropsToYearId other = (CropRotationToGroupOfCropsToYearId) obj;
        return (cropRotationToGroupOfCropsToYearId == other.cropRotationToGroupOfCropsToYearId);
    }
}

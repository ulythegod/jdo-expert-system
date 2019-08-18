package core.data;

/**
 * Author: <Irina><Mikheyeva>
 * Date: 20.05.2016
 * Time: 21:24
 */
public class CropRotationToGradeOfCropsToYearId {
    static Class c = CropRotationToGradeOfCropsToYearId.class;
    public int cropRotationToGradeOfCropsToYearId;

    public CropRotationToGradeOfCropsToYearId() {
    }

    public CropRotationToGradeOfCropsToYearId(String fromString) {
        cropRotationToGradeOfCropsToYearId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(cropRotationToGradeOfCropsToYearId);
    }

    public int hashCode() {
        return cropRotationToGradeOfCropsToYearId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof CropRotationToGradeOfCropsToYearId))
            return false;
        CropRotationToGradeOfCropsToYearId other = (CropRotationToGradeOfCropsToYearId) obj;
        return (cropRotationToGradeOfCropsToYearId == other.cropRotationToGradeOfCropsToYearId);
    }
}

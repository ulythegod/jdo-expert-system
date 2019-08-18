package core.data;


/**
 * Author: <Irina><Mikheyeva>
 * Date: 20.05.2016
 * Time: 21:21
 */
public class CropRotationToGradeOfCropsToYear {

    private int cropRotationToGradeOfCropsToYearId;
    private CropRotationOfAgriculture cropRotation;
    private GradeOfCrop gradeOfCrop;
    private int number;

    public CropRotationToGradeOfCropsToYear() {
    }

    public int getCropRotationToGradeOfCropsToYearId() {
        return cropRotationToGradeOfCropsToYearId;
    }

    public void setCropRotationToGradeOfCropsToYearId(int cropRotationToGradeOfCropsToYearId) {
        this.cropRotationToGradeOfCropsToYearId = cropRotationToGradeOfCropsToYearId;
    }

    public CropRotationOfAgriculture getCropRotation() {
        return cropRotation;
    }

    public void setCropRotation(CropRotationOfAgriculture cropRotation) {
        this.cropRotation = cropRotation;
    }

    public GradeOfCrop getGradeOfCrop() {
        return gradeOfCrop;
    }

    public void setGradeOfCrop(GradeOfCrop gradeOfCrop) {
        this.gradeOfCrop = gradeOfCrop;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

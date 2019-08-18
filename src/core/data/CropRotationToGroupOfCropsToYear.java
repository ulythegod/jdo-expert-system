package core.data;

/**
 * Author: <Irina><Mikheyeva>
 * Date: 20.05.2016
 * Time: 18:31
 */
public class CropRotationToGroupOfCropsToYear {
    private int cropRotationToGroupOfCropsToYearId;
    private CropRotation cropRotation;
    private GroupOfCrops groupOfCrops;
    private int number;

    public CropRotationToGroupOfCropsToYear() {
    }

    public int getCropRotationToGroupOfCropsToYearId() {
        return cropRotationToGroupOfCropsToYearId;
    }

    public void setCropRotationToGroupOfCropsToYearId(int cropRotationToGroupOfCropToYearId) {
        this.cropRotationToGroupOfCropsToYearId = cropRotationToGroupOfCropToYearId;
    }

    public CropRotation getCropRotation() {
        return cropRotation;
    }

    public void setCropRotation(CropRotation cropRotation) {
        this.cropRotation = cropRotation;
    }

    public GroupOfCrops getGroupOfCrops() {
        return groupOfCrops;
    }

    public void setGroupOfCrops(GroupOfCrops groupOfCrops) {
        this.groupOfCrops = groupOfCrops;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

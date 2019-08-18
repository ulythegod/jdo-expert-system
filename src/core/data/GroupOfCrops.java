package core.data;

import java.util.Collection;
import java.util.HashSet;

public class GroupOfCrops {

    private int groupOfCropsId;
    private String nameGroupOfCrops;
    private int codeGroupOfCrops;
    private boolean isKB;
    private boolean isUD;
    private Collection crop = new HashSet();
    private Collection cropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoil = new HashSet();
    private Collection cropRotationToGroupOfCropsToYear= new HashSet();

    public GroupOfCrops() {
    }

    public Collection getCropRotationToGroupOfCropsToYear() {
        return cropRotationToGroupOfCropsToYear;
    }

    public void setCropRotationToGroupOfCropsToYear(Collection cropRotationToGroupOfCropsToYear) {
        this.cropRotationToGroupOfCropsToYear = cropRotationToGroupOfCropsToYear;
    }

    public int getGroupOfCropsId() {
        return groupOfCropsId;
    }

    public void setGroupOfCropsId(int groupOfCropsId) {
        this.groupOfCropsId = groupOfCropsId;
    }

    public String getNameGroupOfCrops() {
        return nameGroupOfCrops;
    }

    public void setNameGroupOfCrops(String nameGroupOfCrops) {
        this.nameGroupOfCrops = nameGroupOfCrops;
    }

    public int getCodeGroupOfCrops() {
        return codeGroupOfCrops;
    }

    public void setCodeGroupOfCrops(int codeGroupOfCrops) {
        this.codeGroupOfCrops = codeGroupOfCrops;
    }

    public boolean isKB() {
        return isKB;
    }

    public void setIsKB(boolean isKB) {
        this.isKB = isKB;
    }

    public boolean isUD() {
        return isUD;
    }

    public void setIsUD(boolean isUD) {
        this.isUD = isUD;
    }

    public Collection getCrop() {
        return crop;
    }

    public void setCrop(Collection crop) {
        this.crop = crop;
    }

    public Collection getCropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoil() {
        return cropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoil;
    }

    public void setCropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoil(Collection cropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoil) {
        this.cropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoil = cropRotation_2_GroupOfCrops_2_LevelOfIntensification_2_TypeOfSoil;
    }

}

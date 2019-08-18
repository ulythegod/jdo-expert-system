package core.data;

/**
 * Created with IntelliJ IDEA.
 * User: Влада
 * Date: 21.05.13
 * Time: 21:06
 * To change this template use File | Settings | File Templates.
 */
public class GradeOfCrop_2_LevelOfIntensification_2_TypeOfSoil {

    private int gradeOfCrop_2_LevelOfIntensification_2_TypeOfSoilId;
    private GradeOfCrop gradeOfCrop;
    private LevelOfIntensification levelOfIntensification;
    private TypeOfSoil typeOfSoil;

    private GradeOfCrop_2_LevelOfIntensification_2_TypeOfSoil() {
    }

    public int getGradeOfCrop_2_LevelOfIntensification_2_TypeOfSoilId() {
        return gradeOfCrop_2_LevelOfIntensification_2_TypeOfSoilId;
    }

    public void setGradeOfCrop_2_LevelOfIntensification_2_TypeOfSoilId(int gradeOfCrop_2_LevelOfIntensification_2_TypeOfSoilId) {
        this.gradeOfCrop_2_LevelOfIntensification_2_TypeOfSoilId = gradeOfCrop_2_LevelOfIntensification_2_TypeOfSoilId;
    }

    public GradeOfCrop getGradeOfCrop() {
        return gradeOfCrop;
    }

    public void setGradeOfCrop(GradeOfCrop gradeOfCrop) {
        this.gradeOfCrop = gradeOfCrop;
    }

    public LevelOfIntensification getLevelOfIntensification() {
        return levelOfIntensification;
    }

    public void setLevelOfIntensification(LevelOfIntensification levelOfIntensification) {
        this.levelOfIntensification = levelOfIntensification;
    }

    public TypeOfSoil getTypeOfSoil() {
        return typeOfSoil;
    }

    public void setTypeOfSoil(TypeOfSoil typeOfSoil) {
        this.typeOfSoil = typeOfSoil;
    }
}

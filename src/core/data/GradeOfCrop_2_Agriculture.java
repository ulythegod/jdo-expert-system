package core.data;

/**
 * Author: Skosyreva Maria
 * Date: 24.05.2016
 * Time: 19:17
 */
public class GradeOfCrop_2_Agriculture {
    private int gradeOfCrop_2_AgricultureId;
    private GradeOfCrop gradeOfCrop;
    private Agricultures agriculture;

    public GradeOfCrop_2_Agriculture() {
    }

    public int getGradeOfCrop_2_AgricultureId() {
        return gradeOfCrop_2_AgricultureId;
    }

    public void setGradeOfCrop_2_AgricultureId(int gradeOfCrop_2_AgricultureId) {
        this.gradeOfCrop_2_AgricultureId = gradeOfCrop_2_AgricultureId;
    }

    public GradeOfCrop getGradeOfCrop() {
        return gradeOfCrop;
    }

    public void setGradeOfCrop(GradeOfCrop gradeOfCrop) {
        this.gradeOfCrop = gradeOfCrop;
    }

    public Agricultures getAgriculture() {
        return agriculture;
    }

    public void setAgriculture(Agricultures agriculture) {
        this.agriculture = agriculture;
    }
}

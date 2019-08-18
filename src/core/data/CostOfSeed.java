package core.data;

public class CostOfSeed {

    private int costOfSeedId;
    private GradeOfCrop gradeOfCrop;
    private float costOfSeed;
    private Agricultures agriculture;
    private String date;

    public CostOfSeed() {
    }

    public float getCostOfSeed() {
        return costOfSeed;
    }

    public void setCostOfSeed(float costOfSeed) {
        this.costOfSeed = costOfSeed;
    }

    public int getCostOfSeedId() {
        return costOfSeedId;
    }

    public void setCostOfSeedId(int costOfSeedId) {
        this.costOfSeedId = costOfSeedId;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

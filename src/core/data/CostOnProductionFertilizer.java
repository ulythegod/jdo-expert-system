package core.data;

public class CostOnProductionFertilizer {

    private int costOnProductionFertilizerId;
    private GradeOfCrop gradeOfCrop;
    private float costOfProductionAtIntensiveLevel;
    private float costOfProductionAtNormalLevel;
    private float costOfProductionAtExtensiveLevel;
    private float costOfFertilizerAtIntensiveLevel;
    private float costOfFertilizerAtNormalLevel;
    private Agricultures agriculture;
    private String date;

    public CostOnProductionFertilizer() {
    }

    public float getCostOfFertilizerAtIntensiveLevel() {
        return costOfFertilizerAtIntensiveLevel;
    }

    public void setCostOfFertilizerAtIntensiveLevel(float costOfFertilizerAtIntensiveLevel) {
        this.costOfFertilizerAtIntensiveLevel = costOfFertilizerAtIntensiveLevel;
    }

    public float getCostOfFertilizerAtNormalLevel() {
        return costOfFertilizerAtNormalLevel;
    }

    public void setCostOfFertilizerAtNormalLevel(float costOfFertilizerAtNormalLevel) {
        this.costOfFertilizerAtNormalLevel = costOfFertilizerAtNormalLevel;
    }

    public float getCostOfProductionAtExtensiveLevel() {
        return costOfProductionAtExtensiveLevel;
    }

    public void setCostOfProductionAtExtensiveLevel(float costOfProductionAtExtensiveLevel) {
        this.costOfProductionAtExtensiveLevel = costOfProductionAtExtensiveLevel;
    }

    public float getCostOfProductionAtIntensiveLevel() {
        return costOfProductionAtIntensiveLevel;
    }

    public void setCostOfProductionAtIntensiveLevel(float costOfProductionAtIntensiveLevel) {
        this.costOfProductionAtIntensiveLevel = costOfProductionAtIntensiveLevel;
    }

    public float getCostOfProductionAtNormalLevel() {
        return costOfProductionAtNormalLevel;
    }

    public void setCostOfProductionAtNormalLevel(float costOfProductionAtNormalLevel) {
        this.costOfProductionAtNormalLevel = costOfProductionAtNormalLevel;
    }

    public int getCostOnProductionFertilizerId() {
        return costOnProductionFertilizerId;
    }

    public void setCostOnProductionFertilizerId(int costOnProductionFertilizerId) {
        this.costOnProductionFertilizerId = costOnProductionFertilizerId;
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

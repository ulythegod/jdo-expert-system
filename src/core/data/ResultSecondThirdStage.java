package core.data;

public class ResultSecondThirdStage {
    private int id;
    private OptimalLandSolution optimalLandSolutionAlgorithm1;
    private OptimalLandSolution optimalLandSolutionAlgorithm2;
    private OptimalLandSolution optimalLandSolutionAlgorithm3;
    private TypeOfSoil typeOfSoil;
    private Crop crop;
    private AgricultureField agricultureField;
    private float area;
    private float delta;
    private float productivity;
    private LevelOfIntensification levelOfIntensification;

    public ResultSecondThirdStage() { }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OptimalLandSolution getOptimalLandSolutionAlgorithm1() { return optimalLandSolutionAlgorithm1; }

    public void setOptimalLandSolutionAlgorithm1(OptimalLandSolution optimalLandSolutionAlgorithm1) { this.optimalLandSolutionAlgorithm1 = optimalLandSolutionAlgorithm1; }

    public OptimalLandSolution getOptimalLandSolutionAlgorithm2() { return optimalLandSolutionAlgorithm2; }

    public void setOptimalLandSolutionAlgorithm2(OptimalLandSolution optimalLandSolutionAlgorithm2) { this.optimalLandSolutionAlgorithm2 = optimalLandSolutionAlgorithm2; }

    public OptimalLandSolution getOptimalLandSolutionAlgorithm3() { return optimalLandSolutionAlgorithm3; }

    public void setOptimalLandSolutionAlgorithm3(OptimalLandSolution optimalLandSolutionAlgorithm3) { this.optimalLandSolutionAlgorithm3 = optimalLandSolutionAlgorithm3; }

    public TypeOfSoil getTypeOfSoil() { return typeOfSoil; }

    public void setTypeOfSoil(TypeOfSoil typeOfSoil) { this.typeOfSoil = typeOfSoil; }

    public Crop getCrop() {
        return crop;
    }

    public void setCrop(Crop crop) {
        this.crop = crop;
    }

    public AgricultureField getAgricultureField() {
        return agricultureField;
    }

    public void setAgricultureField(AgricultureField agricultureField) {
        this.agricultureField = agricultureField;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getDelta() {
        return delta;
    }

    public void setDelta(float delta) {
        this.delta = delta;
    }

    public float getProductivity() { return productivity; }

    public void setProductivity(float productivity) { this.productivity = productivity; }

    public LevelOfIntensification getLevelOfIntensification() {
        return levelOfIntensification;
    }

    public void setLevelOfIntensification(LevelOfIntensification levelOfIntensification) { this.levelOfIntensification = levelOfIntensification; }
}

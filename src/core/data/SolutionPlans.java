package core.data;

public class SolutionPlans {
    private int id;
    private OptimalLandSolution solution;
    private Crop crop;
    private float plan;
    private String cond;

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public float getPlan() { return plan; }

    public void setPlan(float plan) { this.plan = plan; }

    public Crop getCrop() {
        return crop;
    }

    public void setCrop(Crop crop) {
        this.crop = crop;
    }

    public OptimalLandSolution getSolution() {
        return solution;
    }

    public void setSolution(OptimalLandSolution solution) {
        this.solution = solution;
    }

    public String getCond() {
        return cond;
    }

    public void setCond(String cond) {
        this.cond = cond;
    }
}

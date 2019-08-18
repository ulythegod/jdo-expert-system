package core.data;

public class ResultFirstStage
{
    private int id;
    private OptimalLandSolution solution;
    private TypeOfSoil typeOfSoil;
    private Crop crop;
    private float ga;
    private float zent;
    private AssociationTypes associationTypes;

    public ResultFirstStage() { }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public OptimalLandSolution getSolution() { return solution; }

    public void setSolution(OptimalLandSolution solution) { this.solution = solution; }

    public float getGa()
    {
        return ga;
    }

    public float getZent()
    {
        return zent;
    }

    public void setGa(float ga)
    {
        this.ga = ga;
    }

    public void setZent(float zent)
    {
        this.zent = zent;
    }

    public TypeOfSoil getTypeOfSoil() {
        return typeOfSoil;
    }

    public void setTypeOfSoil(TypeOfSoil typeOfSoil) {
        this.typeOfSoil = typeOfSoil;
    }

    public Crop getCrop() {
        return crop;
    }

    public void setCrop(Crop crop) {
        this.crop = crop;
    }

    public AssociationTypes getAssociationTypes()
    {
        return associationTypes;
    }

    public void setAssociationTypes(AssociationTypes associationTypes)
    {
        this.associationTypes = associationTypes;
    }

}

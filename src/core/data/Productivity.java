package core.data;

public class Productivity {

    private int productivityId;
    private TypeOfSoil typeOfSoil;
    private Crop crop;
    private LevelOfIntensification levelOfIntensification;
    private float productivity;

    public Productivity() {
    }

    public Crop getCrop() {
        return crop;
    }

    public void setCrop(Crop crop) {
        this.crop = crop;
    }

    public LevelOfIntensification getLevelOfIntensification() {
        return levelOfIntensification;
    }

    public void setLevelOfIntensification(LevelOfIntensification levelOfIntensification) {
        this.levelOfIntensification = levelOfIntensification;
    }

    public float getProductivity() {
        return productivity;
    }

    public void setProductivity(float productivity) {
        this.productivity = productivity;
    }

    public int getProductivityId() {
        return productivityId;
    }

    public void setProductivityId(int productivityId) {
        this.productivityId = productivityId;
    }

    public TypeOfSoil getTypeOfSoil() {
        return typeOfSoil;
    }

    public void setTypeOfSoil(TypeOfSoil typeOfSoil) {
        this.typeOfSoil = typeOfSoil;
    }


}

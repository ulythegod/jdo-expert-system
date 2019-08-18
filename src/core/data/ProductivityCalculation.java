package core.data;

/**
 * Author: Skosyreva Maria
 * Date: 05.04.2016
 * Time: 19:21
 */

public class ProductivityCalculation {

    private int productivityCalculationId;
    private TypeOfSoil typeOfSoil;
    private Crop crop;
    private LevelOfIntensification levelOfIntensification;
    private float productivity;

    public ProductivityCalculation() {
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
        return productivityCalculationId;
    }

    public void setProductivityId(int productivityId) {
        this.productivityCalculationId = productivityId;
    }

    public TypeOfSoil getTypeOfSoil() {
        return typeOfSoil;
    }

    public void setTypeOfSoil(TypeOfSoil typeOfSoil) {
        this.typeOfSoil = typeOfSoil;
    }


}

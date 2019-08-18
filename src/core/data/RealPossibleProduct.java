package core.data;

public class RealPossibleProduct {

    private int idRealPossibleProduct;
    private ResultsFertilizers resultsFertilizers;
    private float value;

    public RealPossibleProduct() {
    }

    public int getIdRealPossibleProduct() {
        return idRealPossibleProduct;
    }

    public void setIdRealPossibleProduct(int idRealPossibleProduct) {
        this.idRealPossibleProduct = idRealPossibleProduct;
    }

    public ResultsFertilizers getResultsFertilizers() {
        return resultsFertilizers;
    }

    public void setResultsFertilizers(ResultsFertilizers resultsFertilizers) {
        this.resultsFertilizers = resultsFertilizers;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}

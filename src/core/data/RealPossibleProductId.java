package core.data;

public class RealPossibleProductId {

    static Class c = RealPossibleProduct.class;
    public int idRealPossibleProduct;

    public RealPossibleProductId() {
    }

    public RealPossibleProductId(String fromString) {
        idRealPossibleProduct = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(idRealPossibleProduct);
    }

    public int hashCode() {
        return idRealPossibleProduct;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof RealPossibleProductId))
            return false;
        RealPossibleProductId other = (RealPossibleProductId) obj;
        return (idRealPossibleProduct == other.idRealPossibleProduct);
    }
}

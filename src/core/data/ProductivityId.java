package core.data;

;

public class ProductivityId {

    static Class c = Productivity.class;
    public int productivityId;

    public ProductivityId() {
    }

    public ProductivityId(String fromString) {
        productivityId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(productivityId);
    }

    public int hashCode() {
        return productivityId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof ProductivityId))
            return false;
        ProductivityId other = (ProductivityId) obj;
        return (productivityId == other.productivityId);
    }

}

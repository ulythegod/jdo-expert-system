package core.data;

/**
 * Author: Skosyreva Maria
 * Date: 05.04.2016
 * Time: 19:21
 */

public class ProductivityCalculationId {

    static Class c = Productivity.class;
    public int productivityCalculationId;

    public ProductivityCalculationId() {
    }

    public ProductivityCalculationId(String fromString) {
        productivityCalculationId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(productivityCalculationId);
    }

    public int hashCode() {
        return productivityCalculationId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof ProductivityCalculationId))
            return false;
        ProductivityCalculationId other = (ProductivityCalculationId) obj;
        return (productivityCalculationId == other.productivityCalculationId);
    }

}

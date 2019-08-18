package core.data;


public class CoefficientOfInflationId {
    static Class c = CoefficientOfInflationId.class;

    public int coefficientOfInflationId;

    public CoefficientOfInflationId() {
    }

    public CoefficientOfInflationId(String fromString) {
        coefficientOfInflationId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(coefficientOfInflationId);
    }

    public int hashCode() {
        return coefficientOfInflationId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoefficientOfInflationId))
            return false;
        CoefficientOfInflationId other = (CoefficientOfInflationId) obj;
        return (coefficientOfInflationId == other.coefficientOfInflationId);
    }

}


package core.data;

public class CoefficientOfUsingMicroelementFromFertId {

    public int coefficientOfUsingMicroelementFromFertId;

    public CoefficientOfUsingMicroelementFromFertId(){};

    public CoefficientOfUsingMicroelementFromFertId(String from){

        coefficientOfUsingMicroelementFromFertId = Integer.parseInt(from);
    }

    public String toString() {
        return String.valueOf(coefficientOfUsingMicroelementFromFertId);
    }

    public int hashCode() {
        return coefficientOfUsingMicroelementFromFertId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof CoefficientOfUsingMicroelementFromFertId))
            return false;
        CoefficientOfUsingMicroelementFromFertId other = (CoefficientOfUsingMicroelementFromFertId) obj;
        return (coefficientOfUsingMicroelementFromFertId == other.coefficientOfUsingMicroelementFromFertId);
    }
}

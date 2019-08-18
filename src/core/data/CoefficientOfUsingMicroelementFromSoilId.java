package core.data;

public class CoefficientOfUsingMicroelementFromSoilId {

    public int coefficientOfUsingMicroelementFromSoilId;

    public CoefficientOfUsingMicroelementFromSoilId(){};

    public CoefficientOfUsingMicroelementFromSoilId(String from){

        coefficientOfUsingMicroelementFromSoilId = Integer.parseInt(from);
    }

    public String toString() {
        return String.valueOf(coefficientOfUsingMicroelementFromSoilId);
    }

    public int hashCode() {
        return coefficientOfUsingMicroelementFromSoilId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof CoefficientOfUsingMicroelementFromSoilId))
            return false;
        CoefficientOfUsingMicroelementFromSoilId other = (CoefficientOfUsingMicroelementFromSoilId) obj;
        return (coefficientOfUsingMicroelementFromSoilId == other.coefficientOfUsingMicroelementFromSoilId);
    }
}

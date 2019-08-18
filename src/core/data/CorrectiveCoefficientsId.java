package core.data;

public class CorrectiveCoefficientsId {

    static Class c = CorrectiveCoefficients.class;
    public int idCorrectiveCoefficients;

    public CorrectiveCoefficientsId() {
    }

    public CorrectiveCoefficientsId(String fromString) {
        idCorrectiveCoefficients = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(idCorrectiveCoefficients);
    }

    public int hashCode() {
        return idCorrectiveCoefficients;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof CorrectiveCoefficientsId))
            return false;
        CorrectiveCoefficientsId other = (CorrectiveCoefficientsId) obj;
        return (idCorrectiveCoefficients == other.idCorrectiveCoefficients);
    }

}

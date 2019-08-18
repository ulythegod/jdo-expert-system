package core.data;

public class HumusMineralizationCoefficientId {

    static Class c = HumusMineralizationCoefficient.class;
    public int idHumusMineralizationCoefficient;

    public HumusMineralizationCoefficientId() {
    }

    public HumusMineralizationCoefficientId(String fromString) {
        idHumusMineralizationCoefficient = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(idHumusMineralizationCoefficient);
    }

    public int hashCode() {
        return idHumusMineralizationCoefficient;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof HumusMineralizationCoefficientId))
            return false;
        HumusMineralizationCoefficientId other = (HumusMineralizationCoefficientId) obj;
        return (idHumusMineralizationCoefficient == other.idHumusMineralizationCoefficient);
    }

}

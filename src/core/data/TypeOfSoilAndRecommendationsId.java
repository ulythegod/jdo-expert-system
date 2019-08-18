package core.data;

public class TypeOfSoilAndRecommendationsId {

    static Class c = TypeOfSoilAndRecommendations.class;
    public int typeOfSoilAndRecommendationsId;

    public TypeOfSoilAndRecommendationsId() {
    }

    public TypeOfSoilAndRecommendationsId(String fromString) {
        typeOfSoilAndRecommendationsId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(typeOfSoilAndRecommendationsId);
    }

    public int hashCode() {
        return typeOfSoilAndRecommendationsId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof TypeOfSoilAndRecommendationsId))
            return false;
        TypeOfSoilAndRecommendationsId other = (TypeOfSoilAndRecommendationsId) obj;
        return (typeOfSoilAndRecommendationsId == other.typeOfSoilAndRecommendationsId);
    }

}

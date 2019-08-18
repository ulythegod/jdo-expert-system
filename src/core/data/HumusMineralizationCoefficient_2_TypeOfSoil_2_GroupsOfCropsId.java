package core.data;

public class HumusMineralizationCoefficient_2_TypeOfSoil_2_GroupsOfCropsId {

    static Class c = HumusMineralizationCoefficient_2_TypeOfSoil_2_GroupsOfCrops.class;
    public int id;

    public HumusMineralizationCoefficient_2_TypeOfSoil_2_GroupsOfCropsId() {
    }

    public HumusMineralizationCoefficient_2_TypeOfSoil_2_GroupsOfCropsId(String fromString) {
        id = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(id);
    }

    public int hashCode() {
        return id;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof HumusMineralizationCoefficient_2_TypeOfSoil_2_GroupsOfCropsId))
            return false;
        HumusMineralizationCoefficient_2_TypeOfSoil_2_GroupsOfCropsId other = (HumusMineralizationCoefficient_2_TypeOfSoil_2_GroupsOfCropsId) obj;
        return (id == other.id);
    }

}

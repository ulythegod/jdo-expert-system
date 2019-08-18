package core.data;

public class CareOfCropsId {
    static Class c = CareOfCrops.class;
    public int careOfCropsId;

    public CareOfCropsId() {
    }

    public CareOfCropsId(String fromString) {
        careOfCropsId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(careOfCropsId);
    }

    public int hashCode() {
        return careOfCropsId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof CareOfCropsId))
            return false;
        CareOfCropsId other = (CareOfCropsId) obj;
        return (careOfCropsId == other.careOfCropsId);
    }


}

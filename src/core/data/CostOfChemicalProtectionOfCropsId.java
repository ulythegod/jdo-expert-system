package core.data;

public class CostOfChemicalProtectionOfCropsId {

    static Class c = CostOfChemicalProtectionOfCrops.class;
    public int costOfChemicalProtectionOfCropsId;

    public CostOfChemicalProtectionOfCropsId() {
    }

    public CostOfChemicalProtectionOfCropsId(String fromString) {
        costOfChemicalProtectionOfCropsId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(costOfChemicalProtectionOfCropsId);
    }

    public int hashCode() {
        return costOfChemicalProtectionOfCropsId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof CostOfChemicalProtectionOfCropsId))
            return false;
        CostOfChemicalProtectionOfCropsId other = (CostOfChemicalProtectionOfCropsId) obj;
        return (costOfChemicalProtectionOfCropsId == other.costOfChemicalProtectionOfCropsId);
    }

}

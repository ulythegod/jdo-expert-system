package core.data;

public class CostOfRawMaterialForChemicalProtectionId {

    static Class c = CostOfRawMaterialForChemicalProtection.class;
    public int costOfRawMaterialForChemicalProtectionId;

    public CostOfRawMaterialForChemicalProtectionId() {
    }

    public CostOfRawMaterialForChemicalProtectionId(String fromString) {
        costOfRawMaterialForChemicalProtectionId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(costOfRawMaterialForChemicalProtectionId);
    }

    public int hashCode() {
        return costOfRawMaterialForChemicalProtectionId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof CostOfRawMaterialForChemicalProtectionId))
            return false;
        CostOfRawMaterialForChemicalProtectionId other = (CostOfRawMaterialForChemicalProtectionId) obj;
        return (costOfRawMaterialForChemicalProtectionId == other.costOfRawMaterialForChemicalProtectionId);
    }

}

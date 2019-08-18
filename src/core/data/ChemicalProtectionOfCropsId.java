package core.data;

public class ChemicalProtectionOfCropsId {

    static Class c = ChemicalProtectionOfCrops.class;
    public int chemicalProtectionOfCropsId;

    public ChemicalProtectionOfCropsId() {
    }

    public ChemicalProtectionOfCropsId(String fromString) {
        chemicalProtectionOfCropsId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(chemicalProtectionOfCropsId);
    }

    public int hashCode() {
        return chemicalProtectionOfCropsId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof ChemicalProtectionOfCropsId))
            return false;
        ChemicalProtectionOfCropsId other = (ChemicalProtectionOfCropsId) obj;
        return (chemicalProtectionOfCropsId == other.chemicalProtectionOfCropsId);
    }

}

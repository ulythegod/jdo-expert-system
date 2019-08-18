package core.data;

/**
 * Author: Skosyreva Maria
 * Date: 24.05.2016
 * Time: 19:40
 */
public class ChemicalProtection_2_AgricultureId {
    static Class c = ChemicalProtection_2_AgricultureId.class;
    public int chemicalProtection_2_AgricultureId;

    public ChemicalProtection_2_AgricultureId() {
    }

    public ChemicalProtection_2_AgricultureId(String fromString) {
        chemicalProtection_2_AgricultureId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(chemicalProtection_2_AgricultureId);
    }

    public int hashCode() {
        return chemicalProtection_2_AgricultureId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof ChemicalProtection_2_AgricultureId))
            return false;
        ChemicalProtection_2_AgricultureId other = (ChemicalProtection_2_AgricultureId) obj;
        return (chemicalProtection_2_AgricultureId == other.chemicalProtection_2_AgricultureId);
    }
}

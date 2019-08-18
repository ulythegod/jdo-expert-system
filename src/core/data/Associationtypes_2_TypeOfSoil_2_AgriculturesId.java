package core.data;

public class Associationtypes_2_TypeOfSoil_2_AgriculturesId {

    static Class c = Associationtypes_2_TypeOfSoil_2_Agricultures.class;
    public int id;

    public Associationtypes_2_TypeOfSoil_2_AgriculturesId() {
    }

    public Associationtypes_2_TypeOfSoil_2_AgriculturesId(String from) {

        id = Integer.parseInt(from);
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

        if (!(obj instanceof Associationtypes_2_TypeOfSoil_2_AgriculturesId))
            return false;
        Associationtypes_2_TypeOfSoil_2_AgriculturesId other = (Associationtypes_2_TypeOfSoil_2_AgriculturesId) obj;
        return (id == other.id);
    }

}

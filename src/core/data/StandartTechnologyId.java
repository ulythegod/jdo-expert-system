package core.data;

;

public class StandartTechnologyId {

    static Class c = StandartTechnology.class;
    public int standartTechnologyId;

    public StandartTechnologyId() {
    }

    public StandartTechnologyId(String fromString) {
        standartTechnologyId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(standartTechnologyId);
    }

    public int hashCode() {
        return standartTechnologyId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof StandartTechnologyId))
            return false;
        StandartTechnologyId other = (StandartTechnologyId) obj;
        return (standartTechnologyId == other.standartTechnologyId);
    }

}

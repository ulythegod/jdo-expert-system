package core.data;

public class MonthId {

    public int monthId;

    public MonthId(){};

    public MonthId(String from){

        monthId = Integer.parseInt(from);
    }

    public String toString() {
        return String.valueOf(monthId);
    }

    public int hashCode() {
        return monthId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof MonthId))
            return false;
        MonthId other = (MonthId) obj;
        return (monthId == other.monthId);
    }
}

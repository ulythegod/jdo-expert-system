package core.data;

public class ResultsFertilizersId {

    public int resultsFertilizersId;

    public ResultsFertilizersId(){};

    public ResultsFertilizersId(String from){

        resultsFertilizersId = Integer.parseInt(from);
    }

    public String toString() {
        return String.valueOf(resultsFertilizersId);
    }

    public int hashCode() {
        return resultsFertilizersId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof ResultsFertilizersId))
            return false;
        ResultsFertilizersId other = (ResultsFertilizersId) obj;
        return (resultsFertilizersId == other.resultsFertilizersId);
    }
}

package core.data;

public class ResultSecondThirdStageId {

    static Class c = ResultSecondThirdStage.class;
    public int id;

    public ResultSecondThirdStageId() {
    }

    public ResultSecondThirdStageId(String from) {

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

        if (!(obj instanceof ResultSecondThirdStageId))
            return false;
        ResultSecondThirdStageId other = (ResultSecondThirdStageId) obj;
        return (id == other.id);
    }

}

package core.data;

public class CorrectionResultId {

    public int correctionResultId;

    public CorrectionResultId(){}

    public CorrectionResultId(String from){

        correctionResultId = Integer.parseInt(from);
    }

    public String toString() {
        return String.valueOf(correctionResultId);
    }

    public int hashCode() {
        return correctionResultId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof CorrectionResultId))
            return false;
        CorrectionResultId other = (CorrectionResultId) obj;
        return (correctionResultId == other.correctionResultId);
    }
}

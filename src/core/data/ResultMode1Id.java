package core.data;

/**
 * Author: Skosyreva Maria
 * Date: 21.08.2016
 * Time: 11:30
 */
public class ResultMode1Id {
    static Class c = ResultMode1.class;
    public int resultMode1Id;

    public ResultMode1Id() {
    }

    public ResultMode1Id(String fromString) {
        this.resultMode1Id = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(this.resultMode1Id);
    }

    public int hashCode() {
        return this.resultMode1Id;
    }

    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        } else if(!(obj instanceof ResultMode1Id)) {
            return false;
        } else {
            ResultMode1Id other = (ResultMode1Id)obj;
            return this.resultMode1Id == other.resultMode1Id;
        }
    }
}

package core.data;

/**
 * Author: Skosyreva Maria
 * Date: 21.08.2016
 * Time: 11:30
 */
public class ResultMode3Id {
    static Class c = ResultMode3.class;
    public int resultMode3Id;

    public ResultMode3Id() {
    }

    public ResultMode3Id(String fromString) {
        this.resultMode3Id = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(this.resultMode3Id);
    }

    public int hashCode() {
        return this.resultMode3Id;
    }

    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        } else if(!(obj instanceof ResultMode3Id)) {
            return false;
        } else {
            ResultMode3Id other = (ResultMode3Id)obj;
            return this.resultMode3Id == other.resultMode3Id;
        }
    }
}

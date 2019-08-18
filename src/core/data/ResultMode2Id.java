package core.data;

/**
 * Author: Skosyreva Maria
 * Date: 21.08.2016
 * Time: 11:30
 */
public class ResultMode2Id {
    static Class c = ResultMode2.class;
    public int resultMode2Id;

    public ResultMode2Id() {
    }

    public ResultMode2Id(String fromString) {
        this.resultMode2Id = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(this.resultMode2Id);
    }

    public int hashCode() {
        return this.resultMode2Id;
    }

    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        } else if(!(obj instanceof ResultMode2Id)) {
            return false;
        } else {
            ResultMode2Id other = (ResultMode2Id)obj;
            return this.resultMode2Id == other.resultMode2Id;
        }
    }
}

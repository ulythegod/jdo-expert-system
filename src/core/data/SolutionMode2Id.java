package core.data;

/**
 * Author: Skosyreva Maria
 * Date: 21.08.2016
 * Time: 11:30
 */
public class SolutionMode2Id {
    static Class c = SolutionMode2.class;
    public int solutionMode2Id;

    public SolutionMode2Id() {
    }

    public SolutionMode2Id(String fromString) {
        this.solutionMode2Id = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(this.solutionMode2Id);
    }

    public int hashCode() {
        return this.solutionMode2Id;
    }

    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        } else if(!(obj instanceof SolutionMode2Id)) {
            return false;
        } else {
            SolutionMode2Id other = (SolutionMode2Id)obj;
            return this.solutionMode2Id == other.solutionMode2Id;
        }
    }
}

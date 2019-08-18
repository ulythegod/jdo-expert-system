package core.data;

/**
 * Author: Skosyreva Maria
 * Date: 21.08.2016
 * Time: 11:30
 */
public class SolutionMode3Id {
    static Class c = SolutionMode3.class;
    public int solutionMode3Id;

    public SolutionMode3Id() {
    }

    public SolutionMode3Id(String fromString) {
        this.solutionMode3Id = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(this.solutionMode3Id);
    }

    public int hashCode() {
        return this.solutionMode3Id;
    }

    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        } else if(!(obj instanceof SolutionMode3Id)) {
            return false;
        } else {
            SolutionMode3Id other = (SolutionMode3Id)obj;
            return this.solutionMode3Id == other.solutionMode3Id;
        }
    }
}

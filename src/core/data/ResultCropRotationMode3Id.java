package core.data;

/**
 * Author: Skosyreva Maria
 * Date: 21.08.2016
 * Time: 11:30
 */
public class ResultCropRotationMode3Id {
    static Class c = ResultCropRotationMode3Id.class;
    public int resultCropRotationMode3Id;

    public ResultCropRotationMode3Id() {
    }

    public ResultCropRotationMode3Id(String fromString) {
        this.resultCropRotationMode3Id = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(this.resultCropRotationMode3Id);
    }

    public int hashCode() {
        return this.resultCropRotationMode3Id;
    }

    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        } else if(!(obj instanceof ResultCropRotationMode3Id)) {
            return false;
        } else {
            ResultCropRotationMode3Id other = (ResultCropRotationMode3Id)obj;
            return this.resultCropRotationMode3Id == other.resultCropRotationMode3Id;
        }
    }
}

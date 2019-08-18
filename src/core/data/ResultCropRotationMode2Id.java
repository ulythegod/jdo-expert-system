package core.data;

/**
 * Author: Skosyreva Maria
 * Date: 21.08.2016
 * Time: 11:30
 */
public class ResultCropRotationMode2Id {
    static Class c = ResultCropRotationMode2Id.class;
    public int resultCropRotationMode2Id;

    public ResultCropRotationMode2Id() {
    }

    public ResultCropRotationMode2Id(String fromString) {
        this.resultCropRotationMode2Id = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(this.resultCropRotationMode2Id);
    }

    public int hashCode() {
        return this.resultCropRotationMode2Id;
    }

    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        } else if(!(obj instanceof ResultCropRotationMode2Id)) {
            return false;
        } else {
            ResultCropRotationMode2Id other = (ResultCropRotationMode2Id)obj;
            return this.resultCropRotationMode2Id == other.resultCropRotationMode2Id;
        }
    }
}

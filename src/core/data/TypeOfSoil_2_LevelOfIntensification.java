package core.data;

/**
 * Created with IntelliJ IDEA.
 * User: Влада
 * Date: 21.05.13
 * Time: 22:10
 * To change this template use File | Settings | File Templates.
 */
public class TypeOfSoil_2_LevelOfIntensification {

    private int typeOfSoil_2_LevelOfIntensificationId;
    private TypeOfSoil typeOfSoil;
    private LevelOfIntensification levelOfIntensification;

    private TypeOfSoil_2_LevelOfIntensification() {
    }


    public int getTypeOfSoil_2_LevelOfIntensificationId() {
        return typeOfSoil_2_LevelOfIntensificationId;
    }

    public void setTypeOfSoil_2_LevelOfIntensificationId(int typeOfSoil_2_LevelOfIntensificationId) {
        this.typeOfSoil_2_LevelOfIntensificationId = typeOfSoil_2_LevelOfIntensificationId;
    }

    public TypeOfSoil getTypeOfSoil() {
        return typeOfSoil;
    }

    public void setTypeOfSoil(TypeOfSoil typeOfSoil) {
        this.typeOfSoil = typeOfSoil;
    }

    public LevelOfIntensification getLevelOfIntensification() {
        return levelOfIntensification;
    }

    public void setLevelOfIntensification(LevelOfIntensification levelOfIntensification) {
        this.levelOfIntensification = levelOfIntensification;
    }
}

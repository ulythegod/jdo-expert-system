package core.data;

/**
 * Author: Skosyreva Maria
 * Date: 24.05.2016
 * Time: 19:20
 */
public class TypeOfSoil_2_Agriculture {
    private int typeOfSoil_2_AgricultureId;
    private TypeOfSoil typeOfSoil;
    private Agricultures agriculture;
    private String color;

    public TypeOfSoil_2_Agriculture() {
    }

    public int getTypeOfSoil_2_AgricultureId() {
        return typeOfSoil_2_AgricultureId;
    }

    public void setTypeOfSoil_2_AgricultureId(int typeOfSoil_2_AgricultureId) {
        this.typeOfSoil_2_AgricultureId = typeOfSoil_2_AgricultureId;
    }

    public TypeOfSoil getTypeOfSoil() {
        return typeOfSoil;
    }

    public void setTypeOfSoil(TypeOfSoil typeOfSoil) {
        this.typeOfSoil = typeOfSoil;
    }

    public Agricultures getAgriculture() {
        return agriculture;
    }

    public void setAgriculture(Agricultures agriculture) {
        this.agriculture = agriculture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

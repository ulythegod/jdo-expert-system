
package core.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;


public class AgricultureField {
    private int agricultureFieldId;
    private int fieldNumber;
    private TypeOfSoil typeOfSoil;
    private ArrayList<Point> poligon = new ArrayList<Point>();
    private float area;
    private float calcArea;
    private float calcHeithtArea;
    private String color;
    private Agricultures agriculture;
    private float topsoilDepth;
    private float soilBulk;
    private Collection landBase_2_agricultureField = new HashSet();
    private Collection crop_2_AgricultureField_2_Year = new HashSet();
    private Collection cropRotationOfAgriculture_2_AgricultureField = new HashSet();
    private Collection resultsMode1 = new HashSet();
    private Collection resultsMode2 = new HashSet();
    private Collection resultsFertilizers = new HashSet();

    public AgricultureField() {
    }

    public AgricultureField(int agricultureFieldId, int fieldNumber, float area, float calcArea, float calcHeithtArea, String color, Agricultures agriculture) {
        this.agricultureFieldId = agricultureFieldId;
        this.fieldNumber = fieldNumber;
        this.area = area;
        this.calcArea = calcArea;
        this.calcHeithtArea = calcHeithtArea;
        this.color = color;
        this.agriculture = agriculture;
    }

    public Collection getResultsMode1() {
        return resultsMode1;
    }

    public void setResultsMode1(Collection resultsMode1) {
        this.resultsMode1 = resultsMode1;
    }

    public Collection getResultsMode2() {
        return resultsMode2;
    }

    public void setResultsMode2(Collection resultsMode2) {
        this.resultsMode2 = resultsMode2;
    }

    public Collection getCropRotationOfAgriculture_2_AgricultureField() {
        return cropRotationOfAgriculture_2_AgricultureField;
    }

    public void setCropRotationOfAgriculture_2_AgricultureField(Collection cropRotationOfAgriculture_2_AgricultureField) {
        this.cropRotationOfAgriculture_2_AgricultureField = cropRotationOfAgriculture_2_AgricultureField;
    }

    public AgricultureField(int agricultureFieldId, int fieldNumber, TypeOfSoil typeOfSoil, ArrayList<Point> poligon, float area, float calcArea, float calcHeithtArea, String color, Agricultures agriculture) {
        this.agricultureFieldId = agricultureFieldId;
        this.fieldNumber = fieldNumber;
        this.typeOfSoil = typeOfSoil;
        this.poligon = poligon;
        this.area = area;
        this.calcArea = calcArea;
        this.calcHeithtArea = calcHeithtArea;
        this.color = color;
        this.agriculture = agriculture;
    }

    public Agricultures getAgriculture() {
        return agriculture;
    }

    public void setAgriculture(Agricultures agriculture) {
        this.agriculture = agriculture;
    }

    public int getAgricultureFieldId() {
        return agricultureFieldId;
    }

    public void setAgricultureFieldId(int agricultureFieldId) {
        this.agricultureFieldId = agricultureFieldId;
    }

    public TypeOfSoil getTypeOfSoil() {
        return typeOfSoil;
    }

    public void setTypeOfSoil(TypeOfSoil typeOfSoil) {
        this.typeOfSoil = typeOfSoil;
    }

    public ArrayList<Point> getPoligon() {
        return poligon;
    }

    public void setPoligon(ArrayList<Point> poligon) {
        this.poligon = poligon;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getCalcArea() {
        return calcArea;
    }

    public void setCalcArea(float calcArea) {
        this.calcArea = calcArea;
    }

    public float getCalcHeithtArea() {
        return calcHeithtArea;
    }

    public void setCalcHeithtArea(float calcHeithtArea) {
        this.calcHeithtArea = calcHeithtArea;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFieldNumber() {
        return fieldNumber;
    }

    public void setFieldNumber(int fieldNumber) {
        this.fieldNumber = fieldNumber;
    }

    public Collection getLandBase_2_agricultureField() {
        return landBase_2_agricultureField;
    }

    public void setLandBase_2_agricultureField(Collection landBase_2_agricultureField) {
        this.landBase_2_agricultureField = landBase_2_agricultureField;
    }

    public Collection getCrop_2_AgricultureField_2_Year() {
        return crop_2_AgricultureField_2_Year;
    }

    public void setCrop_2_AgricultureField_2_Year(Collection crop_2_AgricultureField_2_Year) {
        this.crop_2_AgricultureField_2_Year = crop_2_AgricultureField_2_Year;
    }

    public float getTopsoilDepth() {
        return topsoilDepth;
    }

    public void setTopsoilDepth(float topsoilDepth) {
        this.topsoilDepth = topsoilDepth;
    }

    public float getSoilBulk() {
        return soilBulk;
    }

    public void setSoilBulk(float soilBulk) {
        this.soilBulk = soilBulk;
    }

    public Collection getResultsFertilizers() {
        return resultsFertilizers;
    }

    public void setResultsFertilizers(Collection resultsFertilizers) {
        this.resultsFertilizers = resultsFertilizers;
    }
}
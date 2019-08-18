package core.data;

import java.util.Collection;
import java.util.HashSet;

public class CoefficientOfUsingMicroelementFromFert {

    private int coefficientOfUsingMicroelementFromFertId;
    private Microelement microelement;
    private String yearOfUsing;
    private int minValue;
    private int maxValue;

    public int getCoefficientOfUsingMicroelementFromFertId() {
        return coefficientOfUsingMicroelementFromFertId;
    }

    public void setCoefficientOfUsingMicroelementFromFertId(int coefficientOfUsingMicroelementFromFertId) {
        this.coefficientOfUsingMicroelementFromFertId = coefficientOfUsingMicroelementFromFertId;
    }

    public Microelement getMicroelement() {
        return microelement;
    }

    public void setMicroelement(Microelement microelement) {
        this.microelement = microelement;
    }

    public String getYearOfUsing() {
        return yearOfUsing;
    }

    public void setYearOfUsing(String yearOfUsing) {
        this.yearOfUsing = yearOfUsing;
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }
}

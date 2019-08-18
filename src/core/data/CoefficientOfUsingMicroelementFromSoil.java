package core.data;

import java.util.Collection;

public class CoefficientOfUsingMicroelementFromSoil {

    private int coefficientOfUsingMicroelementFromSoilId;
    private Microelement microelement;
    private float amountInSoil;
    private float value;

    public CoefficientOfUsingMicroelementFromSoil(){};

    public int getCoefficientOfUsingMicroelementFromSoilId() {
        return coefficientOfUsingMicroelementFromSoilId;
    }

    public void setCoefficientOfUsingMicroelementFromSoilId(int coefficientOfUsingMicroelementFromSoilId) {
        this.coefficientOfUsingMicroelementFromSoilId = coefficientOfUsingMicroelementFromSoilId;
    }

    public Microelement getMicroelement() {
        return microelement;
    }

    public void setMicroelement(Microelement microelement) {
        this.microelement = microelement;
    }

    public float getAmountInSoil() {
        return amountInSoil;
    }

    public void setAmountInSoil(float amountInSoil) {
        this.amountInSoil = amountInSoil;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}

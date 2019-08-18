
package core.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;


public class CoefficientOfInflation {
    private int coefficientOfInflationId;
    private float value;
    private String dateCreate;
    private Season season;
    private Agricultures agriculture;


    public CoefficientOfInflation() {
    }

    public int getCoefficientOfInflationId() {
        return coefficientOfInflationId;
    }

    public void setCoefficientOfInflationId(int coefficientOfInflationId) {
        this.coefficientOfInflationId = coefficientOfInflationId;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public Agricultures getAgriculture() {
        return agriculture;
    }

    public void setAgriculture(Agricultures agriculture) {
        this.agriculture = agriculture;
    }
}
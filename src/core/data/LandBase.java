package core.data;

import java.util.Collection;
import java.util.HashSet;

/**
 * Author: Skosyreva Maria
 * Date: 19.11.2017
 * Time: 8:26
 */

public class LandBase {
    private int landBaseId;
    private Agricultures agriculture;
    private String date;
    private Collection landBase_2_agricultureField = new HashSet();
    private Collection solutionsMode2 = new HashSet();
    private Collection resultsMode1 = new HashSet();
    private Collection agrochemicalSoilSurveys = new HashSet();
    private Collection solutions = new HashSet();

    public LandBase() {
    }

    public int getLandBaseId() {
        return landBaseId;
    }

    public void setLandBaseId(int landBaseId) {
        this.landBaseId = landBaseId;
    }

    public Agricultures getAgriculture() {
        return agriculture;
    }

    public void setAgriculture(Agricultures agriculture) {
        this.agriculture = agriculture;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Collection getLandBase_2_agricultureField() {
        return landBase_2_agricultureField;
    }

    public void setLandBase_2_agricultureField(Collection landBase_2_agricultureField) {
        this.landBase_2_agricultureField = landBase_2_agricultureField;
    }

    public Collection getSolutionsMode2() {
        return solutionsMode2;
    }

    public void setSolutionsMode2(Collection solutionsMode2) {
        this.solutionsMode2 = solutionsMode2;
    }

    public Collection getResultsMode1() {
        return resultsMode1;
    }

    public void setResultsMode1(Collection resultsMode1) {
        this.resultsMode1 = resultsMode1;
    }

    public Collection getAgrochemicalSoilSurveys() {
        return agrochemicalSoilSurveys;
    }

    public void setAgrochemicalSoilSurveys(Collection agrochemicalSoilSurveys) {
        this.agrochemicalSoilSurveys = agrochemicalSoilSurveys;
    }

    public Collection getSolutions() { return solutions; }

    public void setSolutions(Collection solutions) { this.solutions = solutions; }
}

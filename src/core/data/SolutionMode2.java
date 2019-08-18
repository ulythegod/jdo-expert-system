package core.data;

import java.util.Collection;
import java.util.HashSet;

/**
 * Author: Skosyreva Maria
 * Date: 21.08.2016
 * Time: 11:26
 */
public class SolutionMode2 {
    private int solutionMode2Id;
    private String nameSolution;
    private String dateCreate;
    private int calcYear;
    private float area;
    private float prod;
    private float income;
    private float costs;
    private float prodSt;
    private float incomeSt;
    private float costsSt;
    private String status;
    private Agricultures agriculture;
    private LandBase landBase;
    private Collection resultsCropRotation = new HashSet();

    public SolutionMode2(String status) {
        this.prod = 0;
        this.income = 0;
        this.costs = 0;
        this.status = status;
    }

    public SolutionMode2(String nameSolution, String dateCreate, int calcYear, Agricultures agriculture, LandBase landBase, String status) {
        this.nameSolution = nameSolution;
        this.dateCreate = dateCreate;
        this.calcYear = calcYear;
        this.prod = 0;
        this.income = 0;
        this.costs = 0;
        this.prodSt = 0;
        this.incomeSt = 0;
        this.costsSt = 0;
        this.agriculture = agriculture;
        this.landBase = landBase;
        this.status = status;
        this.area = 0;
    }

    public int getSolutionMode2Id() {
        return solutionMode2Id;
    }

    public void setSolutionMode2Id(int solutionMode2Id) {
        this.solutionMode2Id = solutionMode2Id;
    }

    public String getNameSolution() {
        return nameSolution;
    }

    public void setNameSolution(String nameSolution) {
        this.nameSolution = nameSolution;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public int getCalcYear() {
        return calcYear;
    }

    public void setCalcYear(int calcYear) {
        this.calcYear = calcYear;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getProd() {
        return prod;
    }

    public void setProd(float prod) {
        this.prod = prod;
    }

    public float getIncome() {
        return income;
    }

    public void setIncome(float income) {
        this.income = income;
    }

    public float getCosts() {
        return costs;
    }

    public void setCosts(float costs) {
        this.costs = costs;
    }

    public float getProdSt() {
        return prodSt;
    }

    public void setProdSt(float prodSt) {
        this.prodSt = prodSt;
    }

    public float getIncomeSt() {
        return incomeSt;
    }

    public void setIncomeSt(float incomeSt) {
        this.incomeSt = incomeSt;
    }

    public float getCostsSt() {
        return costsSt;
    }

    public void setCostsSt(float costsSt) {
        this.costsSt = costsSt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Agricultures getAgriculture() {
        return agriculture;
    }

    public void setAgriculture(Agricultures agriculture) {
        this.agriculture = agriculture;
    }

    public LandBase getLandBase() {
        return landBase;
    }

    public void setLandBase(LandBase landBase) {
        this.landBase = landBase;
    }

    public Collection getResultsCropRotation() {
        return resultsCropRotation;
    }

    public void setResultsCropRotation(Collection resultsCropRotation) {
        this.resultsCropRotation = resultsCropRotation;
    }
}

package core.data;

import java.util.Collection;
import java.util.HashSet;

/**
 * Author: Skosyreva Maria
 * Date: 21.08.2016
 * Time: 11:26
 */
public class ResultCropRotationMode2 {
    private int resultCropRotationMode2Id;
    private String name;
    private String status;
    private float area;
    private CropRotationOfAgriculture cropRotationOfAgriculture;
    private SolutionMode2 solution;
    private float prod;
    private float income;
    private float costs;
    private float costsSt;
    private float prodSt;
    private float incomeSt;
    private Collection resultsMode2 = new HashSet();
    private int fieldsAll;
    private String fieldsProc;
    private String fieldsUnproc;

    public ResultCropRotationMode2() {
        this.fieldsProc = "";
        this.fieldsUnproc = "";
    }

    public ResultCropRotationMode2(CropRotationOfAgriculture cropRotationOfAgriculture, SolutionMode2 solution, String status) {
        this.name = cropRotationOfAgriculture.getCodeCropRotationOfAgriculture() + " " + cropRotationOfAgriculture.getCropRotation().getNameCropRotation();
        this.solution = solution;
        this.cropRotationOfAgriculture = cropRotationOfAgriculture;
        this.prod = 0;
        this.income = 0;
        this.costs = 0;
        this.prodSt = 0;
        this.incomeSt = 0;
        this.costsSt = 0;
        this.status = status;
        this.area = 0;
        this.fieldsAll = 0;
        this.fieldsProc = "";
        this.fieldsUnproc = "";
    }

    public int getResultCropRotationMode2Id() {
        return resultCropRotationMode2Id;
    }

    public void setResultCropRotationMode2Id(int resultCropRotationMode2Id) {
        this.resultCropRotationMode2Id = resultCropRotationMode2Id;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public CropRotationOfAgriculture getCropRotationOfAgriculture() {
        return cropRotationOfAgriculture;
    }

    public void setCropRotationOfAgriculture(CropRotationOfAgriculture cropRotationOfAgriculture) {
        this.cropRotationOfAgriculture = cropRotationOfAgriculture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SolutionMode2 getSolution() {
        return solution;
    }

    public void setSolution(SolutionMode2 solution) {
        this.solution = solution;
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

    public float getCostsSt() {
        return costsSt;
    }

    public void setCostsSt(float costsSt) {
        this.costsSt = costsSt;
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

    public Collection getResultsMode2() {
        return resultsMode2;
    }

    public void setResultsMode2(Collection resultsMode2) {
        this.resultsMode2 = resultsMode2;
    }

    public String getFieldsProc() {
        return fieldsProc;
    }

    public void setFieldsProc(String fieldsProc) {
        this.fieldsProc = fieldsProc;
    }

    public String getFieldsUnproc() {
        return fieldsUnproc;
    }

    public void setFieldsUnproc(String fieldsUnproc) {
        this.fieldsUnproc = fieldsUnproc;
    }

    public int getFieldsAll() {
        return fieldsAll;
    }

    public void setFieldsAll(int fieldsAll) {
        this.fieldsAll = fieldsAll;
    }
}

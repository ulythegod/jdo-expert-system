package core.data;

import java.util.Collection;
import java.util.HashSet;

/**
 * Author: Skosyreva Maria
 * Date: 21.08.2016
 * Time: 11:26
 */
public class ResultCropRotationMode3 {
    private int resultCropRotationMode3Id;
    private String name;
    private String status;
    private float area;
    private CropRotationOfAgriculture cropRotationOfAgriculture;
    private SolutionMode3 solution;
    private Predecessor pred;
    private GradeOfCrop grade;
    private LevelOfIntensification level;
    private MainProcessing mainP;
    private PreseedingProcessingAndSowing preP;
    private CareOfCrops care;
    private Harvesting harv;
    private ApplicationOfFertilizers fert;
    private ChemicalProtectionOfCrops chem;
    /*Затраты на операции*/
    private float kInf;
    private float seedsCost;
    private float mainPCost;
    private float prePCost;
    private float careCost;
    private float harvCost;
    private float fertCost;
    private float chemCost;
    /*Стандартная технология*/
    private StandartTechnology st;
    private float seedsCostSt;
    private float mainPCostSt;
    private float prePCostSt;
    private float careCostSt;
    private float harvCostSt;
    private float fertCostSt;
    private float chemCostSt;
    private float prod;
    private float income;
    private float costs;
    private float costsSt;
    private float prodSt;
    private float incomeSt;
    private int fieldsAll;
    private String fieldsProc;
    private String fieldsUnproc;
    private Collection resultsMode3 = new HashSet();

    public ResultCropRotationMode3() {
    }

    public ResultCropRotationMode3(CropRotationOfAgriculture cropRotationOfAgriculture, SolutionMode3 solution) {
        this.name = cropRotationOfAgriculture.getCodeCropRotationOfAgriculture() + " " + cropRotationOfAgriculture.getCropRotation().getNameCropRotation();
        this.solution = solution;
        this.cropRotationOfAgriculture = cropRotationOfAgriculture;
        this.prod = 0;
        this.income = 0;
        this.costs = 0;
        this.prodSt = 0;
        this.incomeSt = 0;
        this.costsSt = 0;
        this.status = "Не завершено";
        this.area = 0;
        this.fieldsAll = 0;
        this.fieldsProc = "";
        this.fieldsUnproc = "";
    }

    public ResultCropRotationMode3(SolutionMode3 solution, CropRotationOfAgriculture cropRotation, Predecessor pred, GradeOfCrop grade, LevelOfIntensification level, MainProcessing mainP, PreseedingProcessingAndSowing preP, CareOfCrops care, Harvesting harv, ApplicationOfFertilizers fert, ChemicalProtectionOfCrops chem, StandartTechnology st) {
        this.name = cropRotation.getCodeCropRotationOfAgriculture() + " " + cropRotation.getCropRotation().getNameCropRotation();
        this.solution = solution;
        this.cropRotationOfAgriculture = cropRotation;
        this.prod = 0;
        this.income = 0;
        this.costs = 0;
        this.prodSt = 0;
        this.incomeSt = 0;
        this.costsSt = 0;
        this.status = "Не завершено";
        this.area = 0;
        this.fieldsAll = 0;
        this.fieldsProc = "";
        this.fieldsUnproc = "";
        this.pred = pred;
        this.grade = grade;
        this.level = level;
        this.mainP = mainP;
        this.preP = preP;
        this.care = care;
        this.harv = harv;
        this.fert = fert;
        this.chem = chem;
        this.st = st;
    }

    public int getResultCropRotationMode3Id() {
        return resultCropRotationMode3Id;
    }

    public void setResultCropRotationMode3Id(int resultCropRotationMode3Id) {
        this.resultCropRotationMode3Id = resultCropRotationMode3Id;
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

    public SolutionMode3 getSolution() {
        return solution;
    }

    public void setSolution(SolutionMode3 solution) {
        this.solution = solution;
    }

    public Predecessor getPred() {
        return pred;
    }

    public void setPred(Predecessor pred) {
        this.pred = pred;
    }

    public GradeOfCrop getGrade() {
        return grade;
    }

    public void setGrade(GradeOfCrop grade) {
        this.grade = grade;
    }

    public LevelOfIntensification getLevel() {
        return level;
    }

    public void setLevel(LevelOfIntensification level) {
        this.level = level;
    }

    public MainProcessing getMainP() {
        return mainP;
    }

    public void setMainP(MainProcessing mainP) {
        this.mainP = mainP;
    }

    public PreseedingProcessingAndSowing getPreP() {
        return preP;
    }

    public void setPreP(PreseedingProcessingAndSowing preP) {
        this.preP = preP;
    }

    public CareOfCrops getCare() {
        return care;
    }

    public void setCare(CareOfCrops care) {
        this.care = care;
    }

    public Harvesting getHarv() {
        return harv;
    }

    public void setHarv(Harvesting harv) {
        this.harv = harv;
    }

    public ApplicationOfFertilizers getFert() {
        return fert;
    }

    public void setFert(ApplicationOfFertilizers fert) {
        this.fert = fert;
    }

    public ChemicalProtectionOfCrops getChem() {
        return chem;
    }

    public void setChem(ChemicalProtectionOfCrops chem) {
        this.chem = chem;
    }

    public float getKInf() {
        return kInf;
    }

    public void setKInf(float kInf) {
        this.kInf = kInf;
    }

    public float getSeedsCost() {
        return seedsCost;
    }

    public void setSeedsCost(float seedsCost) {
        this.seedsCost = seedsCost;
    }

    public float getMainPCost() {
        return mainPCost;
    }

    public void setMainPCost(float mainPCost) {
        this.mainPCost = mainPCost;
    }

    public float getPrePCost() {
        return prePCost;
    }

    public void setPrePCost(float prePCost) {
        this.prePCost = prePCost;
    }

    public float getCareCost() {
        return careCost;
    }

    public void setCareCost(float careCost) {
        this.careCost = careCost;
    }

    public float getHarvCost() {
        return harvCost;
    }

    public void setHarvCost(float harvCost) {
        this.harvCost = harvCost;
    }

    public float getFertCost() {
        return fertCost;
    }

    public void setFertCost(float fertCost) {
        this.fertCost = fertCost;
    }

    public float getChemCost() {
        return chemCost;
    }

    public void setChemCost(float chemCost) {
        this.chemCost = chemCost;
    }

    public StandartTechnology getSt() {
        return st;
    }

    public void setSt(StandartTechnology st) {
        this.st = st;
    }

    public float getSeedsCostSt() {
        return seedsCostSt;
    }

    public void setSeedsCostSt(float seedsCostSt) {
        this.seedsCostSt = seedsCostSt;
    }

    public float getMainPCostSt() {
        return mainPCostSt;
    }

    public void setMainPCostSt(float mainPCostSt) {
        this.mainPCostSt = mainPCostSt;
    }

    public float getPrePCostSt() {
        return prePCostSt;
    }

    public void setPrePCostSt(float prePCostSt) {
        this.prePCostSt = prePCostSt;
    }

    public float getCareCostSt() {
        return careCostSt;
    }

    public void setCareCostSt(float careCostSt) {
        this.careCostSt = careCostSt;
    }

    public float getHarvCostSt() {
        return harvCostSt;
    }

    public void setHarvCostSt(float harvCostSt) {
        this.harvCostSt = harvCostSt;
    }

    public float getFertCostSt() {
        return fertCostSt;
    }

    public void setFertCostSt(float fertCostSt) {
        this.fertCostSt = fertCostSt;
    }

    public float getChemCostSt() {
        return chemCostSt;
    }

    public void setChemCostSt(float chemCostSt) {
        this.chemCostSt = chemCostSt;
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

    public int getFieldsAll() {
        return fieldsAll;
    }

    public void setFieldsAll(int fieldsAll) {
        this.fieldsAll = fieldsAll;
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

    public Collection getResultsMode3() {
        return resultsMode3;
    }

    public void setResultsMode3(Collection resultsMode3) {
        this.resultsMode3 = resultsMode3;
    }
}

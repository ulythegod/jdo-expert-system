package core.data;

/**
 * Author: Skosyreva Maria
 * Date: 21.08.2016
 * Time: 11:26
 */
public class ResultMode1 {
    private int resultMode1Id;
    private String nameResult;
    private String dateCreate;
    private AgricultureField agricultureField;
    private LandBase landBase;
    private Predecessor pred;
    private CropRotation rot;
    private GradeOfCrop grade;
    private LevelOfIntensification level;
    private MainProcessing mainP;
    private PreseedingProcessingAndSowing preP;
    private CareOfCrops care;
    private Harvesting harv;
    private ApplicationOfFertilizers fert;
    private ChemicalProtectionOfCrops chem;
    private float prod;
    private float income;
    private float costs;
    /*Затраты*/
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
    private float costsSt;
    private float prodSt;
    private float incomeSt;
    /*Результаты мат.мод. системы удобрений*/
    private ResultsFertilizers resultsFertilizers;

    public ResultMode1(String nameResult, String dateCreate, AgricultureField agricultureField, LandBase landBase, Predecessor pred, CropRotation rot, GradeOfCrop grade, LevelOfIntensification level, MainProcessing mainP, PreseedingProcessingAndSowing preP, CareOfCrops care, Harvesting harv, ApplicationOfFertilizers fert, ChemicalProtectionOfCrops chem, float prod, float income, StandartTechnology st, float prodSt, float incomeSt) {
        this.nameResult = nameResult;
        this.dateCreate = dateCreate;
        this.agricultureField = agricultureField;
        this.landBase = landBase;
        this.pred = pred;
        this.rot = rot;
        this.grade = grade;
        this.level = level;
        this.mainP = mainP;
        this.preP = preP;
        this.care = care;
        this.harv = harv;
        this.fert = fert;
        this.chem = chem;
        this.prod = prod;
        this.income = income;
        this.st = st;
        this.prodSt = prodSt;
        this.incomeSt = incomeSt;
    }

    public int getResultMode1Id() {
        return resultMode1Id;
    }

    public void setResultMode1Id(int resultMode1Id) {
        this.resultMode1Id = resultMode1Id;
    }

    public String getNameResult() {
        return nameResult;
    }

    public void setNameResult(String nameResult) {
        this.nameResult = nameResult;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public AgricultureField getAgricultureField() {
        return agricultureField;
    }

    public void setAgricultureField(AgricultureField agricultureField) {
        this.agricultureField = agricultureField;
    }

    public LandBase getLandBase() {
        return landBase;
    }

    public void setLandBase(LandBase landBase) {
        this.landBase = landBase;
    }

    public Predecessor getPred() {
        return pred;
    }

    public void setPred(Predecessor pred) {
        this.pred = pred;
    }

    public CropRotation getRot() {
        return rot;
    }

    public void setRot(CropRotation rot) {
        this.rot = rot;
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

    public float getkInf() {
        return kInf;
    }

    public void setkInf(float kInf) {
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

    public ResultsFertilizers getResultsFertilizers() {
        return resultsFertilizers;
    }

    public void setResultsFertilizers(ResultsFertilizers resultsFertilizers) {
        this.resultsFertilizers = resultsFertilizers;
    }
}
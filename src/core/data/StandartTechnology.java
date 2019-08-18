package core.data;

public class StandartTechnology {

    private int standartTechnologyId;
    private LevelOfIntensification levelOfIntensification;
    private GradeOfCrop gradeOfCrop;
    private MainProcessing mainProcessing;
    private PreseedingProcessingAndSowing preseedingProcessingAndSowing;
    private CareOfCrops careOfCrops;
    private Harvesting harvesting;
    private ApplicationOfFertilizers applicationOfFertilizers;
    private ChemicalProtectionOfCrops chemicalProtectionOfCrops;


    public StandartTechnology() {
    }

    public ApplicationOfFertilizers getApplicationOfFertilizers() {
        return applicationOfFertilizers;
    }

    public void setApplicationOfFertilizers(ApplicationOfFertilizers applicationOfFertilizers) {
        this.applicationOfFertilizers = applicationOfFertilizers;
    }

    public CareOfCrops getCareOfCrops() {
        return careOfCrops;
    }

    public void setCareOfCrops(CareOfCrops careOfCrops) {
        this.careOfCrops = careOfCrops;
    }

    public ChemicalProtectionOfCrops getChemicalProtectionOfCrops() {
        return chemicalProtectionOfCrops;
    }

    public void setChemicalProtectionOfCrops(ChemicalProtectionOfCrops chemicalProtectionOfCrops) {
        this.chemicalProtectionOfCrops = chemicalProtectionOfCrops;
    }

    public GradeOfCrop getGradeOfCrop() {
        return gradeOfCrop;
    }

    public void setGradeOfCrop(GradeOfCrop gradeOfCrop) {
        this.gradeOfCrop = gradeOfCrop;
    }

    public Harvesting getHarvesting() {
        return harvesting;
    }

    public void setHarvesting(Harvesting harvesting) {
        this.harvesting = harvesting;
    }

    public LevelOfIntensification getLevelOfIntensification() {
        return levelOfIntensification;
    }

    public void setLevelOfIntensification(LevelOfIntensification levelOfIntensification) {
        this.levelOfIntensification = levelOfIntensification;
    }

    public MainProcessing getMainProcessing() {
        return mainProcessing;
    }

    public void setMainProcessing(MainProcessing mainProcessing) {
        this.mainProcessing = mainProcessing;
    }

    public PreseedingProcessingAndSowing getPreseedingProcessingAndSowing() {
        return preseedingProcessingAndSowing;
    }

    public void setPreseedingProcessingAndSowing(PreseedingProcessingAndSowing preseedingProcessingAndSowing) {
        this.preseedingProcessingAndSowing = preseedingProcessingAndSowing;
    }

    public int getStandartTechnologyId() {
        return standartTechnologyId;
    }

    public void setStandartTechnologyId(int standartTechnologyId) {
        this.standartTechnologyId = standartTechnologyId;
    }



}

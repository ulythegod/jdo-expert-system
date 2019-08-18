package core.data;

public class ApplicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_Crop {

    private int applicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_CropId;
    private ApplicationOfFertilizers applicationOfFertilizers;
    private TypeOfSoil typeOfSoil;
    private LevelOfIntensification levelOfIntensification;
    private Crop crop;


    public ApplicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_Crop() {
    }

    public int getApplicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_CropId() {
        return applicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_CropId;
    }

    public void setApplicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_CropId(int applicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_CropId) {
        this.applicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_CropId = applicationOfFertilizers_2_TypeOfSoil_2_LevelOfIntensification_2_CropId;
    }

    public ApplicationOfFertilizers getApplicationOfFertilizers() {
        return applicationOfFertilizers;
    }

    public void setApplicationOfFertilizers(ApplicationOfFertilizers applicationOfFertilizers) {
        this.applicationOfFertilizers = applicationOfFertilizers;
    }

    public Crop getCrop() {
        return crop;
    }

    public void setCrop(Crop crop) {
        this.crop = crop;
    }

    public LevelOfIntensification getLevelOfIntensification() {
        return levelOfIntensification;
    }

    public void setLevelOfIntensification(LevelOfIntensification levelOfIntensification) {
        this.levelOfIntensification = levelOfIntensification;
    }

    public TypeOfSoil getTypeOfSoil() {
        return typeOfSoil;
    }

    public void setTypeOfSoil(TypeOfSoil typeOfSoil) {
        this.typeOfSoil = typeOfSoil;
    }

}

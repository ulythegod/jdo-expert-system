package core.data;

public class TypeOfSoilAndRecommendations {

    private int typeOfSoilAndRecommendationsId;
    private TypeOfSoil typeOfSoil;
    private String thePossibilityOfUsingTypeOfSoil;
    private String descriptionOfTypeOfSoil;
    private String adapterForCrops;
    private String adapterForCropRotations;

    public TypeOfSoilAndRecommendations() {
    }

    public String getAdapterForCropRotations() {
        return adapterForCropRotations;
    }

    public void setAdapterForCropRotations(String adapterForCropRotations) {
        this.adapterForCropRotations = adapterForCropRotations;
    }

    public String getAdapterForCrops() {
        return adapterForCrops;
    }

    public void setAdapterForCrops(String adapterForCrops) {
        this.adapterForCrops = adapterForCrops;
    }

    public String getDescriptionOfTypeOfSoil() {
        return descriptionOfTypeOfSoil;
    }

    public void setDescriptionOfTypeOfSoil(String descriptionOfTypeOfSoil) {
        this.descriptionOfTypeOfSoil = descriptionOfTypeOfSoil;
    }

    public String getThePossibilityOfUsingTypeOfSoil() {
        return thePossibilityOfUsingTypeOfSoil;
    }

    public void setThePossibilityOfUsingTypeOfSoil(String thePossibilityOfUsingTypeOfSoil) {
        this.thePossibilityOfUsingTypeOfSoil = thePossibilityOfUsingTypeOfSoil;
    }

    public TypeOfSoil getTypeOfSoil() {
        return typeOfSoil;
    }

    public void setTypeOfSoil(TypeOfSoil typeOfSoil) {
        this.typeOfSoil = typeOfSoil;
    }

    public int getTypeOfSoilAndRecommendationsId() {
        return typeOfSoilAndRecommendationsId;
    }

    public void setTypeOfSoilAndRecommendationsId(int typeOfSoilAndRecommendationsId) {
        this.typeOfSoilAndRecommendationsId = typeOfSoilAndRecommendationsId;
    }


}

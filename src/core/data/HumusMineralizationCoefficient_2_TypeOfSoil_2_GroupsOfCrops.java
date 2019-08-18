
package core.data;

public class HumusMineralizationCoefficient_2_TypeOfSoil_2_GroupsOfCrops {
    private int id;
    private HumusMineralizationCoefficient humusMineralizationCoefficient;
    private TypeOfSoil typeOfSoil;
    private GroupOfCropForCoeff groupOfCrops;

    public HumusMineralizationCoefficient_2_TypeOfSoil_2_GroupsOfCrops() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HumusMineralizationCoefficient getHumusMineralizationCoefficient() {
        return humusMineralizationCoefficient;
    }

    public void setHumusMineralizationCoefficient(HumusMineralizationCoefficient humusMineralizationCoefficient) {
        this.humusMineralizationCoefficient = humusMineralizationCoefficient;
    }

    public TypeOfSoil getTypeOfSoil() {
        return typeOfSoil;
    }

    public void setTypeOfSoil(TypeOfSoil typeOfSoil) {
        this.typeOfSoil = typeOfSoil;
    }

    public GroupOfCropForCoeff getGroupOfCrops() {
        return groupOfCrops;
    }

    public void setGroupOfCrops(GroupOfCropForCoeff groupOfCrops) {
        this.groupOfCrops = groupOfCrops;
    }
}
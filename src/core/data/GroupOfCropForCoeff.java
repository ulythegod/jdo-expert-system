
package core.data;

import java.util.Collection;
import java.util.HashSet;

public class GroupOfCropForCoeff {
    private int idGroupOfCropForCoeff;
    private String name;
    private Collection crops = new HashSet();
    private Collection humusMineralizationCoefficient_2_TypeOfSoil_2_GroupsOfCrops = new HashSet();
    private Collection correctiveCoefficients = new HashSet();

    public GroupOfCropForCoeff() {
    }

    public int getIdGroupOfCropForCoeff() {
        return idGroupOfCropForCoeff;
    }

    public void setIdGroupOfCropForCoeff(int idGroupOfCropForCoeff) {
        this.idGroupOfCropForCoeff = idGroupOfCropForCoeff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection getCrops() {
        return crops;
    }

    public void setCrops(Collection crops) {
        this.crops = crops;
    }

    public Collection getHumusMineralizationCoefficient_2_TypeOfSoil_2_GroupsOfCrops() {
        return humusMineralizationCoefficient_2_TypeOfSoil_2_GroupsOfCrops;
    }

    public void setHumusMineralizationCoefficient_2_TypeOfSoil_2_GroupsOfCrops(Collection humusMineralizationCoefficient_2_TypeOfSoil_2_GroupsOfCrops) {
        this.humusMineralizationCoefficient_2_TypeOfSoil_2_GroupsOfCrops = humusMineralizationCoefficient_2_TypeOfSoil_2_GroupsOfCrops;
    }

    public Collection getCorrectiveCoefficients() {
        return correctiveCoefficients;
    }

    public void setCorrectiveCoefficients(Collection correctiveCoefficients) {
        this.correctiveCoefficients = correctiveCoefficients;
    }
}
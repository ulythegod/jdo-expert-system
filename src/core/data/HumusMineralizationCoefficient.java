
package core.data;

import java.util.Collection;
import java.util.HashSet;

public class HumusMineralizationCoefficient {
    private int idHumusMineralizationCoefficient;
    private float cmhValue;
    private float nValue;
    private Collection humusMineralizationCoefficient_2_TypeOfSoil_2_GroupsOfCrops = new HashSet();

    public HumusMineralizationCoefficient() {
    }

    public int getIdHumusMineralizationCoefficient() {
        return idHumusMineralizationCoefficient;
    }

    public void setIdHumusMineralizationCoefficient(int idHumusMineralizationCoefficient) {
        this.idHumusMineralizationCoefficient = idHumusMineralizationCoefficient;
    }

    public float getCmhValue() {
        return cmhValue;
    }

    public void setCmhValue(float cmhValue) {
        this.cmhValue = cmhValue;
    }

    public float getnValue() {
        return nValue;
    }

    public void setnValue(float nValue) {
        this.nValue = nValue;
    }

    public Collection getHumusMineralizationCoefficient_2_TypeOfSoil_2_GroupsOfCrops() {
        return humusMineralizationCoefficient_2_TypeOfSoil_2_GroupsOfCrops;
    }

    public void setHumusMineralizationCoefficient_2_TypeOfSoil_2_GroupsOfCrops(Collection humusMineralizationCoefficient_2_TypeOfSoil_2_GroupsOfCrops) {
        this.humusMineralizationCoefficient_2_TypeOfSoil_2_GroupsOfCrops = humusMineralizationCoefficient_2_TypeOfSoil_2_GroupsOfCrops;
    }
}
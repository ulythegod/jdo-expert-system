package core.data;

import java.util.Collection;
import java.util.HashSet;

public class ChemicalProtectionOfCrops {

    private int chemicalProtectionOfCropsId;
    private String codeChemicalProtectionOfCrops;
    private String descriptionChemicalProtectionOfCrops;
    private Collection costOfChemicalProtectionOfCrops = new HashSet();
    private Collection costOfRawMaterialForChemicalProtection = new HashSet();
	private Collection standartTechnology = new HashSet();
    private Collection chemicalProtectionOfCrops_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_F1_2_F2 = new HashSet();


    public ChemicalProtectionOfCrops() {
    }

    public int getChemicalProtectionOfCropsId() {
        return chemicalProtectionOfCropsId;
    }

    public void setChemicalProtectionOfCropsId(int chemicalProtectionOfCropsId) {
        this.chemicalProtectionOfCropsId = chemicalProtectionOfCropsId;
    }

    public String getCodeChemicalProtectionOfCrops() {
        return codeChemicalProtectionOfCrops;
    }

    public void setCodeChemicalProtectionOfCrops(String codeChemicalProtectionOfCrops) {
        this.codeChemicalProtectionOfCrops = codeChemicalProtectionOfCrops;
    }

    public String getDescriptionChemicalProtectionOfCrops() {
        return descriptionChemicalProtectionOfCrops;
    }

    public void setDescriptionChemicalProtectionOfCrops(String descriptionChemicalProtectionOfCrops) {
        this.descriptionChemicalProtectionOfCrops = descriptionChemicalProtectionOfCrops;
    }

    public Collection getCostOfChemicalProtectionOfCrops() {
        return costOfChemicalProtectionOfCrops;
    }

    public void setCostOfChemicalProtectionOfCrops(Collection costOfChemicalProtectionOfCrops) {
        this.costOfChemicalProtectionOfCrops = costOfChemicalProtectionOfCrops;
    }

    public Collection getCostOfRawMaterialForChemicalProtection() {
        return costOfRawMaterialForChemicalProtection;
    }

    public void setCostOfRawMaterialForChemicalProtection(Collection costOfRawMaterialForChemicalProtection) {
        this.costOfRawMaterialForChemicalProtection = costOfRawMaterialForChemicalProtection;
    }

    public Collection getChemicalProtectionOfCrops_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_F1_2_F2() {
        return chemicalProtectionOfCrops_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_F1_2_F2;
    }

    public void setChemicalProtectionOfCrops_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_F1_2_F2(Collection chemicalProtectionOfCrops_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_F1_2_F2) {
        this.chemicalProtectionOfCrops_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_F1_2_F2 = chemicalProtectionOfCrops_2_TypeOfSoil_2_LevelOfIntensification_2_Crop_2_F1_2_F2;
    }

    public Collection getStandartTechnology() {
        return standartTechnology;
    }

    public void setStandartTechnology(Collection standartTechnology) {
        this.standartTechnology = standartTechnology;
    }
}

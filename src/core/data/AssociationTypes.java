package core.data;

import java.util.Collection;
import java.util.HashSet;

public class AssociationTypes
{
    private int associationTypesId;
    private float area;
    private String code;
    private String dominant;
    private int associationFlag;

    private Collection resultFirstStage= new HashSet();
    private Collection associationtypes_2_TypeOfSoil_2_Agricultures= new HashSet();

    public AssociationTypes() { }

    public float getArea()
    {
        return area;
    }

    public int getAssociationTypesId()
    {
        return associationTypesId;
    }

    public String getCode()
    {
        return code;
    }

    public void setArea(float area)
    {
        this.area = area;
    }

    public void setAssociationTypesId(int associationTypesId)
    {
        this.associationTypesId = associationTypesId;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getDominant()
    {
        return dominant;
    }

    public void setDominant(String dominant)
    {
        this.dominant = dominant;
    }

    public Collection getResultFirstStage() { return resultFirstStage; }

    public void setResultFirstStage(Collection resultFirstStage) { this.resultFirstStage = resultFirstStage; }

    public int getAssociationFlag()
    {
        return associationFlag;
    }

    public void setAssociationFlag(int associationFlag)
    {
        this.associationFlag = associationFlag;
    }

    public Collection getAssociationtypes_2_TypeOfSoil_2_Agricultures() { return associationtypes_2_TypeOfSoil_2_Agricultures; }

    public void setAssociationtypes_2_TypeOfSoil_2_Agricultures(Collection associationtypes_2_TypeOfSoil_2_Agricultures) { this.associationtypes_2_TypeOfSoil_2_Agricultures = associationtypes_2_TypeOfSoil_2_Agricultures; }
}

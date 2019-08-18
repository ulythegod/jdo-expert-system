package core.data;

import java.util.Collection;
import java.util.HashSet;

public class GroupOfTypesOfSoils {

    private int groupOfTypesOfSoilsId;
    private String nameGroupOfTypesOfSoils;
    private Collection typeOfSoil = new HashSet();

    public GroupOfTypesOfSoils() {
    }

    public int getGroupOfTypesOfSoilsId() {
        return groupOfTypesOfSoilsId;
    }

    public void setGroupOfTypesOfSoilsId(int groupOfTypeOfSoilsId) {
        this.groupOfTypesOfSoilsId = groupOfTypeOfSoilsId;
    }

    public String getNameGroupOfTypesOfSoils() {
        return nameGroupOfTypesOfSoils;
    }

    public void setNameGroupOfTypesOfSoils(String nameGroupOfTypesOfSoils) {
        this.nameGroupOfTypesOfSoils = nameGroupOfTypesOfSoils;
    }

    public Collection getTypeOfSoil() {
        return typeOfSoil;
    }

    public void setTypeOfSoil(Collection typeOfSoil) {
        this.typeOfSoil = typeOfSoil;
    }
}

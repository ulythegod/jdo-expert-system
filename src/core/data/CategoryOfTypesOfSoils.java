package core.data;

import java.util.Collection;
import java.util.HashSet;

public class CategoryOfTypesOfSoils {
    private int categoryOfTypesOfSoilsId;
    private String codCategory;
    private String descriptionCategoryOfSoils;
    private String additionalDescriptionCategoryOfSoils;
    private Collection typeOfSoil = new HashSet();

    public CategoryOfTypesOfSoils() {
    }

    public String getAdditionalDescriptionCategoryOfSoils() {
        return additionalDescriptionCategoryOfSoils;
    }

    public void setAdditionalDescriptionCategoryOfSoils(String additionalDescriptionCategoryOfSoils) {
        this.additionalDescriptionCategoryOfSoils = additionalDescriptionCategoryOfSoils;
    }

    public int getCategoryOfTypesOfSoilsId() {
        return categoryOfTypesOfSoilsId;
    }

    public void setCategoryOfSoilsId(int categoryOfTypesSoilsId) {
        this.categoryOfTypesOfSoilsId = categoryOfTypesSoilsId;
    }

    public String getDescriptionCategoryOfSoils() {
        return descriptionCategoryOfSoils;
    }

    public void setDescriptionCategoryOfSoils(String descriptionCategoryOfSoils) {
        this.descriptionCategoryOfSoils = descriptionCategoryOfSoils;
    }

    public Collection getTypeOfSoil() {
        return typeOfSoil;
    }

    public void setTypeOfSoil(Collection typeOfSoil) {
        typeOfSoil = typeOfSoil;
    }


    public String getCodCategory() {
        return codCategory;
    }

    public void setCodCategory(String codCategory) {
        this.codCategory = codCategory;
    }
}

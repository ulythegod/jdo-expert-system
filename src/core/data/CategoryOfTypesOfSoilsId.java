package core.data;

public class CategoryOfTypesOfSoilsId {


    public int categoryOfTypesOfSoilsId;

    public CategoryOfTypesOfSoilsId() {
    }

    public CategoryOfTypesOfSoilsId(String fromString) {
        categoryOfTypesOfSoilsId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(categoryOfTypesOfSoilsId);
    }

    public int hashCode() {
        return categoryOfTypesOfSoilsId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof CategoryOfTypesOfSoilsId))
            return false;
        CategoryOfTypesOfSoilsId other = (CategoryOfTypesOfSoilsId) obj;
        return (categoryOfTypesOfSoilsId == other.categoryOfTypesOfSoilsId);
    }


}

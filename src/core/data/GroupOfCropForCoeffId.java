package core.data;

public class GroupOfCropForCoeffId {

    static Class c = GroupOfCropForCoeff.class;
    public int idGroupOfCropForCoeff;

    public GroupOfCropForCoeffId() {
    }

    public GroupOfCropForCoeffId(String fromString) {
        idGroupOfCropForCoeff = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(idGroupOfCropForCoeff);
    }

    public int hashCode() {
        return idGroupOfCropForCoeff;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof GroupOfCropForCoeffId))
            return false;
        GroupOfCropForCoeffId other = (GroupOfCropForCoeffId) obj;
        return (idGroupOfCropForCoeff == other.idGroupOfCropForCoeff);
    }

}

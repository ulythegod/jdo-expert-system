
package core.data;

public class CorrectiveCoefficients {
    private int idCorrectiveCoefficients;
    private Microelement microelement;
    private GroupOfCropForCoeff groupOfCrop;
    private String sufficiency;
    private float value;

    public CorrectiveCoefficients() {
    }

    public int getIdCorrectiveCoefficients() {
        return idCorrectiveCoefficients;
    }

    public void setIdCorrectiveCoefficients(int idCorrectiveCoefficients) {
        this.idCorrectiveCoefficients = idCorrectiveCoefficients;
    }

    public Microelement getMicroelement() {
        return microelement;
    }

    public void setMicroelement(Microelement microelement) {
        this.microelement = microelement;
    }

    public GroupOfCropForCoeff getGroupOfCrop() {
        return groupOfCrop;
    }

    public void setGroupOfCrop(GroupOfCropForCoeff groupOfCrop) {
        this.groupOfCrop = groupOfCrop;
    }

    public String getSufficiency() {
        return sufficiency;
    }

    public void setSufficiency(String sufficiency) {
        this.sufficiency = sufficiency;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}
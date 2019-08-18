package core.data;

public class RemovalOfMicroelement {

    private int removalOfMicroelementId;
    private Crop crop;
    private Microelement microelement;
    private float value;

    public int getRemovalOfMicroelementId() {
        return removalOfMicroelementId;
    }

    public void setRemovalOfMicroelementId(int removalOfMicroelementId) {
        this.removalOfMicroelementId = removalOfMicroelementId;
    }

    public Crop getCrop() {
        return crop;
    }

    public void setCrop(Crop crop) {
        this.crop = crop;
    }

    public Microelement getMicroelement() {
        return microelement;
    }

    public void setMicroelement(Microelement microelement) {
        this.microelement = microelement;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}

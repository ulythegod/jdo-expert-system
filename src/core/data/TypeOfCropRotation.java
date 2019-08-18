package core.data;

import java.util.Collection;
import java.util.HashSet;

public class TypeOfCropRotation {

    private int typeOfCropRotationId;
    private String nameTypeOfCropRotation;
    private String destinationTypeOfCropRotation;
    private Collection subtypeOfCropRotation = new HashSet();

    public TypeOfCropRotation() {
    }

    public String getDestinationTypeOfCropRotation() {
        return destinationTypeOfCropRotation;
    }

    public void setDestinationTypeOfCropRotation(String destinationTypeOfCropRotation) {
        this.destinationTypeOfCropRotation = destinationTypeOfCropRotation;
    }

    public String getNameTypeOfCropRotation() {
        return nameTypeOfCropRotation;
    }

    public void setNameTypeOfCropRotation(String nameTypeOfCropRotation) {
        this.nameTypeOfCropRotation = nameTypeOfCropRotation;
    }

    public Collection getSubtypeOfCropRotation() {
        return subtypeOfCropRotation;
    }

    public void setSubtypeOfCropRotation(Collection subtypeOfCropRotation) {
        this.subtypeOfCropRotation = subtypeOfCropRotation;
    }

    public int getTypeOfCropRotationId() {
        return typeOfCropRotationId;
    }

    public void setTypeOfCropRotationId(int typeOfCropRotationId) {
        typeOfCropRotationId = typeOfCropRotationId;
    }

}

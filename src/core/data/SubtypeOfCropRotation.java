package core.data;

import java.util.Collection;
import java.util.HashSet;

public class SubtypeOfCropRotation {

    private int subtypeOfCropRotationId;
    private TypeOfCropRotation typeOfCropRotation;
    private String nameSubtypeOfCropRotation;
    private String descriptionSubtypeOfCropRotation;
    private Collection subtypeOfCropRotation_2_ViewOfCropRotation = new HashSet();

    public SubtypeOfCropRotation() {
    }

    public String getDescriptionSubtypeOfCropRotation() {
        return descriptionSubtypeOfCropRotation;
    }

    public void setDescriptionSubtypeOfCropRotation(String descriptionSubtypeOfCropRotation) {
        this.descriptionSubtypeOfCropRotation = descriptionSubtypeOfCropRotation;
    }

    public String getNameSubtypeOfCropRotation() {
        return nameSubtypeOfCropRotation;
    }

    public void setNameSubtypeOfCropRotation(String nameSubtypeOfCropRotation) {
        this.nameSubtypeOfCropRotation = nameSubtypeOfCropRotation;
    }

    public int getSubtypeOfCropRotationsId() {
        return subtypeOfCropRotationId;
    }

    public void setSubtypeOfCropRotationId(int subtypeOfCropRotationId) {
        this.subtypeOfCropRotationId = subtypeOfCropRotationId;
    }

    public TypeOfCropRotation getTypeOfCropRotation() {
        return typeOfCropRotation;
    }

    public void setTypeOfCropRotation(TypeOfCropRotation typeOfCropRotation) {
        this.typeOfCropRotation = typeOfCropRotation;
    }

    public Collection getSubtypeOfCropRotation_2_ViewOfCropRotation() {
        return subtypeOfCropRotation_2_ViewOfCropRotation;
    }

    public void setSubtypeOfCropRotation_2_ViewOfCropRotation(
            Collection subtypeOfCropRotation_2_ViewOfCropRotation) {
        this.subtypeOfCropRotation_2_ViewOfCropRotation = subtypeOfCropRotation_2_ViewOfCropRotation;
    }

}

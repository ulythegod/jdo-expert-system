package core.data;

import java.util.Collection;
import java.util.HashSet;

public class ViewOfCropRotation {

    private int viewOfCropRotationId;
    private String nameViewOfCropRotation;
    private String descriptionViewOfCropRotation;
    private String exampleViewOfCropRotation;
    private String emergenceViewOfCropRotation;
    private String placeOfUseViewOfCropRotation;
    private Collection cropRotation = new HashSet();
    private Collection subtypeOfCropRotation_2_ViewOfCropRotation = new HashSet();

    public ViewOfCropRotation() {
    }


    public Collection getSubtypeOfCropRotation_2_ViewOfCropRotation() {
        return subtypeOfCropRotation_2_ViewOfCropRotation;
    }

    public void setSubtypeOfCropRotation_2_ViewOfCropRotation(
            Collection subtypeOfCropRotation_2_ViewOfCropRotation) {
        this.subtypeOfCropRotation_2_ViewOfCropRotation = subtypeOfCropRotation_2_ViewOfCropRotation;
    }


    public String getDescriptionViewOfCropRotation() {
        return descriptionViewOfCropRotation;
    }

    public void setDescriptionViewOfCropRotation(String descriptionViewOfCropRotation) {
        this.descriptionViewOfCropRotation = descriptionViewOfCropRotation;
    }

    public String getEmergenceViewOfCropRotation() {
        return emergenceViewOfCropRotation;
    }

    public void setEmergenceViewOfCropRotation(String emergenceViewOfCropRotation) {
        this.emergenceViewOfCropRotation = emergenceViewOfCropRotation;
    }

    public String getExampleViewOfCropRotation() {
        return exampleViewOfCropRotation;
    }

    public void setExampleViewOfCropRotation(String exampleViewOfCropRotation) {
        this.exampleViewOfCropRotation = exampleViewOfCropRotation;
    }

    public String getNameViewOfCropRotation() {
        return nameViewOfCropRotation;
    }

    public void setNameViewOfCropRotation(String nameViewOfCropRotation) {
        this.nameViewOfCropRotation = nameViewOfCropRotation;
    }

    public String getPlaceOfUseViewOfCropRotation() {
        return placeOfUseViewOfCropRotation;
    }

    public void setPlaceOfUseViewOfCropRotation(String placeOfUseViewOfCropRotation) {
        this.placeOfUseViewOfCropRotation = placeOfUseViewOfCropRotation;
    }

    public int getViewOfCropRotationId() {
        return viewOfCropRotationId;
    }

    public void setViewOfCropRotationId(int viewOfCropRotationId) {
        viewOfCropRotationId = viewOfCropRotationId;
    }

    public Collection getCropRotation() {
        return cropRotation;
    }

    public void setCropRotation(Collection cropRotation) {
        this.cropRotation = cropRotation;
    }
}

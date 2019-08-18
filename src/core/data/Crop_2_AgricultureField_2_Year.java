package core.data;


public class Crop_2_AgricultureField_2_Year {
    private int crop_2_AgricultureField_2_YearId;
    private Crop crop;
    private transient AgricultureField agricultureField;
    private int year;

    public Crop_2_AgricultureField_2_Year() {
    }

    public int getCrop_2_AgricultureField_2_YearId() {
        return crop_2_AgricultureField_2_YearId;
    }

    public void setCrop_2_AgricultureField_2_YearId(int crop_2_AgricultureField_2_YearId) {
        this.crop_2_AgricultureField_2_YearId = crop_2_AgricultureField_2_YearId;
    }

    public Crop getCrop() {
        return crop;
    }

    public void setCrop(Crop crop) {
        this.crop = crop;
    }

    public AgricultureField getAgricultureField() {
        return agricultureField;
    }

    public void setAgricultureField(AgricultureField agricultureField) {
        this.agricultureField = agricultureField;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

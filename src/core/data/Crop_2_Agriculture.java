package core.data;

/**
 * Author: Skosyreva Maria
 * Date: 24.05.2016
 * Time: 19:15
 */
public class Crop_2_Agriculture {
    private int crop_2_AgricultureId;
    private Crop crop;
    private Agricultures agriculture;
    private String color;
    private String pattern;

    public Crop_2_Agriculture() {
    }

    public int getCrop_2_AgricultureId() {
        return crop_2_AgricultureId;
    }

    public void setCrop_2_AgricultureId(int crop_2_AgricultureId) {
        this.crop_2_AgricultureId = crop_2_AgricultureId;
    }

    public Crop getCrop() {
        return crop;
    }

    public void setCrop(Crop crop) {
        this.crop = crop;
    }

    public Agricultures getAgriculture() {
        return agriculture;
    }

    public void setAgriculture(Agricultures agriculture) {
        this.agriculture = agriculture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}

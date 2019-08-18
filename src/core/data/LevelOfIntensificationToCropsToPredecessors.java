package core.data;

/**
 * Author: Skosyreva Maria
 * Date: 05.04.2016
 * Time: 19:21
 */
public class LevelOfIntensificationToCropsToPredecessors {
    private int levelOfIntensificationToCropsToPredecessorsId;
    private Crop crop;
    private Predecessor predecessor;
    private LevelOfIntensification levelOfIntensification;
    private float factor;

    public LevelOfIntensificationToCropsToPredecessors() {
    }

    public int getLevelOfIntensificationToCropsToPredecessorsId() {
        return levelOfIntensificationToCropsToPredecessorsId;
    }

    public void setLevelOfIntensificationToCropsToPredecessorsId(int levelOfIntensificationToCropsToPredecessorsId) {
        this.levelOfIntensificationToCropsToPredecessorsId = levelOfIntensificationToCropsToPredecessorsId;
    }

    public Crop getCrop() {
        return crop;
    }

    public void setCrop(Crop crop) {
        this.crop = crop;
    }

    public Predecessor getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Predecessor predecessor) {
        this.predecessor = predecessor;
    }

    public LevelOfIntensification getLevelOfIntensification() {
        return levelOfIntensification;
    }

    public void setLevelOfIntensification(LevelOfIntensification levelOfIntensification) {
        this.levelOfIntensification = levelOfIntensification;
    }

    public float getFactor() {
        return factor;
    }

    public void setFactor(float factor) {
        this.factor = factor;
    }
}

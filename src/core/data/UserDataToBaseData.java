
package core.data;

public class UserDataToBaseData {
    private int id;
    private Agricultures agriculture;
    private MetaData metaData;
    private boolean isBD;
    private boolean isUD;

    public UserDataToBaseData() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Agricultures getAgriculture() {
        return agriculture;
    }

    public void setAgriculture(Agricultures agriculture) {
        this.agriculture = agriculture;
    }

    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    public boolean isBD() {
        return isBD;
    }

    public void setBD(boolean BD) {
        isBD = BD;
    }

    public boolean isUD() {
        return isUD;
    }

    public void setUD(boolean UD) {
        isUD = UD;
    }
}
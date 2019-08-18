package core.data;


/**
 * Author: Skosyreva Maria
 * Date: 12.12.2017
 * Time: 7:28
 */
public class LandBase_2_AgricultureField {
    private int landBase_2_AgricultureFieldId;
    private LandBase landBase;
    private AgricultureField agricultureField;

    public LandBase_2_AgricultureField() {
    }

    public LandBase_2_AgricultureField(LandBase landBase, AgricultureField agricultureField) {
        this.landBase = landBase;
        this.agricultureField = agricultureField;
    }

    public int getLandBase_2_AgricultureFieldId() {
        return landBase_2_AgricultureFieldId;
    }

    public void setLandBase_2_AgricultureFieldId(int landBase_2_AgricultureFieldId) {
        this.landBase_2_AgricultureFieldId = landBase_2_AgricultureFieldId;
    }

    public LandBase getLandBase() {
        return landBase;
    }

    public void setLandBase(LandBase landBase) {
        this.landBase = landBase;
    }

    public AgricultureField getAgricultureField() {
        return agricultureField;
    }

    public void setAgricultureField(AgricultureField agricultureField) {
        this.agricultureField = agricultureField;
    }
}

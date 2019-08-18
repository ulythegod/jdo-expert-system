package core.data;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 * User: ноут
 * Date: 05.06.14
 * Time: 18:02
 * To change this template use File | Settings | File Templates.
 */
public class Point {
    private int pointId;
    private int number;
    private float latitude;
    private float longitude;
    private transient AgricultureField field;
    private Collection point_2_Microelement_2_Method = new HashSet();

    public Point() {
    }

    public int getPointId() {
        return pointId;
    }

    public void setPointId(int pointId) {
        this.pointId = pointId;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public AgricultureField getField() {
        return field;
    }

    public void setField(AgricultureField field) {
        this.field = field;
    }

    public Collection getPoint_2_Microelement_2_Method() {
        return point_2_Microelement_2_Method;
    }

    public void setPoint_2_Microelement_2_Method(Collection point_2_Microelement_2_Method) {
        this.point_2_Microelement_2_Method = point_2_Microelement_2_Method;
    }
}

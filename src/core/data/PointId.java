package core.data;

/**
 * Created with IntelliJ IDEA.
 * User: ноут
 * Date: 05.06.14
 * Time: 18:03
 * To change this template use File | Settings | File Templates.
 */
public class PointId {
    public int pointId;

    public PointId() {
    }

    public PointId(String fromString) {
        pointId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(pointId);
    }

    public int hashCode() {
        return pointId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointId))
            return false;
        PointId other = (PointId) obj;
        return (pointId == other.pointId);
    }

}


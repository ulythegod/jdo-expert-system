package core.data;

/**
 * Created with IntelliJ IDEA.
 * User: ноут
 * Date: 05.06.14
 * Time: 18:03
 * To change this template use File | Settings | File Templates.
 */
public class Point_2_Microelement_2_MethodId {
    public int id;

    public Point_2_Microelement_2_MethodId() {
    }

    public Point_2_Microelement_2_MethodId(String fromString) {
        id = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(id);
    }

    public int hashCode() {
        return id;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Point_2_Microelement_2_MethodId))
            return false;
        Point_2_Microelement_2_MethodId other = (Point_2_Microelement_2_MethodId) obj;
        return (id == other.id);
    }

}


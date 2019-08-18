package core.data;

import java.util.Collection;
import java.util.HashSet;

public class Method {

    private int idMethod;
    private String name;
    private Collection gropsMicroelement = new HashSet();
    private Collection point_2_Microelement_2_Method = new HashSet();

    public Method(){
    }

    public int getIdMethod() {
        return idMethod;
    }

    public void setIdMethod(int idMethod) {
        this.idMethod = idMethod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection getGropsMicroelement() {
        return gropsMicroelement;
    }

    public void setGropsMicroelement(Collection gropsMicroelement) {
        this.gropsMicroelement = gropsMicroelement;
    }

    public Collection getPoint_2_Microelement_2_Method() {
        return point_2_Microelement_2_Method;
    }

    public void setPoint_2_Microelement_2_Method(Collection point_2_Microelement_2_Method) {
        this.point_2_Microelement_2_Method = point_2_Microelement_2_Method;
    }
}

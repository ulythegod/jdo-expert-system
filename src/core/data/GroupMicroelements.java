package core.data;

public class GroupMicroelements {

    private int idGroup;
    private String name;
    private String beginRange;
    private String endRange;
    private String standartColor;
    private Method method;
    private Microelement microelement;

    public GroupMicroelements(){
    }

    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeginRange() {
        return beginRange;
    }

    public void setBeginRange(String beginRange) {
        this.beginRange = beginRange;
    }

    public String getEndRange() {
        return endRange;
    }

    public void setEndRange(String endRange) {
        this.endRange = endRange;
    }

    public String getStandartColor() {
        return standartColor;
    }

    public void setStandartColor(String standartColor) {
        this.standartColor = standartColor;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public Microelement getMicroelement() {
        return microelement;
    }

    public void setMicroelement(Microelement microelement) {
        this.microelement = microelement;
    }
}

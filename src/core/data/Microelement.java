package core.data;

import java.util.Collection;
import java.util.HashSet;

public class Microelement {

    private int microelementId;
    private String microelementName;
    private Collection applicationOfFertilizers_2_microelement = new HashSet();
    private Collection removalOfMicroelement = new HashSet();
    private Collection coefficientOfUsingMicroelementFromFert = new HashSet();
    private Collection coefficientOfUsingMicroelementFromSoil = new HashSet();
    private Collection correctiveCoefficients = new HashSet();
    private Collection gropsMicroelement = new HashSet();
    private Collection point_2_Microelement_2_Method = new HashSet();

    public Microelement(){
    }

    public Microelement(int microelementId, String microelementName){
        this.microelementId = microelementId;
        this.microelementName = microelementName;
    }

    public int getMicroelementId() {
        return microelementId;
    }

    public void setMicroelementId(int microelementId) {
        this.microelementId = microelementId;
    }

    public String getMicroelementName() {
        return microelementName;
    }

    public void setMicroelementName(String microelementName) {
        this.microelementName = microelementName;
    }

    public Collection getApplicationOfFertilizers_2_microelement() {
        return applicationOfFertilizers_2_microelement;
    }

    public void setApplicationOfFertilizers_2_microelement(Collection applicationOfFertilizers_2_microelement) {
        this.applicationOfFertilizers_2_microelement = applicationOfFertilizers_2_microelement;
    }

    public Collection getRemovalOfMicroelement() {
        return removalOfMicroelement;
    }

    public void setRemovalOfMicroelement(Collection removalOfMicroelement) {
        this.removalOfMicroelement = removalOfMicroelement;
    }

    public Collection getCoefficientOfUsingMicroelementFromFert() {
        return coefficientOfUsingMicroelementFromFert;
    }

    public void setCoefficientOfUsingMicroelementFromFert(Collection coefficientOfUsingMicroelementFromFert) {
        this.coefficientOfUsingMicroelementFromFert = coefficientOfUsingMicroelementFromFert;
    }

    public Collection getCoefficientOfUsingMicroelementFromSoil() {
        return coefficientOfUsingMicroelementFromSoil;
    }

    public void setCoefficientOfUsingMicroelementFromSoil(Collection coefficientOfUsingMicroelementFromSoil) {
        this.coefficientOfUsingMicroelementFromSoil = coefficientOfUsingMicroelementFromSoil;
    }

    public Collection getCorrectiveCoefficients() {
        return correctiveCoefficients;
    }

    public void setCorrectiveCoefficients(Collection correctiveCoefficients) {
        this.correctiveCoefficients = correctiveCoefficients;
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

package core.data;

import java.util.Collection;
import java.util.HashSet;

public class ApplicationOfFertilizers_2_Microelements_2_ResultsFertilizers {

    private int applicationOfFertilizers_2_Microelements_2_ResultsFertilizersId;
    private ResultsFertilizers resultsFertilizers;
    private ApplicationOfFertilizers_2_Microelement applicationOfFertilizers_2_microelements;
    private String date;
    private Collection correctionResult = new HashSet();

    public ApplicationOfFertilizers_2_Microelements_2_ResultsFertilizers(){}

    public int getApplicationOfFertilizers_2_Microelements_2_ResultsFertilizersId() {
        return applicationOfFertilizers_2_Microelements_2_ResultsFertilizersId;
    }

    public void setApplicationOfFertilizers_2_Microelements_2_ResultsFertilizersId(int applicationOfFertilizers_2_Microelements_2_ResultsFertilizersId) {
        this.applicationOfFertilizers_2_Microelements_2_ResultsFertilizersId = applicationOfFertilizers_2_Microelements_2_ResultsFertilizersId;
    }

    public ResultsFertilizers getResultsFertilizers() {
        return resultsFertilizers;
    }

    public void setResultsFertilizers(ResultsFertilizers resultsFertilizers) {
        this.resultsFertilizers = resultsFertilizers;
    }

    public ApplicationOfFertilizers_2_Microelement getApplicationOfFertilizers_2_microelements() {
        return applicationOfFertilizers_2_microelements;
    }

    public void setApplicationOfFertilizers_2_microelements(ApplicationOfFertilizers_2_Microelement applicationOfFertilizers_2_microelements) {
        this.applicationOfFertilizers_2_microelements = applicationOfFertilizers_2_microelements;
    }

    public Collection getCorrectionResult() {
        return correctionResult;
    }

    public void setCorrectionResult(Collection correctionResult) {
        this.correctionResult = correctionResult;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

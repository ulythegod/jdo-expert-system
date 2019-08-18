package core.data;

import java.util.Collection;
import java.util.HashSet;

public class CorrectionResult {

    private int correctionResultId;
    private ApplicationOfFertilizers_2_Microelements_2_ResultsFertilizers application_of_fertilizers_2_microel_2_res_fert;
    private String date;
    private boolean temperature;
    private boolean humid;
    private Collection months = new HashSet();

    public int getCorrectionResultId() {
        return correctionResultId;
    }

    public void setCorrectionResultId(int correctionResultId) {
        this.correctionResultId = correctionResultId;
    }

    public ApplicationOfFertilizers_2_Microelements_2_ResultsFertilizers getApplication_of_fertilizers_2_microel_2_res_fert() {
        return application_of_fertilizers_2_microel_2_res_fert;
    }

    public void setApplication_of_fertilizers_2_microel_2_res_fert(ApplicationOfFertilizers_2_Microelements_2_ResultsFertilizers application_of_fertilizers_2_microel_2_res_fert) {
        this.application_of_fertilizers_2_microel_2_res_fert = application_of_fertilizers_2_microel_2_res_fert;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isTemperature() {
        return temperature;
    }

    public void setTemperature(boolean temperature) {
        this.temperature = temperature;
    }

    public boolean isHumid() {
        return humid;
    }

    public void setHumid(boolean humid) {
        this.humid = humid;
    }

    public Collection getMonths() {
        return months;
    }

    public void setMonths(Collection months) {
        this.months = months;
    }
}

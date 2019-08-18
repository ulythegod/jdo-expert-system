package core.data;

/**
 * Author: Skosyreva Maria
 * Date: 19.11.2017
 * Time: 8:32
 */
public class AgrochemicalSoilSurvey {
    private int agrochemicalSoilSurveyId;
    private String date;
    private LandBase landBase;

    public AgrochemicalSoilSurvey() {
    }

    public int getAgrochemicalSoilSurveyId() {
        return agrochemicalSoilSurveyId;
    }

    public void setAgrochemicalSoilSurveyId(int agrochemicalSoilSurveyId) {
        this.agrochemicalSoilSurveyId = agrochemicalSoilSurveyId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public LandBase getLandBase() {
        return landBase;
    }

    public void setLandBase(LandBase landBase) {
        this.landBase = landBase;
    }
}

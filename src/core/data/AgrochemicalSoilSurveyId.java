package core.data;

public class AgrochemicalSoilSurveyId {

    static Class c = AgrochemicalSoilSurvey.class;
    public int agrochemicalSoilSurveyId;

    public AgrochemicalSoilSurveyId() {
    }

    public AgrochemicalSoilSurveyId(String fromString) {
        agrochemicalSoilSurveyId = Integer.parseInt(fromString);
    }

    public String toString() {
        return String.valueOf(agrochemicalSoilSurveyId);
    }

    public int hashCode() {
        return agrochemicalSoilSurveyId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof AgrochemicalSoilSurveyId))
            return false;
        AgrochemicalSoilSurveyId other = (AgrochemicalSoilSurveyId) obj;
        return (agrochemicalSoilSurveyId == other.agrochemicalSoilSurveyId);
    }

}

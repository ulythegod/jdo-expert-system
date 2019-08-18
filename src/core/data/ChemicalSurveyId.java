package core.data;

public class ChemicalSurveyId {
  static Class c = ChemicalSurvey.class;
  public int chemicalSurveyId;

  public ChemicalSurveyId() {
  }

  public ChemicalSurveyId(String fromString) {
    chemicalSurveyId = Integer.parseInt(fromString);
  }

  public String toString() {
    return String.valueOf(chemicalSurveyId);
  }

  public int hashCode() {
    return chemicalSurveyId;
  }

  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj instanceof ChemicalSurveyId) {
      ChemicalSurveyId other = (ChemicalSurveyId) obj;
      return chemicalSurveyId == other.chemicalSurveyId;
    }
    return false;
  }
}

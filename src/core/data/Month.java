package core.data;

import java.util.Collection;
import java.util.HashSet;

public class Month {

    private int monthId;
    private String nameMonth;
    private Collection correctionResult = new HashSet();

    public int getMonthId() {
        return monthId;
    }

    public void setMonthId(int monthId) {
        this.monthId = monthId;
    }

    public String getNameMonth() {
        return nameMonth;
    }

    public void setNameMonth(String nameMonth) {
        this.nameMonth = nameMonth;
    }

    public Collection getResultsCorrections() {
        return correctionResult;
    }

    public void setResultsCorrections(Collection resultsCorrections) {
        this.correctionResult = resultsCorrections;
    }
}

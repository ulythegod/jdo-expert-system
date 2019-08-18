package core.data;

import java.util.Collection;
import java.util.HashSet;

/**
 * Author: Skosyreva Maria
 * Date: 21.01.2017
 * Time: 16:26
 */
public class Season {
    private int seasonId;
    private int yearStart;
    private int yearEnd;
    private Collection coefficientsInflation = new HashSet();

    public Season() {
    }

    public Season(int yearStart, int yearEnd) {
        this.seasonId = seasonId;
        this.yearStart = yearStart;
        this.yearEnd = yearEnd;
    }

    public int getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(int seasonId) {
        this.seasonId = seasonId;
    }

    public int getYearStart() {
        return yearStart;
    }

    public void setYearStart(int yearStart) {
        this.yearStart = yearStart;
    }

    public int getYearEnd() {
        return yearEnd;
    }

    public void setYearEnd(int yearEnd) {
        this.yearEnd = yearEnd;
    }

    public Collection getCoefficientsInflation() {
        return coefficientsInflation;
    }

    public void setCoefficientsInflation(Collection coefficientsInflation) {
        this.coefficientsInflation = coefficientsInflation;
    }
}

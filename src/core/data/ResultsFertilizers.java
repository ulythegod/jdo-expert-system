package core.data;

import java.util.*;
import core.data.*;

public class ResultsFertilizers {

    private int resultsFertilizersId;
    /*исходные данные для решения*/
    private String date;
    private String resultsFertilizersName;
    private ResultMode1 resultMode1;
    private AgricultureField agricultureField;
    private Crop crop;
    private Predecessor pred;
    private ApplicationOfFertilizers systFert;
    private float palnningYield;
    private float predDoze;
    private float predYeild;
    private float average_h;
    private float average_p;
    private float average_ph;
    private float removal_n;
    private float removal_p;
    private float removal_ph;
    private String yearOfUsing;
    private float coeffFromFertN;
    private float coeffFromFertP;
    private float coeffFromFertPh;
    private float coeffFromSoilN;
    private float coeffFromSoilP;
    private float coeffFromSoilPh;
    /*ирасчетные данные для решения*/
    private float takeaway_N;
    private float takeaway_P;
    private float takeaway_Ph;
    private float m;
    private float ph_Content;
    private float p_Content;
    private float value_humus;
    private float value_of_nitrogen_in_humus;
    private float value_forms_of_nitrogen;
    private float number_digestible_N;
    private float number_digestible_P;
    private float number_digestible_Ph;
    private float real_possible_harvest_N;
    private float real_possible_harvest_P;
    private float real_possible_harvest_Ph;
    private float absorption;
    private float accumulated_balance;
    private float accumulated_balance_in_soil;
    private float common_amount_of_digestible_N;
    private float common_amount_of_digestible_Ph;
    private float common_amount_of_digestible_P;
    private float accumulated_balance_in_leavings;
    private float need_in_N;
    private float need_in_Ph;
    private float need_in_P;
    private float additional_N;
    private float additional_P;
    private float additional_Ph;
    private String coeff1_requirement;
    private String coeff2_requirement;
    private String coeff3_requirement;
    private boolean isAgrSyst;
    private Collection<ApplicationOfFertilizers_2_Microelements_2_ResultsFertilizers> applicationOfFertilizers_2_microelements_2_resultsFertilizers = new HashSet();

    public ResultsFertilizers(){}

    public int getResultsFertilizersId() {
        return resultsFertilizersId;
    }

    public void setResultsFertilizersId(int resultsFertilizersId) {
        this.resultsFertilizersId = resultsFertilizersId;
    }

    public String getResultsFertilizersName() {
        return resultsFertilizersName;
    }

    public void setResultsFertilizersName(String resultsFertilizersName) {
        this.resultsFertilizersName = resultsFertilizersName;
    }

    public ResultMode1 getResultMode1() {
        return resultMode1;
    }

    public void setResultMode1(ResultMode1 resultMode1) {
        this.resultMode1 = resultMode1;
    }

    public AgricultureField getAgricultureField() {
        return agricultureField;
    }

    public void setAgricultureField(AgricultureField agricultureField) {
        this.agricultureField = agricultureField;
    }

    public ApplicationOfFertilizers getSystFert() {
        return systFert;
    }

    public void setSystFert(ApplicationOfFertilizers systFert) {
        this.systFert = systFert;
    }

    public Crop getCrop() {
        return crop;
    }

    public void setCrop(Crop crop) {
        this.crop = crop;
    }

    public Predecessor getPred() {
        return pred;
    }

    public void setPred(Predecessor pred) {
        this.pred = pred;
    }


    public float getPalnningYield() {
        return palnningYield;
    }

    public void setPalnningYield(float palnningYield) {
        this.palnningYield = palnningYield;
    }

    public float getPredDoze() {
        return predDoze;
    }

    public void setPredDoze(float predDoze) {
        this.predDoze = predDoze;
    }

    public float getPredYeild() {
        return predYeild;
    }

    public void setPredYeild(float predYeild) {
        this.predYeild = predYeild;
    }

    public float getAverage_h() {
        return average_h;
    }

    public void setAverage_h(float average_h) {
        this.average_h = average_h;
    }

    public float getAverage_p() {
        return average_p;
    }

    public void setAverage_p(float average_p) {
        this.average_p = average_p;
    }

    public float getAverage_ph() {
        return average_ph;
    }

    public void setAverage_ph(float average_ph) {
        this.average_ph = average_ph;
    }

    public float getRemoval_n() {
        return removal_n;
    }

    public void setRemoval_n(float removal_n) {
        this.removal_n = removal_n;
    }

    public float getRemoval_p() {
        return removal_p;
    }

    public void setRemoval_p(float removal_p) {
        this.removal_p = removal_p;
    }

    public float getRemoval_ph() {
        return removal_ph;
    }

    public void setRemoval_ph(float removal_ph) {
        this.removal_ph = removal_ph;
    }

    public void setYearOfUsing(String yearOfUsing) {
        this.yearOfUsing = yearOfUsing;
    }

    public String getYearOfUsing() {
        return yearOfUsing;
    }

    public float getCoeffFromFertN() {
        return coeffFromFertN;
    }

    public void setCoeffFromFertN(float coeffFromFertN) {
        this.coeffFromFertN = coeffFromFertN;
    }

    public float getCoeffFromFertP() {
        return coeffFromFertP;
    }

    public void setCoeffFromFertP(float coeffFromFertP) {
        this.coeffFromFertP = coeffFromFertP;
    }

    public float getCoeffFromFertPh() {
        return coeffFromFertPh;
    }

    public void setCoeffFromFertPh(float coeffFromFertPh) {
        this.coeffFromFertPh = coeffFromFertPh;
    }

    public float getCoeffFromSoilN() {
        return coeffFromSoilN;
    }

    public void setCoeffFromSoilN(float coeffFromSoilN) {
        this.coeffFromSoilN = coeffFromSoilN;
    }

    public float getCoeffFromSoilP() {
        return coeffFromSoilP;
    }

    public void setCoeffFromSoilP(float coeffFromSoilP) {
        this.coeffFromSoilP = coeffFromSoilP;
    }

    public float getCoeffFromSoilPh() {
        return coeffFromSoilPh;
    }

    public void setCoeffFromSoilPh(float coeffFromSoilPh) {
        this.coeffFromSoilPh = coeffFromSoilPh;
    }

    public Collection<ApplicationOfFertilizers_2_Microelements_2_ResultsFertilizers> getApplicationOfFertilizers_2_microelements_2_resultsFertilizers() {
        return applicationOfFertilizers_2_microelements_2_resultsFertilizers;
    }

    public void setApplicationOfFertilizers_2_microelements_2_resultsFertilizers(Collection<ApplicationOfFertilizers_2_Microelements_2_ResultsFertilizers> applicationOfFertilizers_2_microelements_2_resultsFertilizers) {
        this.applicationOfFertilizers_2_microelements_2_resultsFertilizers = applicationOfFertilizers_2_microelements_2_resultsFertilizers;
    }

    public float getTakeaway_N() {
        return takeaway_N;
    }

    public void setTakeaway_N(float takeaway_N) {
        this.takeaway_N = takeaway_N;
    }

    public float getTakeaway_P() {
        return takeaway_P;
    }

    public void setTakeaway_P(float takeaway_P) {
        this.takeaway_P = takeaway_P;
    }

    public float getTakeaway_Ph() {
        return takeaway_Ph;
    }

    public void setTakeaway_Ph(float takeaway_Ph) {
        this.takeaway_Ph = takeaway_Ph;
    }

    public float getAbsorption() {
        return absorption;
    }

    public void setAbsorption(float absorption) {
        this.absorption = absorption;
    }

    public float getAccumulated_balance() {
        return accumulated_balance;
    }

    public void setAccumulated_balance(float accumulated_balance) {
        this.accumulated_balance = accumulated_balance;
    }

    public float getM() {
        return m;
    }

    public void setM(float m) {
        this.m = m;
    }

    public float getAccumulated_balance_in_leavings() {
        return accumulated_balance_in_leavings;
    }

    public void setAccumulated_balance_in_leavings(float accumulated_balance_in_leavings) {
        this.accumulated_balance_in_leavings = accumulated_balance_in_leavings;
    }

    public float getAccumulated_balance_in_soil() {
        return accumulated_balance_in_soil;
    }

    public void setAccumulated_balance_in_soil(float accumulated_balance_in_soil) {
        this.accumulated_balance_in_soil = accumulated_balance_in_soil;
    }

    public float getAdditional_N() {
        return additional_N;
    }

    public void setAdditional_N(float additional_N) {
        this.additional_N = additional_N;
    }

    public float getAdditional_P() {
        return additional_P;
    }

    public void setAdditional_P(float additional_P) {
        this.additional_P = additional_P;
    }

    public float getAdditional_Ph() {
        return additional_Ph;
    }

    public void setAdditional_Ph(float additional_Ph) {
        this.additional_Ph = additional_Ph;
    }

    public float getCommon_amount_of_digestible_N() {
        return common_amount_of_digestible_N;
    }

    public void setCommon_amount_of_digestible_N(float common_amount_of_digestible_N) {
        this.common_amount_of_digestible_N = common_amount_of_digestible_N;
    }

    public float getCommon_amount_of_digestible_P() {
        return common_amount_of_digestible_P;
    }

    public void setCommon_amount_of_digestible_P(float common_amount_of_digestible_P) {
        this.common_amount_of_digestible_P = common_amount_of_digestible_P;
    }

    public float getCommon_amount_of_digestible_Ph() {
        return common_amount_of_digestible_Ph;
    }

    public void setCommon_amount_of_digestible_Ph(float common_amount_of_digestible_Ph) {
        this.common_amount_of_digestible_Ph = common_amount_of_digestible_Ph;
    }

    public float getNeed_in_N() {
        return need_in_N;
    }

    public void setNeed_in_N(float need_in_N) {
        this.need_in_N = need_in_N;
    }

    public float getNeed_in_P() {
        return need_in_P;
    }

    public void setNeed_in_P(float need_in_P) {
        this.need_in_P = need_in_P;
    }

    public float getNeed_in_Ph() {
        return need_in_Ph;
    }

    public void setNeed_in_Ph(float need_in_Ph) {
        this.need_in_Ph = need_in_Ph;
    }

    public float getNumber_digestible_N() {
        return number_digestible_N;
    }

    public void setNumber_digestible_N(float number_digestible_N) {
        this.number_digestible_N = number_digestible_N;
    }

    public float getNumber_digestible_P() {
        return number_digestible_P;
    }

    public void setNumber_digestible_P(float number_digestible_P) {
        this.number_digestible_P = number_digestible_P;
    }

    public float getNumber_digestible_Ph() {
        return number_digestible_Ph;
    }

    public void setNumber_digestible_Ph(float number_digestible_Ph) {
        this.number_digestible_Ph = number_digestible_Ph;
    }

    public float getP_Content() {
        return p_Content;
    }

    public void setP_Content(float p_Content) {
        this.p_Content = p_Content;
    }

    public float getPh_Content() {
        return ph_Content;
    }

    public void setPh_Content(float ph_Content) {
        this.ph_Content = ph_Content;
    }

    public float getReal_possible_harvest_N() {
        return real_possible_harvest_N;
    }

    public void setReal_possible_harvest_N(float real_possible_harvest_N) {
        this.real_possible_harvest_N = real_possible_harvest_N;
    }

    public float getReal_possible_harvest_P() {
        return real_possible_harvest_P;
    }

    public void setReal_possible_harvest_P(float real_possible_harvest_P) {
        this.real_possible_harvest_P = real_possible_harvest_P;
    }

    public float getReal_possible_harvest_Ph() {
        return real_possible_harvest_Ph;
    }

    public void setReal_possible_harvest_Ph(float real_possible_harvest_Ph) {
        this.real_possible_harvest_Ph = real_possible_harvest_Ph;
    }

    public float getValue_forms_of_nitrogen() {
        return value_forms_of_nitrogen;
    }

    public void setValue_forms_of_nitrogen(float value_forms_of_nitrogen) {
        this.value_forms_of_nitrogen = value_forms_of_nitrogen;
    }

    public float getValue_humus() {
        return value_humus;
    }

    public void setValue_humus(float value_humus) {
        this.value_humus = value_humus;
    }

    public float getValue_of_nitrogen_in_humus() {
        return value_of_nitrogen_in_humus;
    }

    public void setValue_of_nitrogen_in_humus(float value_of_nitrogen_in_humus) {
        this.value_of_nitrogen_in_humus = value_of_nitrogen_in_humus;
    }

    public String getCoeff1_requirement() {
        return coeff1_requirement;
    }

    public void setCoeff1_requirement(String coeff1_requirement) {
        this.coeff1_requirement = coeff1_requirement;
    }

    public String getCoeff2_requirement() {
        return coeff2_requirement;
    }

    public void setCoeff2_requirement(String coeff2_requirement) {
        this.coeff2_requirement = coeff2_requirement;
    }

    public String getCoeff3_requirement() {
        return coeff3_requirement;
    }

    public void setCoeff3_requirement(String coeff3_requirement) {
        this.coeff3_requirement = coeff3_requirement;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isAgrSyst() {
        return isAgrSyst;
    }

    public void setAgrSyst(boolean systFert) {
        isAgrSyst = systFert;
    }
}

package core.data;

public class ApplicationOfFertilizers_2_Microelements_2_ResultsFertilizersId {

    public int applicationOfFertilizers_2_Microelements_2_ResultsFertilizersId;

    public ApplicationOfFertilizers_2_Microelements_2_ResultsFertilizersId(){}

    public ApplicationOfFertilizers_2_Microelements_2_ResultsFertilizersId(String from){

        applicationOfFertilizers_2_Microelements_2_ResultsFertilizersId = Integer.parseInt(from);
    }

    public String toString() {
        return String.valueOf(applicationOfFertilizers_2_Microelements_2_ResultsFertilizersId);
    }

    public int hashCode() {
        return applicationOfFertilizers_2_Microelements_2_ResultsFertilizersId;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof ApplicationOfFertilizers_2_Microelements_2_ResultsFertilizersId))
            return false;
        ApplicationOfFertilizers_2_Microelements_2_ResultsFertilizersId other = (ApplicationOfFertilizers_2_Microelements_2_ResultsFertilizersId) obj;
        return (applicationOfFertilizers_2_Microelements_2_ResultsFertilizersId == other.applicationOfFertilizers_2_Microelements_2_ResultsFertilizersId);
    }
}

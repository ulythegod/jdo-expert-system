package core.data;

public class Associationtypes_2_TypeOfSoil_2_Agricultures {
    private int id;
    private AssociationTypes associationType;
    private TypeOfSoil soil;
    private Agricultures agriculture;

    public Associationtypes_2_TypeOfSoil_2_Agricultures() {
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public AssociationTypes getAssociationType() { return associationType; }

    public void settAssociationType(AssociationTypes type) { this.associationType = type; }

    public TypeOfSoil getSoil() { return soil; }

    public void setSoil(TypeOfSoil soil) { this.soil = soil; }

    public Agricultures getAgricultures() { return agriculture; }

    public void setAgricultures(Agricultures agriculture) { this.agriculture = agriculture; }
}

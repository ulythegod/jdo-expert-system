package core.data;

public class AssociationTypesId
{
  static Class c = AssociationTypes.class;
  public int associationTypesId;
  public AssociationTypesId()
  {
  }
  public AssociationTypesId (String fromString)
  {
    associationTypesId = Integer.parseInt(fromString);
  }

  public String toString()
  {
    return String.valueOf(associationTypesId);
  }
  public int hashCode()
  {
    return associationTypesId;
  }

  public boolean equals(Object obj)
  {
    if(this == obj)
    {
      return true;
    }
    if(!(obj instanceof AssociationTypesId))
     return false;
    AssociationTypesId other = (AssociationTypesId) obj;
    return (associationTypesId == other.associationTypesId);
  }

}

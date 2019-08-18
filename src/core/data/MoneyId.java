package core.data;

public class MoneyId
{
  static Class c = Money.class;
  public int moneyId;
  public MoneyId()
  {
  }
  public MoneyId (String fromString)
  {
     moneyId = Integer.parseInt(fromString);
  }

  public String toString()
  {
    return String.valueOf(moneyId);
  }
  public int hashCode()
  {
     return moneyId;
  }

  public boolean equals(Object obj)
  {
   if(this == obj)
   {
      return true;
   }
     if(!(obj instanceof MoneyId))
       return false;
     MoneyId other = (MoneyId) obj;
     return (moneyId == other.moneyId);
  }

}

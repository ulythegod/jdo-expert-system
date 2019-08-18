package core.data;

public class SolutionStateId
{
    static Class c = SolutionState.class;
    public int stateId;
    public SolutionStateId() { }
    public SolutionStateId(String fromString)
    {
        stateId = Integer.parseInt(fromString);
    }

    public String toString()
    {
      return String.valueOf(stateId);
    }
    public int hashCode()
    {
       return stateId;
    }

    public boolean equals(Object obj)
    {
     if(this == obj)
     {
        return true;
     }
       if(!(obj instanceof SolutionStateId))
         return false;
       SolutionStateId other = (SolutionStateId) obj;
       return (stateId == other.stateId);
    }

  }

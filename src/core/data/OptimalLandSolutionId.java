package core.data;

public class OptimalLandSolutionId
{
    static Class c = OptimalLandSolution.class;
    public int id;
    public OptimalLandSolutionId()
    {
    }
    public OptimalLandSolutionId(String fromString)
    {
        id = Integer.parseInt(fromString);
    }

    public String toString()
    {
      return String.valueOf(id);
    }
    public int hashCode()
    {
      return id;
    }

    public boolean equals(Object obj)
    {
      if(this == obj)
      {
        return true;
      }
      if(!(obj instanceof OptimalLandSolutionId))
       return false;
      OptimalLandSolutionId other = (OptimalLandSolutionId) obj;
      return (id == other.id);
    }

  }

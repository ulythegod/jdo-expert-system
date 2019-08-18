package core.data;

public class ResultFirstStageId
{
    static Class c = ResultFirstStage.class;
    public int id;
    public ResultFirstStageId()
    {
    }
    public ResultFirstStageId(String fromString)
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
       if(!(obj instanceof ResultFirstStageId))
         return false;
       ResultFirstStageId other = (ResultFirstStageId) obj;
       return (id == other.id);
    }

  }

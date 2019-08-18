package core.data;

public class MethodId {

    public int idMethod;

    public MethodId(){}

    public MethodId(String from){

        idMethod = Integer.parseInt(from);
    }

    public String toString() {
        return String.valueOf(idMethod);
    }

    public int hashCode() {
        return idMethod;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof MethodId))
            return false;
        MethodId other = (MethodId) obj;
        return (idMethod == other.idMethod);
    }
}

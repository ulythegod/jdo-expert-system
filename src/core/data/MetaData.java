package core.data;

import java.util.Collection;
import java.util.HashSet;

public class MetaData {

    private int idMetaData;
    private String table_name;
    private Collection userDataToBaseData = new HashSet();

    public MetaData(){
    }

    public int getIdMetaData() {
        return idMetaData;
    }

    public void setIdMetaData(int idMetaData) {
        this.idMetaData = idMetaData;
    }

    public String getTable_name() {
        return table_name;
    }

    public void setTable_name(String table_name) {
        this.table_name = table_name;
    }

    public Collection getUserDataToBaseData() {
        return userDataToBaseData;
    }

    public void setUserDataToBaseData(Collection userDataToBaseData) {
        this.userDataToBaseData = userDataToBaseData;
    }
}

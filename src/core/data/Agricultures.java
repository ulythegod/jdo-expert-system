package core.data;

import java.util.Collection;
import java.util.HashSet;

/**
 * Author: Skosyreva Maria
 * Date: 20.05.2016
 * Time: 11:17
 */
public class Agricultures {
    private int agricultureId;
    private String name;
    private String description;
    private String address;
    private User user;
    private float latitude;
    private float longitude;
    private Collection agricultureFields = new HashSet();
    private Collection cropRotationsOfAgriculture = new HashSet();
    private Collection typeOfSoils = new HashSet();
    private Collection landBases = new HashSet();

    public Agricultures() {
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public Collection getCropRotationsOfAgriculture() {
        return cropRotationsOfAgriculture;
    }

    public void setCropRotationsOfAgriculture(Collection cropRotationsOfAgriculture) {
        this.cropRotationsOfAgriculture = cropRotationsOfAgriculture;
    }

    public Agricultures(int agricultureId) {
        this.agricultureId = agricultureId;
    }

    public int getAgricultureId() {
        return agricultureId;
    }

    public void setAgricultureId(int agricultureId) {
        this.agricultureId = agricultureId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Collection getAgricultureFields() {
        return agricultureFields;
    }

    public void setAgricultureFields(Collection agricultureFields) {
        this.agricultureFields = agricultureFields;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Collection getTypeOfSoils() {
        return typeOfSoils;
    }

    public void setTypeOfSoils(Collection typeOfSoils) {
        this.typeOfSoils = typeOfSoils;
    }

    public Collection getLandBases() {
        return landBases;
    }

    public void setLandBases(Collection landBases) {
        this.landBases = landBases;
    }
}

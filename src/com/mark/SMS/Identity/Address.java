package com.mark.SMS.Identity;
public class Address {
    String city, municipality, barangay;

    public Address(String barangay, String municipality, String city){
        this.barangay = barangay;
        this.municipality = municipality;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public String getBarangay() {
        return barangay;
    }

    public void setBarangay(String barangay) {
        this.barangay = barangay;
    }
    public String toString(){
        return barangay + ", " + municipality + ", " + city;
    }
}

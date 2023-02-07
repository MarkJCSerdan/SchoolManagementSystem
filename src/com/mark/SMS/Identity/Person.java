package com.mark.SMS.Identity;

public class Person {
    String firstName, lastName;
    Address address;
    int age;
    String birthdate;
    float height;
    String gender;
    Person(){}

    protected Person(String firstName, String lastName, Address address, int age, String birthdate, float height, String gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.age = age;
        this.birthdate = birthdate;
        this.height = height;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

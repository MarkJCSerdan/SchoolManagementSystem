package com.mark.SMS.People;

import com.mark.SMS.Identity.Address;
import com.mark.SMS.Identity.Person;

public class Student extends Person {
    String userName;
    String password;
    public Student(String firstName, String lastName, Address address, String gender, String userName, String password){
        super(firstName, lastName, address, gender);
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString(){
        return getFirstName() + " " + getLastName();
    }
}

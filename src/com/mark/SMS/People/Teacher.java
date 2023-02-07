package com.mark.SMS.People;

import com.mark.SMS.Identity.Address;
import com.mark.SMS.Identity.Person;

public class Teacher extends Person {
    String userName, password;

    public Teacher(String firstName, String lastName, Address address, int age, String birthDate, float height, String gender, String userName, String password){
        super(firstName, lastName, address, age, birthDate, height,  gender);
        this.userName = userName;
        this.password = password;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }
    public String getUserName(){
        return userName;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
}

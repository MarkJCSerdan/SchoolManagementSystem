package com.mark.SMS;

public class Teacher extends Person{
    String name, gender, userName, password, birthDate;
    int age;
    float height;

    Teacher(String name, int age, String birthDate, float height, String gender, String userName, String password){
        super(name, age, birthDate, height,  gender);
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

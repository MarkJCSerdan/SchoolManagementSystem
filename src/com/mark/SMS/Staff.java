package com.mark.SMS;

public class Staff extends Person{
    String userName, password;
    public Staff(String name, int age, String birthdate, float height, String gender, String userName, String password){
        super(name, age, birthdate, height, gender);
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

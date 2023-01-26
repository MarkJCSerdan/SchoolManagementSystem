package com.mark.SMS;

public class Student extends Person {
    String userName;
    String password;

    public Student(){}
    public Student(String name, int age, String birthdate, float height, String gender, String userName, String password){
        super(name, age, birthdate, height, gender);
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

}

package com.mark.SMS;

public class Teacher extends Person{
    String subjectHandled;

    Teacher(String name, int age, String birthDate, float height, String gender, String subjectHandled){
        super(name, age, birthDate, height,  gender);
        this.subjectHandled = subjectHandled;
    }
}

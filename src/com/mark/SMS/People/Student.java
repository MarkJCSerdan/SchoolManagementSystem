package com.mark.SMS.People;

import com.mark.SMS.Identity.*;
public class Student extends Account {
    public Student(String firstName, String lastName, Address address, String gender, String userName, String password){
        super(firstName, lastName, address, gender, userName, password);
    }
}

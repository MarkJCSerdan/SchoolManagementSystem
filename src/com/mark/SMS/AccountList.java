package com.mark.SMS;

import com.mark.SMS.People.Admin;
import com.mark.SMS.People.Staff;
import com.mark.SMS.People.Student;
import com.mark.SMS.People.Teacher;

public class AccountList {
    Student[] studentList = new Student[500];
    Staff[] staffList = new Staff[50];
    Teacher[] teacherList = new Teacher[100];
    Admin[] adminList = new Admin[10];
    int studentCount = 0;
    int staffCount = 0;
    int teacherCount = 0;
    int adminCount = 0;

    public void addToStudent(Student std){
        studentList[studentCount] = std;
        studentCount++;
    }


    public void addToStaff(Staff sta){
        staffList[staffCount] = sta;
        staffCount++;
    }


    public void addToTeacher(Teacher teacher){
        teacherList[teacherCount] = teacher;
        teacherCount++;
    }

    public void addToAdmins(Admin admin){
        adminList[adminCount] = admin;
        adminCount++;
    }
}

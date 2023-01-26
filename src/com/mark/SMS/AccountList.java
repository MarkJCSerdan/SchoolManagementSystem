package com.mark.SMS;

public class AccountList {
    Student[] studentList = new Student[500];
    Staff[] staffList = new Staff[50];
    Teacher[] teacherList = new Teacher[100];
    int studentCount = 0;
    int staffCount = 0;
    int teacherCount = 0;

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
}

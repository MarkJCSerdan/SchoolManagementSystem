package com.mark.SMS;

import com.mark.SMS.People.Admin;
import com.mark.SMS.People.Staff;
import com.mark.SMS.People.Student;
import com.mark.SMS.People.Teacher;

public class AccountList {
    public Student[] studentList = new Student[500];
    public Staff[] staffList = new Staff[50];
    public Teacher[] teacherList = new Teacher[100];
    public Admin[] adminList = new Admin[10];
    public int studentCount = 0;
    public int staffCount = 0;
    public int teacherCount = 0;
    public int adminCount = 0;

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

    public void displayStudents(){
        for(int i=0; i<studentCount;i++){
            System.out.println(studentList[i].toString());
        }
    }
}

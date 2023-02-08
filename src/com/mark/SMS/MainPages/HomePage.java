package com.mark.SMS.MainPages;

import com.mark.SMS.AccountList;
import com.mark.SMS.SubPages.AdminHomePage;
import com.mark.SMS.SubPages.StaffHomePage;
import com.mark.SMS.SubPages.StudentHomePage;
import com.mark.SMS.SubPages.TeacherHomePage;

import javax.accessibility.Accessible;
import javax.swing.*;
import java.awt.*;
public class HomePage extends JPanel{
    public AdminHomePage adminHomePage;
    public StudentHomePage studentHomePage;
    public TeacherHomePage teacherHomePage;
    public StaffHomePage staffHomePage;
    public String tracker="";
    public HomePage(){
        adminHomePage = new AdminHomePage();
        studentHomePage = new StudentHomePage();
        teacherHomePage = new TeacherHomePage();
        staffHomePage = new StaffHomePage();

        //Adding SubPages to HomePage
        this.add(adminHomePage);
        this.add(studentHomePage);
        this.add(teacherHomePage);
        this.add(staffHomePage);

        //Initializing HomePagePanel
        this.setLayout(null);
        this.setBackground(Color.GRAY);
        this.setBounds(0,0,800,700);
        this.setVisible(false);
    }

    public void setTracker(String tracker) {
        this.tracker = tracker;
    }

    public String getTracker(){
        return tracker;
    }

}

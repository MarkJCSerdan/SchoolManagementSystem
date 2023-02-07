package com.mark.SMS.MainPages;

import com.mark.SMS.SubPages.AdminHomePage;
import com.mark.SMS.SubPages.StudentHomePage;
import com.mark.SMS.SubPages.TeacherHomePage;

import javax.swing.*;
import java.awt.*;
public class HomePage extends JPanel{
    AdminHomePage adminHomePage;
    StudentHomePage studentHomePage;
    TeacherHomePage teacherHomePage;
    public HomePage(){
        adminHomePage = new AdminHomePage();
        studentHomePage = new StudentHomePage();
        teacherHomePage = new TeacherHomePage();

        //Adding SubPages to HomePage
        this.add(adminHomePage);
        this.add(studentHomePage);
        this.add(teacherHomePage);

        //Initializing HomePagePanel
        this.setLayout(null);
        this.setBackground(Color.GRAY);
        this.setBounds(0,0,800,700);
        this.setVisible(true);
    }
}

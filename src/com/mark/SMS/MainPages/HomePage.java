package com.mark.SMS.MainPages;

import com.mark.SMS.AccountList;
import com.mark.SMS.Identity.Account;
import com.mark.SMS.SubPages.*;

import javax.swing.*;
import java.awt.*;
public class HomePage extends JPanel{
    public AdminHomePage adminHomePage;
    public StudentHomePage studentHomePage;
    public TeacherHomePage teacherHomePage;
    public StaffHomePage staffHomePage;
    public ProfilePage profilePage;
    public String tracker="";
    Account accountLogIn;
    public HomePage(){
        adminHomePage = new AdminHomePage();
        studentHomePage = new StudentHomePage();
        teacherHomePage = new TeacherHomePage();
        staffHomePage = new StaffHomePage();
        profilePage = new ProfilePage();

        //Adding SubPages to HomePage
        this.add(adminHomePage);
        this.add(studentHomePage);
        this.add(teacherHomePage);
        this.add(staffHomePage);
        this.add(profilePage);

        //Initializing HomePagePanel
        this.setLayout(null);
        this.setBackground(Color.GRAY);
        this.setBounds(0,0,800,700);
        this.setVisible(false); //false
    }

    public void setTracker(String tracker) {
        this.tracker = tracker;
    }

    public String getTracker(){
        return tracker;
    }

    public void setAccountLogIn(Account accountLogIn){
        this.accountLogIn = accountLogIn;
    }
    public Account getAccountLogIn(){
        return accountLogIn;
    }

}

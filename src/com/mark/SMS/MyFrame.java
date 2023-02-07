package com.mark.SMS;
//import com.mark.SMS.Identity.Address;
//import com.mark.SMS.MainPages.*;
//import com.mark.SMS.People.*;
//import com.mark.SMS.SubPages.*;

import com.mark.SMS.MainPages.HomePage;
import com.mark.SMS.MainPages.LogInPage;
import com.mark.SMS.MainPages.SignUpPage;

import javax.swing.*;

public class MyFrame extends JFrame {
    LogInPage logInPage;
    SignUpPage signUpPage;
    HomePage homePage;
    MyFrame() {
        logInPage = new LogInPage();
        signUpPage = new SignUpPage();
        homePage = new HomePage();

        //Adding Main Pages in the Frame
        this.add(signUpPage);
        this.add(logInPage);
        this.add(homePage);


        //Initializing Frame
        this.setTitle("School Management System");
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setSize(800, 700);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

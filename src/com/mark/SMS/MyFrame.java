package com.mark.SMS;
import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    static AccountType accountType;
    static LogInPage logInPage;
    static SignUpPage signUpPage;
    static HomePage homePage;

    MyFrame(){

        accountType = new AccountType();
        logInPage = new LogInPage();
        signUpPage = new SignUpPage();
        homePage = new HomePage();

        this.add(accountType);
        this.add(logInPage);
        this.add(signUpPage);
        this.add(homePage);

        this.setTitle("School Management System");
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setBackground(Color.GREEN);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);
    }
}

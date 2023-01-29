package com.mark.SMS;
import javax.swing.*;

public class MyFrame extends JFrame {
    static AccountType accountType;
    static LogInPage logInPage;
    static SignUpPage signUpPage;
    static HomePage homePage;
    static AccountList accountList;

    MyFrame() {
        accountList = new AccountList();
        accountList.addToStudent(new Student("mark", 21, "jan", 160f, "male", "mark", "serdan"));
        accountList.addToStaff(new Staff("Anna", 22, "may", 156f, "female", "anna", "anna"));
        accountList.addToTeacher(new Teacher("Mary", 23, "may", 150f, "female", "mary", "serdan"));

        accountType = new AccountType(accountList);
        logInPage = new LogInPage(accountList);
        signUpPage = new SignUpPage(accountList);
        homePage = new HomePage();

        this.add(accountType);
        this.add(logInPage);
        this.add(signUpPage);
        this.add(homePage);

        this.setTitle("School Management System");
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);
    }
}

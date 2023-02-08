package com.mark.SMS;
//import com.mark.SMS.Identity.Address;
//import com.mark.SMS.MainPages.*;
//import com.mark.SMS.People.*;
//import com.mark.SMS.SubPages.*;

import com.mark.SMS.Identity.Address;
import com.mark.SMS.MainPages.HomePage;
import com.mark.SMS.MainPages.LogInPage;
import com.mark.SMS.MainPages.SignUpPage;
import com.mark.SMS.People.Admin;
import com.mark.SMS.People.Staff;
import com.mark.SMS.People.Student;
import com.mark.SMS.People.Teacher;

import javax.swing.*;

public class MyFrame extends JFrame {
    public static LogInPage logInPage;
    public static SignUpPage signUpPage;
    public static HomePage homePage;
    public static AccountList accountList;
    MyFrame() {
        accountList = new AccountList();
        accountList.addToStudent(new Student("user", "user",
                new Address("barangay", "municipality", "city"), "male", "student", "student"));
        accountList.addToStaff(new Staff("user","user",
                new Address("barangay","municipality","city"),"female","staff","staff"));
        accountList.addToTeacher(new Teacher("user","user",
                new Address("barangay","municipality","city"),"male","teacher","teacher"));
        accountList.addToAdmins(new Admin("admin", "admin"));
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

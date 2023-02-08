package com.mark.SMS.SubPages;

import com.mark.SMS.AccountList;
import com.mark.SMS.MainPages.HomePage;
import com.mark.SMS.MainPages.LogInPage;
import com.mark.SMS.MainPages.SignUpPage;
import com.mark.SMS.MyFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ChooseAccountPage extends JPanel implements ActionListener {
    JLabel des, orLabel;
    JButton studentChoice, staffChoice, teacherChoice, adminChoice, signUpButton;
    AccountList accountList;

    public ChooseAccountPage(){
        this.accountList = accountList;
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);

        des = new JLabel("Sign in as: ");
        des.setBounds(240, 40, 100, 100);
        des.setFont(new Font(null, Font.BOLD, 18));

        studentChoice = new JButton("Student");
        studentChoice.setBounds(235, 130, 100, 30);
        studentChoice.addActionListener(this);
        studentChoice.setFocusable(false);
        studentChoice.setCursor(cursor);

        teacherChoice = new JButton("Teacher");
        teacherChoice.setBounds(235, 170, 100, 30);
        teacherChoice.addActionListener(this);
        teacherChoice.setFocusable(false);
        teacherChoice.setCursor(cursor);

        staffChoice = new JButton("Staff");
        staffChoice.setBounds(235, 210, 100, 30);
        staffChoice.addActionListener(this);
        staffChoice.setFocusable(false);
        staffChoice.setCursor(cursor);

        adminChoice = new JButton("Admin");
        adminChoice.setBounds(235, 250, 100, 30);
        adminChoice.addActionListener(this);
        adminChoice.setFocusable(false);
        adminChoice.setCursor(cursor);

        orLabel = new JLabel("OR");
        orLabel.setBounds(275, 280, 50,30);

        signUpButton = new JButton("Sign Up");
        signUpButton.setBounds(235, 310, 100, 30);
        signUpButton.addActionListener(this);
        signUpButton.setFocusable(false);
        signUpButton.setCursor(new Cursor(Cursor.HAND_CURSOR));


        this.add(des);
        this.add(studentChoice);
        this.add(teacherChoice);
        this.add(staffChoice);
        this.add(adminChoice);
        this.add(orLabel);
        this.add(signUpButton);
        this.setBackground(Color.LIGHT_GRAY);
        this.setLayout(null);
        this.setBounds(100,60,590,540);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==studentChoice){
            this.setVisible(false);
            LogInPage.logInForm.setVisible(true);
            MyFrame.homePage.setTracker("Student");
        }
        else if(e.getSource()==staffChoice){
            this.setVisible(false);
            LogInPage.logInForm.setVisible(true);
            MyFrame.homePage.setTracker("Staff");
        }
        else if(e.getSource()==teacherChoice){
            this.setVisible(false);
            LogInPage.logInForm.setVisible(true);
            MyFrame.homePage.setTracker("Teacher");
        }
        else if(e.getSource()==adminChoice){
            this.setVisible(false);
            LogInPage.logInForm.setVisible(true);
            MyFrame.homePage.setTracker("Admin");
        }
        else if(e.getSource()==signUpButton){
            this.setVisible(false);
            MyFrame.signUpPage.setVisible(true);
            SignUpPage.signUpForm.setVisible(true);
        }
    }
}
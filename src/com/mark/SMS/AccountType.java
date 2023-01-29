package com.mark.SMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AccountType extends JPanel implements ActionListener {
    JLabel des, orLabel;
    JButton studentChoice, staffChoice, teacherChoice, adminChoice, signUpButton;
    AccountList accountList;

    AccountType(AccountList accountList){
        this.accountList = accountList;
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);

        des = new JLabel("Sign in as: ");
        des.setBounds(210, 40, 100, 100);
        des.setFont(new Font(null, Font.BOLD, 18));

        studentChoice = new JButton("Student");
        studentChoice.setBounds(205, 130, 100, 30);
        studentChoice.addActionListener(this);
        studentChoice.setFocusable(false);
        studentChoice.setCursor(cursor);

        teacherChoice = new JButton("Teacher");
        teacherChoice.setBounds(205, 170, 100, 30);
        teacherChoice.addActionListener(this);
        teacherChoice.setFocusable(false);
        teacherChoice.setCursor(cursor);

        staffChoice = new JButton("Staff");
        staffChoice.setBounds(205, 210, 100, 30);
        staffChoice.addActionListener(this);
        staffChoice.setFocusable(false);
        staffChoice.setCursor(cursor);

        adminChoice = new JButton("Admin");
        adminChoice.setBounds(205, 250, 100, 30);
        adminChoice.addActionListener(this);
        adminChoice.setFocusable(false);
        adminChoice.setCursor(cursor);

        orLabel = new JLabel("OR");
        orLabel.setBounds(245, 280, 50,30);

        signUpButton = new JButton("Sign Up");
        signUpButton.setBounds(205, 310, 100, 30);
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
        this.setBackground(Color.GRAY);
        this.setLayout(null);
        this.setBounds(20,20,540,540);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==studentChoice){
            this.setVisible(false);
            MyFrame.logInPage.showLogInPage(true);
            MyFrame.logInPage.setStudents(MyFrame.accountList.studentList);
            MyFrame.logInPage.setTracker("Student");
            MyFrame.logInPage.label.setText("Student");
        }
        else if(e.getSource()==staffChoice){
            this.setVisible(false);
            MyFrame.logInPage.showLogInPage(true);
            MyFrame.logInPage.setStaffs(MyFrame.accountList.staffList);
            MyFrame.logInPage.setTracker("Staff");
            MyFrame.logInPage.label.setText("Staff");
        }
        else if(e.getSource()==teacherChoice){
            this.setVisible(false);
            MyFrame.logInPage.showLogInPage(true);
            MyFrame.logInPage.setTeachers(MyFrame.accountList.teacherList);
            MyFrame.logInPage.setTracker("Teacher");
            MyFrame.logInPage.label.setText("Teacher");
        }
        else if(e.getSource()==signUpButton){
            this.setVisible(false);
            MyFrame.signUpPage.showSignUpPage(true);
        }
    }
}

package com.mark.SMS.SubPages;

import com.mark.SMS.MyFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogInForm extends JPanel implements ActionListener {
    JLabel userNameLabel, passwordLabel;
    JTextField userNameTextField, passwordTextField;
    JButton logInButton, backButton;

    Font font = new Font("Arial", Font.PLAIN, 20);
    public LogInForm(){
        userNameLabel = new JLabel("Username");
        userNameLabel.setBounds(100,100,100,40);
        userNameLabel.setFont(font);

        userNameTextField = new JTextField();
        userNameTextField.setBounds(240, 100, 200, 40);
        userNameTextField.setFont(font);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(100,200,100,40);
        passwordLabel.setFont(font);

        passwordTextField = new JTextField();
        passwordTextField.setBounds(240, 200, 200, 40);
        passwordTextField.setFont(font);

        backButton = new JButton("Back");
        backButton.setBounds(100, 320, 100, 40);
        backButton.setFocusable(false);
        backButton.addActionListener(this);

        logInButton = new JButton("Log In");
        logInButton.setBounds(340, 320, 100, 40);
        logInButton.setFocusable(false);
        logInButton.addActionListener(this);

        //Adding components to this Panel
        this.add(userNameLabel);
        this.add(userNameTextField);
        this.add(passwordLabel);
        this.add(passwordTextField);
        this.add(backButton);
        this.add(logInButton);

        this.setLayout(null);
        this.setBackground(Color.LIGHT_GRAY);
        this.setBounds(100,60,590,540);
        this.setVisible(false);
    }
    public void resetField(){
        userNameTextField.setText("");
        passwordTextField.setText("");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userNameTextField.getText();
        String pass = passwordTextField.getText();

        TEMP:
        if(e.getSource()==logInButton){
            try{
                switch(MyFrame.homePage.getTracker()){
                    case "Student":
                        for(int i=0; i<MyFrame.accountList.studentCount; i++){
                            if(MyFrame.accountList.studentList[i].getUserName().equals(user) &&
                                    MyFrame.accountList.studentList[i].getPassword().equals(pass)) {
                                MyFrame.logInPage.setVisible(false);
                                this.setVisible(false);
                                MyFrame.homePage.setVisible(true);
                                MyFrame.homePage.studentHomePage.setVisible(true);
                                resetField();
                                break TEMP;
                            }
                        }
                        JOptionPane.showMessageDialog(null, "Invalid", "Error", JOptionPane.PLAIN_MESSAGE);
                        resetField();
                        break TEMP;

                    case "Staff":
                        for(int i=0; i<MyFrame.accountList.staffCount; i++){
                            if(MyFrame.accountList.staffList[i].getUserName().equals(user) &&
                                    MyFrame.accountList.staffList[i].getPassword().equals(pass)) {
                                MyFrame.logInPage.setVisible(false);
                                this.setVisible(false);
                                MyFrame.homePage.setVisible(true);
                                MyFrame.homePage.staffHomePage.setVisible(true);
                                resetField();
                                break TEMP;
                            }
                        }
                        JOptionPane.showMessageDialog(null, "Invalid", "Error", JOptionPane.PLAIN_MESSAGE);
                        resetField();
                        break TEMP;

                    case "Teacher":
                        for(int i=0; i<MyFrame.accountList.teacherCount; i++){
                            if(MyFrame.accountList.teacherList[i].getUserName().equals(user) &&
                                    MyFrame.accountList.teacherList[i].getPassword().equals(pass)) {
                                MyFrame.logInPage.setVisible(false);
                                this.setVisible(false);
                                MyFrame.homePage.setVisible(true);
                                MyFrame.homePage.teacherHomePage.setVisible(true);
                                resetField();
                                break TEMP;
                            }
                        }
                        JOptionPane.showMessageDialog(null, "Invalid", "Error", JOptionPane.PLAIN_MESSAGE);
                        resetField();
                        break TEMP;
                    case "Admin":
                        for(int i=0; i<MyFrame.accountList.adminCount; i++){
                            if(MyFrame.accountList.adminList[i].getUserName().equals(user) &&
                                    MyFrame.accountList.adminList[i].getPassword().equals(pass)) {
                                MyFrame.logInPage.setVisible(false);
                                this.setVisible(false);
                                MyFrame.homePage.setVisible(true);
                                MyFrame.homePage.adminHomePage.setVisible(true);
                                resetField();
                                break TEMP;
                            }
                        }
                        JOptionPane.showMessageDialog(null, "Invalid", "Error", JOptionPane.PLAIN_MESSAGE);
                        resetField();
                        break TEMP;
                }

            }catch (NullPointerException nul){
                JOptionPane.showMessageDialog(null, "Something's Wrong", "Notice", JOptionPane.PLAIN_MESSAGE);
            }
        }
        else if(e.getSource()==backButton){
            this.setVisible(false);
            MyFrame.logInPage.chooseAccountPage.setVisible(true);
        }
    }
}

package com.mark.SMS;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//This is where you log in or sign up
//Input your username and password to go to homepage

public class LogInPage extends JPanel implements ActionListener{
    JLabel userNameLabel, passwordLabel;
    JTextField userNameTextField, passwordTextField;
    JButton signInButton, signUpButton;
    SignUpPage signUpPage;
    static AccountList accountList;

    //Constructor to use in displaying LogInPage in MyFrame
    LogInPage(){
        accountList = new AccountList();
        signUpPage = new SignUpPage();

        //Set up userName Text and userName textBox
        userNameLabel = new JLabel("Username ");
        userNameLabel.setBounds(140,100, 70,30);
        userNameTextField = new JTextField();
        userNameTextField.setBounds(240,100,150,30);

        //Set up password Text and password textBox
        passwordLabel = new JLabel("Password ");
        passwordLabel.setBounds(140,150,70,30);
        passwordTextField = new JTextField();
        passwordTextField.setBounds(240,150,150,30);

        //This is the SignIn button
        signInButton = new JButton("Sign in");
        signInButton.setBounds(150, 210, 80, 30);
        signInButton.setFocusable(false);
        signInButton.addActionListener(this);


        //This is the SignUpButton
        signUpButton = new JButton("Sign up");
        signUpButton.setBounds(270, 210, 80,30);
        signUpButton.setFocusable(false);
        signUpButton.addActionListener(this);


        //Adding the objects Ive created to the LogInPage Class
        this.add(userNameLabel);
        this.add(userNameTextField);
        this.add(passwordLabel);
        this.add(passwordTextField);
        this.add(signInButton);
        this.add(signUpButton);
        this.add(signUpPage);

        this.setLayout(null);
        this.setBackground(Color.BLUE);
        this.setBounds(20,20,540,540);
        this.setVisible(false);
    }

    public void showLogInPage(boolean b){
        this.setVisible(b);
    }

    public void resetField(){
        userNameTextField.setText("");
        passwordTextField.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        TEMP:
        if(e.getSource()==signUpButton){
            showLogInPage(false);
            MyFrame.signUpPage.showSignUpPage(true);
        }

        else if(e.getSource()==signInButton){
            for(int i=0; i<accountList.studentCount; i++){
                if(this.userNameTextField.getText().equals(accountList.studentList[i].getUserName())
                && this.passwordTextField.getText().equals(accountList.studentList[i].getPassword())){
                    MyFrame.homePage.showHomePage(true);
                    MyFrame.logInPage.showLogInPage(false);
                    break TEMP;
                }
            }
            JOptionPane.showMessageDialog(null, "Error", null, JOptionPane.PLAIN_MESSAGE);
            resetField();
        }
    }
}

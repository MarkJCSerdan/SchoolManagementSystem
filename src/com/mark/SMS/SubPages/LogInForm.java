package com.mark.SMS.SubPages;

import com.mark.SMS.MainPages.LogInPage;

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

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==backButton){
            this.setVisible(false);
            LogInPage.chooseAccountPage.setVisible(true);
        }
    }
}

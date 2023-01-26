package com.mark.SMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpPage extends JPanel implements ActionListener{
    JLabel nameLabel, ageLabel, birthDateLabel, heightLabel,  genderLabel, usernameLabel, passwordLabel;
    JTextField nameTextField, ageTextField, birthTextField, heightTextField, genderTextField, userNameTextField,
    passwordTextField;
    JButton signUp, back;

    String name, userName, password;
    int age;
    float height;
    String birthDate;
    String gender;


    SignUpPage(){

        nameLabel = new JLabel("Name");
        nameLabel.setBounds(30, 30, 80, 30);
        nameTextField = new JTextField();
        nameTextField.setBounds(140, 30, 170, 30);

        ageLabel = new JLabel("Age");
        ageLabel.setBounds(30, 90, 80, 30);
        ageTextField = new JTextField();
        ageTextField.setBounds(140, 90, 170, 30);

        birthDateLabel = new JLabel("Birthdate");
        birthDateLabel.setBounds(30, 150, 80, 30);
        birthTextField = new JTextField();
        birthTextField.setBounds(140, 150, 170, 30);

        heightLabel = new JLabel("Height");
        heightLabel.setBounds(30, 210, 80, 30);
        heightTextField = new JTextField();
        heightTextField.setBounds(140, 210, 170, 30);

        genderLabel = new JLabel("Gender");
        genderLabel.setBounds(30, 270, 80, 30);
        genderTextField = new JTextField();
        genderTextField.setBounds(140, 270, 170, 30);

        usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(30, 330, 80, 30);
        userNameTextField = new JTextField();
        userNameTextField.setBounds(140, 330, 170, 30);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(30, 390, 80, 30);
        passwordTextField = new JTextField();
        passwordTextField.setBounds(140, 390, 170, 30);

        signUp = new JButton("Sign Up");
        signUp.setBounds(80, 470, 100, 30);
        signUp.setFocusable(false);
        signUp.addActionListener(this);

        back = new JButton("Back");
        back.setBounds(350, 470, 100, 30);
        back.setFocusable(false);
        back.addActionListener(this);

        this.add(nameLabel);
        this.add(nameTextField);
        this.add(ageLabel);
        this.add(ageTextField);
        this.add(birthDateLabel);
        this.add(birthTextField);
        this.add(heightLabel);
        this.add(heightTextField);
        this.add(genderLabel);
        this.add(genderTextField);
        this.add(usernameLabel);
        this.add(userNameTextField);
        this.add(passwordLabel);
        this.add(passwordTextField);
        this.add(signUp);
        this.add(back);

        this.setLayout(null);
        this.setBackground(Color.GRAY);
        this.setBounds(20,20,540,540);
        this.setVisible(false);
    }

    public void showSignUpPage(boolean b){
        this.setVisible(b);
    }
    public void resetField(){
        nameTextField.setText("");
        ageTextField.setText("");
        birthTextField.setText("");
        heightTextField.setText("");
        genderTextField.setText("");
        userNameTextField.setText("");
        passwordTextField.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==signUp){
            try{
                name = nameTextField.getText();
                age = Integer.parseInt(ageTextField.getText());
                birthDate = birthTextField.getText();
                height = Float.parseFloat(heightTextField.getText());
                gender = genderTextField.getText();
                userName = userNameTextField.getText();
                password = passwordTextField.getText();

                LogInPage.accountList.addToStudent(new Student(name, age, birthDate, height, gender, userName, password));
                JOptionPane.showMessageDialog(null, "Account Created!",null, JOptionPane.PLAIN_MESSAGE);
                resetField();

            }catch(Exception exception){
                JOptionPane.showMessageDialog(null, "Please Try again", "Error", JOptionPane.PLAIN_MESSAGE);
                resetField();
            }
        }
        else if(e.getSource()==back){
            resetField();
            showSignUpPage(false);
            MyFrame.logInPage.showLogInPage(true);
        }
    }
}

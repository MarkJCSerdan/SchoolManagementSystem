package com.mark.SMS.SubPages;

import com.mark.SMS.AccountList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpForm extends JPanel implements ActionListener {

    JLabel firstNameLabel, lastNameLabel, cityLabel, municipalityLabel, barangayLabel, ageLabel, birthDateLabel, heightLabel,
            genderLabel, usernameLabel, passwordLabel, typeLabel;
    JTextField firstNameTextField, lastNameTextField, cityTextField, municipalityTextField, barangayTextField, ageTextField,
            heightTextField, userNameTextField, passwordTextField;
    JComboBox typeCombo, genderCombo, birthDateCombo;
    JButton signUp, back;

    String firstName, lastName, userName, password;
    String type = "";
    String barangay, municipality, city;
    int age;
    float height;
    String birthDate, gender;
    String[] typeValue = {"Select", "Student", "Staff", "Teacher"};
    String[] birthValue = {"Select", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
            "November", "December"};
    String[] genderValue = {"Select", "Male", "Female"};

    public SignUpForm(){

        firstNameLabel = new JLabel("Firstname");
        firstNameLabel.setBounds(30, 30, 60, 30);
        firstNameTextField = new JTextField();
        firstNameTextField.setBounds(110, 30, 120, 30);

        ageLabel = new JLabel("Age");
        ageLabel.setBounds(290, 30, 60, 30);
        ageTextField = new JTextField();
        ageTextField.setBounds(360, 30, 120, 30);

        lastNameLabel = new JLabel("Lastname");
        lastNameLabel.setBounds(30, 90, 60, 30);
        lastNameTextField = new JTextField();
        lastNameTextField.setBounds(110, 90, 120, 30);

        genderLabel = new JLabel("Gender");
        genderLabel.setBounds(290, 90, 60, 30);
        genderCombo = new JComboBox(genderValue);
        genderCombo.setBounds(360, 90, 120, 30);

        cityLabel = new JLabel("City");
        cityLabel.setBounds(30, 150, 60, 30);
        cityTextField = new JTextField();
        cityTextField.setBounds(110, 150, 120, 30);

        birthDateLabel = new JLabel("Birthdate");
        birthDateLabel.setBounds(290, 150, 60, 30);
        birthDateCombo = new JComboBox(birthValue);
        birthDateCombo.setBounds(360, 150, 120, 30);

        municipalityLabel = new JLabel("Municipality");
        municipalityLabel.setBounds(30, 210, 70, 30);
        municipalityTextField = new JTextField();
        municipalityTextField.setBounds(110, 210, 120, 30);

        heightLabel = new JLabel("Height");
        heightLabel.setBounds(290, 210, 60, 30);
        heightTextField = new JTextField();
        heightTextField.setBounds(360, 210, 120, 30);

        barangayLabel = new JLabel("Barangay");
        barangayLabel.setBounds(30, 270, 60, 30);
        barangayTextField = new JTextField();
        barangayTextField.setBounds(110, 270, 120, 30);

        typeLabel = new JLabel("Account");
        typeLabel.setBounds(30, 330, 60, 30);
        typeCombo = new JComboBox(typeValue);
        typeCombo.setBounds(110, 330, 120, 30);

        usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(290, 270, 60, 30);
        userNameTextField = new JTextField();
        userNameTextField.setBounds(360, 270, 120, 30);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(290, 330, 60, 30);
        passwordTextField = new JTextField();
        passwordTextField.setBounds(360, 330, 120, 30);

        signUp = new JButton("Sign Up");
        signUp.setBounds(80, 470, 100, 30);
        signUp.setFocusable(false);
        signUp.addActionListener(this);

        back = new JButton("Back");
        back.setBounds(350, 470, 100, 30);
        back.setFocusable(false);
        back.addActionListener(this);

        this.add(firstNameLabel);
        this.add(firstNameTextField);
        this.add(lastNameLabel);
        this.add(lastNameTextField);
        this.add(cityLabel);
        this.add(cityTextField);
        this.add(municipalityLabel);
        this.add(municipalityTextField);
        this.add(barangayLabel);
        this.add(barangayTextField);
        this.add(typeLabel);
        this.add(typeCombo);
        this.add(ageLabel);
        this.add(ageTextField);
        this.add(birthDateLabel);
        this.add(birthDateCombo);
        this.add(heightLabel);
        this.add(heightTextField);
        this.add(genderLabel);
        this.add(genderCombo);
        this.add(usernameLabel);
        this.add(userNameTextField);
        this.add(passwordLabel);
        this.add(passwordTextField);

        this.add(signUp);
        this.add(back);

        this.setLayout(null);
        this.setBackground(Color.GRAY);
        this.setBounds(100,60,590,540);
        this.setVisible(false);
    }
    public void resetField(){
        firstNameTextField.setText("");
        lastNameTextField.setText("");
        cityTextField.setText("");
        municipalityTextField.setText("");
        barangayTextField.setText("");
        ageTextField.setText("");
        heightTextField.setText("");
        userNameTextField.setText("");
        passwordTextField.setText("");
        genderCombo.setSelectedItem(genderValue[0]);
        birthDateCombo.setSelectedItem(birthValue[0]);
        typeCombo.setSelectedItem(typeValue[0]);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==signUp){

        }
        else if(e.getSource()==back){

        }
    }
}

package com.mark.SMS.SubPages;

import com.mark.SMS.AccountList;
import com.mark.SMS.Identity.Address;
import com.mark.SMS.MainPages.LogInPage;
import com.mark.SMS.MyFrame;
import com.mark.SMS.People.Staff;
import com.mark.SMS.People.Student;
import com.mark.SMS.People.Teacher;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpForm extends JPanel implements ActionListener {

    JLabel firstNameLabel, lastNameLabel, cityLabel, municipalityLabel, barangayLabel,
            genderLabel, usernameLabel, passwordLabel, typeLabel;
    JTextField firstNameTextField, lastNameTextField, cityTextField, municipalityTextField, barangayTextField,
            userNameTextField, passwordTextField;
    JComboBox typeCombo, genderCombo;
    JButton signUp, back;

    String firstName, lastName, userName, password;
    String type = "";
    String barangay, municipality, city;
    String gender;
    String[] typeValue = {"Select", "Student", "Staff", "Teacher"};
    String[] genderValue = {"Select", "Male", "Female"};
    public SignUpForm(){

        firstNameLabel = new JLabel("Firstname");
        firstNameLabel.setBounds(30, 30, 60, 30);
        firstNameTextField = new JTextField();
        firstNameTextField.setBounds(110, 30, 120, 30);

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

        municipalityLabel = new JLabel("Municipality");
        municipalityLabel.setBounds(30, 210, 70, 30);
        municipalityTextField = new JTextField();
        municipalityTextField.setBounds(110, 210, 120, 30);

        barangayLabel = new JLabel("Barangay");
        barangayLabel.setBounds(30, 270, 60, 30);
        barangayTextField = new JTextField();
        barangayTextField.setBounds(110, 270, 120, 30);

        typeLabel = new JLabel("Account");
        typeLabel.setBounds(290, 30, 60, 30);
        typeCombo = new JComboBox(typeValue);
        typeCombo.setBounds(360, 30, 120, 30);

        usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(290, 150, 60, 30);
        userNameTextField = new JTextField();
        userNameTextField.setBounds(360, 150, 120, 30);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(290, 210, 60, 30);
        passwordTextField = new JTextField();
        passwordTextField.setBounds(360, 210, 120, 30);

        signUp = new JButton("Sign Up");
        signUp.setBounds(80, 400, 100, 30);
        signUp.setFocusable(false);
        signUp.addActionListener(this);

        back = new JButton("Back");
        back.setBounds(350, 400, 100, 30);
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
        userNameTextField.setText("");
        passwordTextField.setText("");
        genderCombo.setSelectedItem(genderValue[0]);
        typeCombo.setSelectedItem(typeValue[0]);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==signUp){
            try{
                firstName = firstNameTextField.getText();
                lastName = lastNameTextField.getText();
                city = cityTextField.getText();
                municipality = municipalityTextField.getText();
                barangay = barangayTextField.getText();
                gender = genderCombo.getSelectedItem().toString();
                type = String.valueOf(typeCombo.getSelectedItem());
                userName = userNameTextField.getText();
                password = passwordTextField.getText();
                switch(type){
                    case "Student":
                        MyFrame.accountList.addToStudent(
                                new Student(firstName,lastName, new Address(barangay, municipality,city), gender, userName, password));
                        JOptionPane.showMessageDialog(null, "Account Created!", "Notice", JOptionPane.PLAIN_MESSAGE);
                        resetField();
                        break;

                    case "Staff":
                        MyFrame.accountList.addToStaff(
                                new Staff(firstName,lastName, new Address(barangay, municipality,city), gender, userName, password));
                        JOptionPane.showMessageDialog(null, "Account Created!", "Notice", JOptionPane.PLAIN_MESSAGE);
                        resetField();
                        break;

                    case "Teacher":
                        MyFrame.accountList.addToTeacher(
                                new Teacher(firstName,lastName, new Address(barangay, municipality,city), gender, userName, password));
                        JOptionPane.showMessageDialog(null, "Account Created!", "Notice", JOptionPane.PLAIN_MESSAGE);
                        resetField();
                        break;
                }
            }catch(Exception exception){
                JOptionPane.showMessageDialog(null,"Somethings Wrong", "Error", JOptionPane.PLAIN_MESSAGE);
            }
        }
        else if(e.getSource()==back){
            this.setVisible(false);
            MyFrame.signUpPage.setVisible(false);
            resetField();
            MyFrame.logInPage.setVisible(true);
            LogInPage.chooseAccountPage.setVisible(true);
        }
    }
}

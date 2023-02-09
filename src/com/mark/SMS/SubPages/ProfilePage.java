package com.mark.SMS.SubPages;

import com.mark.SMS.Identity.Account;
import com.mark.SMS.MyFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProfilePage extends JPanel implements ActionListener {
    JLabel nameLabel, addressLabel, sexLabel, userNameLabel, passwordLabel;
    JTextField nameField, addressField, sexField, userNameField, passwordField;
    JButton changeName, changeAddress, changeSex, changeUserName, changePassword, saveButton, backButton;
    String newUserName, newPassword;
    Account account;

    public ProfilePage(){
        nameLabel = new JLabel("Name");
        nameLabel.setBounds(50,50,80,30);
        nameField = new JTextField();
        nameField.setBounds(120, 50, 250, 30);
        nameField.setEditable(false);
        nameField.setFocusable(false);
        changeName = new JButton("Change");
        changeName.setBounds(400, 50, 90,30);
        changeName.setEnabled(false);

        addressLabel = new JLabel("Address");
        addressLabel.setBounds(50,100,80,30);
        addressField = new JTextField();
        addressField.setBounds(120, 100, 250, 30);
        addressField.setEditable(false);
        addressField.setFocusable(false);
        changeAddress = new JButton("Change");
        changeAddress.setBounds(400, 100, 90,30);
        changeAddress.setEnabled(false);

        sexLabel = new JLabel("Sex");
        sexLabel.setBounds(50,150,80,30);
        sexField = new JTextField();
        sexField.setBounds(120, 150, 250, 30);
        sexField.setEditable(false);
        sexField.setFocusable(false);
        changeSex = new JButton("Change");
        changeSex.setBounds(400, 150, 90,30);
        changeSex.setEnabled(false);

        userNameLabel = new JLabel("Username");
        userNameLabel.setBounds(50, 200,80,30);
        userNameField = new JTextField();
        userNameField.setBounds(120, 200, 250, 30);
        userNameField.setEditable(false);
        changeUserName = new JButton("Change");
        changeUserName.setBounds(400, 200, 90,30);
        changeUserName.setFocusable(false);
        changeUserName.addActionListener(this);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(50,250,80,30);
        passwordField = new JTextField();
        passwordField.setBounds(120, 250, 250, 30);
        passwordField.setEditable(false);
        changePassword = new JButton("Change");
        changePassword.setBounds(400, 250, 90,30);
        changePassword.setFocusable(false);

        backButton = new JButton("Back");
        backButton.setBounds(50, 350, 90, 30);
        backButton.setFocusable(false);
        backButton.addActionListener(this);

        saveButton = new JButton("Save");
        saveButton.setBounds(400, 350, 90, 30);
        saveButton.setFocusable(false);

        this.add(nameLabel);
        this.add(nameField);
        this.add(changeName);
        this.add(addressLabel);
        this.add(addressField);
        this.add(changeAddress);
        this.add(sexField);
        this.add(sexLabel);
        this.add(changeSex);
        this.add(userNameLabel);
        this.add(userNameField);
        this.add(changeUserName);
        this.add(passwordLabel);
        this.add(passwordField);
        this.add(changePassword);
        this.add(backButton);
        this.add(saveButton);

        this.setBackground(Color.YELLOW);
        this.setLayout(null);
        this.setBounds(100,60,590,540);
        this.setVisible(false); //false
    }

    public void setAccount(Account account){
        this.account = account;
    }

    public void setField(){
        nameField.setText(account.getFirstName());
        addressField.setText(account.getAddress().getCity());
        sexField.setText(account.getGender());
        userNameField.setText(account.getUserName());
        passwordField.setText(account.getPassword());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==changeUserName){
            newUserName = JOptionPane.showInputDialog("Enter new Username");
        }
        if(e.getSource()==changePassword){
            newPassword = JOptionPane.showInputDialog("Enter new Password");
        }
        if(e.getSource()==backButton){
            this.setVisible(false);
            switch(MyFrame.homePage.getTracker()){
                case "Student":
                    MyFrame.homePage.studentHomePage.setVisible(true);
                    break;
                case "Staff":
                    MyFrame.homePage.staffHomePage.setVisible(true);
                    break;
                case "Teacher":
                    MyFrame.homePage.teacherHomePage.setVisible(true);
                    break;
            }
        }
    }
}

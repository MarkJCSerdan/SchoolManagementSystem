package com.mark.SMS;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//This is where you log in or sign up
//Input your username and password to go to homepage

public class LogInPage extends JPanel implements ActionListener{
    JLabel userNameLabel, passwordLabel, label;
    JTextField userNameTextField, passwordTextField;
    JButton signInButton, backButton;
    static AccountList accountList;
    Student[] studentList;
    Staff[] staffList;
    Teacher[] teacherList;
    String tracker;


    //Constructor to use in displaying LogInPage in MyFrame
    LogInPage(AccountList accountList){
        this.accountList = accountList;

        label = new JLabel();
        label.setBounds(235,50,100,30);
        label.setFont(new Font(null, Font.BOLD, 16));

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
        backButton = new JButton("Back");
        backButton.setBounds(270, 210, 80,30);
        backButton.setFocusable(false);
        backButton.addActionListener(this);


        //Adding the objects Ive created to the LogInPage Class
        this.add(label);
        this.add(userNameLabel);
        this.add(userNameTextField);
        this.add(passwordLabel);
        this.add(passwordTextField);
        this.add(signInButton);
        this.add(backButton);

        this.setLayout(null);
        this.setBackground(Color.GRAY);
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

    public void setStudents(Student[] studentList){
        this.studentList = studentList;
    }
    public void setStaffs(Staff[] staffList){
        this.staffList = staffList;
    }
    public void setTeachers(Teacher[] teacherList){
        this.teacherList = teacherList;
    }
    public void setTracker(String tracker){
        this.tracker = tracker;
    }
    public String getTracker(){
        return tracker;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        TEMP:
        if(e.getSource()==backButton){
            showLogInPage(false);
            MyFrame.accountType.setVisible(true);
        }

        else if(e.getSource()==signInButton){
            try{
                switch(tracker){
                    case "Student":
                        for(int i=0; i<studentList.length; i++){
                            if(userNameTextField.getText().equals(studentList[i].getUserName()) &&
                                    passwordTextField.getText().equals(studentList[i].getPassword())){
                                showLogInPage(false);
                                resetField();
                                MyFrame.homePage.showHomePage(true);
                                break TEMP;
                            }
                        }
                        JOptionPane.showMessageDialog(null, "Invalid", "Error", JOptionPane.PLAIN_MESSAGE);
                        break;

                    case "Staff":
                        for(int i=0; i<staffList.length; i++){
                            if(userNameTextField.getText().equals(staffList[i].getUserName()) &&
                                    passwordTextField.getText().equals(staffList[i].getPassword())) {
                                showLogInPage(false);
                                resetField();
                                MyFrame.homePage.showHomePage(true);
                                break TEMP;
                            }
                        }
                        JOptionPane.showMessageDialog(null, "Invalid", "Error", JOptionPane.PLAIN_MESSAGE);
                        break;
                    case "Teacher":
                        for(int i=0; i<teacherList.length; i++){
                            if(userNameTextField.getText().equals(teacherList[i].getUserName()) &&
                                    passwordTextField.getText().equals(teacherList[i].getPassword())){
                                showLogInPage(false);
                                resetField();
                                MyFrame.homePage.showHomePage(true);
                                break TEMP;
                            }
                        }
                        JOptionPane.showMessageDialog(null, "Invalid", "Error", JOptionPane.PLAIN_MESSAGE);
                        break;
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Invalid", "Error", JOptionPane.PLAIN_MESSAGE);
                resetField();
            }


        }
    }

}

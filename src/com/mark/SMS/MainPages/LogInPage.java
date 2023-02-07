package com.mark.SMS.MainPages;
import com.mark.SMS.SubPages.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//This is where you log in or sign up
//Input your username and password to go to homepage

public class LogInPage extends JPanel implements ActionListener{
    public static ChooseAccountPage chooseAccountPage;
    public static LogInForm logInForm;

    //Constructor to use in displaying LogInPage in MyFrame
    public LogInPage(){
        chooseAccountPage = new ChooseAccountPage();
        logInForm = new LogInForm();


        //Adding SubPages to the LogInPage
        this.add(chooseAccountPage);
        this.add(logInForm);

        this.setLayout(null);
        this.setBackground(Color.GRAY);
        this.setBounds(0,0,800,700);
        this.setVisible(false);
    }
    public void resetField(){

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

}

package com.mark.SMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends JPanel implements ActionListener {
    JButton homeButton, requestButton, enrollButton, eventButton, gradesButton, logOutButton;
    HomePageDisplay homePageDisplay;

    HomePage() {
        homePageDisplay = new HomePageDisplay();

        homeButton = new JButton("Home");
        homeButton.setBounds(20,20,80,30);
        homeButton.setFocusable(false);
        homeButton.addActionListener(this);

        requestButton = new JButton("Request");
        requestButton.setBounds(20,90,80,30);
        requestButton.setFocusable(false);
        requestButton.addActionListener(this);

        enrollButton = new JButton("Enroll");
        enrollButton.setBounds(20,160,80,30);
        enrollButton.setFocusable(false);
        enrollButton.addActionListener(this);

        eventButton = new JButton("Events");
        eventButton.setBounds(20,230,80,30);
        eventButton.setFocusable(false);
        eventButton.addActionListener(this);

        gradesButton = new JButton("Grades");
        gradesButton.setBounds(20,300,80,30);
        gradesButton.setFocusable(false);
        gradesButton.addActionListener(this);

        logOutButton = new JButton("Log out");
        logOutButton.setBounds(20,370,80,30);
        logOutButton.setFocusable(false);
        logOutButton.addActionListener(this);

        this.add(homeButton);
        this.add(requestButton);
        this.add(enrollButton);
        this.add(eventButton);
        this.add(gradesButton);
        this.add(logOutButton);
        this.add(homePageDisplay);

        this.setBackground(Color.GRAY);
        this.setLayout(null);
        this.setBounds(20,20,540,540);
        this.setVisible(false);
    }

    public void showHomePage(boolean b){
        this.setVisible(b);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==homeButton){
            homePageDisplay.home.showHome(true);
            homePageDisplay.request.showRequest(false);
            homePageDisplay.event.showEvent(false);
            homePageDisplay.enroll.showEnroll(false);
            homePageDisplay.grades.showGrades(false);
        }
        else if(e.getSource()==requestButton){
            homePageDisplay.home.showHome(false);
            homePageDisplay.request.showRequest(true);
            homePageDisplay.event.showEvent(false);
            homePageDisplay.enroll.showEnroll(false);
            homePageDisplay.grades.showGrades(false);
        }
        else if (e.getSource()==enrollButton) {
            homePageDisplay.home.showHome(false);
            homePageDisplay.request.showRequest(false);
            homePageDisplay.event.showEvent(false);
            homePageDisplay.enroll.showEnroll(true);
            homePageDisplay.grades.showGrades(false);
        }
        else if(e.getSource()==eventButton){
            homePageDisplay.home.showHome(false);
            homePageDisplay.request.showRequest(false);
            homePageDisplay.event.showEvent(true);
            homePageDisplay.enroll.showEnroll(false);
            homePageDisplay.grades.showGrades(false);
        }
        else if(e.getSource()==gradesButton){
            homePageDisplay.home.showHome(false);
            homePageDisplay.request.showRequest(false);
            homePageDisplay.event.showEvent(false);
            homePageDisplay.enroll.showEnroll(false);
            homePageDisplay.grades.showGrades(true);
        }
        else if(e.getSource()==logOutButton){
           homePageDisplay.home.showHome(true);
           this.showHomePage(false);
           MyFrame.accountType.setVisible(true);
           MyFrame.logInPage.resetField();
        }
    }
}

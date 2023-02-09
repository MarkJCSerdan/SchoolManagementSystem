package com.mark.SMS.SubPages;

import com.mark.SMS.MainPages.LogInPage;
import com.mark.SMS.MyFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StaffHomePage extends JPanel implements ActionListener {
    JButton docRequestButton, uploadCorButton,
            createEventButton, createClassButton,
            profileButton, settingButton, logOutButton;
    JPanel panel;


    public StaffHomePage(){
        panel = new JPanel();
        panel.setBounds(50,50,490,350);
        panel.setBackground(Color.CYAN);
        panel.setLayout(new GridLayout(2,2,20,20));

        docRequestButton = new JButton("Document");
        uploadCorButton = new JButton("Update COR");
        createClassButton = new JButton("Create Class");
        createEventButton = new JButton("Create Event");

        panel.add(docRequestButton);
        panel.add(uploadCorButton);
        panel.add(createClassButton);
        panel.add(createEventButton);

        profileButton = new JButton("Profile");
        profileButton.setBounds(130,440,100,30);
        profileButton.setFocusable(false);
        profileButton.addActionListener(this);

        settingButton = new JButton("Settings");
        settingButton.setBounds(250, 440, 100,30);
        settingButton.setFocusable(false);
        settingButton.addActionListener(this);

        logOutButton = new JButton("Log Out");
        logOutButton.setBounds(370, 440, 100,30);
        logOutButton.setFocusable(false);
        logOutButton.addActionListener(this);

        this.add(panel);
        this.add(profileButton);
        this.add(settingButton);
        this.add(logOutButton);
        this.setBackground(Color.YELLOW);
        this.setLayout(null);
        this.setBounds(100,60,590,540);
        this.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==logOutButton){
            this.setVisible(false);
            MyFrame.homePage.setVisible(false);
            LogInPage.chooseAccountPage.setVisible(true);
            MyFrame.logInPage.setVisible(true);
        }
        if(e.getSource()==profileButton){
            this.setVisible(false);
            MyFrame.homePage.profilePage.setVisible(true);
        }
    }
}

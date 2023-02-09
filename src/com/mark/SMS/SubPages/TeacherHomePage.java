package com.mark.SMS.SubPages;

import com.mark.SMS.MainPages.LogInPage;
import com.mark.SMS.MyFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeacherHomePage extends JPanel implements ActionListener {
    JPanel panel;
    JButton uploadGradeButton, logOutButton, settingButton, profileButton;
    public TeacherHomePage(){
        SchoolClass clas = new SchoolClass("Math");
        SchoolClass clas1 = new SchoolClass("Science");
        SchoolClass clas2 = new SchoolClass("PE");
        SchoolClass clas3 = new SchoolClass("Math");
        SchoolClass clas4 = new SchoolClass("Science");
        SchoolClass clas5 = new SchoolClass("PE");
        panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEADING));
        panel.setBounds(20,20,360,270);
        panel.setBackground(Color.CYAN);
        panel.add(clas);
        panel.add(clas1);
        panel.add(clas2);
        panel.add(clas3);
        panel.add(clas4);
        panel.add(clas5);

        uploadGradeButton = new JButton("Upload Grade");
        uploadGradeButton.setBounds(70,340,150,150);

        logOutButton = new JButton("Log Out");
        logOutButton.setBounds(400,130,90,30);
        logOutButton.setFocusable(false);
        logOutButton.addActionListener(this);

        settingButton = new JButton("Settings");
        settingButton.setBounds(400,90,90,30);
        settingButton.setFocusable(false);
        settingButton.addActionListener(this);

        profileButton = new JButton("Profile");
        profileButton.setBounds(400,50,90,30);
        profileButton.setFocusable(false);
        profileButton.addActionListener(this);

        this.add(uploadGradeButton);
        this.add(logOutButton);
        this.add(settingButton);
        this.add(profileButton);
        this.add(panel);
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

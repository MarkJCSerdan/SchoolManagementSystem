package com.mark.SMS.SubPages;

import com.mark.SMS.MainPages.LogInPage;
import com.mark.SMS.MyFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminHomePage extends JPanel implements ActionListener {
    JLabel studentCount, teacherCount, staffCount, totalCount, lastAccountLabel;
    JPanel studentPanel, teacherPanel, staffPanel, totalPanel;
    JButton studentButton, teacherButton, staffButton, totalButton, settingButton, logOutButton;
    JTextField lastAccountDisplay;
    public AdminHomePage(){

        studentButton = new JButton();
        studentButton.add(displayStudentCountPanel());
        studentButton.setLayout(null);
        studentButton.setBackground(Color.LIGHT_GRAY);
        studentButton.setBounds(20,20,150,150);
        studentButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        studentButton.addActionListener(this);

        teacherButton = new JButton();
        teacherButton.add(displayTeacherCountPanel());
        teacherButton.setLayout(null);
        teacherButton.setBackground(Color.LIGHT_GRAY);
        teacherButton.setBounds(220,20,150,150);
        teacherButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        teacherButton.addActionListener(this);

        staffButton = new JButton();
        staffButton.add(displayStaffCountPanel());
        staffButton.setLayout(null);
        staffButton.setBackground(Color.LIGHT_GRAY);
        staffButton.setBounds(420,20,150,150);
        staffButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        staffButton.addActionListener(this);

        totalButton = new JButton();
        totalButton.add(displayTotalCountPanel());
        totalButton.setLayout(null);
        totalButton.setBackground(Color.LIGHT_GRAY);
        totalButton.setBounds(200,200,190,100);
        totalButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        totalButton.addActionListener(this);

        settingButton = new JButton("Settings");
        settingButton.setBounds(40, 460, 100, 40);
        settingButton.setFocusable(false);
        settingButton.addActionListener(this);

        logOutButton = new JButton("Log Out");
        logOutButton.setBounds(450, 460, 100,40);
        logOutButton.setFocusable(false);
        logOutButton.addActionListener(this);

        lastAccountLabel = new JLabel("Last Account Registered");
        lastAccountLabel.setBounds(50, 350, 150, 30);

        lastAccountDisplay = new JTextField();
        lastAccountDisplay.setBounds(50, 380, 490, 30);
        lastAccountDisplay.setEditable(false);

        //Adding components to the AdminHomePage
        this.add(studentButton);
        this.add(teacherButton);
        this.add(staffButton);
        this.add(totalButton);
        this.add(settingButton);
        this.add(logOutButton);
        this.add(lastAccountLabel);
        this.add(lastAccountDisplay);

        this.setBackground(Color.YELLOW);
        this.setLayout(null);
        this.setBounds(100,60,590,540);
        this.setVisible(false);
    }

    public JPanel displayStudentCountPanel(){
        studentPanel = new JPanel();
        studentCount = new JLabel();

        JLabel label = new JLabel("Student");
        label.setBounds(40,0,100,40);

        studentPanel.add(label);
        studentPanel.add(studentCount);
        studentPanel.setBackground(Color.green);
        studentPanel.setLayout(null);
        studentPanel.setBounds(2,2,146,146);

        return studentPanel;
    }

    public JPanel displayTeacherCountPanel(){
        teacherPanel = new JPanel();
        teacherCount = new JLabel();

        JLabel label = new JLabel("Teacher");
        label.setBounds(40,0,100,40);

        teacherPanel.add(label);
        teacherPanel.add(teacherCount);
        teacherPanel.setBackground(Color.green);
        teacherPanel.setLayout(null);
        teacherPanel.setBounds(2,2,146,146);

        return teacherPanel;
    }

    public JPanel displayStaffCountPanel(){
        staffPanel = new JPanel();
        staffCount = new JLabel();

        JLabel label = new JLabel("Staff");
        label.setBounds(55,0,100,40);

        staffPanel.add(label);
        staffPanel.add(staffCount);
        staffPanel.setBackground(Color.green);
        staffPanel.setLayout(null);
        staffPanel.setBounds(2,2,146,146);

        return staffPanel;
    }

    public JPanel displayTotalCountPanel(){
        totalPanel = new JPanel();
        totalCount = new JLabel();

        JLabel label = new JLabel("Account Registered: ");
        label.setBounds(30,0,120,40);

        totalPanel.add(label);
        totalPanel.add(staffCount);
        totalPanel.setBackground(Color.green);
        totalPanel.setLayout(null);
        totalPanel.setBounds(2,2,186,96);

        return totalPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==logOutButton){
            this.setVisible(false);
            MyFrame.homePage.setVisible(false);
            LogInPage.chooseAccountPage.setVisible(true);
            MyFrame.logInPage.setVisible(true);
        }
    }
}

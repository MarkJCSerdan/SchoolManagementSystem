package com.mark.SMS.SubPages;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentHomePage extends JPanel implements ActionListener {
    JButton[] gridPanelButtons;
    JPanel gridPanel, greetingPanel;
    JButton viewProfileButton, settingButton, logOutButton;
    JLabel greetingLabel, userLabel;
    public StudentHomePage(){
        Font font = new Font("Verdana", Font.BOLD, 20);

        gridPanel = new JPanel();
        gridPanel.setBounds(60,270,475,250);
        gridPanel.setBackground(Color.CYAN);
        gridPanel.setLayout(new GridLayout(2,2, 20,20));

        gridPanelButtons = new JButton[4];
        gridPanelButtons[0] = new JButton("My Grades");
        gridPanelButtons[1] = new JButton("My COR");
        gridPanelButtons[2] = new JButton("Request");
        gridPanelButtons[3] = new JButton("Enrollment");

        for(int i=0; i<4; i++){
            gridPanel.add(gridPanelButtons[i]);
            gridPanelButtons[i].setFont(font);
            gridPanelButtons[i].setFocusable(false);
            gridPanelButtons[i].addActionListener(this);
        }

        viewProfileButton = new JButton("View Profile");
        viewProfileButton.setBounds(450, 70, 110, 30);
        viewProfileButton.setFocusable(false);


        settingButton = new JButton("Settings");
        settingButton.setBounds(450, 110, 110, 30);
        settingButton.setFocusable(false);

        logOutButton = new JButton("Log out");
        logOutButton.setBounds(450, 150, 110, 30);
        logOutButton.setFocusable(false);

        greetingPanel = new JPanel();
        greetingPanel.setBounds(40,30,350,200);
        greetingPanel.setLayout(null);
        greetingPanel.setBackground(Color.LIGHT_GRAY);

        greetingLabel = new JLabel("Good Day!");
        greetingLabel.setBounds(30, 50, 200, 30);
        greetingLabel.setFont(new Font("MV Boli", Font.PLAIN, 28));

        userLabel = new JLabel("Mark");
        userLabel.setBounds(120, 100, 200, 30);
        userLabel.setFont(new Font("MV Boli", Font.PLAIN, 28));

        greetingPanel.add(greetingLabel);
        greetingPanel.add(userLabel);

        //Adding components to the StudentHomePage
        this.add(gridPanel);
        this.add(greetingPanel);
        this.add(viewProfileButton);
        this.add(logOutButton);
        this.add(settingButton);

        this.setBackground(Color.YELLOW);
        this.setLayout(null);
        this.setBounds(100,60,590,540);
        this.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

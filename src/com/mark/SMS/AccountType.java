package com.mark.SMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AccountType extends JPanel implements ActionListener {
    JLabel des;
    JButton studentChoice, staffChoice, teacherChoice, admin;

    AccountType(){

        des = new JLabel("Log in as: ");
        des.setBounds(210, 40, 100, 100);
        des.setFont(new Font(null, Font.BOLD, 18));

        studentChoice = new JButton("Student");
        studentChoice.setBounds(205, 130, 100, 30);
        studentChoice.addActionListener(this);

        teacherChoice = new JButton("Teacher");
        teacherChoice.setBounds(205, 170, 100, 30);

        staffChoice = new JButton("Staff");
        staffChoice.setBounds(205, 210, 100, 30);

        admin = new JButton("Admin");
        admin.setBounds(205, 250, 100, 30);

        this.add(des);
        this.add(studentChoice);
        this.add(teacherChoice);
        this.add(staffChoice);
        this.add(admin);
        this.setBackground(Color.CYAN);
        this.setLayout(null);
        this.setBounds(25,20,540,540);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==studentChoice){

        }
    }
}

package com.mark.SMS.SubPages;

import com.mark.SMS.People.Student;

import javax.swing.*;
import java.awt.*;

public class SchoolClass extends JPanel {
    String subject;
    String day;
    Student studentList;
    public SchoolClass(String subject){
        this.subject = subject;
        JLabel label = new JLabel();
        label.setText(getSubject());

        this.add(label);
        this.setBackground(Color.DARK_GRAY);
        this.setPreferredSize(new Dimension(100,100));
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Student getStudentList() {
        return studentList;
    }

    public void setStudentList(Student studentList) {
        this.studentList = studentList;
    }
}

package com.mark.SMS;

import javax.swing.*;
import java.awt.*;

public class HomePageDisplay extends JPanel {
    Home home;
    Event event;
    Enroll enroll;
    Request request;
    Grades grades;
    HomePageDisplay(){
        home = new Home();
        event = new Event();
        enroll = new Enroll();
        request = new Request();
        grades = new Grades();

        this.add(home);
        this.add(event);
        this.add(enroll);
        this.add(request);
        this.add(grades);
        this.setBounds(140, 14, 500, 500);
        this.setLayout(null);
        this.setBackground(Color.CYAN);
        this.setVisible(true);
    }

    public void showHomePageDisplay(boolean b){
        this.setVisible(b);
    }
}

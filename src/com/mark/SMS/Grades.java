package com.mark.SMS;

import javax.swing.*;
import java.awt.*;

public class Grades extends JPanel {
    Grades(){

        this.setBounds(0,0, 500,500);
        this.setBackground(Color.MAGENTA);
        this.setLayout(null);
        this.setVisible(false);
    }

    public void showGrades(boolean b){
        this.setVisible(b);
    }
}

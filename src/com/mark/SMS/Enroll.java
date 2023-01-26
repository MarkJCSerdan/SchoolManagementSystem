package com.mark.SMS;

import javax.swing.*;
import java.awt.*;

public class Enroll extends JPanel {
    Enroll(){

        this.setBounds(0,0, 500,500);
        this.setBackground(Color.YELLOW);
        this.setLayout(null);
        this.setVisible(false);
    }

    public void showEnroll(boolean b){
        this.setVisible(b);
    }
}

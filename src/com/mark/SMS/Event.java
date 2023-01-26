package com.mark.SMS;

import javax.swing.*;
import java.awt.*;

public class Event extends JPanel {
    Event(){

        this.setBounds(0,0, 500,500);
        this.setBackground(Color.RED);
        this.setLayout(null);
        this.setVisible(false);
    }

    public void showEvent(boolean b){
        this.setVisible(b);
    }

}

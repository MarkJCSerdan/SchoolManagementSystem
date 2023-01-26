package com.mark.SMS;

import javax.swing.*;
import java.awt.*;

public class Home extends JPanel {
    Home(){

        this.setBounds(0,0, 500,500);
        this.setBackground(Color.DARK_GRAY);
        this.setLayout(null);
        this.setVisible(true);
    }

    public void showHome(boolean b){
        this.setVisible(b);
    }
}

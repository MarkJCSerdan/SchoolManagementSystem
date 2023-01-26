package com.mark.SMS;

import javax.swing.*;
import java.awt.*;

public class Request extends JPanel {
    Request(){

        this.setBounds(0,0, 500,500);
        this.setBackground(Color.pink);
        this.setLayout(null);
        this.setVisible(false);
    }

    public void showRequest(boolean b){
        this.setVisible(b);
    }
}

package com.mark.SMS.MainPages;

import com.mark.SMS.AccountList;
import com.mark.SMS.SubPages.SignUpForm;

import javax.swing.*;
import java.awt.*;

public class SignUpPage extends JPanel {
    public static SignUpForm signUpForm;
    public SignUpPage(){

        signUpForm = new SignUpForm();

        //Adding SubPages to SignUpPage
        this.add(signUpForm);

        this.setLayout(null);
        this.setBackground(Color.GRAY);
        this.setBounds(0,0,800,700);
        this.setVisible(false);
    }

}

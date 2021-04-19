package com.company.View.Test;

import javax.swing.*;

public class SigninPanelTest extends JPanel {

    private JLabel userLabel;
    private JLabel passwordLabel;
    private JTextField userTextfield;
    private JPasswordField passwordTextfield;
    private JButton submitButton;
    private JButton registerButton;

    public SigninPanelTest(){
        //Create UI elements
        createUIelements();

        //create
        createLayoutSignin();

    }

    private void createUIelements(){
        userLabel = new JLabel("User :");
        passwordLabel = new JLabel("Password :");
        userTextfield = new JTextField();
        passwordTextfield = new JPasswordField();
        submitButton = new JButton("Submit");
        registerButton = new JButton("Register");
    }

    private void createLayoutSignin(){
            this.add(userLabel);
            this.add(passwordLabel);
            this.add(userTextfield);
            this.add(passwordTextfield);
            this.add(submitButton);
            this.add(registerButton);
    }
}

package com.company.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class SigninView{

    private JFrame signinFrame;
    private JLabel userLabel;
    private JLabel passwordLabel;
    private JTextField userTextfield;
    private JPasswordField passwordTextfield;
    private JButton submitButton;
    private JButton registerButton;

    public SigninView(String title) {
        //set frame (window)
        signinFrame = new JFrame(title);
        signinFrame.getContentPane().setLayout(new BorderLayout());
        signinFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        signinFrame.setSize(400,200);
        signinFrame.setLocationRelativeTo(null);
        signinFrame.setResizable(false);
        signinFrame.setVisible(true);

        //Create UI elements
        createUIelements();

        //create layout
        createLayoutSignin();

    }

    public void addSigninListener(ActionListener listenForRegisterButton){
        registerButton.addActionListener(listenForRegisterButton);
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
        GroupLayout layout = new GroupLayout(signinFrame.getContentPane());
        signinFrame.getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(userLabel)
                                        .addComponent(passwordLabel)
                                        .addComponent(submitButton))
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(userTextfield)
                                        .addComponent(passwordTextfield)
                                        .addComponent(registerButton))))
        );
        layout.linkSize(SwingConstants.HORIZONTAL, userLabel, passwordLabel);
        layout.linkSize(SwingConstants.HORIZONTAL, submitButton, registerButton);
        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(userLabel)
                        .addComponent(userTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(passwordLabel)
                        .addComponent(passwordTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(submitButton)
                        .addComponent(registerButton))
        );
    }
}

/*

 public JFrame getSigninFrame() {
        return signinFrame;
    }

    public void setSigninFrame(JFrame signinFrame) {
        this.signinFrame = signinFrame;
    }

    public JLabel getUserLabel() {
        return userLabel;
    }

    public void setUserLabel(JLabel userLabel) {
        this.userLabel = userLabel;
    }

    public JLabel getPasswordLabel() {
        return passwordLabel;
    }

    public void setPasswordLabel(JLabel passwordLabel) {
        this.passwordLabel = passwordLabel;
    }

    public JTextField getUserTextfield() {
        return userTextfield;
    }

    public void setUserTextfield(JTextField userTextfield) {
        this.userTextfield = userTextfield;
    }

    public JPasswordField getPasswordTextfield() {
        return passwordTextfield;
    }

    public void setPasswordTextfield(JPasswordField passwordTextfield) {
        this.passwordTextfield = passwordTextfield;
    }

    public JButton getSubmitButton() {
        return submitButton;
    }

    public void setSubmitButton(JButton submitButton) {
        this.submitButton = submitButton;
    }

    public JButton getRegisterButton() {
        return registerButton;
    }

    public void setRegisterButton(JButton registerButton) {
        this.registerButton = registerButton;
    }
 */

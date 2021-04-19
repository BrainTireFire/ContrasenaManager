package com.company.View;

import javax.swing.*;
import java.awt.*;

public class RegisterView implements createViewWindow{

    private JFrame registerFrame;
    private JLabel userLabel;
    private JLabel passwordLabel;
    private JLabel emailLabel;
    private JLabel nameLabel;
    private JLabel surnameLabel;
    private JTextField userTextfield;
    private JTextField passwordTextfield;
    private JTextField emailTextfield;
    private JTextField nameTextfield;
    private JTextField surnameTextfield;
    private JButton submitButton;

    public RegisterView() {
        //set register frame
        registerFrame = new JFrame("Register");
        registerFrame.getContentPane().setLayout(new BorderLayout());
        registerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registerFrame.setSize(500,500);
        registerFrame.setLocationRelativeTo(null);
        registerFrame.setResizable(false);
        registerFrame.setVisible(true);

        //Create UI elements
        createUIelements();
    }


    @Override
    public void createLayoutSignin() {

    }

    @Override
    public void createUIelements() {

    }
}


/*
   private void createUIelements(){
        userLabel = new JLabel("User :");
        passwordLabel = new JLabel("Password :");
        emailLabel = new JLabel("Email :");
        nameLabel = new JLabel("Name :");
        surnameLabel = new JLabel("Surname :");

        userTextfield = new JTextField();
        passwordTextfield = new JPasswordField();
        emailTextfield = new JPasswordField();
        nameTextfield = new JPasswordField();
        surnameTextfield = new JPasswordField();

        submitButton = new JButton("Submit");
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
 */
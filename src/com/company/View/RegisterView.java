package com.company.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class RegisterView{

    private JFrame registerFrame;
    private JLabel userLabel;
    private JLabel passwordLabel;
    private JLabel emailLabel;
    private JLabel nameLabel;
    private JLabel surnameLabel;
    private JTextField userTextfield;
    private JPasswordField passwordTextfield;
    private JTextField emailTextfield;
    private JTextField nameTextfield;
    private JTextField surnameTextfield;
    private JButton submitButton;

    public RegisterView() {
        //set register frame
        registerFrame = new JFrame("Register");
        registerFrame.getContentPane().setLayout(new BorderLayout());
        registerFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        registerFrame.setSize(500,300);
        registerFrame.setLocationRelativeTo(null);
        registerFrame.setResizable(false);
        registerFrame.setVisible(true);

        //Create UI elements
        createUIelements();

        //create layout
        createLayoutRegistration();
    }

    public String getTextFieldContent(){
        return nameTextfield.getText() + " " + surnameTextfield.getText() + " " + emailTextfield.getText() + " " +  userTextfield.getText()  + " " + passwordTextfield.getText();
    }

    public void addRegisterListener(ActionListener listenForSumbitButton){
        submitButton.addActionListener(listenForSumbitButton);
    }

    public void closeFrame(){
        registerFrame.dispose();
    }

    private void createUIelements(){
        userLabel = new JLabel("User :");
        passwordLabel = new JLabel("Password :");
        emailLabel = new JLabel("Email :");
        nameLabel = new JLabel("Name :");
        surnameLabel = new JLabel("Surname :");

        userTextfield = new JTextField();
        passwordTextfield = new JPasswordField();
        emailTextfield = new JTextField();
        nameTextfield = new JTextField();
        surnameTextfield = new JTextField();

        submitButton = new JButton("Submit");
    }


    private void createLayoutRegistration(){
        GroupLayout layout = new GroupLayout(registerFrame.getContentPane());
        registerFrame.getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(nameLabel)
                                        .addComponent(surnameLabel)
                                        .addComponent(emailLabel)
                                        .addComponent(userLabel)
                                        .addComponent(passwordLabel)
                                        .addComponent(submitButton))
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(nameTextfield)
                                        .addComponent(surnameTextfield)
                                        .addComponent(emailTextfield)
                                        .addComponent(userTextfield)
                                        .addComponent(passwordTextfield))))
        );
        layout.linkSize(SwingConstants.HORIZONTAL, userLabel, passwordLabel, nameLabel, surnameLabel, emailLabel);
        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(nameLabel)
                        .addComponent(nameTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(surnameLabel)
                        .addComponent(surnameTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(emailLabel)
                        .addComponent(emailTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(userLabel)
                        .addComponent(userTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(passwordLabel)
                        .addComponent(passwordTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(submitButton))
        );
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
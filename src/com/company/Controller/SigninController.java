package com.company.Controller;

import com.company.Model.Person;
import com.company.View.SigninView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SigninController {
    private SigninView signinView;
    private Person personModel;

    public SigninController(SigninView signinView, Person personModel) {
        this.signinView = signinView;
        this.personModel = personModel;
    }

    public void initSigninView(){
        signinView.getSubmitButton().addActionListener(e -> checkUser());
       // signinView.getRegisterButton().addActionListener();
    }

    private void checkUser(){
        if(personModel.getLogin().equals(signinView.getUserTextfield().getText()) && personModel.getPassword().equals(signinView.getPasswordTextfield().getText())){
            JOptionPane.showMessageDialog(null, "Correct", "Info", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Incorrect", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}

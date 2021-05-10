package com.company.Controller;

import com.company.Model.Person;
import com.company.Model.PersonList;
import com.company.Model.Vaults;
import com.company.View.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SigninController {
    private SigninView signinView;
    private PersonList personList;
    private PasswordManagerView passwordManagerView;


    public SigninController(SigninView signinView, PersonList personList) {
        this.signinView = signinView;
        this.personList = personList;

       // this.signinView.addSigninListener(new SigninListener());
        //this.signinView.addSumbitButtonListener(new SumbitButtonListener());
    }

    public void setPersonList(){

    }

    /*
    class SigninListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            RegisterController registerController = new RegisterController(new RegisterView(), personList);
        }
    }

    class SumbitButtonListener implements  ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if(personModel.checkUserAccount(signinView.getTextFieldContent())){
                //JOptionPane.showMessageDialog(null, "Correct", "Info", JOptionPane.INFORMATION_MESSAGE);
                signinView.closeFrame();
                PasswordManagerController passwordManagerController = new PasswordManagerController(new VaultItemPanelView(), new VaultItemPanelController(), new VaultPanelView(), new VaultPanelController());
            }else{
               // JOptionPane.showMessageDialog(null, "Incorrect", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
      }
    }

     */

}

/*
!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! ZLE MYSLENIE !!!!!!!!!!!!!!!!!!!!!!!!!!!!

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
 */

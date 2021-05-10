package com.company.Controller;

import com.company.Model.Person;
import com.company.Model.PersonList;
import com.company.View.RegisterView;
import com.company.View.SigninView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterController {
    private SigninView signinView;
    private RegisterView registerView;
    private PersonList personList;

    public RegisterController(RegisterView registerView){
        this.registerView = registerView;

       // this.registerView.addRegisterListener(new RegisterListener());
    }



    /*
    class RegisterListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
           // personList.add();
            registerView.closeFrame();
        }
    }


     */
}

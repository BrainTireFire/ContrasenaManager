package com.company.Controller;

import com.company.Model.Person;
import com.company.View.RegisterView;
import com.company.View.SigninView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterController {
    private SigninView signinView;
    private RegisterView registerView;
    private Person personModel;

    public RegisterController(RegisterView registerView, Person personModel){
        this.registerView = registerView;
        this.personModel = personModel;

        this.registerView.addRegisterListener(new RegisterListener());
    }

    class RegisterListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            personModel.registerNewPerson(registerView.getTextFieldContent());
            registerView.closeFrame();
        }
    }
}

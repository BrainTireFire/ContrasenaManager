package com.company.Controller;

import com.company.Model.Person;
import com.company.Model.PersonList;
import com.company.View.PasswordManagerView;
import com.company.View.RegisterView;
import com.company.View.SigninView;

public class PersonController {
    private RegisterView registerView;
    private PersonList personList;
    private PasswordManagerView passwordManagerView;


    public PersonController(RegisterView registerView, PersonList personList) {
        this.registerView = registerView;
        this.personList = personList;

    }

    public void setPersonList(){
      // personList.add(registerView.getPerson());
    }


}

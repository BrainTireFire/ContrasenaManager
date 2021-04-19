package com.company;

import com.company.Controller.SigninController;
import com.company.Model.Person;
import com.company.View.SigninView;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Tomek", "Kot", "mas@gmail.com", "admin", "admin", 1);


        SwingUtilities.invokeLater(() -> {
            try {
                SigninController signinController = new SigninController(new SigninView("Password"), person);
            }catch (Exception ex) {
                ex.printStackTrace();
            }
        });
    }
}



/*


layout.setHorizontalGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(userLabel)
                                        .addComponent(passwordLabel))
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(userTextfield)
                                        .addComponent(passwordTextfield))
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(submitButton)
                                        .addComponent(registerButton))
        );
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

           layout.setHorizontalGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(userLabel)
                                                .addComponent(passwordLabel))
                                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(userTextfield)
                                                .addComponent(passwordTextfield)))
                                )
        );
       layout.linkSize(SwingConstants.HORIZONTAL, userLabel, passwordLabel);

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(userLabel)
                                    .addComponent(userTextfield))
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(passwordLabel)
                                    .addComponent(passwordTextfield))))
        );


        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(userLabel)
                        .addComponent(passwordLabel))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(userTextfield)
                        .addComponent(passwordTextfield)
                        .addComponent(submitButton)
                        .addComponent(registerButton))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING))
 */
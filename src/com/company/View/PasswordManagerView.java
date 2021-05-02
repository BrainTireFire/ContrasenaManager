package com.company.View;

import javax.swing.*;
import java.awt.*;

public class PasswordManagerView extends JFrame {

    public PasswordManagerView(){
        //set register frame
        new JFrame("Register");
        this.getContentPane().setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }
}

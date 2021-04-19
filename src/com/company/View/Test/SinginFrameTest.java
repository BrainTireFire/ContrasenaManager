package com.company.View.Test;

import javax.swing.*;
import java.awt.*;

public class SinginFrameTest extends JFrame{


    public SinginFrameTest(){
        //set frame (window)
        this.setTitle("Sign in");
        this.getContentPane().setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,200);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);

    }
}

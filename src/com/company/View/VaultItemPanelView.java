package com.company.View;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionListener;

public class VaultItemPanelView extends JPanel{

    Border blackline = BorderFactory.createLineBorder(Color.black);
    private JPanel rightMiddlePanel, rightDownPanel, vaultItemContentPanel;
    private JButton editVaultPoleButton, saveVaultPoleButton, deleteVaultPoleButton;
    private Label nameLabel, usernameLabel, passwordLabel ,descriptionLabel;
    private JTextField nameTextfiled, passwordTextField,  usernameTextfiled, descriptionTextfield;
   // private JPasswordField passwordField;

    public VaultItemPanelView(){

        //PANEL
        rightMiddlePanel = new JPanel();
        rightDownPanel = new JPanel();
        vaultItemContentPanel = new JPanel();

        //MAIN PANEL
        this.setVisible(true);
        this.setLayout(new BorderLayout());
        this.add(rightMiddlePanel, BorderLayout.CENTER);
        this.add(rightDownPanel, BorderLayout.SOUTH);
        vaultItemContentPanel.setVisible(false);

        //BUTTONS
        saveVaultPoleButton = new JButton("Save");
        saveVaultPoleButton.setPreferredSize(new Dimension(60,60));
        saveVaultPoleButton.setBorder(blackline);
        saveVaultPoleButton.setBackground(new Color(255, 250 ,240));

        editVaultPoleButton = new JButton("Edit");
        editVaultPoleButton.setPreferredSize(new Dimension(60,60));
        editVaultPoleButton.setBorder(blackline);
        editVaultPoleButton.setBackground(new Color(255, 250 ,240));

        deleteVaultPoleButton = new JButton("Delete");
        deleteVaultPoleButton.setPreferredSize(new Dimension(60,60));
        deleteVaultPoleButton.setBorder(blackline);
        deleteVaultPoleButton.setBackground(new Color(255, 250 ,240));

        //TEXTFIELD and LABEL
        nameLabel = new Label("Name");
        usernameLabel = new Label("Username");
        passwordLabel = new Label("Password");
        descriptionLabel = new Label("Description");

        nameTextfiled = new JTextField(50);
        usernameTextfiled = new JTextField(50);
        passwordTextField = new JTextField(50);
        descriptionTextfield = new JTextField(50);

        //PANEL SET UP
        rightMiddlePanel.setPreferredSize(new Dimension(700,300));
        vaultItemContentPanel.setPreferredSize(new Dimension(500,300));
        rightDownPanel.setPreferredSize(new Dimension(700,75));
        vaultItemContentPanel.setLayout(new GridLayout(4, 1, 5, 5));

        //NAME LABEL AND TEXTFIELD
        vaultItemContentPanel.setBackground(Color.PINK);
        rightMiddlePanel.setBackground(Color.white);
        rightMiddlePanel.setBorder(blackline);
        vaultItemContentPanel.add(nameLabel);
        vaultItemContentPanel.add(nameTextfiled);
        vaultItemContentPanel.add(usernameLabel);
        vaultItemContentPanel.add(usernameTextfiled);
        vaultItemContentPanel.add(passwordLabel);
        vaultItemContentPanel.add(passwordTextField);
        vaultItemContentPanel.add(descriptionLabel);
        vaultItemContentPanel.add(descriptionTextfield);

        rightMiddlePanel.add(vaultItemContentPanel);
        rightDownPanel.setBackground(Color.white);
        rightDownPanel.setBorder(blackline);
        rightDownPanel.add(saveVaultPoleButton);
        rightDownPanel.add(editVaultPoleButton);
        rightDownPanel.add(deleteVaultPoleButton);

    }

    public String getTextFieldContent(){
        return nameTextfiled.getText()  + " " + usernameTextfiled.getText() + " " + passwordTextField.getText() + " " + descriptionTextfield.getText();
    }

    public void saveVaultPoleButtonListener(ActionListener actionListener){
        saveVaultPoleButton.addActionListener(actionListener);
    }


    public void setPanelVisible(){
        vaultItemContentPanel.setVisible(true);
    }


}

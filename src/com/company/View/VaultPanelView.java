package com.company.View;

import com.company.Controller.VaultItemPanelController;
import com.company.Controller.VaultPanelController;
import com.company.Model.ListVaultsButton;
import com.company.Model.Vaults;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VaultPanelView extends JPanel {

    Border blackline = BorderFactory.createLineBorder(Color.black);
    private JPanel middleUpPanel;
    private JPanel middleMiddlePanel;
    private JPanel middleDownPanel;
    private JTextField searchVaultTextField;
    private JButton addNewVaultMiddleButton, searchVaultButton, defaultVaultButton;
    private JButton newVaultButton;

    private ListVaultsButton<JButton> listVaultsButton;


    public VaultPanelView() {
        listVaultsButton = new ListVaultsButton<>();

        middleUpPanel = new JPanel();
        middleMiddlePanel = new JPanel();
        middleDownPanel = new JPanel();

        //MAIN panel
        this.setVisible(true);
        this.setLayout(new BorderLayout());
        this.add(middleUpPanel, BorderLayout.NORTH);
        this.add(middleMiddlePanel, BorderLayout.CENTER);
        this.add(middleDownPanel, BorderLayout.SOUTH);

        //button and Textfield middle
        addNewVaultMiddleButton = new JButton("Add new password pole");
        addNewVaultMiddleButton.setPreferredSize(new Dimension(500, 60));
        addNewVaultMiddleButton.setBorder(blackline);
        addNewVaultMiddleButton.setBackground(new Color(255, 250, 240));

        searchVaultButton = new JButton("Search");
        searchVaultButton.setPreferredSize(new Dimension(60, 60));
        searchVaultButton.setBorder(blackline);
        searchVaultButton.setBackground(new Color(32, 178, 170));

        searchVaultTextField = new JTextField();
        searchVaultTextField.setPreferredSize(new Dimension(400, 60));
        searchVaultTextField.setBorder(blackline);
        searchVaultTextField.setBackground(new Color(0, 139, 139));

        //SET UP PANELS
        middleUpPanel.setBackground(new Color(0, 128, 128));
        middleMiddlePanel.setBackground(new Color(255, 255, 240));
        middleDownPanel.setBackground(new Color(255, 255, 240));

        middleUpPanel.setPreferredSize(new Dimension(200, 100));
        middleMiddlePanel.setPreferredSize(new Dimension(200, 3000));
        middleDownPanel.setPreferredSize(new Dimension(200, 75));
        JScrollPane scrollFrame = new JScrollPane(middleMiddlePanel);
        middleMiddlePanel.setAutoscrolls(true);
        scrollFrame.setPreferredSize(new Dimension(800, 300));
        this.add(scrollFrame);

        middleMiddlePanel.setBorder(blackline);
        middleDownPanel.setBorder(blackline);
        middleUpPanel.setBorder(blackline);

        middleUpPanel.add(searchVaultTextField);
        middleUpPanel.add(searchVaultButton);
        middleDownPanel.add(addNewVaultMiddleButton);

        defaultVaultButton = new JButton("default Vault");
        defaultVaultButton.setPreferredSize(new Dimension(500, 60));
        defaultVaultButton.setBorder(blackline);
        defaultVaultButton.setBackground(new Color(154, 205, 50));

        middleMiddlePanel.add(defaultVaultButton);

/*
        addNewVaultMiddleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                newVaultButton = new JButton("Vault");
                newVaultButton.setPreferredSize(new Dimension(500, 60));
                newVaultButton.setBorder(blackline);
                newVaultButton.setBackground(new Color(154, 205, 50));
                middleMiddlePanel.add(newVaultButton);
                middleMiddlePanel.revalidate();
            }
        });

 */


    }

    public void newDefaultVaultLisener(ActionListener actionListener) {
        defaultVaultButton.addActionListener(actionListener);
    }

    public void newVaultMiddleButtontLisener(ActionListener actionListener) {
        addNewVaultMiddleButton.addActionListener(actionListener);
    }

    public void createVault(ActionListener actionListener){
        listVaultsButton.add(newVaultButton = new JButton("Vault"));
        newVaultButton.setPreferredSize(new Dimension(500, 60));
        newVaultButton.setBorder(blackline);
        newVaultButton.setBackground(new Color(154, 205, 50));
        newVaultButton.addActionListener(actionListener);
        middleMiddlePanel.add(newVaultButton);
        middleMiddlePanel.revalidate();
    }

    public void setNameNewVaultButton(String name){
        newVaultButton.setText(name);
    }



/*
    public ActionListener setActionListnerNewVaultButton(){
        ActionListener defaultVaultLisener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };

        return defaultVaultLisener;
    }


 */

}

package com.company.View;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class PasswordManagerView extends JFrame {

    Border blackline = BorderFactory.createLineBorder(Color.black);
    private JPanel mainPanel;
    private JPanel leftMainPanel;
    private JPanel leftMiddlePanel;
    private JPanel leftDownPanel;
    private VaultItemPanelView vaultItemPanel;
    private VaultPanelView vaultPanel;

    /*
    private JPanel middleMainPanel;
    private JPanel middleUpPanel;
    private JPanel middleMiddlePanel;
    private JPanel middleDownPanel;
    private JPanel rightMainPanel;
    private JPanel rightMiddlePanel;
    private JPanel rightDownPanel;

    private JButton addNewVaultMiddleButton, editVaultPoleButton, saveVaultPoleButton, deleteVaultPoleButton, searchVaultButton;
    private JTextField searchVaultTextField;

     */

    public PasswordManagerView(VaultItemPanelView vaultItemPanel, VaultPanelView vaultPanel){
        this.vaultItemPanel = vaultItemPanel;
        this.vaultPanel = vaultPanel;

        //set register frame
        this.setTitle("Contrasena Manager");
        this.getContentPane().setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1500,1000);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);

        createUIelements();

        createLayoutPasswordManager();
    }

    private void createUIelements(){
        mainPanel = new JPanel();

        //panel left
        leftMainPanel = new JPanel();
        leftMiddlePanel = new JPanel();
        leftDownPanel = new JPanel();

        //PANEL middle
     //   vaultPanel = new VaultPanelView();

        //Panel RIGHT
      //  vaultItemPanel = new VaultItemPanelView();

/*
        //panel middle
        middleMainPanel = new JPanel();
        middleUpPanel = new JPanel();
        middleMiddlePanel = new JPanel();
        middleDownPanel = new JPanel();

        //panel right
        rightMainPanel = new JPanel();
        rightMiddlePanel = new JPanel();
        rightDownPanel = new JPanel();



        //button and Textfield middle
        addNewVaultMiddleButton = new JButton("Add new password pole");
        addNewVaultMiddleButton.setPreferredSize(new Dimension(500,60));
        addNewVaultMiddleButton.setBorder(blackline);
        addNewVaultMiddleButton.setBackground(new Color(255, 250 ,240));

        searchVaultButton = new JButton("Search");
        searchVaultButton.setPreferredSize(new Dimension(60,60));
        searchVaultButton.setBorder(blackline);
        searchVaultButton.setBackground(new Color(32 ,178, 170));

        searchVaultTextField = new JTextField();
        searchVaultTextField.setPreferredSize(new Dimension(400,60));
        searchVaultTextField.setBorder(blackline);
        searchVaultTextField.setBackground(new Color(0, 139, 139));
         */
/*
        //button rigth
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
 */
    }

    private void createLayoutPasswordManager(){
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(leftMainPanel, BorderLayout.WEST);
        //mainPanel.add(middleMainPanel, BorderLayout.CENTER);
        //mainPanel.add(rightMainPanel, BorderLayout.EAST);
        mainPanel.add(vaultPanel, BorderLayout.CENTER);
        mainPanel.add(vaultItemPanel, BorderLayout.EAST);
        mainPanel.setBackground(Color.PINK);

        //LEFT PANEL
        leftMainPanel.setBackground(Color.darkGray);
        leftMainPanel.setLayout(new BorderLayout());
        leftMainPanel.add(leftMiddlePanel, BorderLayout.CENTER);
        leftMainPanel.add(leftDownPanel, BorderLayout.SOUTH);

        leftMiddlePanel.setBackground(Color.white);
        leftDownPanel.setBackground(new Color(255, 255,240));


        leftMainPanel.setPreferredSize(new Dimension(200,300));
        leftDownPanel.setPreferredSize(new Dimension(200,75));
        leftMiddlePanel.setBorder(blackline);
        leftDownPanel.setBorder(blackline);

/*
        //Middle Panel
        middleMainPanel.setLayout(new BorderLayout());
        middleMainPanel.add(middleUpPanel, BorderLayout.NORTH);
        middleMainPanel.add(middleMiddlePanel, BorderLayout.CENTER);
        middleMainPanel.add(middleDownPanel, BorderLayout.SOUTH);

        middleUpPanel.setBackground(new Color(0 ,128, 128));
        middleMiddlePanel.setBackground(new Color(255, 255,240));
        middleDownPanel.setBackground(new Color(255, 255,240));

        middleUpPanel.setPreferredSize(new Dimension(200,100));
        middleMiddlePanel.setPreferredSize(new Dimension(200,300));
        middleDownPanel.setPreferredSize(new Dimension(200,75));

        middleMiddlePanel.setBorder(blackline);
        middleDownPanel.setBorder(blackline);
        middleUpPanel.setBorder(blackline);

        middleUpPanel.add(searchVaultTextField);
        middleUpPanel.add(searchVaultButton);
        middleDownPanel.add(addNewVaultMiddleButton);

        //Right Panel
        rightMainPanel.setLayout(new BorderLayout());
        rightMainPanel.add(rightMiddlePanel, BorderLayout.CENTER);
        rightMainPanel.add(rightDownPanel, BorderLayout.SOUTH);

        rightMiddlePanel.setPreferredSize(new Dimension(700,300));
        rightDownPanel.setPreferredSize(new Dimension(700,75));

        rightMiddlePanel.setBackground(Color.white);
        rightDownPanel.setBackground(Color.white);
        rightMiddlePanel.setBorder(blackline);
        rightDownPanel.setBorder(blackline);

        rightDownPanel.add(saveVaultPoleButton);
        rightDownPanel.add(editVaultPoleButton);
        rightDownPanel.add(deleteVaultPoleButton);
 */
        this.setContentPane(mainPanel);
    }



}


/*
mainPanel.setLayout(new BorderLayout());
        mainPanel.add(leftPanel, BorderLayout.LINE_START);

        leftPanel.setLayout(new BorderLayout());
        leftPanel.add(leftDownPanel, BorderLayout.PAGE_END);
        leftPanel.setBackground(Color.BLACK);
        leftPanel.add(Box.createRigidArea(new Dimension(200,5)));

        leftDownPanel.setBackground(Color.RED);
        leftDownPanel.add(Box.createRigidArea(new Dimension(200,100)));

        mainPanel.add(middlePanel, BorderLayout.CENTER);
        middlePanel.setBackground(Color.BLUE);
        middlePanel.add(Box.createRigidArea(new Dimension(400,100)));
        middlePanel.setLayout(new BorderLayout());
        middlePanel.add(middleUpPanel, BorderLayout.PAGE_START);
        middleUpPanel.add(Box.createRigidArea(new Dimension(400,100)));
        middleUpPanel.setBackground(Color.CYAN);
        middlePanel.add(middleDownPanel, BorderLayout.PAGE_END);
        middleDownPanel.add(Box.createRigidArea(new Dimension(400,100)));
        middleDownPanel.setBackground(Color.PINK);
        middlePanel.add(test2);


        mainPanel.add(rightPanel, BorderLayout.LINE_END);
        rightPanel.setBackground(Color.YELLOW);
        rightPanel.add(Box.createRigidArea(new Dimension(600,100)));

        rightPanel.setLayout(new BorderLayout());
        rightPanel.add(rightDownPanel, BorderLayout.PAGE_END);
        rightDownPanel.setBackground(Color.RED);
        rightDownPanel.add(Box.createRigidArea(new Dimension(600,100)));


        this.setContentPane(mainPanel);
 */

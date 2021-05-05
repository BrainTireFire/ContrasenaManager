package com.company.Controller;

import com.company.Model.Vaults;
import com.company.View.VaultItemPanelView;
import com.company.View.VaultPanelView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VaultItemPanelController {

    private VaultItemPanelView vaultItemPanelView;
    private VaultPanelView vaultPanelView;
    private Vaults vaults;

    public  VaultItemPanelController(){

    }

    public VaultItemPanelController(VaultItemPanelView vaultItemPanelView, VaultPanelView vaultPanelView, Vaults vaults) {
        this.vaultItemPanelView = vaultItemPanelView;
        this.vaultPanelView = vaultPanelView;
        this.vaults = vaults;

        this.vaultItemPanelView.saveVaultPoleButtonListener(new SaveVaultPoleButton());
    }

    class SaveVaultPoleButton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            vaults.addNewVault(vaultItemPanelView.getTextFieldContent());
            vaultPanelView.setNameNewVaultButton(vaults.getIdString());
            System.out.println(vaults.toString());
        }
    }




}

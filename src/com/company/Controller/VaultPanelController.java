package com.company.Controller;

import com.company.Model.Vaults;
import com.company.View.VaultItemPanelView;
import com.company.View.VaultPanelView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VaultPanelController {

    private VaultPanelView vaultPanelView;
    private VaultItemPanelView vaultItemPanelView;
    private Vaults vaults;

    public VaultPanelController() {

    }

    public VaultPanelController(VaultPanelView vaultPanelView, VaultItemPanelView vaultItemPanelView) {
        this.vaultPanelView = vaultPanelView;
        this.vaultItemPanelView = vaultItemPanelView;

        this.vaultPanelView.newDefaultVaultLisener(new NewDefaultLisener());
        this.vaultPanelView.newVaultMiddleButtontLisener(new NewVault());
    }

    class NewVault implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            vaultPanelView.createVault(new NewVaultButton());
        }
    }

    class NewVaultButton implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            vaultItemPanelView.setPanelVisible();

        }
    }

    class NewDefaultLisener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {

        }
    }
}


package com.company.Controller;

import com.company.Model.Vaults;
import com.company.View.PasswordManagerView;
import com.company.View.VaultItemPanelView;
import com.company.View.VaultPanelView;

public class PasswordManagerController {

    private VaultItemPanelView vaultItemPanelView;
    private VaultItemPanelController vaultItemPanelController;
    private VaultPanelView vaultPanelView;
    private VaultPanelController vaultPanelController;


    public PasswordManagerController(VaultItemPanelView vaultItemPanelView, VaultItemPanelController vaultItemPanelController, VaultPanelView vaultPanelView, VaultPanelController vaultPanelController) {
        this.vaultItemPanelView = vaultItemPanelView;
        this.vaultItemPanelController = vaultItemPanelController;
        this.vaultPanelView = vaultPanelView;
        this.vaultPanelController = vaultPanelController;

        PasswordManagerView passwordManagerView = new PasswordManagerView(this.vaultItemPanelView, this.vaultPanelView);
        createControllers();

    }

    private void createControllers(){
        vaultItemPanelController = new VaultItemPanelController(vaultItemPanelView, vaultPanelView, new Vaults(0,"test", "test", "test", "test"));
        vaultPanelController = new VaultPanelController(vaultPanelView, vaultItemPanelView);
    }




}

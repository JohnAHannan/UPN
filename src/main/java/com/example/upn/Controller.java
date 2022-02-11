package com.example.upn;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class Controller {
    //Start Main menu
    //------------------------------------------------
    @FXML
    private Button btnCloseMainMenu;

    @FXML
    private Button btnMenuDigitalSlip;

    @FXML
    private Button btnMenuHelp;

    @FXML
    private Button btnMenuPackageIn;

    @FXML
    private Button btnMenuRecipientNav;

    @FXML
    private Label lblStatus;

    @FXML
    private Pane pnlStatus;

    @FXML
    void handleMenuClicks(ActionEvent event) {
        // Recipient navigation
        if(event.getSource() == btnMenuRecipientNav){
            lblStatus.setText("Recipient Navigation");
        }
        // Package inventory / status
        else if(event.getSource() == btnMenuPackageIn){
            lblStatus.setText("Package Inventory / Status");
        }
        // Digital Menu Slip
        else if(event.getSource() == btnMenuDigitalSlip){
            lblStatus.setText("Digital Slip Entry");
        }
        // Help
        else if(event.getSource() == btnMenuHelp){
            lblStatus.setText("Help");
        }
    }
    // End Main Menu
    //------------------------------------------------


    // Start Login
    //------------------------------------------------
    @FXML
    private Button btnCloseMenu;

    @FXML
    private Button btnLoginSubmit;

    @FXML
    private TextField txtBxPassword;

    @FXML
    void handleLoginClicks(ActionEvent event) {

    }
    // End Login
    //------------------------------------------------
}
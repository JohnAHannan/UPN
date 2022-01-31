package com.example.upn;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class Controller {
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
    private void handleClicks(ActionEvent event){
        if(event.getSource() == btnMenuRecipientNav){
            lblStatus.setText("Recipient Navigation");

        }
        else if(event.getSource() == btnMenuPackageIn){
            lblStatus.setText("Package Inventory / Status");

        }
        else if(event.getSource() == btnMenuDigitalSlip){
            lblStatus.setText("Digital Slip Entry");

        }
        else if(event.getSource() == btnMenuHelp){
            lblStatus.setText("Help");

        }
    }
}
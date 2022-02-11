package com.example.upn;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Window;

import java.io.IOException;
import java.net.URL;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.Window;

public class Controller {
    Stage stage = null;
    Parent root = null;

    //Start Main menu
    //------------------------------------------------
    @FXML
    private Button btnCloseMainMenu;

    @FXML
    private Button btnMenuDigitalSlip;

    @FXML
    private Button btnMenuHelp;

    @FXML
    private Button btnMenuLogout;

    @FXML
    private Button btnMenuPackageIn;

    @FXML
    private Button btnMenuRecipientNav;

    @FXML
    private Label lblStatus;

    @FXML
    private Pane pnlStatus;

    @FXML
    void handleMenuClicks(ActionEvent event) throws IOException {
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
        // Logout
        else if(event.getSource()==btnMenuLogout){
            stage = (Stage) btnMenuLogout.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        }
        // Close App
        else if (event.getSource() == btnCloseMainMenu) {
            Stage stage = (Stage) btnCloseMainMenu.getScene().getWindow();
            stage.close();
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    // End Main Menu
    //------------------------------------------------

    //Stage stage = null;
    // Parent root = null;
    // Start Login
    //------------------------------------------------
    @FXML
    private Button btnCloseMenu;

    @FXML
    private Button btnLoginSubmit;

    @FXML
    private PasswordField txtBxPassword;

    @FXML
    private Label lblStatusPassword;

    @FXML
    void handleLoginClicks(ActionEvent event) throws IOException {
        Window owner = btnLoginSubmit.getScene().getWindow();
        String pw = "password";
        System.out.println(txtBxPassword.getText());

        // Login Submit
        if (event.getSource() == btnLoginSubmit) {
            // if Password is empty
            if (txtBxPassword.getText().isEmpty()) {
                return;
            }
            // if entered string is equal to the password
            else if (pw.equals(txtBxPassword.getText())){
                stage = (Stage) btnLoginSubmit.getScene().getWindow();
                root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
            }
            // if incorrect password tell user
            else{
                lblStatusPassword.setText("Incorrect Password");
                return;
            }
        }
        // Close App
        else if (event.getSource() == btnCloseMenu) {
            Stage stage = (Stage) btnCloseMenu.getScene().getWindow();
            stage.close();
            //((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
        }
        //PasswordString = txtBxPassword.getText();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
        // End Login
        //------------------------------------------------
}
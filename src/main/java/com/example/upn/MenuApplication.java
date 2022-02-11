package com.example.upn;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class MenuApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {


    // Start Login
    //------------------------------------------------
        FXMLLoader Login = new FXMLLoader(MenuApplication.class.getResource("Login.fxml"));
        Scene scene0 = new Scene(Login.load(), 950.0, 631.0);
        stage.setTitle("UPN_Login");
        stage.setScene(scene0);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
    // End Login
    //------------------------------------------------


    // Start Main Menu
    //------------------------------------------------
    /*
        FXMLLoader MainMenu = new FXMLLoader(MenuApplication.class.getResource("Menu.fxml"));
        Scene scene1 = new Scene(MainMenu.load(), 950.0, 631.0);
        stage.setTitle("UPN_Menu");
        stage.setScene(scene1);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
    */
    // End Main Menu
    //------------------------------------------------
    }


// main
//------------------------------------------------
    public static void main (String[] args) {
        launch();
    }
}
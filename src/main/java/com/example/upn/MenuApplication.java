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
        /*Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        primaryStage.setTitle("UPN_Menu");
        primaryStage.setScene(new Scene(root));
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.show(); */

        FXMLLoader fxmlLoader = new FXMLLoader(MenuApplication.class.getResource("Menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 950.0, 631.0);
        stage.setTitle("UPN_Menu");
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
    }

    public static void main (String[] args) {
        launch();
    }
}
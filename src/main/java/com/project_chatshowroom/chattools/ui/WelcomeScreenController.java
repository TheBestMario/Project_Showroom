package com.project_chatshowroom.chattools.ui;

import com.project_chatshowroom.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class WelcomeScreenController {
    @FXML
    private Label welcomeText;

    private Stage stage;
    private Scene scene;
    @FXML
    protected void onNextButtonClick() {
        welcomeText.setText("Sending you to the login screen.");
        FXMLLoader fxmlLoader = new FXMLLoader(MainController.class.getResource("View.fxml"));
        this.stage = Application.getStage();
        try {
            this.scene = new Scene(fxmlLoader.load(),400,600);
            stage.setScene(scene);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

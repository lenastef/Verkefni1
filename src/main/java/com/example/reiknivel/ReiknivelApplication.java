package com.example.reiknivel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class ReiknivelApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ReiknivelApplication.class.getResource("Reiknivel.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 310, 390);
        stage.setTitle("Reiknivél");
        stage.setScene(scene);
        stage.show();
        Image icon = new Image("img.png");
        stage.getIcons().add(icon);
    }

    public static void main(String[] args) {
        launch();
    }
}

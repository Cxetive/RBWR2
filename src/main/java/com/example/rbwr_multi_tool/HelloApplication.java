package com.example.rbwr_multi_tool;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("javafx.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("RBWR Multi Tool!");
        stage.setScene(scene);
        stage.show();
        stage.sizeToScene();
        stage.setResizable(false);

    }

    public static void main(String[] args) {
        launch();
    }
}
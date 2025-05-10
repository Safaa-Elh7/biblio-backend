package com.example.todolist;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        Button Ajouter = new Button("Ajouter tache");
        Button Supprimer = new Button("Supprimer tache");
        Button Marquer = new Button("Marquer comme terminee");
        TextField text = new TextField();
        ListView list = new ListView();
        HBox tache = new HBox(20,new Label("what is ur to do list for the day !!!!!"),text,Ajouter, Supprimer, Marquer,list);
        Scene scene = new Scene(tache,1000,600);
        stage.setScene(scene);
        Ajouter.setOnAction(event -> {
            String tacheName = text.getText().trim();
            if (!tacheName.isEmpty()) {
                list.getItems().add(tacheName);
                text.clear();
            }else {
                showAlert("Erreur");
            }
        });
        stage.setTitle("Hello!");
//        stage.setScene(scene);
        stage.show();
    }
    public void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Erreur");
        alert.setHeaderText(message);
        alert.showAndWait();
    }


    public static void main(String[] args) {
        launch(args);
    }
}


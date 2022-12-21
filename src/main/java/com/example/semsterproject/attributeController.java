package com.example.semsterproject;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class attributeController {

    Stage   stage;
    public  void sceneSwitcher(String filename, Button button){

        FXMLLoader fxmlLoader = new FXMLLoader(HomeTaskerController.class.getResource(filename+".fxml"));
        stage = (Stage) button.getScene().getWindow();
        try {
            stage.setScene(new Scene(fxmlLoader.load()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();


    }

}

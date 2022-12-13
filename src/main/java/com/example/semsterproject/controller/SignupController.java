package com.example.semsterproject.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;

import java.net.URL;
import java.util.ResourceBundle;

public class SignupController implements Initializable {
    @FXML
    private ChoiceBox<String> choicebox_gender;
    String [] gender = {"MALE","FEMALE"};


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        choicebox_gender.setValue("Select");
        choicebox_gender.getItems().addAll(gender);

    }
}

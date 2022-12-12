package com.example.semsterproject;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeTaskerController implements Initializable {
    //Signup controller

    @FXML
    private ChoiceBox<String> choicebox_gender;
String [] gender = {"MALE","FEMALE"};
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choicebox_gender.setValue("Select");

        choicebox_gender.getItems().addAll(gender);
    }






}
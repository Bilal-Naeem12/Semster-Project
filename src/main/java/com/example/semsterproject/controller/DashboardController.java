package com.example.semsterproject.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {
    @FXML
    private Circle Userpfp;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Image img =  new Image("D:\\Semster-Project\\src\\main\\resources\\Images\\Profile\\IMG-20200617-WA0011.jpg");

        Userpfp.setFill(new ImagePattern(img));

    }
}

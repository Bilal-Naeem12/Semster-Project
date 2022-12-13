package com.example.semsterproject;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeTaskerController implements Initializable{
    //Signup controller

    @FXML
    private ChoiceBox<String> choicebox_gender;
    String [] gender = {"MALE","FEMALE"};
  // Dashboard
//    @FXML
//    private Circle Userpfp;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

       //Signup

        choicebox_gender.setValue("Select");
        choicebox_gender.getItems().addAll(gender);

        //dashboard

//
//        Image img =  new Image("G:\\comsat\\semster 3\\OOP\\JAVAFX\\Semster-Project\\src\\main\\resources\\Images\\IMG-20200617-WA0011.jpg");
//
//        Userpfp.setFill(new ImagePattern(img));



    }

}
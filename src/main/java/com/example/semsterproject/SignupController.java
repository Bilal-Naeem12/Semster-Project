package com.example.semsterproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;

import java.net.URL;
import java.util.ResourceBundle;

public class SignupController extends attributeController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        choicebox_gender.setValue("Select");
        choicebox_gender.getItems().addAll(gender);
    }
    @FXML
    private Button Loginbtn_signup,SIGNUPbtn;

    @FXML
    private ChoiceBox<String> choicebox_gender;
    String[] gender = {"MALE", "FEMALE"};

    @FXML
    private TextField address_signup,email_signup,username_signup;

    @FXML
    private PasswordField confirm_signup,password_signup;



    @FXML
    void toLogin(ActionEvent event) {

        Button b = (Button) event.getSource();
        if (b == Loginbtn_signup) {

            sceneSwitcher("Login", Loginbtn_signup);
        } else if (b == SIGNUPbtn){

if (checker() == 0) {
    if (password_signup.getText().equals(confirm_signup.getText()) ) {
        Image image = new Image("G:\\comsat\\semster 3\\OOP\\JAVAFX\\Semster-Project\\src\\main\\resources\\Images\\Profile\\IMG-20200617-WA0011.jpg");
        User user = new User(username_signup.getText(), email_signup.getText(), address_signup.getText(), choicebox_gender.getValue(), password_signup.getText(),image.getUrl());
        write_user(user);
        sceneSwitcher("Login", SIGNUPbtn);
    }
    else {
        System.out.println("call me again");
    }
}

        }

    }







     public int checker() {


    if (username_signup.getLength() == 0 ||  password_signup.getLength() == 0 ||address_signup.getLength() == 0||confirm_signup.getLength() == 0 ||email_signup.getLength() == 0) {

        if (address_signup.getLength() == 0) {


            address_signup.setStyle("-fx-background-color: rgba(255,0,0,0.53)");


        }else {
            address_signup.setStyle(null);
        }

        if (username_signup.getLength() == 0) {


            username_signup.setStyle("-fx-background-color: rgba(255,0,0,0.53)");


        }else {
            username_signup.setStyle(null);
        }
        if (password_signup.getLength() == 0) {


            password_signup.setStyle("-fx-background-color: rgba(255,0,0,0.53)");


        }else {
            if (!password_signup.getText().equals(confirm_signup.getText()) ) {
                password_signup.clear();
                confirm_signup.clear();
                password_signup.setPromptText("Password donot match");
                confirm_signup.setPromptText("Password donot match");
                confirm_signup.setStyle("-fx-background-color: rgba(255,0,0,0.53)");
                password_signup.setStyle("-fx-background-color: rgba(255,0,0,0.53)");


            }else {
                password_signup.setStyle(null);
            }}




        if (confirm_signup.getLength() == 0) {


            confirm_signup.setStyle("-fx-background-color: rgba(255,0,0,0.53)");


        }else {
            if (!password_signup.getText().equals(confirm_signup.getText()) ) {
            password_signup.clear();
            confirm_signup.clear();
            password_signup.setPromptText("Password donot match");
            confirm_signup.setPromptText("Password donot match");
            confirm_signup.setStyle("-fx-background-color: rgba(255,0,0,0.53)");
            password_signup.setStyle("-fx-background-color: rgba(255,0,0,0.53)");


        }else {
                confirm_signup.setStyle(null);
            }}
        if (email_signup.getLength() == 0) {


            email_signup.setStyle("-fx-background-color: rgba(255,0,0,0.53)");


        }else {
            email_signup.setStyle(null);
        }
        if (choicebox_gender.getValue().equals("Select") ) {


            choicebox_gender.setStyle("-fx-background-color: rgba(255,0,0,0.53);-fx-mark-color: white;");


        }else {
            choicebox_gender.setStyle(null);
        }


 return -1;   }

    else if (!password_signup.getText().equals(confirm_signup.getText()) ) {
            password_signup.clear();
            confirm_signup.clear();
            password_signup.setPromptText("Password donot match");
            confirm_signup.setPromptText("Password donot match");
            confirm_signup.setStyle("-fx-background-color: rgba(255,0,0,0.53)");
            password_signup.setStyle("-fx-background-color: rgba(255,0,0,0.53)");
        address_signup.setStyle(null);
        username_signup.setStyle(null);

        choicebox_gender.setStyle(null);
            return -1;
        }
    else {
        return 0;
    }

    }


}

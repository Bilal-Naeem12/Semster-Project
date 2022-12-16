package com.example.semsterproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

import java.net.URL;
import java.util.ResourceBundle;

public class SignupController extends attributeController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        choicebox_gender.setValue("Select");
        choicebox_gender.getItems().addAll(gender);
    }

    @FXML
    private Button Loginbtn_signup;

    @FXML
    private Button SIGNUPbtn;

    @FXML
    private ChoiceBox<String> choicebox_gender;
    String [] gender = {"MALE","FEMALE"};
    @FXML
    void toLogin(ActionEvent event) {

        Button b= (Button) event.getSource();
        if ( b== Loginbtn_signup) {
            sceneSwitcher("Login",Loginbtn_signup);
        }else {
            sceneSwitcher("Login",SIGNUPbtn);
        }
    }

}

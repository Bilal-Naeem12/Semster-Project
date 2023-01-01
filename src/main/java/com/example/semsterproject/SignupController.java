package com.example.semsterproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class SignupController extends attributeController implements Initializable ,validator {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        choicebox_gender.setValue("Select");
        choicebox_gender.getItems().addAll(gender);
    }

    @FXML
    private Button Loginbtn_signup, SIGNUPbtn;

    @FXML
    private ChoiceBox<String> choicebox_gender;
    String[] gender = {"MALE", "FEMALE"};

    @FXML
    private TextField address_signup, email_signup, username_signup;

    @FXML
    private PasswordField confirm_signup, password_signup;


    @FXML
    void toLogin(ActionEvent event) {

        Button b = (Button) event.getSource();
        if (b == Loginbtn_signup) {

            sceneSwitcher("Login", Loginbtn_signup);
        } else if (b == SIGNUPbtn) {

    if (checker() == 0) {

        User user = new User(username_signup.getText(), email_signup.getText(), address_signup.getText(), choicebox_gender.getValue(), password_signup.getText());
        UploadImgController.setUser(user);
        sceneSwitcher("Upload-Image", SIGNUPbtn);


    }
}
        }




    @Override
    public int checker() {


        if (username_signup.getLength() == 0 || password_signup.getLength() == 0 || address_signup.getLength() == 0 || confirm_signup.getLength() == 0 || email_signup.getLength() == 0) {

            if (address_signup.getLength() == 0) {


                address_signup.setStyle("-fx-background-color: rgba(255,0,0,0.53)");


            } else {
                address_signup.setStyle(null);
            }

            if (username_signup.getLength() == 0) {

                username_signup.setStyle("-fx-background-color: rgba(255,0,0,0.53)");


            } else {

                if (usernameValidation()) {
                    username_signup.setStyle(null);
                } else {

                    username_signup.setStyle("-fx-background-color: rgba(255,0,0,0.53)");
                    username_signup.clear();
                    username_signup.setPromptText("Username Already Exist");
                }

            }


            if (password_signup.getLength() == 0) {

                password_signup.setStyle("-fx-background-color: rgba(255,0,0,0.53)");


            } else {

                if (password_signup.getText().equals(confirm_signup.getText()) && password_signup.getLength() < 8) {
                    password_signup.clear();
                    password_signup.setStyle("-fx-background-color: rgba(255,0,0,0.53)");
                    password_signup.setPromptText("Password is than 8 character");
                } else {
                    password_signup.setStyle(null);
                }

            }


            if (confirm_signup.getLength() == 0) {

                confirm_signup.setStyle("-fx-background-color: rgba(255,0,0,0.53)");


            } else {
                if (password_signup.getText().equals(confirm_signup.getText()) && confirm_signup.getLength() < 8) {
                    confirm_signup.clear();
                    confirm_signup.setStyle("-fx-background-color: rgba(255,0,0,0.53)");
                    confirm_signup.setPromptText("Password is than 8 character");
                } else {
                    confirm_signup.setStyle(null);
                }

            }


            if (email_signup.getLength() == 0) {


                email_signup.setStyle("-fx-background-color: rgba(255,0,0,0.53)");


            } else {
                email_signup.setStyle(null);
            }
            if (choicebox_gender.getValue().equals("Select")) {


                choicebox_gender.setStyle("-fx-background-color: rgba(255,0,0,0.53);-fx-mark-color: white;");


            } else {
                choicebox_gender.setStyle(null);
            }


            return -1;
        } else if (password_signup.getText().equals(confirm_signup.getText())) {


            if (confirm_signup.getLength() < 8 || password_signup.getLength() < 8) {
                confirm_signup.clear();
                confirm_signup.setPromptText("Password is than 8 character");
                password_signup.clear();
                password_signup.setPromptText("Password is than 8 character");
                password_signup.setStyle("-fx-background-color: rgba(255,0,0,0.53)");
                confirm_signup.setStyle("-fx-background-color: rgba(255,0,0,0.53)");
                if (usernameValidation()) {
                    username_signup.setStyle(null);
                }   else {
                    username_signup.setStyle("-fx-background-color: rgba(255,0,0,0.53)");
                    username_signup.clear();
                    username_signup.setPromptText("Username Already Exist");
                }
                address_signup.setStyle(null);

                email_signup.setStyle(null);
                choicebox_gender.setStyle(null);
                return -1;
            } else {
                if (usernameValidation()) {
                    username_signup.setStyle(null);
                }   else {
                    username_signup.setStyle("-fx-background-color: rgba(255,0,0,0.53)");
                    username_signup.clear();
                    username_signup.setPromptText("Username Already Exist");
             return -1;
                }
                return 0;
            }




        } else if (!password_signup.getText().equals(confirm_signup.getText())) {


            password_signup.clear();
            confirm_signup.clear();


            confirm_signup.setPromptText("Password donot match");

            password_signup.setPromptText("Password donot match");

            confirm_signup.setStyle("-fx-background-color: rgba(255,0,0,0.53)");
            password_signup.setStyle("-fx-background-color: rgba(255,0,0,0.53)");


            address_signup.setStyle(null);
            username_signup.setStyle(null);
            email_signup.setStyle(null);
            choicebox_gender.setStyle(null);
            if (usernameValidation()) {
                username_signup.setStyle(null);
            }   else {
                username_signup.setStyle("-fx-background-color: rgba(255,0,0,0.53)");
                username_signup.clear();
                username_signup.setPromptText("Username Already Exist");
            }
            return -1;
        } else {


            if (usernameValidation()) {
                username_signup.setStyle(null);
            }   else {
                username_signup.setStyle("-fx-background-color: rgba(255,0,0,0.53)");
                username_signup.clear();
                username_signup.setPromptText("Username Already Exist");
                return -1;
            }
            return 0;
        }
    }



     public boolean usernameValidation() {
        boolean write = true;
        for (User user : attributeController.userArrayList) {
            if (username_signup.getText().equals(user.getUserName())) {

                write = false;

            }
        }
return  write;
    }

}

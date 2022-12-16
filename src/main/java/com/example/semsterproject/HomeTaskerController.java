package com.example.semsterproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class HomeTaskerController extends attributeController implements Initializable {



//Login
    @FXML
    private Button Loginbtn;

    @FXML
    private Button Signupbtn;

    @FXML
    void toDashboard(ActionEvent event) throws IOException {

      sceneSwitcher("Dashboard",Loginbtn);



    }

    @FXML
    void toSignup(ActionEvent event) throws IOException {
        sceneSwitcher("Signup",Signupbtn);
    }





    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {




    }

}

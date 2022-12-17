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
    void toSignup(ActionEvent event) throws IOException {
        sceneSwitcher("Signup",Signupbtn);
    }





    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {




    }


    //Setting

    @FXML
    private Button LogoutBtn;

    @FXML
    private Button changePasswordbtn;

    @FXML
    private Button editMyProfilebtn;


    @FXML
    private Button backtodashboardbtn;
    @FXML
    void toChangePassword(ActionEvent event) {
sceneSwitcher("Change-Password",changePasswordbtn);
    }

    @FXML
    void toEditProfile(ActionEvent event) {
sceneSwitcher("Edit-Profile",editMyProfilebtn);
    }

    @FXML
    void toLogin(ActionEvent event) {
sceneSwitcher("Login",LogoutBtn);
    }


    @FXML
    void toDashboard(ActionEvent event) throws IOException {
        Button b= (Button) event.getSource();
        if ( b==  Loginbtn) {
            sceneSwitcher("Dashboard",Loginbtn);
        }else if (b == backtodashboardbtn) {
            sceneSwitcher("Dashboard",backtodashboardbtn);
        }




    }


    //History


    @FXML
    private Button forward;

    @FXML
    void toReceipt(ActionEvent event) {
        sceneSwitcher("Receipt",forward);
    }

//Receipt

    @FXML
    private Button Receiptbtn;

    @FXML
    void toHistory(ActionEvent event) {
sceneSwitcher("History",Receiptbtn);
    }
}

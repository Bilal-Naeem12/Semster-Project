package com.example.semsterproject;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
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


    @FXML
    private Button close;

    @FXML
    void exit(ActionEvent event) throws IOException {


      FXMLLoader fxmlLoader = new FXMLLoader(HomeTasker.class.getResource("Exit.fxml"));
     Scene scene = new Scene(fxmlLoader.load());
        Stage stage1 = new Stage();
        stage1.initStyle(StageStyle.UNDECORATED);
        stage1.setScene(scene);
        stage1.centerOnScreen();
   stage1.show();


     //  sceneSwitcher("Exit",close);


    }
    @FXML
    private PasswordField Pass_passwordField;


    @FXML
    private TextField UsernameTextfield;


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
        System.out.println("Username: "+UsernameTextfield.getText()+"\n Password: "+Pass_passwordField.getText());



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
//Check-out



    @FXML
    private Button cartBtn;

    @FXML
    void toCart(ActionEvent event) {
        sceneSwitcher("Cart", cartBtn);
    }

    //cart
    @FXML
    private Button proceedBtn;
    @FXML
    void toCheckout(ActionEvent event) {
sceneSwitcher("Check-out",proceedBtn);
    }



    //Exit
    @FXML
    private Button noBtn;

    @FXML
    public Button yesBtn;
    Stage stage;

    @FXML
    void NO(ActionEvent event) {

        stage = (Stage) noBtn.getScene().getWindow();
        stage.close();
    }

    @FXML
    public  void YES(ActionEvent event) throws IOException {

        Platform.exit();
    }
}




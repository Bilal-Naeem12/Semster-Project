package com.example.semsterproject;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
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
    protected PasswordField Pass_passwordField;


    @FXML
    protected TextField UsernameTextfield;


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
        Button b = (Button) event.getSource();
        if (b == Loginbtn) {
ArrayList<User> users = read_user();

       if (checker()==0) {
for (int i = 0 ; i< users.size();i++){
          if (UsernameTextfield.getText().equals(users.get(i).getUserName()) && Pass_passwordField.getText().equals(users.get(i).getPassword())) {
setUser(users.get(i));
          sceneSwitcher("Dashboard",Loginbtn);
           }
}
       }

        }else if (b == backtodashboardbtn) {
            sceneSwitcher("Dashboard", backtodashboardbtn);
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

    @Override
    public int checker() {


        if (UsernameTextfield.getLength() == 0 || Pass_passwordField.getLength() == 0) {
   if (UsernameTextfield.getLength() == 0){


       UsernameTextfield.setStyle("-fx-background-color: rgba(255,0,0,0.53)");
   }else {
       UsernameTextfield.setStyle(null);
   }

            if (Pass_passwordField.getLength() == 0) {

                Pass_passwordField.setStyle("-fx-background-color: rgba(255,0,0,0.53)");
            }else {

                Pass_passwordField.setStyle(null);

            }
            return -1;

        }else {
            UsernameTextfield.setStyle(null);
Pass_passwordField.setStyle(null);
            return 0;
        }

    }

}






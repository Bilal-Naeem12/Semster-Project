package com.example.semsterproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ResourceBundle;

public class ChangePasswordController extends attributeController implements Initializable,validator {


    @FXML
    private Button yesBtn;


    @FXML
    private AnchorPane pane1;

    @FXML
    private AnchorPane pane2;



    @FXML
    protected Circle Userpfp;

    @FXML
    protected Button change_backtoSettingbtn;

    @FXML
    protected Button confirmbtn;

    @FXML
    private Button noBtn;

    @FXML
    private AnchorPane alertAnchor;

    @FXML
    private AnchorPane opaqueAnchor;
    @FXML
    private PasswordField passfield1;

    @FXML
    private PasswordField passfield2;

    @FXML
    void toSetting(ActionEvent event) {
        Button b = (Button) event.getSource();
if (b.equals(change_backtoSettingbtn)){

    sceneSwitcher("Setting",change_backtoSettingbtn);
}else if (b.equals(confirmbtn)){

if (checker() == 0) {

    opaqueAnchor.setVisible(true);
    alertAnchor.setVisible(true);


}

}

    }


    @FXML
    void NO(ActionEvent event) {
       setImg(Userpfp, user.getImg());
        opaqueAnchor.setVisible(false);
        alertAnchor.setVisible(false);

    }

    @FXML
    void YES(ActionEvent event) {
        updateUser();
      user.setPassword(passfield1.getText());
        write_user(user);
        opaqueAnchor.setVisible(false);
        alertAnchor.setVisible(false);

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



     Userpfp.setFill(imgP);


    }


    @Override
    public int checker() {


        if (passfield1.getLength() == 0 || passfield2.getLength() == 0) {
            if (passfield1.getLength() == 0) {


                pane1.setStyle("-fx-background-color: rgba(255,0,0,0.53)");
            } else {

                pane1.setStyle(null);


            }

            if (passfield2.getLength() == 0) {

                pane2.setStyle("-fx-background-color: rgba(255,0,0,0.53)");
            } else {

                pane2.setStyle(null);


            }

            return -1;

        } else if (!passfield1.getText().equals(passfield2.getText())) {
            passfield1.clear();
            passfield2.clear();
            passfield1.setPromptText("Password donot match");
            passfield2.setPromptText("Password donot match");
            pane1.setStyle("-fx-background-color: rgba(255,0,0,0.53)");
            pane2.setStyle("-fx-background-color: rgba(255,0,0,0.53)");

            return -1;
        } else if (passfield1.getText().equals(passfield2.getText())) {

            if (passfield1.getLength() < 8 || passfield2.getLength() < 8) {
                passfield1.clear();
                passfield1.setPromptText("Password is than 8 character");
                passfield2.clear();
                passfield2.setPromptText("Password is than 8 character");
                pane1.setStyle("-fx-background-color: rgba(255,0,0,0.53)");
                pane2.setStyle("-fx-background-color: rgba(255,0,0,0.53)");
                return -1;
            }
            pane1.setStyle(null);
            pane2.setStyle(null);
            return 0;
        }
            return 0;

        }




    @Override
    public boolean usernameValidation() {
        return false;
    }


}
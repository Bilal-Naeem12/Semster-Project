package com.example.semsterproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ResourceBundle;

public class EditController extends attributeController implements Initializable,validator {


    @FXML
    private Button yesBtn;


    @FXML
    private AnchorPane pane1;

    @FXML
    private AnchorPane pane2;

    @FXML
    private AnchorPane pane3;

    @FXML
    protected Circle Userpfp;

    @FXML
    protected Button change_backtoSettingbtn;

    @FXML
    protected Button confirmbtn;

    @FXML
    private Button noBtn;
    @FXML
    private TextField ed_address;

    @FXML
    private TextField ed_email;

    @FXML
    private TextField ed_username;
    @FXML
    private Button browser;
    @FXML
    private AnchorPane alertAnchor;

    @FXML
    private AnchorPane opaqueAnchor;

    @FXML
    void fileChooser(ActionEvent event) {
       sceneSwitcher("Upload-Image-edit",browser);
    }

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
        ed_address.setText(user.getAddress());
        ed_email.setText(user.getEmail());
        ed_username.setText(user.getUserName());
       setImg(Userpfp, user.getImg());
        opaqueAnchor.setVisible(false);
        alertAnchor.setVisible(false);
        sceneSwitcher("Edit-Profile",noBtn);
    }

    @FXML
    void YES(ActionEvent event) {
        updateUser();
        user.setAddress(ed_address.getText());
        user.setEmail(ed_email.getText());
        user.setUserName(ed_username.getText());
       user.setImg(imgP.getImage().getUrl());
        write_user(user);
        opaqueAnchor.setVisible(false);
        alertAnchor.setVisible(false);
        sceneSwitcher("Edit-Profile",yesBtn);
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


     ed_address.setText(user.getAddress());
     ed_email.setText(user.getEmail());
     ed_username.setText(user.getUserName());

     Userpfp.setFill(imgP);

        change_backtoSettingbtn.setVisible(imgP.getImage().getUrl().equals(getUser().getImg()));

    }


    @Override
    public int checker() {


        if (ed_username.getLength() == 0 || ed_address.getLength() == 0 || ed_email.getLength() == 0  ) {
            if (ed_username.getLength() == 0){


                pane1.setStyle("-fx-background-color: rgba(255,0,0,0.53)");
            }else {
                pane1.setStyle(null);
            }

            if (ed_address.getLength() == 0) {

                pane3.setStyle("-fx-background-color: rgba(255,0,0,0.53)");
            }else {

                pane3.setStyle(null);

            }
            if (ed_email.getLength() == 0) {

                pane2.setStyle("-fx-background-color: rgba(255,0,0,0.53)");
            }else {

                pane2.setStyle(null);

            }

            return -1;

        }else {
            pane1.setStyle(null);
            pane2.setStyle(null);
            pane3.setStyle(null);

            return 0;
        }

    }


}
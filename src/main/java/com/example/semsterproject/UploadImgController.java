package com.example.semsterproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.FileChooser;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class UploadImgController extends attributeController implements Initializable {



    @FXML
    private Button btn1;

    @FXML
    private Button btn11;

    @FXML
    private Button btn12;

    @FXML
    private Button btn13;

    @FXML
    private Button btn14;

    @FXML
    private Button btn15;
    @FXML
    private Button Uploadbtn;

    @FXML
    private Circle Userpfp;

    @FXML
    private Circle Userpfp1;

    @FXML
    private Circle Userpfp11;

    @FXML
    private Circle Userpfp12;

    @FXML
    private Circle Userpfp13;

    @FXML
    private Circle Userpfp14;

    @FXML
    private Circle Userpfp15;
    @FXML
    private Button Uploadbtn2;




    @FXML
    private Button browser;



    @FXML
    private Button backtoSignup;

    @FXML
    private Button backtoEdit;

    @FXML
    void toEdit(ActionEvent event) {
        Button b = (Button) event.getSource();
        if (b == backtoEdit) {

            sceneSwitcher("Edit-Profile", backtoEdit);
        } else if (b == backtoSignup) {

            sceneSwitcher("Signup", backtoSignup);
        }
    }

    @FXML
    void fileChooser(ActionEvent event) {
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("list","*.jpg","*.png"));
        File f =  fc.showOpenDialog(null);
   setImg(Userpfp,f.getAbsolutePath());
    }



    @FXML
    void upload(ActionEvent event) {
Button b = (Button) event.getSource();
if (b == Uploadbtn) {
    user.setImg(imgP.getImage().getUrl());
    write_user(user);
    attributeController.setUser(user);
    sceneSwitcher("Login", Uploadbtn);
} else if (b == Uploadbtn2) {


    sceneSwitcher("Edit-Profile", Uploadbtn2);
}

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//
//setImg(Userpfp1,"G:\\comsat\\semster 3\\OOP\\JAVAFX\\Semster-Project\\src\\main\\resources\\Images\\Profile\\1.png");
//setImg(Userpfp11,"G:\\comsat\\semster 3\\OOP\\JAVAFX\\Semster-Project\\src\\main\\resources\\Images\\Profile\\2.png");
//setImg(Userpfp12,"G:\\comsat\\semster 3\\OOP\\JAVAFX\\Semster-Project\\src\\main\\resources\\Images\\Profile\\4.png");
//setImg(Userpfp13,"G:\\comsat\\semster 3\\OOP\\JAVAFX\\Semster-Project\\src\\main\\resources\\Images\\Profile\\6.png");
//setImg(Userpfp14,"G:\\comsat\\semster 3\\OOP\\JAVAFX\\Semster-Project\\src\\main\\resources\\Images\\Profile\\3.png");
//setImg(Userpfp15,"G:\\comsat\\semster 3\\OOP\\JAVAFX\\Semster-Project\\src\\main\\resources\\Images\\Profile\\7.png");
//setImg(Userpfp,"G:\\comsat\\semster 3\\OOP\\JAVAFX\\Semster-Project\\src\\main\\resources\\Images\\Profile\\default.jpg");


setImg(Userpfp1,"E:\\Semster-Project\\src\\main\\resources\\Images\\Profile\\1.png");
setImg(Userpfp11,"E:\\Semster-Project\\src\\main\\resources\\Images\\Profile\\2.png");
setImg(Userpfp12,"E:\\Semster-Project\\src\\main\\resources\\Images\\Profile\\4.png");
setImg(Userpfp13,"E:\\Semster-Project\\src\\main\\resources\\Images\\Profile\\6.png");
setImg(Userpfp14,"E:\\Semster-Project\\src\\main\\resources\\Images\\Profile\\3.png");
setImg(Userpfp15,"E:\\Semster-Project\\src\\main\\resources\\Images\\Profile\\7.png");
setImg(Userpfp,"E:\\Semster-Project\\src\\main\\resources\\Images\\Profile\\default.jpg");
    }


    @FXML
    void setProfile(ActionEvent event) {
//setImg(Userpfp,"G:\\comsat\\semster 3\\OOP\\JAVAFX\\Semster-Project\\src\\main\\resources\\Images\\Profile\\1.png");
setImg(Userpfp,"E:\\Semster-Project\\src\\main\\resources\\Images\\Profile\\1.png");
    }

    @FXML
    void setProfile1(ActionEvent event) {
//        setImg(Userpfp,"G:\\comsat\\semster 3\\OOP\\JAVAFX\\Semster-Project\\src\\main\\resources\\Images\\Profile\\2.png");
        setImg(Userpfp,"E:\\Semster-Project\\src\\main\\resources\\Images\\Profile\\2.png");

    }

    @FXML
    void setProfile2(ActionEvent event) {
//        setImg(Userpfp,"G:\\comsat\\semster 3\\OOP\\JAVAFX\\Semster-Project\\src\\main\\resources\\Images\\Profile\\4.png");
        setImg(Userpfp,"E:\\Semster-Project\\src\\main\\resources\\Images\\Profile\\4.png");

    }

    @FXML
    void setProfile3(ActionEvent event) {
//        setImg(Userpfp,"G:\\comsat\\semster 3\\OOP\\JAVAFX\\Semster-Project\\src\\main\\resources\\Images\\Profile\\6.png");
        setImg(Userpfp,"E:\\Semster-Project\\src\\main\\resources\\Images\\Profile\\6.png");


    }

    @FXML
    void setProfile4(ActionEvent event) {
//        setImg(Userpfp,"G:\\comsat\\semster 3\\OOP\\JAVAFX\\Semster-Project\\src\\main\\resources\\Images\\Profile\\3.png");
        setImg(Userpfp,"E:\\Semster-Project\\src\\main\\resources\\Images\\Profile\\3.png");

    }

    @FXML
    void setProfile5(ActionEvent event) {
//        setImg(Userpfp,"G:\\comsat\\semster 3\\OOP\\JAVAFX\\Semster-Project\\src\\main\\resources\\Images\\Profile\\7.png");
        setImg(Userpfp,"E:\\Semster-Project\\src\\main\\resources\\Images\\Profile\\7.png");

    }

private static  User user;

    public static User getUser() {
        return user;
    }

    public static void setUser(User user) {
        UploadImgController.user= user;
    }



}

package com.example.semsterproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController extends attributeController implements Initializable {



    //Dashboard
    @FXML
    private Circle Userpfp;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

     Image img =  new Image("G:\\comsat\\semster 3\\OOP\\JAVAFX\\Semster-Project\\src\\main\\resources\\Images\\Profile\\IMG-20200617-WA0011.jpg");
     //   Image img =  new Image("E:\\Semster-Project\\src\\main\\resources\\Images\\Profile\\IMG-20200617-WA0011.jpg");

        Userpfp.setFill(new ImagePattern(img));
setNameLabel();
    }
    @FXML
    private Button Beauty_btn;
    @FXML
    private Button dashboard_Logout_Btn;

    @FXML
    private Button homeServicesbtn;



    @FXML
    void toHomeServicesScreen(ActionEvent event) {

        sceneSwitcher("Home-Services-Selection",homeServicesbtn);
    }

    @FXML
    void toLoginScreen(ActionEvent event) {
sceneSwitcher("Login",dashboard_Logout_Btn);
    }

    @FXML
    private Button cartBtn;

    @FXML
    void toCart(ActionEvent event) {
sceneSwitcher("Cart",cartBtn);
    }
    @FXML
    private Button menuBtn;

    @FXML
    private AnchorPane miniDashboard;

    @FXML
    void popUP(ActionEvent event) {
        if (miniDashboard.isVisible()){
miniDashboard.setVisible(false);
        }else {
            miniDashboard.setVisible(true);
        }
    }


    @FXML
    private Button historyBtn;



    @FXML
    private Button settingBtn;

    @FXML
    private Button termsBtn;



    @FXML
    void toHistory(ActionEvent event) {
sceneSwitcher("History",historyBtn);
    }






    @FXML
    void toTerms(ActionEvent event) {
        sceneSwitcher("Terms-and-Condition",termsBtn);
    }



    //home service selection

    @FXML
    private Button cleaningBtn;

    @FXML
    private Button homeServicesBack;

    @FXML
    private Button repairingBtn;





    @FXML
    void toRepairing(ActionEvent event) {
        sceneSwitcher("Repairing",repairingBtn);
    }
//Cleaing

    @FXML
    private Button backtocleaning;






    //Generic Functions
    @FXML
    void toCleaning(ActionEvent event) {
        Button b= (Button) event.getSource();
        if ( b== cleaningBtn) {
            sceneSwitcher("Cleaning",cleaningBtn);
        }else {
            sceneSwitcher("Home-Services-Selection",backtocleaning);
        }
    }




    @FXML
    private Button carWashbtn;

    @FXML
    private Button carpetBtn;

    @FXML
    private Button fullHouseBtn;

    @FXML
    private Button sofaBtn;

    @FXML
    void toCarWash(ActionEvent event) {
sceneSwitcher("Car-wash",carWashbtn);
    }

    @FXML
    void toCarpet(ActionEvent event) {
sceneSwitcher("Carpet-Cleaning",carpetBtn);
    }



    @FXML
    void toHouseCleaning(ActionEvent event) {
sceneSwitcher("Full-House-Cleaning",fullHouseBtn);
    }

    @FXML
    void toSofaSet(ActionEvent event) {
        sceneSwitcher("Sofa-Set-cleaning",sofaBtn);
    }

//Change password




    @FXML
    private Button change_backtoSettingbtn;

    @FXML
    private Button confirmbtn;

    @FXML
    void toSetting(ActionEvent event) {
        Button b= (Button) event.getSource();
        if ( b== change_backtoSettingbtn) {
            sceneSwitcher("Setting",change_backtoSettingbtn);
        }else if (b == settingBtn) {
            sceneSwitcher("Setting",settingBtn);
        } {
            sceneSwitcher("Setting",confirmbtn);
        }
    }
//beauty & Selfcare



    @FXML
    private Button backtoDashboardbtn;

    @FXML
    private Button hairTreatment;

    @FXML
    void toDashboard(ActionEvent event) {
        Button b= (Button) event.getSource();
        if ( b== backtoDashboardbtn) {
            sceneSwitcher("Dashboard",backtoDashboardbtn);
        }else if (b == homeServicesBack) {
            sceneSwitcher("Dashboard",homeServicesBack);
        }

    }



    @FXML
    private Button makeupBtn;

    @FXML
    private Button facialBtn;

    @FXML
    private Button waxingBtn;



    @FXML
    void toMakeup(ActionEvent event) {
sceneSwitcher("Makeup",makeupBtn);
    }

    @FXML
    void toFacial(ActionEvent event) {
sceneSwitcher("Facial",facialBtn);
    }

    @FXML
    void toWaxing(ActionEvent event) {
sceneSwitcher("Wax",waxingBtn);
    }

    @FXML
    void toHairtreatment(ActionEvent event) {
sceneSwitcher("Hair-Treatment",hairTreatment);
    }






    //Hair treatment


    @FXML
    private Button backtoBeauty;

    @FXML
    void toBeautyscreen(ActionEvent event) {
            sceneSwitcher("Beauty-Selfcare",backtoBeauty);
        }



//Repairing



    @FXML
    private Button electricianBtn;


    @FXML
    private Button painterBtn;

    @FXML
    private Button plumberBtn;

    @FXML
    void toElectrician(ActionEvent event) {
sceneSwitcher("Electritions",electricianBtn);
    }


    @FXML
    void toPainter(ActionEvent event) {
sceneSwitcher("Painter",painterBtn);
    }

    @FXML
    void toPlumber(ActionEvent event) {
sceneSwitcher("Plumber",plumberBtn);
    }


    @Override
    public int checker() {
        return 0;
    }
















    //methods
    @FXML
    private Label nameLabel;
    public void setNameLabel(){

nameLabel.setText(attributeController.getUser().getUserName());

    }















}













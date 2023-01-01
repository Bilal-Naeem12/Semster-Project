package com.example.semsterproject;

import com.example.semsterproject.Classes.Cart_Card;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
      Image img = new Image(getUser().getImg());
        Userpfp.setFill(new ImagePattern(img));
setNameLabel();
counter.setText(Integer.toString(getGuiCards().size()));
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
    private Button cartBtn1;

    @FXML
    void toCart(ActionEvent event) {
        Button b = (Button) event.getSource();
        if (cartBtn==b) {
            sceneSwitcher("Cart", cartBtn);
        }
    else {
            sceneSwitcher("Cart", cartBtn1);
        }


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
        } else {
            sceneSwitcher("Setting",confirmbtn);
        }
    }
//beauty & Selfcare


    @FXML
    private Button backtoDashboardbtn2;
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
        } else if (b == backtoDashboardbtn2) {
            sceneSwitcher("Dashboard",backtoDashboardbtn2);
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















    //methods
    @FXML
    private Label nameLabel;
    public void setNameLabel(){

nameLabel.setText(attributeController.getUser().getUserName());

    }

//Cart-handling


    @FXML
    private Label BlowDry;

    @FXML
    private Label BlowDryRate;

    @FXML
    private Label HairCut;

    @FXML
    private Label HairCutRate;

    @FXML
    private Label HairDye;

    @FXML
    private Label HairDyeRate;

    @FXML
    private Label Keritan;

    @FXML
    private Label KeritanRate;


    @FXML
    private Button blowDryBtn;

    @FXML
    private ImageView blowDryImageview;


    @FXML
    private Label counter;



    @FXML
    private Button hairCutBtn;

    @FXML
    private ImageView hairCutImageview;

    @FXML
    private ImageView hairDyeImgview;

    @FXML
    private Button hairDyebtn;



    @FXML
    private Button keritanBtn;

    @FXML
    private ImageView keritanImgview;




    @FXML
    private Label DermaFacial;

    @FXML
    private Button DermaFacialbtn;

    @FXML
    private ImageView DermaFacialimgview;

    @FXML
    private Label DermaFacialrate;

    @FXML
    private Label GoldenFacial;

    @FXML
    private ImageView GoldenFacialImgview;

    @FXML
    private Button GoldenFacialbtn;

    @FXML
    private Label GoldenFacialrate;

    @FXML
    private Label HydraFacial;

    @FXML
    private Button HydraFacialbtn;

    @FXML
    private ImageView HydraFacialimgview;

    @FXML
    private Label HydraFacialrate;

    @FXML
    private Label SkinPolisher;

    @FXML
    private Button SkinPolisherbtn;

    @FXML
    private ImageView SkinPolisherimgview;

    @FXML
    private Label SkinPolisherrate;


    @FXML
    private Label FriutWaxing;

    @FXML
    private Button FriutWaxingbtn;

    @FXML
    private ImageView FriutWaxingimgveiw;

    @FXML
    private Label FriutWaxingrate;

    @FXML
    private Label HoneyWaxing;

    @FXML
    private Button HoneyWaxingbtn;

    @FXML
    private ImageView HoneyWaxingimgview;

    @FXML
    private Label HoneyWaxingrate;


    @FXML
    private Label BridalMakeup;

    @FXML
    private Button BridalMakeupbtn;

    @FXML
    private ImageView BridalMakeupimg;

    @FXML
    private Label BridalMakeuprate;

    @FXML
    private Label EyeMakeup;

    @FXML
    private Button EyeMakeupbtn;

    @FXML
    private ImageView EyeMakeupimg;

    @FXML
    private Label EyeMakeuprate;

    @FXML
    private Label PartyMakeup;

    @FXML
    private Button PartyMakeupbtn;

    @FXML
    private ImageView PartyMakeupimg;

    @FXML
    private Label PartyMakeuprate;

    @FXML
    private Label FiveSetter;

    @FXML
    private Button FiveSetterbtn;

    @FXML
    private ImageView FiveSetterimg;

    @FXML
    private Label FiveSetterrate;

    @FXML
    private Label SevenSetter;

    @FXML
    private Button SevenSetterbtn;

    @FXML
    private ImageView SevenSetterimg;

    @FXML
    private Label SevenSetterrate;

    @FXML
    private Label TenSetter;

    @FXML
    private ImageView TenSetterImg;

    @FXML
    private Button TenSetterbtn;

    @FXML
    private Label TenSetterrate;

    @FXML
    private Label ThreeSetter;

    @FXML
    private Button ThreeSetterbtn;

    @FXML
    private ImageView ThreeSetterimg;

    @FXML
    private Label ThreeSetterrate;

    //carwash
    @FXML
    private Label CROSSOVER;

    @FXML
    private Button CROSSOVERbtn;

    @FXML
    private ImageView CROSSOVERimg;

    @FXML
    private Label CROSSOVERrate;

    @FXML
    private Label HATCHBACK;

    @FXML
    private Button HATCHBACKbtn;

    @FXML
    private ImageView HATCHBACKimg;

    @FXML
    private Label HATCHBACKrate;

    @FXML
    private Label MINIVAN;

    @FXML
    private Button MINIVANbtn;

    @FXML
    private ImageView MINIVANimg;

    @FXML
    private Label MINIVANrate;

    @FXML
    private Label SEDAN;

    @FXML
    private Button SEDANbtn;

    @FXML
    private ImageView SEDANimg;

    @FXML
    private Label SEDANrate;
//carpet

    @FXML
    private Label CARPET;

    @FXML
    private Button CARPETbtn;

    @FXML
    private ImageView CARPETimg;

    @FXML
    private Label CARPETrate;

    @FXML
    private Label RUG;

    @FXML
    private Button RUGbtn;

    @FXML
    private ImageView RUGimg;

    @FXML
    private Label RUGrate;


    @FXML
    private Label KITCHEN;

    @FXML
    private Button KITCHENbtn;

    @FXML
    private ImageView KITCHENimg;

    @FXML
    private Label KITCHENrate;

    @FXML
    private Label ROOM;

    @FXML
    private Button ROOMbtn;

    @FXML
    private ImageView ROOMimg;

    @FXML
    private Label ROOMrate;

    @FXML
    private Label WASHROOM;

    @FXML
    private Button WASHROOMbtn;

    @FXML
    private ImageView WASHROOMimg;

    @FXML
    private Label WASHROOMrate;

//commade

    @FXML
    private Label COMMODE;

    @FXML
    private Button COMMODEbtn;

    @FXML
    private ImageView COMMODEimg;

    @FXML
    private Label COMMODErate;

    @FXML
    private Label GYSERINSTALLATION;

    @FXML
    private Button GYSERINSTALLATIONbtn;

    @FXML
    private ImageView GYSERINSTALLATIONimg;

    @FXML
    private Label GYSERINSTALLATIONrate;



    @FXML
    private Label WASHINGMACHINE;

    @FXML
    private Button WASHINGMACHINEbtn;

    @FXML
    private ImageView WASHINGMACHINEimg;

    @FXML
    private Label WASHINGMACHINErate;

    @FXML
    private Label WATERMOTOR;

    @FXML
    private Button WATERMOTORbtn;

    @FXML
    private ImageView WATERMOTORimg;

    @FXML
    private Label WATERMOTORrate;
    @FXML
    private Label DOORPOLISH;

    @FXML
    private Button DOORPOLISHbtn;

    @FXML
    private ImageView DOORPOLISHimg;

    @FXML
    private Label DOORPOLISHrate;

    @FXML
    private Label FURNITUREPOLISH;

    @FXML
    private Button FURNITUREPOLISHbtn;

    @FXML
    private ImageView FURNITUREPOLISHimg;

    @FXML
    private Label FURNITUREPOLISHrate;

    @FXML
    private Label INDOORPAINT;

    @FXML
    private Button INDOORPAINTbtn;

    @FXML
    private ImageView INDOORPAINTimg;

    @FXML
    private Label INDOORPAINTrate;

    @FXML
    private Label OUTDOORPAINT;

    @FXML
    private Button OUTDOORPAINTbtn;

    @FXML
    private ImageView OUTDOORPAINTimg;

    @FXML
    private Label OUTDOORPAINTrate;

    @FXML
    private Label CEILINGFAN;

    @FXML
    private Button CEILINGFANbtn;

    @FXML
    private ImageView CEILINGFANimg;

    @FXML
    private Label CEILINGFANrate;

    @FXML
    private Label ELECTRICWIRING;

    @FXML
    private Button ELECTRICWIRINGbtn;

    @FXML
    private ImageView ELECTRICWIRINGimg;

    @FXML
    private Label ELECTRICWIRINGrate;

    @FXML
    private Label LCDINSTALLATION;

    @FXML
    private Button LCDINSTALLATIONbtn;

    @FXML
    private ImageView LCDINSTALLATIONimg;

    @FXML
    private Label LCDINSTALLATIONrate;

    @FXML
    private Label UPSREPAIRING;

    @FXML
    private Button UPSREPAIRINGbtn;

    @FXML
    private ImageView UPSREPAIRINGimg;

    @FXML
    private Label UPSREPAIRINGrate;

    @FXML
    void addtoCart(ActionEvent event) {

        Button button = (Button) event.getSource();
        Cart_Card card;

        if (button.equals(keritanBtn)){

            card = new Cart_Card(Keritan.getText(),Integer.parseInt(KeritanRate.getText()),keritanImgview );


            addGUicard(card);
            sceneSwitcher("Hair-Treatment",keritanBtn);

        }else
        if (button.equals(hairDyebtn)){

             card = new Cart_Card(HairDye.getText(),Integer.parseInt(HairDyeRate.getText()),hairDyeImgview );

            addGUicard(card);
            sceneSwitcher("Hair-Treatment",keritanBtn);
        }else
        if (button.equals(hairCutBtn)){

            card = new Cart_Card(HairCut.getText(),Integer.parseInt(HairCutRate.getText()),hairCutImageview );

            addGUicard(card);
            sceneSwitcher("Hair-Treatment",keritanBtn);
        }else
        if (button.equals(blowDryBtn)){

            card = new Cart_Card(BlowDry.getText(),Integer.parseInt(BlowDryRate.getText()),blowDryImageview );


            addGUicard(card);
            sceneSwitcher("Hair-Treatment",keritanBtn);
        }

        //Facail
        else
        if (button.equals(GoldenFacialbtn)){

            card = new Cart_Card(GoldenFacial.getText(),Integer.parseInt(GoldenFacialrate.getText()),GoldenFacialImgview );


            addGUicard(card);
            System.out.println("added goldem");
            sceneSwitcher("Facial",GoldenFacialbtn);
        }
        else
        if (button.equals(HydraFacialbtn)){

            card = new Cart_Card(HydraFacial.getText(),Integer.parseInt(HydraFacialrate.getText()),HydraFacialimgview );


            addGUicard(card);
            sceneSwitcher("Facial",GoldenFacialbtn);
        }
        else
        if (button.equals(SkinPolisherbtn)){

            card = new Cart_Card(SkinPolisher.getText(),Integer.parseInt(SkinPolisherrate.getText()),SkinPolisherimgview );


            addGUicard(card);
            sceneSwitcher("Facial",GoldenFacialbtn);
        }
        else
        if (button.equals(DermaFacialbtn)){

            card = new Cart_Card(DermaFacial.getText(),Integer.parseInt(DermaFacialrate.getText()),DermaFacialimgview );


            addGUicard(card);
            sceneSwitcher("Facial",GoldenFacialbtn);
        }
//Waxing
        else
        if (button.equals(FriutWaxingbtn)){

            card = new Cart_Card(FriutWaxing.getText(),Integer.parseInt(FriutWaxingrate.getText()),FriutWaxingimgveiw );


            addGUicard(card);
            sceneSwitcher("Wax",FriutWaxingbtn);
        } else
        if (button.equals(HoneyWaxingbtn)){

            card = new Cart_Card(HoneyWaxing.getText(),Integer.parseInt(HoneyWaxingrate.getText()),HoneyWaxingimgview );


            addGUicard(card);
            sceneSwitcher("Wax",FriutWaxingbtn);
        }


// Makeup
        else
        if (button.equals(BridalMakeupbtn)){

            card = new Cart_Card(BridalMakeup.getText(),Integer.parseInt(BridalMakeuprate.getText()),BridalMakeupimg );


            addGUicard(card);
            sceneSwitcher("Makeup",BridalMakeupbtn);
        } else
        if (button.equals(EyeMakeupbtn)){

            card = new Cart_Card(EyeMakeup.getText(),Integer.parseInt(EyeMakeuprate.getText()),EyeMakeupimg );


            addGUicard(card);
            sceneSwitcher("Makeup",BridalMakeupbtn);
        }
        else
        if (button.equals(PartyMakeupbtn)){

            card = new Cart_Card(PartyMakeup.getText(),Integer.parseInt(PartyMakeuprate.getText()),PartyMakeupimg );


            addGUicard(card);
            sceneSwitcher("Makeup",BridalMakeupbtn);
        }
//Homeservice  - cleaing
        //sofa-set

        else
        if (button.equals(TenSetterbtn)){

            card = new Cart_Card(TenSetter.getText(),Integer.parseInt(TenSetterrate.getText()),TenSetterImg );


            addGUicard(card);
            sceneSwitcher("Sofa-Set-cleaning",TenSetterbtn);
        }
        else
        if (button.equals(SevenSetterbtn)){

            card = new Cart_Card(SevenSetter.getText(),Integer.parseInt(SevenSetterrate.getText()),SevenSetterimg );


            addGUicard(card);
            sceneSwitcher("Sofa-Set-cleaning",TenSetterbtn);
        }
        else
        if (button.equals(FiveSetterbtn)){

            card = new Cart_Card(FiveSetter.getText(),Integer.parseInt(FiveSetterrate.getText()),FiveSetterimg );


            addGUicard(card);
            sceneSwitcher("Sofa-Set-cleaning",TenSetterbtn);
        }
        else
        if (button.equals(ThreeSetterbtn)){

            card = new Cart_Card(ThreeSetter.getText(),Integer.parseInt(ThreeSetterrate.getText()),ThreeSetterimg );


            addGUicard(card);
            sceneSwitcher("Sofa-Set-cleaning",TenSetterbtn);
        }

        //car-wash

        else
        if (button.equals(HATCHBACKbtn)){

            card = new Cart_Card(HATCHBACK.getText(),Integer.parseInt(HATCHBACKrate.getText()),HATCHBACKimg );


            addGUicard(card);
            sceneSwitcher("Car-wash",HATCHBACKbtn);
        }
        else
        if (button.equals(CROSSOVERbtn)){

            card = new Cart_Card(CROSSOVER.getText(),Integer.parseInt(CROSSOVERrate.getText()),CROSSOVERimg );


          addGUicard(card);
            sceneSwitcher("Car-wash",HATCHBACKbtn);
        }
        else
        if (button.equals(MINIVANbtn)){

            card = new Cart_Card(MINIVAN.getText(),Integer.parseInt(MINIVANrate.getText()),MINIVANimg);


            addGUicard(card);
            sceneSwitcher("Car-wash",HATCHBACKbtn);
        }  else
        if (button.equals(SEDANbtn)){

            card = new Cart_Card(SEDAN.getText(),Integer.parseInt(SEDANrate.getText()),SEDANimg);


            addGUicard(card);
            sceneSwitcher("Car-wash",HATCHBACKbtn);
        }
//     carpet

        else
        if (button.equals(CARPETbtn)){

            card = new Cart_Card(CARPET.getText(),Integer.parseInt(CARPETrate.getText()),CARPETimg);


            addGUicard(card);
            sceneSwitcher("Carpet-Cleaning",CARPETbtn);
        }
        else
        if (button.equals(RUGbtn)){

            card = new Cart_Card(RUG.getText(),Integer.parseInt(RUGrate.getText()),RUGimg);


            addGUicard(card);
            sceneSwitcher("Carpet-Cleaning",CARPETbtn);
        }
        //     Full House Cleaing
        else
        if (button.equals(ROOMbtn)){

            card = new Cart_Card(ROOM.getText(),Integer.parseInt(ROOMrate.getText()),ROOMimg);


            addGUicard(card);
            sceneSwitcher("Full-House-Cleaning",ROOMbtn);
        }
        else
        if (button.equals(WASHROOMbtn)){

            card = new Cart_Card(WASHROOM.getText(),Integer.parseInt(WASHROOMrate.getText()),WASHROOMimg);


            addGUicard(card);
            sceneSwitcher("Full-House-Cleaning",ROOMbtn);
        }else
        if (button.equals(KITCHENbtn)){

            card = new Cart_Card(KITCHEN.getText(),Integer.parseInt(KITCHENrate.getText()),KITCHENimg);


            addGUicard(card);
            sceneSwitcher("Full-House-Cleaning",ROOMbtn);
        }


        //REPAIRING -- PLUMBER
        else
        if (button.equals(COMMODEbtn)){

            card = new Cart_Card(COMMODE.getText(),Integer.parseInt(COMMODErate.getText()),COMMODEimg);


            addGUicard(card);
            sceneSwitcher("Plumber",COMMODEbtn);
        }
        else
        if (button.equals(WASHINGMACHINEbtn)){

            card = new Cart_Card(WASHINGMACHINE.getText(),Integer.parseInt(WASHINGMACHINErate.getText()),WASHINGMACHINEimg);


            addGUicard(card);
            sceneSwitcher("Plumber",COMMODEbtn);
        }
        else
        if (button.equals(GYSERINSTALLATIONbtn)){

            card = new Cart_Card(GYSERINSTALLATION.getText(),Integer.parseInt(GYSERINSTALLATIONrate.getText()),GYSERINSTALLATIONimg);


            addGUicard(card);
            sceneSwitcher("Plumber",COMMODEbtn);
        }
        else
        if (button.equals(WATERMOTORbtn)){

            card = new Cart_Card(WATERMOTOR.getText(),Integer.parseInt(WATERMOTORrate.getText()),WATERMOTORimg);


            addGUicard(card);
            sceneSwitcher("Plumber",COMMODEbtn);
        }





        //paint
        else
        if (button.equals(DOORPOLISHbtn)){

            card = new Cart_Card(DOORPOLISH.getText(),Integer.parseInt(DOORPOLISHrate.getText()),DOORPOLISHimg);


            addGUicard(card);
            sceneSwitcher("Painter",DOORPOLISHbtn);
        }   else
        if (button.equals(FURNITUREPOLISHbtn)){

            card = new Cart_Card(FURNITUREPOLISH.getText(),Integer.parseInt(FURNITUREPOLISHrate.getText()),FURNITUREPOLISHimg);


            addGUicard(card);
            sceneSwitcher("Painter",DOORPOLISHbtn);
        }

        else
        if (button.equals(OUTDOORPAINTbtn)){

            card = new Cart_Card(OUTDOORPAINT.getText(),Integer.parseInt(OUTDOORPAINTrate.getText()),OUTDOORPAINTimg);


            addGUicard(card);
            sceneSwitcher("Painter",DOORPOLISHbtn);
        }
        else
        if (button.equals(INDOORPAINTbtn)){

            card = new Cart_Card(INDOORPAINT.getText(),Integer.parseInt(INDOORPAINTrate.getText()),INDOORPAINTimg);


            addGUicard(card);
            sceneSwitcher("Painter",DOORPOLISHbtn);
        }

//Electrician

        else
        if (button.equals(LCDINSTALLATIONbtn)){

            card = new Cart_Card(LCDINSTALLATION.getText(),Integer.parseInt(LCDINSTALLATIONrate.getText()),LCDINSTALLATIONimg);


            addGUicard(card);
            sceneSwitcher("Electritions",LCDINSTALLATIONbtn);
        }

        else
        if (button.equals(CEILINGFANbtn)){

            card = new Cart_Card(CEILINGFAN.getText(),Integer.parseInt(CEILINGFANrate.getText()),CEILINGFANimg);


            addGUicard(card);
                    sceneSwitcher("Electritions",LCDINSTALLATIONbtn);
        }

        else
        if (button.equals(ELECTRICWIRINGbtn)){

            card = new Cart_Card(ELECTRICWIRING.getText(),Integer.parseInt(ELECTRICWIRINGrate.getText()),ELECTRICWIRINGimg);


            addGUicard(card);
                    sceneSwitcher("Electritions",LCDINSTALLATIONbtn);
        }
        else
        if (button.equals(UPSREPAIRINGbtn)){

            card = new Cart_Card(UPSREPAIRING.getText(),Integer.parseInt(UPSREPAIRINGrate.getText()),UPSREPAIRINGimg);


            addGUicard(card);
                    sceneSwitcher("Electritions",LCDINSTALLATIONbtn);
        }


    }








}













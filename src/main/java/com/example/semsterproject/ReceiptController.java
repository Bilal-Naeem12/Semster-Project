package com.example.semsterproject;

import com.example.semsterproject.Classes.CartCardGUI;
import com.example.semsterproject.Classes.Cart_Card;
import com.example.semsterproject.Classes.HboxReciept;
import com.example.semsterproject.Classes.HboxRecieptGui;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import java.util.Collections;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


public class ReceiptController extends attributeController implements Initializable {
private ArrayList<Cart_Card> ccg = new ArrayList<>();

    static int srNo;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {




        System.out.println(getHistoryOrderNo());

            ccg.addAll(attributeController.historyCardArrayList.get(getHistoryOrderNo()-1).getCart_cards());



        for (int i =0;i<ccg.size(); i++) {
            HboxRecieptGui hboxRecieptGui = new HboxRecieptGui(ccg.get(i).getHboxReciept());

            srNo = i + 1;
            System.out.println(srNo);
            hboxRecieptGui.setSrNo(srNo);



            dataVbox.getChildren().add(hboxRecieptGui.makeGui());





        }






totalbill.setText(Integer.toString(attributeController.historyCardArrayList.get(getHistoryOrderNo()-1).getTotalbill()));













    }
        @FXML
        private Button Receiptbtn;

        @FXML
        private Label totalbill;

        @FXML
        void toHistory(ActionEvent event) {
sceneSwitcher("History",Receiptbtn);
        }

    @FXML
    private VBox dataVbox;



}



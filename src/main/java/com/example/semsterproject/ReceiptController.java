package com.example.semsterproject;

import com.example.semsterproject.Classes.CartCardGUI;
import com.example.semsterproject.Classes.HboxReciept;
import com.example.semsterproject.Classes.HboxRecieptGui;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


public class ReceiptController extends attributeController implements Initializable {
private ArrayList<CartCardGUI> ccg = new ArrayList<>();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        System.out.println(getHistoryOrderNo());

            ccg.addAll(attributeController.historyCardArrayList.get(getHistoryOrderNo()-1).getCardGUIS());


        for (CartCardGUI cartCardGUI : ccg) {
            HboxRecieptGui hboxRecieptGui = new HboxRecieptGui(cartCardGUI.getHboxReciept());
            productVbox.getChildren().add(cartCardGUI.makeCardGuisimple());
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

    @FXML
    private VBox productVbox;

}



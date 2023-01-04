package com.example.semsterproject;

import com.example.semsterproject.Classes.CartCardGUI;
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
private ArrayList<CartCardGUI> ccg;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



ccg = attributeController.historyCardArrayList.get(0).getCardGUIS();


        for (int i = 0; i < ccg.size(); i++) {

            productVbox.getChildren().add(ccg.get(i).makeCardGuisimple());
        }

totalbill.setText(Integer.toString(attributeController.historyCardArrayList.get(0).getTotalbill()));

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



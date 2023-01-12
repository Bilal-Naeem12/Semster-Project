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
import java.util.Collections;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


public class ReceiptController extends attributeController implements Initializable {
private ArrayList<CartCardGUI> ccg = new ArrayList<>();

    static int srNo;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {




        System.out.println(getHistoryOrderNo());

            ccg.addAll(attributeController.historyCardArrayList.get(getHistoryOrderNo()-1).getCardGUIS());



        for (int i =0;i<ccg.size(); i++) {
            HboxRecieptGui hboxRecieptGui = new HboxRecieptGui(ccg.get(i).getHboxReciept());
            productVbox.getChildren().add(ccg.get(i).makeCardGuisimple());
            srNo = i + 1;
            System.out.println(srNo);
            hboxRecieptGui.setSrNo(srNo);


            hboxRecieptGui.setQuantity("10");
            hboxRecieptGui.setSubtotal("15000");

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



package com.example.semsterproject;

import com.example.semsterproject.Classes.HistoryCard;
import com.example.semsterproject.Classes.HistoryCardGui;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HistoryController extends attributeController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        try {



            for (int i = 0; i < attributeController.historyCardArrayList.size(); i++) {
              HistoryCardGui hgc = new HistoryCardGui(attributeController.historyCardArrayList.get(i));

                historyVbox.getChildren().add(hgc.makeGui());

                System.out.println(historyCardArrayList.get(i));

                int finalI = i;
                hgc.btn.setOnAction(e -> {
attributeController.setHistoryOrderNo(attributeController.historyCardArrayList.get(finalI).getOrderNo());
                    System.out.println(getHistoryOrderNo());
                    sceneSwitcher("Receipt",backtodashboardbtn);
                });



            }
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }








    }



    @FXML
    private Button backtodashboardbtn;



    @FXML
    private VBox historyVbox;



    @FXML
    void toDashboard(ActionEvent event) {
        sceneSwitcher("Dashboard",backtodashboardbtn);
    }
}

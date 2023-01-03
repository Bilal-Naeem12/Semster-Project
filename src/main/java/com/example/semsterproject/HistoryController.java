package com.example.semsterproject;

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
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HistorOrder.fxml"));
        AnchorPane anchorPane;
       try {
          anchorPane = fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        HistoryOrderController hoc = fxmlLoader.getController();

    historyVbox.getChildren().add(anchorPane);










    }



    @FXML
    private Button backtodashboardbtn;

    @FXML
    private Button forward;

    @FXML
    private VBox historyVbox;

    @FXML
    void toDashboard(ActionEvent event) {
        sceneSwitcher("Dashboard",backtodashboardbtn);
    }

    @FXML
    void toReceipt(ActionEvent event) {
        sceneSwitcher("Receipt",forward);
    }


}

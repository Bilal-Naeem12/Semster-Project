package com.example.semsterproject;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class HistoryOrderController implements Initializable {
    ArrayList<Order> orders = attributeController.orderArrayList;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
try {
    String orderno = String.valueOf(orders.get(0).getOrderNo());
    String noOfitems =String.valueOf(orders.get(0).getCardGUIS().size());
    String totalbill =String.valueOf(orders.get(0).getTotalbill());
    orderId.setText(orderno);

    noOfItems.setText(noOfitems);

    date.setText(orders.get(0).getDatefromCart());
    totalBill.setText(totalbill);
}catch (Exception e ){



}



    }
    @FXML
    private Label date;


    @FXML
    private Button forward1;

    @FXML
    private Label noOfItems;

    @FXML
    private Label orderId;

    @FXML
    private Label totalBill;

    @FXML
    void toReceipt(ActionEvent event) {

    }



}

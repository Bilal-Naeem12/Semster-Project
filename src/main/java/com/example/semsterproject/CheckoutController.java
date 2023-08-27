package com.example.semsterproject;

import com.example.semsterproject.Classes.HistoryCard;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import java.util.jar.Attributes;

public class CheckoutController extends attributeController implements Initializable {

private int total;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        System.out.println("initial SIZE : " + getGuiCards().size());


        for (int i = 0; i < attributeController.getGuiCards().size(); i++) {
            total +=Integer.parseInt(getGuiCards().get(i).price.getText()) ;

        }
        totalPrice.setText(String.valueOf(total));
        Address.setText(getUser().getAddress());
gridPane.add(getGuiCards().get(0).makeCardGuisimple(),0,0);

    }

private LocalDate date;
    @FXML
    private DatePicker datePicker;

    @FXML
    private Button placeOrder;

    @FXML
    private GridPane gridPane;



    @FXML
    private TextField Address;

    @FXML
    private AnchorPane placedAnchor;

    @FXML
    private Button placedBtn;

    @FXML
    private Button cartBtn;

    @FXML
    private Label totalPrice;

    @FXML
    void toCart(ActionEvent event) {
sceneSwitcher("Cart",cartBtn);
    }

    @FXML
    void addOrder(ActionEvent event) {

date = datePicker.getValue();
String dateFormat = date.format(DateTimeFormatter.ofPattern("MMM/dd/yyyy"));

int orderNo = attributeController.getUser().getOrderNo();
        System.out.println(orderNo);
        HistoryCard historyCard = new HistoryCard(dateFormat,Address.getText(),total,orderNo,attributeController.getGuiCards().size());


attributeController.historyCardArrayList.add(historyCard);

        attributeController.getHistoryCardArrayList().get(getHistoryOrderNo()).getCart_cards().addAll(attributeController.cart_cards);
        attributeController.getUser().setOrderNo(++orderNo);

        System.out.println(orderNo);
        System.out.println("Oder ADDED");
attributeController.cart_cards.clear();
   attributeController.getGuiCards().clear();

        updateUser();
        write_user(user);

placedAnchor.setVisible(true);
    }

    @FXML
    void toDashboard(ActionEvent event) {
sceneSwitcher("Dashboard",placedBtn);
    }
}



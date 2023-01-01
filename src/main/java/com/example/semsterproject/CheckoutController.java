package com.example.semsterproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class CheckoutController extends attributeController implements Initializable {
int total;
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

    @FXML
    private GridPane gridPane;



    @FXML
    private TextField Address;


    @FXML
    private Button cartBtn;

    @FXML
    private Label totalPrice;

    @FXML
    void toCart(ActionEvent event) {
sceneSwitcher("Cart",cartBtn);
    }



}

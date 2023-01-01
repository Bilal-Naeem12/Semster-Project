package com.example.semsterproject;
import com.example.semsterproject.Classes.CartCardGUI;
import com.example.semsterproject.Classes.Cart_Card;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.TilePane;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ResourceBundle;

public class CartController extends attributeController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        try {

            System.out.println("initial SIZE : " + getGuiCards().size());


            for (int i = 0; i < attributeController.getGuiCards().size(); i++) {
                AnchorPane cardPane = getGuiCards().get(i).makeCardGui();
                tilepane.getChildren().add(cardPane);


                int finalI = i;
                getGuiCards().get(i).button.setOnAction(e -> {
                    tilepane.getChildren().remove(cardPane);

                    System.out.println(finalI);
                    System.out.println("SIZE : " + getGuiCards().size());

                    getGuiCards().remove(getGuiCards().get(finalI));
                  sceneSwitcher("Cart",backtodashboardbtn);

                });



            }
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }

    }


    @FXML
    protected TilePane tilepane;
    @FXML
    private Button backtodashboardbtn;

    @FXML
    private Button proceedBtn;

    @FXML
    void toCheckout(ActionEvent event) {
        sceneSwitcher("Check-out", proceedBtn);
    }

    @FXML
    void toDashboard(ActionEvent event) {
        sceneSwitcher("Dashboard", backtodashboardbtn);
    }



    @FXML
    private Button addMore;


    @FXML
    void setTilepane(ActionEvent event) {

    }



}
package com.example.semsterproject;

import com.example.semsterproject.Classes.Cart_Card;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class CardController  {

    @FXML
    private Label currency;

    @FXML
    private ImageView imageSrc;

    @FXML
    private Label rate;

    @FXML
    protected Button remove_Card;

    @FXML
    private Label title;

    @FXML
    protected AnchorPane cardPane;


    public void setCardToCart(Cart_Card card){
        currency.setText(card.currency);
        imageSrc.setImage(new Image(card.getImgsrc()));
        rate.setText( Integer.toString(card.getRate()) );
        title.setText(card.getLabelName());

    }



    @FXML
    void delete(ActionEvent event) {
        System.out.println("byeee");
cardPane.setVisible(false);

    }



}

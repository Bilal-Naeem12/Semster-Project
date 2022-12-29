package com.example.semsterproject.Classes;


import javafx.geometry.Insets;

import javafx.geometry.Rectangle2D;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class CartCardGUI

{
    ImageView imageView;
    Label productName;
    Label currency;
    Label price;
    ImageView btnImg;
   private int Id;
  public   Button button;
    public CartCardGUI(Cart_Card card){

   this.imageView = new ImageView(new Image(card.getImgsrc()));
  this.productName = new Label(card.getLabelName());
       this.currency = new Label(card.currency);
      this.price  = new Label(String.valueOf(card.getRate()));

      btnImg =       new ImageView(new Image("G:\\comsat\\semster 3\\OOP\\JAVAFX\\Semster-Project\\src\\main\\resources\\Images\\Icons\\Cancel.png"));
        button  = new Button("",btnImg);
        Id = card.getId();
}


    public    AnchorPane makeCardGui(){

        AnchorPane anchorPane = new AnchorPane();
        HBox mainHbox = new HBox();

        VBox vBox = new VBox();

        Label starting =new Label("Starting From");


        HBox rate = new HBox(currency,price);


vBox.getChildren().addAll(productName,starting,rate);
mainHbox.getChildren().addAll(imageView,vBox,button);
anchorPane.getChildren().add(mainHbox);

//Alignment

anchorPane.setPrefWidth(260);
anchorPane.setPrefHeight(103);
mainHbox.setPrefHeight(88);
mainHbox.setPrefWidth(250);
imageView.setFitHeight(81);
imageView.setFitWidth(95);
vBox.setPrefWidth(110);
vBox.setPrefHeight(88);
Rectangle2D rect = new Rectangle2D(550,0,1400,1200);
imageView.setViewport(rect);
HBox.setMargin(imageView,new Insets(4,0,0,0));
btnImg.setFitWidth(25);
btnImg.setFitHeight(25);

mainHbox.setLayoutX(8);
mainHbox.setLayoutY(8);
HBox.setMargin(vBox, new Insets(0,0,0,10));
HBox.setMargin(button, new Insets(0,0,0,10));
starting.prefHeight(21);
starting.prefWidth(97);
VBox.setMargin(productName, new Insets(4,0,7,0));
VBox.setMargin(rate, new Insets(7,0,0,0));


//CSS

        button.setStyle("-fx-background-color: none;      -fx-effect: dropshadow(gaussian, rgba(0, 0, 0, 0.34), 8, 0.2,5,4);");

        anchorPane.setStyle("    -fx-background-color:rgba(217, 217, 217, 0.22); -fx-background-radius: 10px;");



        productName.setStyle("-fx-font-size: 20px;-fx-text-fill: white ; -fx-font-family: Arial ;   -fx-font-weight: bolder;");


starting.setStyle(" -fx-font-size: 14px; -fx-font-family: Marlett; -fx-text-fill: white");


rate.setStyle("-fx-font-weight: bolder;-fx-font-size: 20px;-fx-font-family: Arial");
currency.setStyle("-fx-text-fill: rgba(255, 0, 200, 1)");
price.setStyle("-fx-text-fill: rgba(255, 0, 200, 1)");
        return  anchorPane;



    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
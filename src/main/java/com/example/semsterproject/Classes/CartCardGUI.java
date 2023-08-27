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

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class CartCardGUI extends Cart_Card implements Serializable

{
public transient  ImageView imageView;
public     Label productName;
 public    Label currency;
  public   Label price;
  public  transient ImageView btnImg;

  public   Button button;

    private HboxReciept hboxReciept = new HboxReciept();


    public CartCardGUI(Cart_Card card){

        super(card);

hboxReciept =new HboxReciept(super.getLabelName(),super.getRate());

  this.productName = new Label(card.getLabelName());
       this.currency = new Label(card.currency);
      this.price  = new Label(String.valueOf(card.getRate()));

  //  btnImg =       new ImageView(new Image("G:\\comsat\\semster 3\\OOP\\JAVAFX\\Semster-Project\\src\\main\\resources\\Images\\Icons\\Cancel.png"));
    btnImg =       new ImageView(new Image("F:\\repos\\Semster-Project\\src\\main\\resources\\Images\\Icons\\Cancel.png"));

        button  = new Button("",btnImg);
this.imageView = card.imageView;
super.imgPath   = card.imageView.getImage().getUrl();
}


    public HboxReciept getHboxReciept() {
        return hboxReciept;
    }

    public void setHboxReciept(HboxReciept hboxReciept) {
        this.hboxReciept = hboxReciept;
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

anchorPane.setPrefWidth(290);
anchorPane.setPrefHeight(103);
mainHbox.setPrefHeight(88);
mainHbox.setPrefWidth(270);

vBox.setPrefWidth(200);
vBox.setPrefHeight(88);


HBox.setMargin(imageView,new Insets(4,0,0,0));
btnImg.setFitWidth(25);
btnImg.setFitHeight(25);

mainHbox.setLayoutX(8);
mainHbox.setLayoutY(8);
HBox.setMargin(vBox, new Insets(0,0,0,16));
HBox.setMargin(button, new Insets(0,0,0,10));
starting.prefHeight(21);
starting.prefWidth(97);
VBox.setMargin(productName, new Insets(4,0,7,0));
VBox.setMargin(rate, new Insets(7,0,0,0));

currency.prefWidth(20);
//CSS

        button.setStyle("-fx-background-color: none;      -fx-effect: dropshadow(gaussian, rgba(0, 0, 0, 0.34), 8, 0.2,5,4);");

        anchorPane.setStyle("    -fx-background-color:rgba(217, 217, 217, 0.22); -fx-background-radius: 10px;-fx-border-insets: 5px; -fx-background-insets: 5px");



        productName.setStyle("-fx-font-size: 20px;-fx-text-fill: white ; -fx-font-family: Arial ;   -fx-font-weight: bolder;");


starting.setStyle(" -fx-font-size: 14px; -fx-font-family: Marlett; -fx-text-fill: white");


rate.setStyle("-fx-font-weight: bolder;-fx-font-size: 20px;-fx-font-family: Arial");
currency.setStyle("-fx-text-fill: rgba(255, 0, 200, 1)");
price.setStyle("-fx-text-fill: rgba(255, 0, 200, 1)");
        return  anchorPane;



    }

    public    AnchorPane makeCardGuisimple(){

        AnchorPane anchorPane = new AnchorPane();
        HBox mainHbox = new HBox();

        VBox vBox = new VBox();

        Label starting =new Label("Starting From");


        HBox rate = new HBox(currency,price);


        vBox.getChildren().addAll(productName,starting,rate);
        mainHbox.getChildren().addAll(imageView,vBox);
        anchorPane.getChildren().add(mainHbox);

//Alignment

        anchorPane.setPrefWidth(250);
        anchorPane.setPrefHeight(103);
        mainHbox.setPrefHeight(88);
        mainHbox.setPrefWidth(250);

        vBox.setPrefWidth(250);
        vBox.setPrefHeight(88);


        HBox.setMargin(imageView,new Insets(4,0,0,0));

        mainHbox.setLayoutX(8);
        mainHbox.setLayoutY(8);
        HBox.setMargin(vBox, new Insets(0,0,0,16));

        starting.prefHeight(21);
        starting.prefWidth(97);
        VBox.setMargin(productName, new Insets(4,0,7,0));
        VBox.setMargin(rate, new Insets(7,0,0,0));

        currency.prefWidth(20);
//CSS



        anchorPane.setStyle("    -fx-background-color:rgba(217, 217, 217, 0.22); -fx-background-radius: 10px;-fx-border-insets: 5px; -fx-background-insets: 5px");



        productName.setStyle("-fx-font-size: 20px;-fx-text-fill: white ; -fx-font-family: Arial ;   -fx-font-weight: bolder;");


        starting.setStyle(" -fx-font-size: 14px; -fx-font-family: Marlett; -fx-text-fill: white");


        rate.setStyle("-fx-font-weight: bolder;-fx-font-size: 20px;-fx-font-family: Arial");
        currency.setStyle("-fx-text-fill: rgba(255, 0, 200, 1)");
        price.setStyle("-fx-text-fill: rgba(255, 0, 200, 1)");
        return  anchorPane;



    }



    @Override
    public String toString() {
        return "CartCardGUI{" +
                "productName=" + getLabelName()+
                ", price=" + getRate() + "}\n";
    }
}

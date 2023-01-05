package com.example.semsterproject.Classes;

import com.example.semsterproject.attributeController;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HistoryCardGui extends HistoryCard {
    private Label date;

    public Button btn;

    private Label noOfItems;

    private Label orderId;

    private Label totalBill;

    public HistoryCardGui(HistoryCard historyCard) {

        this.date = new Label(historyCard.getDatefromCart());
this.noOfItems = new Label(Integer.toString(historyCard.getNoOfItems()));
        this.orderId = new Label(Integer.toString(historyCard.getOrderNo()));
        this.totalBill = new Label(Integer.toString(historyCard.getTotalbill()));


    }
    public HistoryCardGui() {




    }




    public   AnchorPane makeGui(){

        AnchorPane anchorPane = new AnchorPane();


        Label orderLabel = new Label("Order#");
        Label noItems = new Label("No of Items:");
        Label datelabel = new Label("Date:");
        Label price = new Label("Price:");

        Label Rs = new Label("Rs");



        HBox orderHbox = new HBox(orderLabel,orderId);
        HBox noOfitems = new HBox(noItems,noOfItems,datelabel,date);
        HBox Price = new HBox(price,Rs,totalBill);

        //  ImageView btnImg =       new ImageView(new Image("G:\\comsat\\semster 3\\OOP\\JAVAFX\\Semster-Project\\src\\main\\resources\\Images\\Icons\\Forward.png"));
          ImageView btnImg =       new ImageView(new Image("E:\\Semster-Project\\src\\main\\resources\\Images\\Icons\\Forward.png"));
     btn = new Button("",btnImg);
        VBox mainVbox = new VBox(orderHbox,noOfitems,Price);
        HBox mainHbox = new HBox(mainVbox,btn);
        anchorPane.getChildren().addAll(mainHbox);


        //Alignment
anchorPane.setPrefWidth(466);
anchorPane.setPrefHeight(131);

mainHbox.setPrefHeight(121);
mainHbox.setPrefWidth(466);

HBox.setMargin(btn,new Insets(45,0,15,0));
mainVbox.setPrefWidth(466);
        mainVbox.setPrefHeight(121);
orderHbox.setPrefHeight(39);
noOfitems.setPrefHeight(39);
Price.setPrefHeight(39);

HBox.setMargin(noOfItems,new Insets(0,0,0,15));

        HBox.setMargin(Rs,new Insets(0,3,0,15));

        HBox.setMargin(date,new Insets(0,0,0,15));

        HBox.setMargin(datelabel,new Insets(0,0,0,80));

        HBox.setMargin(orderHbox,new Insets(0,0,30,0));
      AnchorPane.setTopAnchor(mainHbox,6.5);
        AnchorPane.setLeftAnchor(mainHbox,15.1);
        HBox.setMargin(orderId,new Insets(0,0,0,10));

        HBox.setMargin(orderHbox,new Insets(0,0,10,0));

        //CSS
orderLabel.setStyle(csshead());
orderId.setStyle(csshead());
noOfItems.setStyle(cssValue());

noItems.setStyle(cssSub());



datelabel.setStyle(cssSub());


date.setStyle(cssValue());
price.setStyle(cssSub());
totalBill.setStyle(cssValue());
Rs.setStyle(cssValue());
btn.setStyle("-fx-background-color: null");
anchorPane.setStyle(" -fx-background-color: rgba(217, 217, 217, 0.22);-fx-background-radius: 25px;-fx-border-insets: 2px 2px 5px 2px; -fx-background-insets:  2px 2px 5px 2px");
        return anchorPane;
    }






    private String cssSub(){
        return "   -fx-text-fill: #FF00C7;-fx-font-weight: bolder;-fx-font-size: 16px;-fx-font-family: Arial;";
    }
    private String cssValue(){
        return "-fx-text-fill: white;-fx-font-family: Marlett;-fx-font-size: 16px;";
    }
    private String csshead(){
        return "-fx-font-family: Arial;-fx-font-size: 25px;-fx-text-fill: rgb(255, 255, 255);-fx-font-weight: bold;";
    }
}
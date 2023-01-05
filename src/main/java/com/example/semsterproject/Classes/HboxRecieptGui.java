package com.example.semsterproject.Classes;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class HboxRecieptGui extends HboxReciept {

private Label Srno,Productname,UnitPrice,Quantity,Subtotal;


    public HboxRecieptGui(HboxReciept hboxReciept) {


        Productname = new Label(hboxReciept.getProductName());
        UnitPrice = new Label(Integer.toString(hboxReciept.getPrice()));

        Srno = new Label("1");
        Quantity = new Label("5");
        Subtotal = new Label("231322");


    }
    public HboxRecieptGui() {





    }

    public HBox makeGui(){






      HBox mainHbox = new HBox(Srno,Productname,UnitPrice,Quantity,Subtotal);
       // HBox mainHbox = new HBox(Productname,pane1,Price);

Srno.setPrefWidth(94);
Productname.setPrefWidth(172);
UnitPrice.setPrefWidth(79);
Subtotal.setPrefWidth(72);
Quantity.setPrefWidth(97);



//Alignment



UnitPrice.alignmentProperty().setValue(Pos.CENTER_LEFT);

        Srno.alignmentProperty().setValue(Pos.CENTER);

        Productname.alignmentProperty().setValue(Pos.CENTER);

        Subtotal.alignmentProperty().setValue(Pos.CENTER);

        Quantity.alignmentProperty().setValue(Pos.CENTER);

HBox.setMargin(Productname,new Insets(0,42,0,0));
        HBox.setMargin(UnitPrice,new Insets(0,25,0,0));
        HBox.setMargin(Quantity,new Insets(0,28,0,0));
//css
        Productname.setStyle(cssLabel());
UnitPrice.setStyle(cssLabel());
        Subtotal.setStyle(cssLabel());
        Quantity.setStyle(cssLabel());

        Srno.setStyle(cssLabel());




        mainHbox.setPrefHeight(50);

mainHbox.setStyle("-fx-border-insets: 2px 2px 5px 2px; -fx-background-insets:  2px 2px 5px 2px");
return mainHbox;

    }




  public String cssLabel(){

return "    -fx-text-fill: rgba(255, 255, 255, 0.64); -fx-font-family: Verdana; -fx-font-size: 12;";
  }




}

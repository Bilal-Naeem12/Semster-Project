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

import java.io.Serializable;

public class HboxRecieptGui extends HboxReciept implements Serializable {

private Label Srno,Productname,UnitPrice,Quantity,Subtotal;


    public HboxRecieptGui(HboxReciept hboxReciept) {


        Productname = new Label(hboxReciept.getProductName());
        UnitPrice = new Label(Integer.toString(hboxReciept.getPrice()));




    }
    public HboxRecieptGui() {





    }

    public HBox makeGui(){





        Srno = new Label(Integer.toString(super.getSrNo()));
      HBox mainHbox = new HBox(Srno,Productname,UnitPrice);


Srno.setPrefWidth(94);
Productname.setPrefWidth(172);
UnitPrice.setPrefWidth(79);




//Alignment



UnitPrice.alignmentProperty().setValue(Pos.CENTER_LEFT);

        Srno.alignmentProperty().setValue(Pos.CENTER);

        Productname.alignmentProperty().setValue(Pos.CENTER);



HBox.setMargin(Productname,new Insets(0,80,0,0));
        HBox.setMargin(UnitPrice,new Insets(0,0,0,70));

        HBox.setMargin(Srno,new Insets(0,160,0,0));
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

return "    -fx-text-fill: white; -fx-font-family: Verdana; -fx-font-size: 12;";
  }


    @Override
    public String getQuantity() {
        return Quantity.getText();
    }

    public void setQuantity(String quantity) {
        Quantity = new Label(quantity);
    }

    @Override
    public String getSubtotal() {
        return Subtotal.getText();
    }

    public void setSubtotal(String subtotal) {
        Subtotal = new Label(subtotal);
    }
}

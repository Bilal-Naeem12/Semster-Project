package com.example.semsterproject;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class CartController extends attributeController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
cardArrayList.addAll(getCartCards());
//        try {
//for (int i = 0; i< cardArrayList.size();i++){
//
//    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Cart-Card.fxml"));
//
//        AnchorPane anchorPane = fxmlLoader.load();
//
//    CardController cardController = fxmlLoader.getController();
//
//    cardController.setCard(cardArrayList.get(i));
//
//
//    tilepane.getChildren().add(anchorPane);
//int x = i;
//cardController.remove_Card.setOnAction(e->{
// tilepane.getChildren().remove(x);
//    System.out.println("removed");
//});
//
//}
//        } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//

}



    @FXML
    protected TilePane tilepane;
    @FXML
    private Button backtodashboardbtn;

    @FXML
    private Button proceedBtn;

    @FXML
    void toCheckout(ActionEvent event) {
sceneSwitcher("Check-out",proceedBtn);
    }

    @FXML
    void toDashboard(ActionEvent event) {
        sceneSwitcher("Dashboard",backtodashboardbtn);
    }


  private   Cart_Card card;
    private   ArrayList<Cart_Card> cardArrayList = new ArrayList<>();

    public ArrayList<Cart_Card> getCartCards() {

ArrayList<Cart_Card> cardArrayList = new ArrayList<>();


//for (int i=0;i<10;i++){
//
//  card = new Cart_Card("Keritan",200,"Images/Stock images/hair-treatments.jpg");
//cardArrayList.add(card);
//}


        card = new Cart_Card("1",200,"Images/Stock images/hair-treatments.jpg",0);
        cardArrayList.add(card);
        card = new Cart_Card("2",200,"Images/Stock images/hair-treatments.jpg",1);
        cardArrayList.add(card);
        card = new Cart_Card("3",200,"Images/Stock images/hair-treatments.jpg",2);
        cardArrayList.add(card);
        card = new Cart_Card("4",200,"Images/Stock images/hair-treatments.jpg",3);
        cardArrayList.add(card);
        card = new Cart_Card("5",200,"Images/Stock images/hair-treatments.jpg",4);
        cardArrayList.add(card);

return cardArrayList;


    }








    @FXML
    private Button addMore;

    @FXML
    void setTilepane(ActionEvent event) {

        setCardtoTilepane(cardArrayList);
     counter++;

    }

    private  CardController cardController;
private  int counter = 0;

    private  void setCardtoTilepane(ArrayList<Cart_Card> cCards){
        try {

if (counter >= 5){counter = 0;}

    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Cart-Card.fxml"));

        AnchorPane anchorPane = fxmlLoader.load();

            cardController  = fxmlLoader.getController();
cardController.setCardToCart(cCards.get(counter));
    tilepane.getChildren().add(anchorPane);

cardController.cardPane.setOnMousePressed(e->{


   cardController.cardPane.setStyle("-fx-border-color: #00f3c6; -fx-border-width: 2px");

});

}catch (Exception e){


        }

        }






    }


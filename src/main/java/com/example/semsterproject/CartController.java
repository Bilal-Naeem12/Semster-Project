package com.example.semsterproject;
import com.example.semsterproject.Classes.CartCardGUI;
import com.example.semsterproject.Classes.Cart_Card;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.TilePane;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class CartController extends attributeController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
cardArrayList.addAll(getCartCards());

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


  private Cart_Card card;
    private   ArrayList<Cart_Card> cardArrayList = new ArrayList<>();

    private    ArrayList<CartCardGUI> guiCards = new ArrayList<>();

    public ArrayList<Cart_Card> getCartCards() {

ArrayList<Cart_Card> cardArrayList = new ArrayList<>();

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
        System.out.println("adding");

    }

    private  CardController cardController;
private  int counter = 0;

    private  void setCardtoTilepane(ArrayList<Cart_Card> cCards){
if (counter>5){
    counter=0;
}
 CartCardGUI cardGUI = new CartCardGUI(cCards.get(counter++));
        guiCards.add(cardGUI);
AnchorPane cardPane = cardGUI.makeCardGui();
            System.out.println("adding");
 tilepane.getChildren().add(cardPane);
try {
    cardGUI.button.setOnAction(e -> {
        System.out.println("GUI : "+guiCards.size() +"\ttilePane : "+  tilepane.getChildren().size());
        System.out.println("Specific Card Id"+cardGUI.getId());


//        if (tilepane.getChildren().size() == guiCards.size()){
//            tilepane.getChildren().remove(cardGUI.getId());
//    }else {
//            offsetIndex(guiCards);
//            tilepane.getChildren().remove(cardGUI.getId());
//            System.out.println("\nSpecific Card Id after "+cardGUI.getId());
//        }
        tilepane.getChildren().remove(cardPane);
    });


}catch (Exception e ) {
}
    }






    private void offsetIndex(ArrayList<CartCardGUI> guiCards){

        for (int i=0 ; i < guiCards.size() ; i++){


            if (guiCards.get(i).getId() != 0 ){

                guiCards.get(i).setId( guiCards.get(i).getId()-1);
            }
        }


    }

}


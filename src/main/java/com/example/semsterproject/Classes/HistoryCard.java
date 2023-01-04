package com.example.semsterproject.Classes;

import com.example.semsterproject.attributeController;

import java.util.ArrayList;

public class HistoryCard {

private  ArrayList<CartCardGUI> cardGUIS ;
private  String datefromCart;

private  String Address;

private  int Totalbill;
private  int orderNo;

    private  int noOfItems;


    public HistoryCard() {


    }

    public HistoryCard(String datefromCart, String address, int totalbill, int orderNo,int noOfItems) {

        this.datefromCart = datefromCart;
       this.Address = address;
        this.Totalbill = totalbill;
        this.orderNo = orderNo;
        this.noOfItems = noOfItems;
        cardGUIS    = attributeController.getGuiCards();
    }




    public int getNoOfItems() {
        return noOfItems;
    }

    public void setNoOfItems(int noOfItems) {
        this.noOfItems = noOfItems;
    }



    public ArrayList<CartCardGUI> getCardGUIS() {
        return cardGUIS;
    }

    public void setCardGUIS(ArrayList<CartCardGUI> cardGUIS) {
        this.cardGUIS = cardGUIS;
    }

    public String getDatefromCart() {
        return datefromCart;
    }

    public void setDatefromCart(String datefromCart) {
        this.datefromCart = datefromCart;
    }


    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getTotalbill() {
        return Totalbill;
    }

    public void setTotalbill(int totalbill) {
        Totalbill = totalbill;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }
}

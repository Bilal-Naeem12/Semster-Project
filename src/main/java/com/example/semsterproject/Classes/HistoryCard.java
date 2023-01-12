package com.example.semsterproject.Classes;

import com.example.semsterproject.attributeController;

import java.io.Serializable;
import java.util.ArrayList;

public class HistoryCard implements Serializable {

private  String datefromCart;

private  String Address;

private  int Totalbill;
private  int orderNo;

    private  int noOfItems;
    private ArrayList<Cart_Card> cart_cards = new ArrayList<>();

    public HistoryCard() {


    }

    public HistoryCard(String datefromCart, String address, int totalbill, int orderNo,int noOfItems) {

        this.datefromCart = datefromCart;
       this.Address = address;
        this.Totalbill = totalbill;
        this.orderNo = orderNo;
        this.noOfItems = noOfItems;


    }




    public int getNoOfItems() {
        return noOfItems;
    }

    public void setNoOfItems(int noOfItems) {
        this.noOfItems = noOfItems;
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

    public ArrayList<Cart_Card> getCart_cards() {
        return cart_cards;
    }

    public void setCart_cards(ArrayList<Cart_Card> cart_cards) {
        this.cart_cards = cart_cards;
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

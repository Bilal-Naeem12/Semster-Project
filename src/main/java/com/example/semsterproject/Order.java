package com.example.semsterproject;

import com.example.semsterproject.Classes.CartCardGUI;
import com.example.semsterproject.attributeController;

import java.util.ArrayList;
import java.util.Date;

public class Order {

private  ArrayList<CartCardGUI> cardGUIS = attributeController.getGuiCards();
private  String datefromCart;

private  String Address;

private  int Totalbill;
private  int orderNo;





    public Order(String datefromCart,  String address, int totalbill, int orderNo) {

        this.datefromCart = datefromCart;
        Address = address;
        Totalbill = totalbill;
        this.orderNo = orderNo;
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

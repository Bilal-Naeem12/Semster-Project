package com.example.semsterproject.Classes;

import javafx.scene.image.ImageView;

import java.util.Currency;

public class Cart_Card {


    private String labelName;
    private int  rate,id;
    public final String currency = "Rs";
ImageView imageView;
    public Cart_Card() {

    }

    public Cart_Card(String labelName, int rate, ImageView imageView) {
        this.labelName = labelName;
        this.rate = rate;
        this.imageView = imageView;

    }

    public String getLabelName() {
        return labelName;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}

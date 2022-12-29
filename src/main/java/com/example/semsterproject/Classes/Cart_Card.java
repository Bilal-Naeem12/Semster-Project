package com.example.semsterproject.Classes;

import java.util.Currency;

public class Cart_Card {


    private String labelName, imgsrc;
    private int  rate,id;
    public final String currency = "Rs";



    public Cart_Card(String labelName, int rate, String imgsrc,int id) {
        this.labelName = labelName;
        this.rate = rate;
        this.imgsrc = imgsrc;
        this.id = id;
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



    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}

package com.example.semsterproject.Classes;

import javafx.scene.image.ImageView;

import java.io.Serializable;
import java.util.Currency;

public class Cart_Card  implements Serializable {


    public String labelName;
    private int  rate,id;
    public final String currency = "Rs";
transient ImageView imageView;

    private  HboxReciept hboxReciept  ;



    public  String imgPath;
    public Cart_Card() {

    }
    public Cart_Card(Cart_Card cc) {



        this.setRate(cc.getRate());

        this.setLabelName(cc.getLabelName());
   hboxReciept = cc.getHboxReciept();
    }

    public Cart_Card(String labelName, int rate, ImageView imageView) {
        this.labelName = labelName;
        this.rate = rate;
        this.imageView = imageView;
hboxReciept = new HboxReciept(labelName,rate);
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

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HboxReciept getHboxReciept() {
        return hboxReciept;
    }

    public void setHboxReciept(HboxReciept hboxReciept) {
        this.hboxReciept = hboxReciept;
    }
}

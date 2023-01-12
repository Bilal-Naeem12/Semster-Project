package com.example.semsterproject;

import com.example.semsterproject.Classes.HistoryCard;
import com.example.semsterproject.Classes.HistoryCardGui;
import javafx.scene.image.Image;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
   private String userName,email,address,password;
  private   String gender;
private String img;

    private ArrayList<HistoryCard> historyCardArrayList ;


    private int orderNo;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public User(String userName, String email, String address, String gender, String password) {
        this.userName = userName;
        this.email = email;
        this.address = address;
        this.gender = gender;
        this.password = password;
        this.orderNo =1;
historyCardArrayList = new ArrayList<>();
    }

    public User() {

    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public ArrayList<HistoryCard> getHistoryCardArrayList() {
        return historyCardArrayList;
    }

    public void setHistoryCardArrayList(ArrayList<HistoryCard> historyCardArrayList) {
        this.historyCardArrayList = historyCardArrayList;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", img='" + img + '\'' +
                "}\n";
    }
}

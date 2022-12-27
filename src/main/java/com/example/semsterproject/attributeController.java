package com.example.semsterproject;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;

public class attributeController  {

static ArrayList<User> userArrayList ;
    Stage   stage=null;
static   User user;
static int userID;

    public static int getUserID() {
        return userID;
    }

    public static void setUserID(int userID) {
        attributeController.userID = userID;
    }

    attributeController(){

    userArrayList = read_user();
}


    public  void sceneSwitcher(String filename, Button button){

        FXMLLoader fxmlLoader = new FXMLLoader(HomeTaskerController.class.getResource(filename+".fxml"));
        stage = (Stage) button.getScene().getWindow();
        try {
            stage.setScene(new Scene(fxmlLoader.load()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.centerOnScreen();
        stage.show();


    }


    public   void write_user(User users){

        FileOutputStream file = null;
        try {
            file = new FileOutputStream("UserData");
            ObjectOutputStream out = new ObjectOutputStream(file);


    userArrayList.add(users);
    out.writeObject(userArrayList);
    file.close();


    System.out.println("Object has been serialized");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public ArrayList read_user(){

        FileInputStream file = null;
        try {
            file = new FileInputStream("UserData");
            ObjectInputStream out = new ObjectInputStream(file);

ArrayList<User>  readList = (ArrayList) out.readObject();


            System.out.println("Object has been deSerialized");

            file.close();
            return readList;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

    public void updateUser(){


  userArrayList.remove(getUserID());
updateUserList(userArrayList);

    }

    public void updateUserList(ArrayList<User> userList){

        FileOutputStream file = null;
        try {
            file = new FileOutputStream("UserData");
            ObjectOutputStream out = new ObjectOutputStream(file);


            out.writeObject(userList);


            System.out.println("ArrayList Updated");
            file.close();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }

    public static void setUser(User user) {
        attributeController.user = user;
    }

    public static User getUser() {
        return user;
    }


   static ImagePattern imgP;
    public void setImg(Circle circle, String imgPath) {
        Image img = new Image(imgPath);
        imgP  = new ImagePattern(img);
        circle.setFill(imgP);

    }
}

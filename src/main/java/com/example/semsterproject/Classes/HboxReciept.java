package com.example.semsterproject.Classes;

public class HboxReciept {

private  int SrNo, price;

    private  String productName,unit,quantity,subtotal;
    public HboxReciept() {

    }
    public HboxReciept(String productName,int price) {

        this.productName = productName;
        this.price = price;

    }

    public int getSrNo() {
        return SrNo;
    }

    public void setSrNo(int srNo) {
        SrNo = srNo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }
}

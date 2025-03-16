package com.lavanya.SimpleWebApp;



public class Product {
    private int prodId;
    private String prodName;
    private int price;

    // No-argument constructor
    public Product() {}

    // Parameterized constructor
    public Product(int prodId, String prodName, int price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
    }

    // Getters


    public int getProdId() {
        return prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public int getPrice() {
        return price;
    }

    // Setters

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

package com.kh.collection.pack1.listEx;

public class Clothing {
    //필드
    private String name;
    private String category;
    private String price;

    public Clothing() {
    }

    public Clothing(String name, String category, String price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "name=" + name +
                ", category=" + category +
                ", price=" + price ;
    }
}

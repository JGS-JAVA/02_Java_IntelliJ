package com.kh.oop.constructorPre;

import java.util.Scanner;

public class Cafe {

        private String name;
        private int price;
        private int quantity;


    public Cafe() {
   }
   public Cafe(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

   }



    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }





    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int 주문총액(int price, int quantity) {
        return price * quantity;
    }


    @Override
    public String toString() {
        return "Cafe{" +

                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}

package com.kh.oop.constructor;

/*
 *
 *
 * */
public class Snack {
    //필드
    private String name;
    private int price;
    private String taste;

    //기본 생성자
    public Snack() {
    }

    //필수 생성자
    public Snack(String name, int price, String taste) {
        this.name = name;
        this.price = price;
        this.taste = taste;
    }

    //세터
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    //게터
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getTaste() {
        return taste;
    }



    @Override
    public String toString() {
        return "Snack{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", taste='" + taste + '\'' +
                '}';
    }
}

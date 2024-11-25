package com.kh.dto;
//저장,전달역할
public class 과자 {
    private String name;
    private int price;
    private String flavor;

    //기본생성자

    public 과자() {
    }

    //필수생성자

    public 과자(String name, int price, String flavor) {
        this.name = name;
        this.price = price;
        this.flavor = flavor;
    }

    //세터

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    //게터

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getFlavor() {
        return flavor;
    }

    //저장된 정보 보는 toString 재사용

    @Override
    public String toString() {
        return "과자{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", flavor='" + flavor + '\'' +
                '}';
    }
}

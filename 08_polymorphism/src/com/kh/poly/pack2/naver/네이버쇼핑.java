package com.kh.poly.pack2.naver;

public class 네이버쇼핑 extends 네이버회원 {
    private int 결제횟수;
    private String 등급;
    private int point;

    //기본생성자
    public 네이버쇼핑(){
        super();
    }
    //필수생성자

    public 네이버쇼핑(int 결제횟수, String 등급, int point) {
        this.결제횟수 = 결제횟수;
        this.등급 = 등급;
        this.point = point;
    }

    public 네이버쇼핑(String 유저이름, String 유저번호, String 유저주소, String 유저나이, int 결제횟수, String 등급, int point) {
        super(유저이름, 유저번호, 유저주소, 유저나이);
        this.결제횟수 = 결제횟수;
        this.등급 = 등급;
        this.point = point;
    }

    //세터

    public void set결제횟수(int 결제횟수) {
        this.결제횟수 = 결제횟수;
    }

    public void set등급(String 등급) {
        this.등급 = 등급;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    //게터

    public int get결제횟수() {
        return 결제횟수;
    }

    public String get등급() {
        return 등급;
    }

    public int getPoint() {
        return point;
    }

    //toString

    @Override
    public String toString() {
        return "네이버쇼핑{" +
                "결제횟수=" + 결제횟수 +
                ", 등급='" + 등급 + '\'' +
                ", point=" + point +
                '}';
    }
}

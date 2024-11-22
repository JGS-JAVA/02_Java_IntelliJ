package com.kh.oop.basic;
/*
* 매개변수를 원하는 변수값만 가져오기 가능
* 
* */
public class 생성자주의점 {
    private String a;
    private String b;
    private int c;
    private int d;
    private char e;

    //기본 생성자
    public 생성자주의점(){

    }
    //필수 생성자
    public 생성자주의점(String a, String b, int c, int d, char e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    public 생성자주의점(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public 생성자주의점(int c, int d) {
        this.c = c;
        this.d = d;
    }

    public 생성자주의점(String a, int c) {
        this.a = a;
        this.c = c;
    }

    public 생성자주의점(String a) {
        this.a = a;
    }
    
    
}

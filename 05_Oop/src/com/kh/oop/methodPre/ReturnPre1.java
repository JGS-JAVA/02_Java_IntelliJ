package com.kh.oop.methodPre;

public class ReturnPre1 {
    public String name = "홍길동";
    public int phone = 1234;
    public String id = "dongdong1004";

    public String findId(String a, int b) {
        //return "dongdong1004";
        if(name.equals(a) && phone==b) {

        return id; //public String 이어야 한다
        }

        return "등록정보 없음";
    }

    public  double add(double a, double b) {
        return a+b;
    }
    public double sub(double a, double b) {
        return a-b;
    }
    public double mul(double a, double b) {
        return a*b;
    }
    public double div(double a, double b) {
        return a/b;
    }
}

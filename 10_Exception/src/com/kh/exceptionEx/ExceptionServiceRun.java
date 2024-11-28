package com.kh.exceptionEx;

public class ExceptionServiceRun {
    public static void main(String[] args) {

    ExceptionService ex = new ExceptionService();
    //ex.method1(); -> 에러발생시 자바 멈추고 다음행으로 넘어가지 못한다
    ex.method2();
   // ex.method1();
    }
}

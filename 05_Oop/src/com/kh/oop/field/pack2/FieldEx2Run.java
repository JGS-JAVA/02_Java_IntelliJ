//package com.kh.oop.field.pack2;
//
//import com.kh.oop.field.pack1.FieldEx1;
///*
//* protected 사용하려면 상속하다 표기필요
//* 상속해도 메인에 바로 못온다
//* public return method(){} public void mehtod(){}
//* 내부에 작성할것
//*
//* */
//public class FieldEx2Run {
//    public class FieldEx2Run2 extends FieldEx1{
//
//    }
//    public static void main(String[] args) {
//        FieldEx1 f1 = new FieldEx1();
//        System.out.println(f1.퍼블릭필드); //어디서든 접근가능
////        System.out.println(f1.프로텍트필드); //같은 패키지나 다른 패키지 상속
////        System.out.println(f1.디폴트필드); //같은 패키지에서만 가능
////        System.out.println(f1.프라이빗필드);//같은 클래스에서만 가능
//    }
//    public void mehtod(){
//        /*
//        * 상속 이후 변화가 일어나고 그 이후값을 기능에 담아 static에 전달
//        * 다른 패키지이지만 상속되어 개능 내부에 호출가능*/
//        System.out.println(프로텍트필드);
//    }
//}

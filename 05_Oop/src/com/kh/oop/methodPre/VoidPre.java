package com.kh.oop.methodPre;

public class VoidPre {
    public void method1(double celsius){
        double fahrenheit = celsius * 1.8 + 32;
        System.out.println("섭씨 " + celsius + "는 화씨 " + fahrenheit + "이다");
    }
//%n 줄바꿈 %.2f 소수점 2자리까지 -> printf 할 때 줄바꾸기위해 %n 붙이기
    public void method2(String name){

        System.out.println("학생 이름: " + name);
    }

    public void method3(String product, int price){
        System.out.println("상품명: " + product + "가격: " + price);
    }

    public void method4(int time){
        System.out.println("총 " + time + "분입니다.");
    }

    public void method5(String 운동, int 지속시간){
        System.out.println("운동: " + 운동 + ", 지속시간: " + 지속시간);
    }

    public void method6(String 계좌번호, double 계좌잔액) {
        System.out.println("계좌번호: " + 계좌번호 + "계좌잔액: " + 계좌잔액);
    }

    public void method7(String 제목, double 평점){
        System.out.println("영화 제목: " + 제목 + ", 평점: " + 평점 + "/10");
    }

    public void method8(String 차량명, int 최고속도){
        System.out.println("차량명: " + 차량명 + "최고 속도: " + 최고속도 + "km/h");
    }

    public void method9(String 이메일, String 제목){
        System.out.println("수신자: " + 이메일 + ", 제목: " + 제목);
    }

    public void method10(String 상품명, int 수량){
        System.out.println("상품명: " + 상품명 + "수량: " + 수량 + "개");
    }

}

package com.kh.oop.constructorPre;
//03_0_필드 실습 예제 1번 정답
public class Product {
    private String pName = "제품명";
    private int price = 1500;
    private String brand = "맑은세상";

        public void information(){
            System.out.println("이름: " + pName);
            System.out.println("가격: " + price);
            System.out.println("브랜드: " + brand);


        }

}

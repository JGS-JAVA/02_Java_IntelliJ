package com.kh.oop.methodex;

public class Void메서드실행 {
    public static void main(String[] args) {
        Void메서드 v1 = new Void메서드();
//        v1.method1();

        String userId = "홍길동";
//        v1.method2(userId);

        int age = 40;
//        v1.method3(age);
//       v1.method4("박철수", 50); <- 자료형 입력순서 지키기

        String id = "abc";
        String pw = "123";
        v1.login(id, pw);
    }
}

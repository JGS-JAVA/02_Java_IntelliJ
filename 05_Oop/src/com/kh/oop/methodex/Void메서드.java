package com.kh.oop.methodex;

public class Void메서드 {

    //매개변수 없이 전달할 이유 없이 기능실행
    public void method1(){
        System.out.println("안녕");
    }
    //자료형과 변수명은 한세트
    //매개변수 있는 보이드 메서드
    /*
    * 매개변수명은 지역변수로 메서드 내부에서
    * 자료형을 전달하는 역할
    * 입력시와 출력시 자료형은 같아야하고 변수명은 달라도 된다
    *
    *
    public void method2(String userId) <- 스트링으로 변수값 들어올 공간 만들기
        System.out.println("안녕, " + userId + "님"); <- 들어온값 출력
    *                   
    * */
    public void method2(String userId){ 
        System.out.println("안녕, " + userId + "님");
    }

    public void method3(int age){
        System.out.println("나이 : " + age);
    }

    //자료형과 매개변수 2개 이상 들어가는 메서드
    public void method4(String name, int age){
        System.out.println(name + "님 나이는 " + age + "세 ");
    }
    public void login(String id, String pw){
        System.out.println("id는 " + id + "이다");
        System.out.println("pw는 " + pw + "이다");

    }

}

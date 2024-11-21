package com.kh.oop.basic;

public class NationRun {
    public static void main(String[] args) {
        /*nation 객체생성: nation클래스 내용대로 힙에 할당
         */
        Nation n = new Nation();
        n.name = "홍길동"; // . : 하위접근연산자. 객체 내부의 변수명,기능에 접근,호출,실행
        n.age = 18;
        n.gender = 'M';
        n.introduce(); // nation클래스 안 자기소개 기능 불러오기
        n.납세의무();

        n.name = "이순신";     //홍길동을 덮어쓰기함
        n.age = 34;
        n.gender = 'F';
        n.introduce(); // nation클래스 안 자기소개 기능 불러오기
        n.납세의무();

        Nation n2 = new Nation();
        n2.name = "박달래";
        n2.age = 70;
        n2.gender = 'F';
        n2.introduce(); // nation클래스 안 자기소개 기능 불러오기
        n2.납세의무();



    }
}

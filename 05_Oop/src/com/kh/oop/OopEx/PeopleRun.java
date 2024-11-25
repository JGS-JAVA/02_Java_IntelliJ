package com.kh.oop.OopEx;

public class PeopleRun {
    public static void main(String[] args) {
        People p = new People("홍길동",800101,234678);
        System.out.println(p.toString());
        People p2 = new People("강길자",500101,98765432);

       //필수저장값은 아니지만 추가로 DB에 넣는 값 구분짓기
        p2.setHobby("응악듣기");
        p2.setSpecialty("코딩");
        System.out.println(p2.toString());
    }
}

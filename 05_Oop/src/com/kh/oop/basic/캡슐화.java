//package com.kh.oop.basic;
//
//public class 캡슐화 {
//    /*
//    * 캡슐화
//    * 객체속성(필드) 직접 접근 제한이 원칙
//    * 데이터 손상 우려
//    * 모든 필드에 private 작성이 원칙
//    * (현재객체만 접근가능)
//    * 속성에 직접접근 불가, 간접접근 가능
//    * get, set 이용해 저장, 불러오기
//    *
//    * 속성(값) 필드 멤버벼수 전역변수
//    *
//    * 간접접근 public void set속성변수명(매개변수명){
//    *           this.name = 매개변수명;
//    *  }
//    * 매개변수 : 전달받은값 저장
//    *
//    * */
//    private String name;
//    private int age;
//
//    public String setName(String name) {
//        this.name = name;  //this 현재 작성 파일필드에 장성된 변수명을 바라본다
//    }
//    public int setAge(int age) {
//        this.age = age;
//    }
//
//
//    public String getName() {
//        return name;
//    }
//    public int getAge() {
//       return name;
//    }
//
//
//}

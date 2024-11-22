//package com.kh.oop.constructor;
///*
//*       //set 으로 하나씩 넣기-하나하나 조건이나 암호화 등 특수기능 작성후 넣을때 사용
//        //필수생성자 호출해 한번에 넣기-모든 변수명에 기능설정 없이 한번에 값 저장시 사용
//        *
//*
//* */
//public class MemberRun {
//    public static void main(String[] args) {
//        Member m1 = new Member();
//        m1.setName("Jack");
//        m1.setAge(22);
//        m1.setGender("Male");
//
//        //필수생성자 호출해 한번에 넣기
//        Member m2 = new Member("홍길동",22,"남자");
//        //저장값 확인
//       System.out.println("======= m1 ==========");
//       System.out.println(m1.getName());
//       System.out.println(m1.getAge());
//       System.out.println(m1.getGender());
//
//       System.out.println("======= m2 ==========");
//       System.out.println(m2.getName());
//       System.out.println(m2.getAge());
//       System.out.println(m2.getGender());
//
//
////toString 오로 한번에 출력, toString 은 출력기능 없음, 출력시 print 필요
//        System.out.println("toString() 재샤용 결과");
//        System.out.println(m1.toString());
//        System.out.println(m2.toString());
//
//    }
//}

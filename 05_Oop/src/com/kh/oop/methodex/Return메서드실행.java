//package com.kh.oop.methodex;
//
//public class Return메서드실행 {
//    public static void main(String[] args) {
//        Return메서드 rm = new Return메서드(); //리턴 메서드는 값 전달한다 출력안함
//        rm.method1();                       //출력시 System.out.println(rm.method1()); 필요
//
//        System.out.println(rm.method1()); // (방법2)
//
//        String 메서드1 = rm.method1(); //변수명에 기능담기 (방법3)
//        System.out.println(메서드1);
//
//        int a = rm.method2(5);
//        rm.method2(5); //숫자 5 가진상태, abc 에 5 전달한다
//        System.out.println(a);
//
//        System.out.println("이름 박동식, 뒷번호 ");
//        int b = rm.findId();
//        System.out.println("박동식 숫자 아이디: " + b);
//
//        int result1 = rm.더하기(2,1);
//        int result2 = rm.빼기(3,2);
//    }
//}

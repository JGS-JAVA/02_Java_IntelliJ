package com.kh.oop.basic;
/*
*메서드에서 값반환, 메서드 종료 
* 1. 메서드가 실행 마치고 호출한 곳으로 값반환시 사용
* 반환값 타입은 메서드명칭 작성전에 지정한 자료형 타입과 일치시키기
* public int 메서드명칭(){
* return 1;
*   }
*메서드명칭() 이란 기능 호출한 곳으로 1 값 전달
* 
* 2. 메서드 내에서 리턴 사용시 메서드 즉시 종료
* 반환값 없는 메서드에서 리턴으로 종료시킴
* public void 메서드명칭(){
* System.out.println("기능설정");
* return;                      // 메서드명칭() 기능 종료
* }
* 리턴으로전달할 값 있으면 메서드명칭 작성전에 전달할 값 자료형 작성
* 전달값 없이 리턴으로 종료시 메서드기능명 앞에 보이드 작성
* 
* */
public class 리턴 {
    public void checkAge(int age) {
        if (age < 18) {
            System.out.println("미성년");
            return;
        }
        System.out.println("맥주주문?");
    }
}

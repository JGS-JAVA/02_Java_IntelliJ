package com.kh.collection.pack1.listEx;

import java.util.ArrayList;

//컬렉션 프레임워크 : 자바에서 자료구조 만들어 모아둔것
/*
* java.util 폴더 안에 있음
* 특징
* 1.크기제한 없음(부족시 자동증가)
* 2.추가수정삭제검색 등 다양한기능구현
*
* */
public class BookService {
    //list : 자료 순차나열구조
    /*
    * 인덱스 존재
    * 인덱스로 순서구분, 중복데이터 저장가능
    *
    * 리스트 사용하기
    * 리스트 객체생성
    * list (interface) -> 객체로 보기 어렵다. 객체생성 불가. -> 다형성 이용
    * list 기능 물려받은 arraylist(클래스) 활용
    *
    * */
    public void method1(){
        int arr[] = new int[3]; // 정수형 3칸 배열
        String arr2[] = new String[3]; //  문자열 3칸 배열
        arr1[0] = 10; //index 0번째 자리에 10 대입
        //숫자,문자(열) 가능
    ArrayList list1 = new ArrayList(3); //3칸짜리 배열 생성
        list1.add(1); //자동으로 index = 0 자리에 1 대입
        list1.add("아무거나 대입가능"); //자동으로 index = 1 자리에 문자열 대입
        list1.add(123);
        list1.add(false); //3칸에서 4칸으로 자동늘림

        System.out.println(list1);
        //배열길이 : length
        /*
        * 리스트 길이 : size() -> list에 저장된 요소갯수 반환
        *
        *
        * */
        System.out.println("값 갯수:"+list1.size());
    }


    /*
    * list 대입 자료형 제한하기
    * 앞뒤로 <원하는 자료형> 써주는게 좋다
    * 담는공간 모두 String = 담는 값 모두 String
    * */
    public void method2(){
//        ArrayList<원하는 자료형> list1 = new ArrayList<원하는 자료형>();->가능
//        ArrayList list1 = new ArrayList<원하는 자료형>();->가능
//        ArrayList<원하는 자료형> list1 = new ArrayList();->가능

        ArrayList list1 = new ArrayList<String>();
        list1.add("닭갈비");
        list1.add("치킨");
        list1.add("보쌈");
      //  list1.add(123); //추후 코드흐름문제 생길수 있다
        list1.add("족발");
        System.out.println(list1);
        System.out.println(list1.size());


    }
}

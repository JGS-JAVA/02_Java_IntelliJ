package com.kh.loof;

public class For문 {
    public void method1(){
        /*
        * for문은 일정횟수 반복실행 자바와 자바스크립트 사용법 동일
        * for (초기(화)식; 조건식; 증감식){
        *      false 나올때까지 반복실행
        * }
        * 초기식 : 자료형 변수명 = 시작값
        * 조건식 : {} 언제까지 할지
        * 증감식 : 증감값
        *
        * */
        for (int i = 0; i < 10; i++){ //배열이나 리스트에서 인덱스값이 0 으로 시작해서 int = 0; 초기값 작성 전통이 생겼다
            System.out.println(i);


        }
    }

    public void method2(){
        /*
        * 2중 for문 (nested loof)
        * 2차원 데이터 처리, 조합계산, 중첩작업시 사용
        * 메모리 많이차지하니 되도록 쓰지말자
        *
        * 예 : 구구단
        *
        * for (초기(화)식; 조건식; 증감식) {  외부반복문
        *     for (초기(화)식; 조건식; 증감식) {  내부반복문
        *
        * }
        * }
        *
        *
        * */
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                System.out.println("i값 : " + i + "j값 : " + j);

            }


        }
    }

    public void method3(){
        for (int i = 2; i < 10; i++){
            System.out.println(i + "단");
            for (int j = 1; j < 10; j++){
                System.out.println(i + "x" + j + "=" + (i * j));
            }
            System.out.println();
        }
    }

    public void method4(){
        /*
        * 향상된 for문 (enhanced loof)
        * 배열, 컬렉션 같은 데이터 집합 실행시 사용
        * 기존 for문보다 간결, 반복문에서 인덱스처리 안할때 사용
        *
        * for (타입 변수명 : 컬렉션이나 배열){
        *    변수명은 각 요소 나타냄}
        * 요소: html에선 태그 + 그 안 내용물
        *      자바에선 배열,컬렉션,기타 구조 안에 저장된 개별 데이터
        * 예 : int[] numbers = {10, 20, 30, 40}; 에서 요소는 10, 20, 30, 40
        *
        * for (int 변수명 : numbers){
        *     System.out.println("요소 : " + 변수명);
        * }
        *
        *
        * */
        int[] numbers = {10, 20, 30, 40};
        /*
        * numbers 에 들어있는 값 하나씩 변수 number 에 전달
        *
        * */
        for (int number : numbers){ //처음부터 끝까지 다출력
            System.out.println(number);
        }
    }
}

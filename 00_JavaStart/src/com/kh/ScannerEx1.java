package com.kh;

import java.util.Scanner;
public class ScannerEx1 {
    public static void main(String[] args) {
  /*
  * Scanner 클래스
  * 사용자한테 입력받기위해 java 에서 제공하는 클래스
  * java.util 패키지에 존재
  * ->import 구문 작성 필요
  *
  * Scanner.next() : 단어(String)1개 입력 공백 문자 입력시 입력종료
  * Scanner.nextLine() : 문자열 1개 입력 엔터(개행 문자) 입력 시 종료
  * scanner.nextInt() : int 정수 1개 입력
  * Scanner.nextLong() : long 정수 1개 입력
  * scanner.nextDouble() : 실수 1개 입력
  *
  * 1.클래스 위 import 하는 구문 작성
  * 2. import 한 scanner 클래스 이용해서 scanner 객체 생성
  * *System.in : (intelliJ eclipse) 키보드
  *
  * console 창에서 어떤것 입력할지 입력창 표기 위한 print 작성
  *
  * -next() nextInt() nextDouble() 등 작성후
  * nextLine() 작성상황이 오면
  * nextLine() 구문 미리한번 작성하기
  * */
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 :");
        int num1 = sc.nextInt();
        System.out.println("num1에서 가져온 정수는 : " +num1);

        System.out.print("정수입력 2 : ");
        int num2 = sc.nextInt(); // 정수입력2: 나오고 입력된 정수 얻어와 num2 대입
        System.out.print("실수입력 : ");
        double num3 = sc.nextDouble();

        System.out.println("num2 에서 가져온 정수는 : " + num2);
        System.out.println("num3 에서 가져온 정수는 : " + num3);
        System.out.println("단어 2가지 입력 : " );
        String 단어1 = sc.next();
        String 단어2 = sc.next();

        System.out.println("단어 2가지 출력 : " + 단어1 + 단어2);

    }
}

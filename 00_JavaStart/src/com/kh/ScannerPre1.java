package com.kh;

import java.util.Scanner;

public class ScannerPre1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter a number2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter a number3 (실수로 입력): ");
        float num3 = sc.nextFloat();
        System.out.println("이름 입력하기 : ");
        String name = sc.next();
        System.out.println(num1 + num2 + num3 + name);

    /*
    * ctrl + alt + L -> 자동정렬
    *import java.util.Scanner;
    * import = 내외부에서 파일 가져오기
    * import 폴더명1.폴더명2.파일명;
    * 다른파일에서 특정파일 가져올때
    * 파일명 맨 앞글자 영어 대문자만 가져올 수 있다
    * 자바 자체 제작 파일과 같은 이름으로 파일제작 금지
    * 외부에서 가져온 파일명 작성하고
    * 자료형 변수명 = 새로운 스캐너시작(프로그램 내에서 작성한 값 읽기모드);
    *
    * int num1 = sc.nextInt();
    * new Scanner(System.in) 을 sc 라는 변수명 선언
    * sc 라는 변수명으로 스캐너에서 사용자가 키포드로 입력한 값을 
    * 시스템 안에다가 스캔해서 전달한다
    * 
    * int -> nextInt
    * double -> nextDouble
    * float -> nextFloat
    * String -> next
    * String 은 몇 바이트가 될지 몰라서 next 다음에 아무것도 안적음
    * */
    }
}

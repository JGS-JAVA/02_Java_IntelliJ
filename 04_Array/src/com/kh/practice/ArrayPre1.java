package com.kh.practice;

import java.util.Scanner;

public class ArrayPre1 {
    Scanner sc = new Scanner(System.in);

    public void practice3() {
        System.out.println("배열 크기 입력 : ");
        int size = sc.nextInt(); //배열크기 설정

        if (size <= 0) {
            System.out.println("양수 입력하기");
            return; //프로그램 종료
        }
        int[] arr = new int[size]; // 배열생성,초기화
        for (int i = 0; i < size; i++) {
            arr[i] = i + 1; //1부터 size 까지 호출

        }
        for (int i = 0; i < arr.length; i++) { //size = arr.length
            System.out.print(arr[i] + " ");
        }
    }

    public void practice4() {
        String[] fruit = {"사과", "포도", "귤"};

        System.out.println("배열 출력값:" + fruit[0]);
        System.out.println("배열 출력값:" + fruit[1]);
        System.out.println("배열 출력값:" + fruit[2]);
        System.out.println("배열 출력값:" + fruit[3]);

    }

    public void practice6() {
        //주민번호 저장할 char 배열
        char[] arr = new char[14];
        System.out.print("주민번호 - 포함:");
        String input = sc.nextLine();
        int len = input.length();
        for (int i = 0; i < input.length(); i++) {
            if (i <= 7) {
                arr[i] = input.charAt(i); //0~7까지 배열에 저장, charAt : 문자열에서 특정위치 반환

            } else {
                arr[i] = '*';
            }
        }
//결과는 for 문 밖에 작성
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void practice6A() {
        char[] arr = new char[17];
        System.out.print("전화번호 - 포함:");
        String input = sc.nextLine();
        int len = input.length();

        for (int i = 0; i < input.length(); i++){
            if (i <= 7) {
                arr[i] = input.charAt(i);
            } else {
                arr[i] = '*';
            }
        }for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
    }
    }

    public void practice6B() {
        String countryCode = "+82-";// +82- 고정
        //국가번호 + 핸드폰번호 합치기
       String fullNumber = countryCode + input;
       char[] arr = new char[fullNumber.length()];
        System.out.print("전화번호 - 포함:");
        String input = sc.nextLine();


        for (int i = 0; i < fullNumber.length(); i++){
            if (i <= 7) {
                arr[i] = fullNumber.charAt(i);
            } else {
                arr[i] = '*';
            }
        }for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

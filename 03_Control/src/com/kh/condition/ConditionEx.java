package com.kh.condition;

import java.util.Scanner;
/*
* 조건문 기능용 클래스
    public static void main(String[] args)
* 메인 없으면 출력 안됨
* 클래스 안 기능은 소문자로 시작 ex) scannerAge()
* 한번에 주석할때 : 드래그 + ctrl + /
* */
public class ConditionEx {
    public  void 나이확인() {
        Scanner sc = new Scanner(System.in);

        System.out.println("나이 확인");
        int age = 20;
        if (age < 18) {
            System.out.println("미성년");

        }else{
            System.out.println("성년");
        }
    }

    public void scannerAge(){
        Scanner sc = new Scanner(System.in);
        System.out.print("나이로 성인여부판단");
        System.out.print("나이입력 : ");
        int age = sc.nextInt();
        if (age >= 19 ) {
            System.out.print("성년");
        }else{
            System.out.print("미성년");
        }
    }

    public void methodAge(){
        Scanner sc = new Scanner(System.in);
        System.out.println("세분화 나이판단");
        System.out.println("나이 입력 : ");
        int age = sc.nextInt();
        if (age <= 13) {             //나이 작은순부터 큰순으로 차례로 위로 올라감
            System.out.println("어린이");
        } else if (age < 18) {
            System.out.println("청소년");
        }else{
            System.out.println("성인");
        }
    }
}

public void methodMonth(){
    Scanner sc = new Scanner(System.in);
    System.out.println("계절 확인할 월 입력");
    System.out.println("숫자 입력 : ");
    int month = sc.nextInt();
    String season;
    if (month >= 1 && month <= 12) {
        System.out.println("1~12만 가능");
        return;
        if (month >= 3 && month <= 5) {
           season = "봄";
        }else if (month >= 6 && month <= 8) {
            season = "여름";
        }else if (month >= 9 && month <= 11) {
            season = "가을";
        }else {
            season = "겨울";

        }
        System.out.println(month + "월 : " + season);
    }
    public void switchMonth(){
        Scanner sc = new Scanner(System.in);
        System.out.println("월 입력");
        int m = sc.nextInt();
        String season;

        switch (m) {
            case 1: case 2: case 12
                season = "겨울";
                break;
            case 3: case 4: case 5
                season = "봄";
                break;
            case 6: case 7: case 8
                season = "여름";
                break;
            case 9: case 10: case 11
                season = "가을";
                break;
            default:
                season = "입력 오류";
                break;

        }
        System.out.println(m + "월은 " + season);

    }
}
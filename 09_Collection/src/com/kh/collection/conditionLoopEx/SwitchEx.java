package com.kh.collection.conditionLoopEx;

import java.util.Scanner;

/*
 * switch 하나의 변수나 값을 여러 케이스로 나눠 조건에 맞는 기능 실행
 * switch(변수/값){
 * case 값1:
 * 코드
 * break; // 코드 실행후 스위치 종료
 * default:
 * 위 조건에 없으면 실행할 코드
 * break;
 * }
 *
 * */
public class SwitchEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int abc = sc.nextInt();
        switch (abc) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}

package com.kh;

import java.util.Scanner;

public class ScannerPre3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자입력");
        String text = sc.nextLine();
        System.out.println("text로 입력받은 문자: " + text); // 문자 1글자만 가져온다 (기준:맨첫글자)
        char ch = sc.next().charAt(0);  //index 기준 맨 앞은 0번
        char ch = sc.next().charAt(1);  //index 1번
        int changeNum = (int) ch;  // 문자를 숫자로 강제형변환
        System.out.println("1번 changeNum: " + changeNum);
        System.out.println("2번 changeNum: " + changeNum);

    System.out.println("숫자 1번 : ");
    int num1 = sc.nextInt();
    System.out.println("숫자 2번 : ");
        int num2 = sc.nextInt();
    System.out.println("숫자 합 : " + (num1 + num2));
    }
}

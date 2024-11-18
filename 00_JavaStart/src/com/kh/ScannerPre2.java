package com.kh;

import java.util.Scanner;

public class ScannerPre2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   /*
   * String name
   * int age
   * String hobby
   * shift + alt + 화살포 위아래 -> 줄이동 단축키
   * ctrl + d -> 한줄 복사해서 내리기 단축키
   * */
        System.out.print("이름 입력 : ");
        String name = sc.next();    //사용자 입력공간
        System.out.print("나이 입력 : ");
        int age = sc.nextInt();     //사용자 입력공간
        System.out.print("취미 입력 : ");
        String hobby = sc.next();   //사용자 입력공간

        System.out.println(  "이름 입력 : " + name  + "나이 입력 : " + age  +  "취미 입력 : " + hobby);
    }
}

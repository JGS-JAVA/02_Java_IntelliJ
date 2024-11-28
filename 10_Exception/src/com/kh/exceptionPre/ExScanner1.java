package com.kh.exceptionPre;

import java.util.Scanner;

public class ExScanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("첫 수: ");
            int num1 = sc.nextInt();
            System.out.println("둘째 수: ");
            int num2 = sc.nextInt();

            int res = num1 / num2;
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("예외발생:"+e);
            System.out.println("0으로 못나눔");
            System.out.println("종료");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("예상못한 에러");
            System.out.println("종료");
        } finally{ //catch 와 무관히 무조건 실행
            System.out.println("종료");

        }

    }
}

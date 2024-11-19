package kh.com.ex;

import java.util.Scanner;

/*
* 사칙연산기능만 있다
* 입력정수 3의배수 여부 확인
*
* */
public class OperatorEx {
   /* public static void main(String[] args) {
        최종출력 메인에 원하는 기능만 묶어서 출력

        public void 기능명(){}
        원하는 기능별로 묶어 메인에서 출력할 기능만 선택출력
    }*/
    public void 삼의배수여부확인() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 하나 입력 : ");
        int a = sc.nextInt();
        boolean tf = a % 3 == 0;
        System.out.println("3의 배수 여부 : " + tf);
    }
    public void 이의배수여부확인() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수하나 입력 : ");
        int a = sc.nextInt();
        boolean tf = a % 2 == 0;
        System.out.println("2의 배수여부 : " + tf);
    }
}

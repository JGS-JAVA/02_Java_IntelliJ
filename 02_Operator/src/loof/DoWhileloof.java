package loof;

import java.util.Scanner;

/*
* do-while문
* 무조건 1회 이상 반복한다
*
*
* */
            Scanner sc = new Scanner(System.in);
public class DoWhileloof {
    public void method1(){
        int sum = 0;  //합계
        int input = 0;  //입력값 저장 변수

        /*while 문 시작전 한번 무조건 실행
        입력값 0 이면 반복X, 종료
        */

        do{
            System.out.println("정수입력: ");
            input = sc.nextInt(); //입력정수 가져오기
            sum += input; //입력정수 더하기

        }while (input != 0);
        System.out.println("합계 : " + sum);
    }
}

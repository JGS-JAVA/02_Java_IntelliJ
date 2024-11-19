package loof;

import java.util.Scanner;

/*
* class 중괄호 가장 바깥에 작성하면 전역변수 = 필드
* class method 안에 작성시 지역변수 =
* public void 기능명(메서드)
    public static void main(String[] args)
    * 내부에서 sc 사용
    * 한 파일당 하나씩 외부파일에서 변수 사용시 새로 선언하기
      ->  Scanner sc = new Scanner(System.in);
    *
* */
public class LoofEx {
    Scanner sc = new Scanner(System.in);
    public void method1(){
        System.out.println("숫자입력");
        int a = sc.nextInt();
        System.out.println("a값 확인하기 : " + a);

        for (int i = 0; i <= a; i++) {
            System.out.println("i값 : " + i);
        }

    }

    public void method2(){
        System.out.println("숫자입력시 a 가 b 보다 작다");
        int a = sc.nextInt();
        System.out.println("숫자입력시 b 가 a 보다 크다");
        int b = sc.nextInt();

        if(a > b){
            System.out.println("a 는 b 보다 작아야 한다");
        } else if (a < b) {
            for (int i = a; i<=b; i++){
                System.out.println("a값:" + a + "b값:" + b);
                System.out.println("i값:" + i);
            }
        } else {
            System.out.println("두 값이 같다");
        }
    }

    public void method3(){
        for (int i = 10; i >0; i--){
            System.out.println("i값 : " + i);
        }
    }

    public void method4(){
        System.out.println("숫자 입력:");
        int a = sc.nextInt();
        System.out.println("숫자 입력:");
        int b = sc.nextInt();

        if (a < b) {
            for (int i = a; i<=b; i++){
                System.out.println(i);
            } else if (a > b) {
                for (int i = a; i>b; i--){
                    System.out.println("i값 : " + i);
                }
            } else {
                System.out.println("같은수 입력됨");
            }
        }


    }
}

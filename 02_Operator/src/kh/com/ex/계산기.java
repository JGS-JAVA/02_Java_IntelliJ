package kh.com.ex;

import java.util.Scanner;

public class 계산기 {
    public static void main(String[] args) {
        public void 더하기(){

            Scanner sc = new Scanner(System.in);
            System.out.print("첫 수 입력: ");
            int n1 = sc.nextInt();
            System.out.print("둘째 수 입력: ");
            int n2 = sc.nextInt();

        }

    public void 더하기빼기곱하기나누기(){
            Scanner sc = new Scanner(System.in);
            System.out.print("첫 수 입력: ");
            int n1 = sc.nextInt();
            System.out.print("둘째 수 입력: ");
            int n2 = sc.nextInt();
            System.out.println("n1 + n2 = " + n1 + n2);
            System.out.println("n1 - n2 = " + n1 - n2);
            System.out.println("n1 * n2 = " + n1 * n2);
            System.out.println("n1 / n2 = " + n1 / n2);
        }
    }
}

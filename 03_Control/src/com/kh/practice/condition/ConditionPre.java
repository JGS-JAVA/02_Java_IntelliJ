package com.kh.practice.condition;

import java.util.Scanner;

public class ConditionPre {
    public static void main(String[] args) {
        public void methodAge(){
            Scanner sc = new Scanner(System.in);
            System.out.println("세분화 나이판단");
            System.out.println("나이 입력 : ");
            int age = sc.nextInt();


            switch (age/10) {
                case 0 : case 1
                    System.out.println("어린이");
                    break;
                case 2 :
                    if(age >= 18){

                    System.out.println("청소년");
                    }else {
                        System.out.println("성년");
                    break;
                        default :
                            System.out.println("성년");
                    break;

                    }
            }


            }

    }
}

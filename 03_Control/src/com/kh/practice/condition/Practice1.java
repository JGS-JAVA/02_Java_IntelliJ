package com.kh.practice.condition;

import java.util.Scanner;

public class Practice1 {
    public void method1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("메뉴");
        System.out.println("1. 입력");
        System.out.println("2. 수정");
        System.out.println("3. 조회");
        System.out.println("4. 삭제");
        System.out.println("5. 종료");
        System.out.println("메뉴번호 입력 : ");

        int choice = sc.nextInt();
        String result;

        switch (choice) {
            case 1:
                result = "입력";
                System.out.println("입력메뉴");
                break;
            case 2:
                result = "수정";
                break;
            case 3:
                result = "조회";
                break;
                case 4:
                    result = "삭제";
                    break;
                    case 5:
                        result = "종료";
                        break;
              default :
                result = "잘못된 번호";
                break;
        }
        System.out.println(result + "입니다");
    }

    public void method2(){
        Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    if(i > 0){
        if(i % 2 == 0){
            System.out.println("작수");
        } else {
            System.out.println("홀수");

        }

    }else{
            System.out.println("양수 아니다");

    }

    }
    public void method3(){
        String saveId = "myId";
        String savePw = "myPw";


        Scanner sc = new Scanner(System.in);
        String inputId = sc.next();
        String inputPw = sc.next();


      /*  if(saveId == inputId && savePw == inputPw){
            System.out.println("로그인 성공");


        } else if(saveId != inputId){
            System.out.println("아이디 틀림");
        } else if (savePw != inputPw){
            System.out.println("비번 틀림");

        } else {

        }
        */

        if(inputId.equals(saveId) && inputPw.equals(savePw)){
            System.out.println("로그인 성공");
        } else {
            System.out.println("로그인 실패");
        }
    }
}

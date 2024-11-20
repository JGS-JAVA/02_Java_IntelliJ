package com.kh.practice.condition;

import java.util.Scanner;

public class Practice1 {
    Scanner sc = new Scanner(System.in);

    public void method1() {
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
            default:
                result = "잘못된 번호";
                break;
        }
        System.out.println(result + "입니다");
    }

    public void method2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("홀/짝 맞추기 정수입력 : ");
        int i = sc.nextInt();
        if (i > 0) {
            if (i % 2 == 0) {
                System.out.println("작수");
            } else {
                System.out.println("홀수");

            }

        } else {
            System.out.println("양수 아니다");

        }

    }

    public void method5() {
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

        if (inputId.equals(saveId) && inputPw.equals(savePw)) {
            System.out.println("로그인 성공");
        } else {
            System.out.println("로그인 실패");
        }
    }

    public void method4() {
        System.out.println("1~12사이 정수입력:");
        int month = sc.nextInt();
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println(month + "는 겨울");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(month + "는 봄");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(month + "는 여름");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(month + "는 가을");
                break;
            default:
                System.out.println("입력오류");
                break;

        }
    }

    public void method10() {
        boolean isTrue = true;
        while (isTrue) {

            System.out.println("-------실행할 기능을 선택하세요.-----");
            System.out.println("1. 메뉴 출력");
            System.out.println("2. 짝수/홀수");
            System.out.println("3. 합격/불합격");
            System.out.println("4. 계절");
            System.out.println("5. 로그인");
            System.out.println("6. 권한 확인");
            System.out.println("7. BMI");
            System.out.println("8. 계산기");
            System.out.println("9. P/F");
            System.out.println("0. 종료");
            System.out.print("선택 : ");

            int choice = sc.nextInt(); //입력공간
            switch (choice) {
                case 1:
                    method1();
                    //내부에서 기능 불러오기. 메인은 예외로 클래스파일명 변수명 = new 클래스파일명(); 으로 불러오기
                    break;
                case 2:
                    method2();
                    break;
                case 5:
                    method5();
                    break;
                case 4:
                    method4();
                    break;
                case 3:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("기능 준비중");
                    break;
                case 0:
                    System.out.println("프로그램 종료");
                    isTrue = false;
                    //while 옆 true 부분을 변수 isTrue 에 담기
                    //isTrue = false 표현해서 종료하기
                    break;

                default:
                    System.out.println("입력오류");
                    break;
            }
        }
    }

    public void method6() {
        System.out.println("사용자권한 (관리자,회원,비회원 중) 입력 : ");
        String role = sc.next();


        if ("관리자".equals(role)) {
            System.out.println("회원관리, 게시글관리, 게시글 작성, 게시글조회, 댓글작성 가능");
        } else if ("회원".equals(role)) {
            System.out.println("게시글 작성, 게시글조회, 댓글작성 가능");
        } else if ("비회원".equals(role)){
            System.out.println("게시글조회 가능");
        } else {
            System.out.println("입력오류");
        }
    }
}

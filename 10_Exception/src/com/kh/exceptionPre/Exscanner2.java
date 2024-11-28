package com.kh.exceptionPre;

import java.util.Scanner;

public class Exscanner2 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
        try {

            System.out.println("게임캐릭터 정보입력");
            System.out.println("닉네임: ");
            String nickname = sc.nextLine();
            System.out.println("성별: ");
            char gender = sc.next().charAt(0);

            System.out.println("나이: ");
            int age = sc.nextInt();
            System.out.println("캐릭터작성 완료");
            System.out.println("캐릭터정보:"+nickname+gender+age);
        } catch (Exception e) {
            e.printStackTrace();
            //stack 메모리영역 추적해서 출력
            //호출한 기능 순서대로 타고 들어가서 발생한 에러 모두 추적해서
            //출력한다
            System.out.println("캐릭터 작성중 에러발생");
        }finally {
            sc.close();
            System.out.println("종료");

        }
        try {
            int a = 1;
        }catch (Exception e) {
            throw new RuntimeException(e); //에러 출력
        }

    }
}

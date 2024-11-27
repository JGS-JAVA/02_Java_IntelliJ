package com.kh.collection.pack1.listEx;

import java.util.Scanner;

public class User기능실행 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        User기능 userStore = new User기능();

        while (true) {
            System.out.println("\n====사용자 관리 프로그램====");
            System.out.println("1. 사용자 추가");
            System.out.println("2. 추가된 사용자 모두 조회");
            System.out.println("3. 사용자 삭제");
            System.out.println("4. 종료");
            System.out.println("메뉴 선택");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    userStore.addUser();
                    break;
                case 2:
                    userStore.allUsers(); //ctrl 클릭 -> 기능이동
                    break;
                case 3:
                    userStore.removeUser(); //ctrl 클릭 -> 기능이동
                    break;
                case 4:
                    System.out.println("종료");
                    return;
                default:
                    System.out.println("입력오류");
                    break;
            }

        }
    }
}

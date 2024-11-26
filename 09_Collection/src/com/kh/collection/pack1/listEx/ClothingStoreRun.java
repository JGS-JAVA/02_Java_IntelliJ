package com.kh.collection.pack1.listEx;

import java.util.Scanner;

public class ClothingStoreRun {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ClothingStore clothingStore = new ClothingStore();

        while(true) {
            System.out.println("\n 쇼핑몰 옷관리 프로그램");
            System.out.println("1. 옷추가");
            System.out.println("2. 옷목록 조회");
            System.out.println("3. 종료");
            System.out.println("4. 메뉴선택: ");
            int choice = sc.nextInt();
            sc.nextLine(); //잔여 줄바꿈 지우기
            switch(choice) {  //사용자에게 특정번호 받고 해당기능 실행
                case 1:
                    //clothingStore 에서 작성한 addClothing 기능 가져오기
                    clothingStore.addClothing();
                    break;
                    case 2:
                        clothingStore.allClothings();
                        break;
                        case 3:
                            System.out.println("종료");
                            return;
                            default:
                                System.out.println("입력오류");
                                break;
            }
        }
    }
}

package com.kh.collection.pack2.setEx;

import java.util.Scanner;

public class MenuServiceRun {
    public static void main(String[] args) {
        //메뉴 서비스 기능 가져와서 상황에 맞게 실행하게 설정
        MenuService menuService = new MenuService();

        //Scanner로 입력받기
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("\n 메뉴관리 시스템");
            System.out.println("1. 메뉴추가");
            System.out.println("2. 메뉴삭제");
            System.out.println("3. 메뉴검색");
            System.out.println("4. 메뉴조회");
            System.out.println("5. 종료");
            System.out.println("선택: ");

            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
            System.out.print("메뉴ID : ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("메뉴이름 : ");
            String name = sc.nextLine();
            System.out.print("메뉴가격 : ");
            double price = sc.nextDouble();

            Menu menu = new Menu(id, name, price);
            menuService.addMenu(menu);

                        break;
                    case 2:
            System.out.println("메뉴 삭제 공간");
            System.out.print("삭제할 아이디: ");
            int deleteId = sc.nextInt(); //삭제할 아이디
            sc.nextLine();
            menuService.removeMenu(deleteId);
            break;
            case 3:
            System.out.println("메뉴 검색 공간");
            System.out.println("검색할 메뉴: ");
            int searchId = sc.nextInt();
            sc.nextLine();
           System.out.println(menuService.searchMenu(searchId)); //검색 진행
                break;
                case 4:
            System.out.println("메뉴 조회 공간");
            menuService.printMenu();
            break;
            case 5:
                System.out.println("종료");
                return;
                default:
                System.out.println("입력 오류");
                break;

            }
        }

//
//        //메뉴 추가
//        Menu menu1 = new Menu(1,"아메리카노",2000);
//        Menu menu2 = new Menu(2,"카페라떼",5000);
//        Menu menu3 = new Menu(3,"바닐라라떼",5500);
//        Menu menu4 = new Menu(1,"아메리카노",200000);
//
//        menuService.addMenu(menu1);
//        menuService.addMenu(menu2);
//        menuService.addMenu(menu3);
//        menuService.addMenu(menu4);
//
//        //메뉴삭제
//        menuService.removeMenu(2);
//
//        //추가된 메뉴 출력
//        menuService.printMenu();
//
//        //메뉴검색
//        menuService.searchMenu(1);
//        System.out.println(menuService.searchMenu(1));
//
//

    }
}

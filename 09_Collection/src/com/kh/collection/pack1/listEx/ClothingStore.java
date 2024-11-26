package com.kh.collection.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class ClothingStore {
    //옷정보 목록으로 저장하는 배열리스트 소환
    private ArrayList<Clothing> clothings = new ArrayList<Clothing>();
       private Scanner sc = new Scanner(System.in);
    public void addClothing() {

        System.out.println("name: ");
        String name = sc.nextLine();
        System.out.println("category(상의/하의/외투 등): ");
        String category = sc.nextLine();
        System.out.println("price: ");
        String price = sc.nextLine();

        sc.nextLine();
        sc.close();

        //옷 정보 저장클래스 소환
        Clothing cloth1 = new Clothing(name, category, price); //입력받은 값 대입
         clothings.add(cloth1);
        System.out.println(clothings);
        System.out.println("옷추가 성공");
}
    public void allClothings() {
        //System.out.println(snacks.toString());
        System.out.println("옷 리스트");

        if(clothings.isEmpty()) {
            System.out.println("등록된 정보 없음");
        }else {
            for (int i = 0; i < clothings.size(); i++) {
                clothings.get(i);
                System.out.println(clothings.get(i).toString());
            }
        }
    }
}

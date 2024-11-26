package com.kh.collection.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class Snack기능 {
    public void addSnack(){
        Scanner sc = new Scanner(System.in);
        System.out.println("과자명: ");
        String name = sc.nextLine();
        System.out.println("과자가격: ");
        int price = sc.nextInt();
        System.out.println("과자재고: ");
        int quantity = sc.nextInt();
        sc.nextLine();
        sc.close();
        //과자정보 저장클래스 소환
        Snack snack1 = new Snack(name, price, quantity); //입력받은 값 대입
        Snack snack2 = new Snack("오맛나", 5000, 3); //입력받은 값 대입
        Snack snack3 = new Snack("양파맛", 8000, 5); //입력받은 값 대입

        //과자정보 목록으로 저장하는 배열리스트 소환
        ArrayList<Snack> snacks = new ArrayList<Snack>();
        snacks.add(snack1); //과자 1개 추가
        snacks.add(snack2); //과자 1개 추가
        snacks.add(snack3); //과자 1개 추가

        //System.out.println(snacks.toString());
        System.out.println("과자리스트");
        for(int i = 0; i < snacks.size(); i++){
            snacks.get(i);
            System.out.println(snacks.get(i).toString());
        }


        /*(향상된) for문으로 출력
        length 대신 size() 이용하기
        */




    }
}

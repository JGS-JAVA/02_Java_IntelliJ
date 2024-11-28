package com.kh.collection.pack3.mapEx;

import java.util.HashMap;
import java.util.Scanner;

public class SubwayService {
    //put에 직접 작성
    public void method1(){
        HashMap<String,Integer> menu = new HashMap<String,Integer>();

        menu.put("bmt",6000);
        menu.put("치킨데리",6300);

        //출력함수 호출
        System.out.println("메뉴와 가격"+menu);

    }

    //스캐너로 입력
    public void method2(){
        //해시맵 생성 (이름과 가격 저장목록 변수명 생성)
        HashMap<String,Integer> menu = new HashMap<String,Integer>(); //저장공간

        //스캐너 입력객체 생성
        Scanner sc = new Scanner(System.in);
        System.out.println("추가할 이름: ");
        String name = sc.nextLine();
        System.out.println("가격: ");
        int price = sc.nextInt();
        sc.nextLine();

        menu.put(name,price);


        //출력함수 호출
        System.out.println("추가한 이름, 가격"+menu);

    }
}

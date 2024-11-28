package com.kh.collection.pack3.mapEx;

import java.util.HashMap;
//map 은 인터페이스
//hashmap 은 객체
public class SnackService {

    public void method1(){
        HashMap<String,Integer> snackList = new HashMap<String,Integer>();
        snackList.put("구름과자",2000);
        System.out.println("과자와 가격" + snackList);
    }
    public void method2(){
        HashMap<String,String> lunchList = new HashMap<String,String>();
        lunchList.put("김치찌개","한식");
        lunchList.put("파스타","양식");
        lunchList.put("짜장면","중식");
        lunchList.put("스테이크","양식");
        lunchList.put("비빔밥","한식");

        System.out.println("점심리스트 확인: " + lunchList);

        String pastaType = lunchList.get("파스타");

        System.out.println(pastaType);
        System.out.println(lunchList.get("파스타"));
        //출력결과는 "양식"



        lunchList.remove("짜장면");
        boolean 짜장 = lunchList.containsKey("짜장면"); // 참 또는 거짓
        System.out.println(짜장);
        System.out.println(lunchList.containsKey("짜장면"));

        
        lunchList.replace("스테이크","한식"); // 변경가능
        lunchList.put("스테이크","한식");
        lunchList.clear();
        boolean tf = lunchList.isEmpty();

        System.out.println(tf); // 참 또는 거짓
        System.out.println(lunchList.isEmpty()); // 참 또는 거짓



    }
}

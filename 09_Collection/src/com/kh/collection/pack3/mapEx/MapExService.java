package com.kh.collection.pack3.mapEx;

import java.util.HashMap;

public class MapExService {

    /*
    * 번호로 메뉴 추가
    * ArrayList 는 index 0 부터
    * HashMap 은 1번부터 시작하게 설정가능
    *
    * */
    public void method1(){
        HashMap<Integer,String> subway = new HashMap<Integer,String>();

        subway.put(1, "에그마요");
        subway.put(2, "바베큐");
        subway.put(3, "치즈");
        subway.put(4, "새우");
        System.out.println(subway);

    }
}

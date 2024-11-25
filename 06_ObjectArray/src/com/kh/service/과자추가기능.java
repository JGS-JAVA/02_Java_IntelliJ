package com.kh.service;

import com.kh.dto.과자;

public class 과자추가기능 {
    private 과자[] snacks; //과자 배열
    //과자별로 이름 맛 가격을 배열로 넣기
//    {
//        {"썬칩", 2000, "매콤한맛"},
//        {"고래밥", 1000, "고소한맛"},
//        {"포카칩", 1500, "생감자맛"}
//
//
//    }
    }
    private int count; //저장된 과자수

//필수생성자 설정: 최대과자수
    public 과자추가기능(int maxSnacks){
        this.snacks = new 과자[maxSnacks]; //과자 최대저장수
        this.count = 0;                   //현재 저장된 과자 없음
}
//과자 추가기능
public boolean addSnack(String name, int price, String flavor, 과자[] snacks){
        //과자 성공적으로 추가시
    if(count < snacks.length){
        snacks[count++] = new 과자(name, price, flavor); // 배열에 이름 맛 가격 추가
        return true;
    }
    return false;
}
public 과자[] getSnacks(){
        return snacks;
}
public int getCount(){
        return count;
}

private final 과자[] snacks;

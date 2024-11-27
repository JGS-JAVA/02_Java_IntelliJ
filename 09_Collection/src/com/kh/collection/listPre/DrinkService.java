package com.kh.collection.listPre;
//ArrayList

import java.util.ArrayList;

public class DrinkService {
    //drink 객체생성
    private ArrayList<Drink> drinks = new ArrayList<Drink>();
    private Drink d = new Drink();

    //음료 이름 가격 추가
    public void addDrink(String name,int price) {
        Drink d = new Drink();
        d.setName(name);
        System.out.println(name + "추가됨");
    }

    //음료이름 가격 조회
    public void allDrink(Drink d) {
        if(drinks.size() > 0) {
        System.out.println("등록된것 없음");
            
        }else{
        System.out.println("목록");
        for(int i=0; i<drinks.size();i++){
        System.out.println(drinks.get(i));
            
            }
            
        }
    }

    //음료 삭제
    public void removeDrink(String name) {
        for(int i=0; i<drinks.size();i++){
            if(drinks.get(i).getName().equals(name)){
                drinks.remove(i);
                System.out.println("삭제 완료");
            }
        }
    }

    //음료 검색
    public void searchDrink(String name) {
        for(int i=0; i<drinks.size();i++){
            if(drinks.get(i).getName().equals(name)){
                System.out.println(drinks.get(i));
            }else {
                System.out.println("일치정보 없음");

            }
        }
    }

    //음료 검색
    public void searchDrink(int price) {
        for(int i=0; i<drinks.size();i++){
            if(drinks.get(i).getPrice() == price){
                System.out.println(drinks.get(i));
            }else {
                System.out.println("일치정보 없음");

            }
        }
    }

}

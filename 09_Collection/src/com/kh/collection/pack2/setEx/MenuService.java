package com.kh.collection.pack2.setEx;

import java.util.HashSet;

public class MenuService {
    private HashSet<Menu> menuSet = new HashSet<Menu>();

    //메뉴추가
    public void addMenu(Menu menu) {
        //menu 통째로 넣을때 같은 조건 기준
        if(menuSet.add(menu)){
            System.out.println("Menu added"+menu);
        } else {
            System.out.println("Menu not added"+menu);
        }
        System.out.println("메뉴 추가됨" + menu);
        //같은 메뉴 추가 막기
    }
    //메뉴삭제
    public void removeMenu(int id) { //삭제할 id 입력
        for(Menu menu : menuSet) {  //메뉴 순차 확인
            if(menu.getId() == id) { //일치시
                menuSet.remove(menu); //삭제
                break;                 //종료
            }
        }
        System.out.println("해당메뉴 삭제됨");
    }
    //메뉴검색
    public Menu searchMenu(int id) {
        for(Menu menu : menuSet) {
            if(menu.getId() == id) { //일치시
                return menu;        //메뉴 전달해서 보여줌, 출력 안함
            }
        }
        System.out.println("해당하는 메뉴 없음");
        return null;                //빈 값 전달해서 보여줌
    }
    //메뉴출력
    public void printMenu() {
           if(menuSet.isEmpty()) {
               System.out.println("조회할 메뉴 없음");
           }else {
               for(Menu menu : menuSet) {
                   System.out.println(menu);
               }
           }
        for (Menu menu : menuSet) {
            System.out.println(menu);
        }
    }
}

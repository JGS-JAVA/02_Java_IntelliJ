package com.kh.collection.pack2.setEx;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
    Scanner sc = new Scanner(System.in);
    Book bk = new Book();
    ArrayList list = new ArrayList();

    public void insertBook() {
        if(list.add(bk)) {
            System.out.println("추가 성공");
        }else{
            System.out.println("이미 존재하는 도서임");

        }
    }
    /* 정보를 가져와서 정보와 일치하는 도서를 검색하고 존재하면 검색 ok
    * 어떤 파라미터로 도서를 검색할지 (  ) 안에 기재
    * 매개변수명이자 파라미터로 어떤 검색을 해서 가져올지 설정
    * */
    public void searchBook(String title) {
        for(bk : list){
            if(bk.getTitle() == title){
                System.out.println(bk);
            }else {
                System.out.println("해당도서 없음");

            }
        }
    }
    public void deleteBook(String title) {
        for(bk : list){
            if(bk.getTitle() == title){
                list.remove(bk);
                break;
            }
        }
    }

}

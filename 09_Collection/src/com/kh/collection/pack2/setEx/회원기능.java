package com.kh.collection.pack2.setEx;

import java.util.HashSet;

public class 회원기능 {
    //회원객체생성 user

    회원 user = new 회원();
    HashSet<회원> userList = new HashSet<회원>();
    //회원추가기능
    public void addUser(){
        if(menu.add(user)){
            System.out.println("추가 성공");

        }else{
            System.out.println("이미 존재하는 회원임");

        }
    }
    //회원조회기능
    public void allUser(){
        //등록회원 없으면
        if(userList.isEmpty()){
            System.out.println("등록회원 없음");
        }else{
            System.out.println(user);

        }
        for(회원 user : userList){
            System.out.println(user);
        }
    }

    //회원검색기능
    public void searchUser(int id){
    for(회원 user : userList){
        if(user.getId() == id){
            System.out.println(user);
        }else {
            System.out.println("해당회원 없음");

        }
    }
    }
    //회원삭제기능
    public void deleteUser(){
    for(회원 user : userList){
        if(user.getId() == id){
            userList.remove(user);
            break;
        }
    }

    }
}

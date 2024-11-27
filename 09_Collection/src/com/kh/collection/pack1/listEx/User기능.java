package com.kh.collection.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class User기능 {
    //
    private ArrayList<User> userList = new ArrayList<User>();
    private Scanner sc = new Scanner(System.in);
    public void addUser() {
        System.out.println("\n 사용자 추가");
        System.out.println("name: ");
        String name = sc.nextLine();
        System.out.println("password: ");
        String password = sc.nextLine();
        System.out.println("email: ");
        String email = sc.nextLine();

        sc.nextLine();
        sc.close();

        User user = new User(name, password, email);
        userList.add(user);
        System.out.println(userList.toString());
        System.out.println("유저 추가 성공");
    }
    public void allUsers(){
        System.out.println("\n====추가된 사용자 목록====");

        if(userList.isEmpty()){
            System.out.println("등록 사용자 없음");
        }else{
            for (int i = 0; i < userList.size(); i++) {
                userList.get(i);
                System.out.println(userList.get(i).toString());
                //사용자가 1명이라도 있으면 목록 출력
            }
            for(User user : userList){
                System.out.println(user.toString());
                //리스트에 작성한 유저 하나씩 유저에 담기
            }
        }
    }

    public void removeUser(){
        System.out.println("\n 사용자 제거");
        System.out.println("제거할 사용자: ");
        String name = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getName().equals(name)) { //i번째에서 일치함
                userList.remove(i); //i번째 옷 제거
                System.out.println(name + "제거 성공");
                found = true;
                break; //for문 종료
            }
        }

        if (!found) {
            System.out.println(name + "해당 정보 없음");
        }
    }
    }


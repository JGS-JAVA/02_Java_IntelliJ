package com.kh.collection.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class User기능 {
    //
    private ArrayList<User> userList = new ArrayList<User>();
    private Scanner sc = new Scanner(System.in);
    public void addUser() {
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

        if(allUsers.isEmpty()){
            System.out.println("등록 사용자 없음");
        }else{
            for (int i = 0; i < allUsers.size(); i++) {
                allUsers.get(i);
                System.out.println(allUsers.get(i).toString());
            }
        }
    }
}

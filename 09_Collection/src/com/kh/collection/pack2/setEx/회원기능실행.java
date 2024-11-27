package com.kh.collection.pack2.setEx;

import java.util.Scanner;

public class 회원기능실행 {
    public static void main(String[] args) {
        회원 회원 = new 회원();
        회원기능 회원기능 = new 회원기능();

        Scanner sc = new Scanner(System.in);

        회원 u1 = new 회원(1,"홍길동","hong@nn.com","산타기");
        회원 u2 = new 회원(2,"강길자","gil@nn.com","강구경");
        회원 u3 = new 회원(3,"박상실","shil@nn.com","십자수");

        회원기능.addUser(u1);
        회원기능.addUser(u2);
        회원기능.addUser(u3);

        회원기능.allUser();

        회원기능.searchUser(2);

        회원기능.deleteUser(1);

    }
}

package com.kh.oop.constructorPre;

import java.util.Scanner;

public class CafeRun {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        Cafe cafe = new Cafe();

        System.out.println("메뉴이름:");
        String name = sc.nextLine();
        System.out.println("메뉴가격:");
        int price = sc.nextInt();
        System.out.println("메뉴수량:");
        int quantity = sc.nextInt();

       Cafe c = new Cafe(name,price,quantity);

       System.out.println(c.주문총액(price,quantity));
    }
}

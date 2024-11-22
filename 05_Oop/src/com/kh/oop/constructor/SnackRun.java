package com.kh.oop.constructor;
import com.kh.oop.constructor.Snack;


public class SnackRun {
    public static void main(String[] args) {

        Snack snack1 = new Snack();
        snack1.setName("초코칩 쿠키");
        snack1.setPrice(1500);
        snack1.setTaste("달콤한 초코맛");

        Snack snack2 = new Snack();
        snack2.setName("허니버터칩");
        snack2.setPrice(2000);
        snack2.setTaste("달콤한 버터맛");

        System.out.println(snack1.toString());
        System.out.println(snack2.toString());

        Snack snack3 = new Snack("새우깡", 1200, "짭짤한 새우맛");
        String result1 = snack1.toString();
        System.out.println(result1);
        String result2 = snack2.toString();
        System.out.println(result2);
        String result3 = snack3.toString();
        System.out.println(result3);
    }

}

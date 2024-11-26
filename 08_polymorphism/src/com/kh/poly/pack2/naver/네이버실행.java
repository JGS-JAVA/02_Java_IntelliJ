package com.kh.poly.pack2.naver;

public class 네이버실행 {
    public static void main(String[] args) {
        네이버블로그 blog1 = new 네이버블로그("이영희",
                "101-6666-5555", "부산 해운대",
                "40", "momo",
                "여행블로그");
        System.out.println(blog1.toString());

        네이버카페 cafe1 = new 네이버카페("박철수","010-1111-1111", "서울 종로", "30","회원","요리카페");
    }
}

package com.kh.poly.pack2.bookPre;

public class BookRun {
    public static void main(String[] args) {

        EBook eBook = new EBook("자바 프로그래밍","홍길동",2000,"15.5MB");
        eBook.toString();
        PrintBook printBook = new PrintBook("파이썬","이영희",3000,3000);

    System.out.println(printBook.toString());
    }
}

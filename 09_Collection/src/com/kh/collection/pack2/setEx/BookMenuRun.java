package com.kh.collection.pack2.setEx;

import java.util.Scanner;

public class BookMenuRun {
    public static void main(String[] args) {
        Book bk = new Book();
        BookMenu bm = new BookMenu();

        Scanner sc = new Scanner(System.in);

        bm.insertBook();
        bm.searchBook();
        bm.deleteBook();
    }
}

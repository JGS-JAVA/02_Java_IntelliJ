package com.kh.pack2.pre1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritePre3 {
    public static void main(String[] args) {

        System.getProperty("user.home");
        File file = new File(System.getProperty("user.home") + "/Desktop/menus.txt");
        if (!file.exists()) {           //파일 없을때 파일생성
            try {
                file.createNewFile();
                System.out.println("생성 성공");

            } catch (IOException e) {
                System.out.println("생성 실패");
                return;
            }
        } else {
                System.out.println("이미 존재함");
                return;

        }


//alt enter -> 빨간전구 클릭할때 목록 보기
        try {
            FileWriter writer = new FileWriter(file,true); //false 는 덮어쓰기
           // String content = "양식\n 한식\n 중식\n 일식";
            Scanner sc = new Scanner(System.in);
            System.out.println("내용 작성");
            String content = sc.nextLine();

            writer.write(content);
            writer.close();
            System.out.println("파일 안에 글자 작성 완료");
        } catch (IOException e) {
            System.out.println("파일생성 실패");
        } finally {
            System.out.println("종료");

        }
    }
}


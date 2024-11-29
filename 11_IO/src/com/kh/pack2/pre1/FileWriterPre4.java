package com.kh.pack2.pre1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterPre4 {
    public static void main(String[] args) {

        System.getProperty("user.home");
        File file = new File(System.getProperty("user.home") + "/Desktop/menu.txt");
        if (file.exists()) {
            try {
                FileWriter writer = new FileWriter(file,true);
                String content = "떡볶이\n 순대\n 마라탕";
                writer.write(content);
                writer.close();
                System.out.println("이어적기 성공");

            } catch (IOException e) {
                System.out.println("이어적기 실패");
                return;
            }

        } else {
            try {
                file.createNewFile();
                FileWriter writer = new FileWriter(file,true);
                System.out.println("파일생성 성공");
                String content = "떡볶이\n 순대\n 마라탕";
                writer.write(content);
                writer.close();

                System.out.println("글자작성 완료");

            } catch (IOException e) {
                System.out.println("파일생성 및 글자작성 실패");
                return;
            }

        }
    }
}

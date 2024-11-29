package com.kh.pack2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritePre2 {
    public static void main(String[] args) {

        File file = new File(System.getProperty("user.home") + "/Desktop/lunch.txt");

        try {
            if (file.exists()) {
                System.out.println("파일존재");
                return; //덮어쓰기 방지
            } else {
                file.createNewFile();
                System.out.println("파일생성완료");
            }
        } catch (IOException e) {
            System.out.println("오류 발생");
        return;
        }
        try {
            FileWriter writer = new FileWriter(file);
            String content = "한식 된장찌개\n 양식 돈까스\n 중식 볶음밥";
            writer.write(content);
            writer.close();
            System.out.println("작성 완료");
        } catch (IOException e) {
            System.out.println("작성 실패");
        } finally {
            System.out.println("종료");

        }
    }
}

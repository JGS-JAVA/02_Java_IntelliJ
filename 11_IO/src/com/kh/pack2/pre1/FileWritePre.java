package com.kh.pack2.pre1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritePre {
    public static void main(String[] args) {

       String path = System.getProperty("user.home")+"/Desktop/";
        File file = new File(System.getProperty("user.home")+"/Desktop/hello.txt");
        try {
            if(file.exists()){
                System.out.println("파일존재");
                return; //덮어쓰기 방지
            }else {
                file.createNewFile();
                System.out.println("파일생성완료");
            }
        } catch (IOException e) {
            System.out.println(e); //에러출력
            return;
        }

        try {
            FileWriter writer = new FileWriter(file);
            String content = "Hello\n Hi";
            writer.write(content);
            writer.close();
            System.out.println("작성 완료");
        } catch (IOException e) {
            System.out.println(e);
        }finally {
            System.out.println("종료");

        }

    }
}


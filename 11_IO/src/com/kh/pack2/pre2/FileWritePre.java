package com.kh.pack2.pre2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
* createTxt(path, fileName)
* @param
* @param
*
* */
public class FileWritePre {
   public void createTxt() {
       File file = new File(String path + String fileName);



       if(file.exists()) {
           System.out.println("이미 존재함");
           return;

       } else{
           try {
               file.createNewFile();
               System.out.println("파일생성 성공");

           } catch (IOException e) {
               System.out.println("파일생성 실패");
               return;

           }

       }

   }

   public void writeTxt() {
       File file = new File(path+fileName);

       try {
           FileWriter fw = new FileWriter(file,true);
           Scanner sc = new Scanner(System.in);
           System.out.println("내용 입력: ");
           String content = sc.nextLine();
           fw.write(content);
           fw.close();
           System.out.println("파일쓰기 성공");
       } catch (IOException e) {
           System.out.println("파일쓰기 실패");
       }
   }


}

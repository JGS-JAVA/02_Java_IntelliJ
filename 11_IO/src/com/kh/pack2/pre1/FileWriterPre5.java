package com.kh.pack2.pre1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
* createFile(String 경로, String 파일이름)
* 파일생성기능
* param = parameter
* @param path 파일 경로
* @param fileName 파일 경로
* @return 파일 생성 실패시 사용
*
*
* */
public class FileWriterPre5 {
   public void createFile(String path,String fileName) {
       File file = new File(path+fileName);
       if(file.exists()) {
           System.out.println("File already exists"+fileName);
           return;
       } else{
           try {
               file.createNewFile();
           System.out.println("파일 생성");
           } catch (IOException e) {
               //에러출력
           System.out.println("생성 실패");
           System.out.println(e);
           return;
           }
       }
   }

   //파일 안에 글자 작성
    //@param path 파일경로
    //@param fileName 파일이름

   public void writeFile(String path,String fileName) {
       File file = new File(path+fileName);
       if(!file.exists()) {
           System.out.println("파일 없음");
           return;

       }
       Scanner sc = new Scanner(System.in);
       try {
           FileWriter fw = new FileWriter(file,true); //이어쓰기
           System.out.println("이어적을 내용:");
           String input = sc.nextLine();
           fw.write(input);
           fw.close();
       } catch (IOException e) {
           System.out.println("이어적기 실패");

       } finally{

           sc.close();
           System.out.println("종료");
       }

   }
}

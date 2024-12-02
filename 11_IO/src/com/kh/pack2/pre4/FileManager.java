package com.kh.pack2.pre4;

import java.io.*;
import java.util.Scanner;

public class FileManager {
   /*
    * 파일생성기능 / 파일읽기기능 / 파일이어쓰기기능
    * createFile (path,createFileName)
    * readFile (path,readFileName)
    * writeToFile(path, writeFileName)
    * */
    public void createFile(String path, String createFileName){
        File file = new File(path, createFileName);
        if(!file.exists()){
            System.out.println("파일 존재");

        }else{
            try {
                file.createNewFile();
            System.out.println("파일 생성완료");
            } catch (IOException e) {
            System.out.println("파일 생성실패"+e.getMessage());

            }finally{
            System.out.println("종료");

            }
        }
    }
   String readFileName;
   public void readFile(String path, String readFileName){
       File file = new File(path, readFileName);
       if(!file.exists()){
           System.out.println("파일 없음"+file.getAbsolutePath());
           return; //종료
       } {
           try (FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr)){
           //열고닫기 자동관리

           } catch (FileNotFoundException e) {
               System.out.println("파일 없음");
           } catch (IOException e) {
               System.out.println("파일 찾기 이외 다른문제 발생");
           } finally {
               System.out.println("종료");

           }
       }

   }
    String writeFileName;

   public void writeToFile(String path, String writeFileName){
       File file = new File(path, writeFileName);
       if(!file.exists()){
           System.out.println("이어쓰기할 파일 없음");
           return;
       }
       try (FileWriter fw = new FileWriter(file, true);
           Scanner sc = new Scanner(System.in);) {

            //(file) 덮어쓰기, (file,true) 이어쓰기
           System.out.println("파일에 작성할 내용 입력: ");
           System.out.println("입력하기 멈출때 exit 입력: ");
           System.out.println("파일내용 : ");


           while (true) {
               String input = sc.nextLine();

               if(input.equalsIgnoreCase("exit")){ //대소문자 관계없음
                   return; //이어쓰지않고 종료
               }
           fw.write(input); //작성
         //   sc.close(); // 메서드 하나에서 닫으면 메인까지 닫힌다. 그래서 try 안에 작성해야 안전하다 안적는게 좋다.
           }

          // fw.close();      //저장,닫기 -> try (FileWriter fw = new FileWriter(file)) 로 대신한다
       } catch (IOException e) {
           System.out.println("이어쓰기 중 문제발생"+e.getMessage());
       } finally {

           System.out.println("이어쓰기 종료");
           
       }
   }

}

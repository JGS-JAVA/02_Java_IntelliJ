package com.kh.pack2.pre4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteTrue {
    public  void writeTxt(){
        String path = System.getProperty("user.home")+"/Desktop/";
        Scanner sc = new Scanner(System.in);
        System.out.println("이어쓸 파일명: ");
        String fileName = sc.nextLine();
        File file = new File(path+fileName+".txt"); //fileName 뒤에 확장자 표기 붙이기
        if(!file.exists()){
            System.out.println("피일 없음");
            System.out.println(fileName+"피일 생성? Yes/No");
            String answer = sc.nextLine();
            if(answer.equalsIgnoreCase("yes")){
                try {
                    file.createNewFile();
                    System.out.println("파일생성 성공");
                } catch (IOException e) {
            System.out.println("피일 생성 실패"+e.getMessage());

                }
            } else if(answer.equalsIgnoreCase("no")){
                return;
            } else {
            System.out.println("종료");
                return;
            }
            //파일에 글 작성 // try() 안에 여러개 쓸 때 ; 로 구분하기
            try(FileWriter fw = new FileWriter(file,true)) {
                while(true){
            System.out.println("종료시 exit 작성");
            System.out.println("작성할 내용: ");

                String input = sc.nextLine();
                    if(input.equalsIgnoreCase("exit")){ //대소문자 관계없음
                        return; //이어쓰지않고 종료 break 는 와일, 포문 안에서만 가능
                    } else {
                        fw.write(input+"\r\n"); 
                        // \r = 키보드 커서를 현재줄 맨앞으로 이동하기
                        // \n = 줄바꿈
                        //윈도우는 글작성시 줄바꿀때마다 \r\n 한다

                    System.out.println("내용이 추가되었습니다.");
                    }


                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

package com.kh.pack1.fileEx;

import java.io.File;
import java.io.IOException;

public class FileService {
    public void method1(){
        //C:/Users/user1/Desktop>
        //C:/Users/user1/바탕화면>

        //바탕화면에 만들기
        File 폴더=new File(System.getProperty("user.home")+"/Desktop/newFolders");

        System.out.println("폴더위치:"+폴더.getPath());

        System.out.println("폴더절대경로"+폴더.getAbsolutePath());
        //                    :C:/newFolder
        System.out.println("폴더이름: "+폴더.getName());
        System.out.println("폴더존재확인: "+폴더.exists());

        //폴더생성, 폴더 존재하는지 확인후 폴더생성
        if(폴더.exists()){
            System.out.println("이미 존재하는 폴더");
        }else{
            폴더.mkdir();
            System.out.println("폴더 생성완료");

        }


    }

    //바탕화면에 만들기
    public void method2()  {
        File file = new File(System.getProperty("user.home")+"/Desktop/내파일.txt");

        if (file.exists()) {
            System.out.println("이미 존재함");
        }else{
            try {
                file.createNewFile();
                System.out.println("파일이 생성되었습니다.");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

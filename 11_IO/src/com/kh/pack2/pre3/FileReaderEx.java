package com.kh.pack2.pre3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderEx {
    public void method1(String path,String fileName) {
        path = System.getProperty("user.home") + "/Desktop/";
        String filename = "lunch.txt";

        try {
            FileReader file = new FileReader(path+fileName);
            BufferedReader br = new BufferedReader(file); // 성능 향상용
            String line; // 공간 설정, while 문 안에 자료형 못써서 여기 작성
            
            while ((line = br.readLine()) != null) { //한줄씩 읽기
                System.out.println(line); //출력
            }
        } catch (Exception e) {
            System.out.println(e);
        }


    }
    }
}

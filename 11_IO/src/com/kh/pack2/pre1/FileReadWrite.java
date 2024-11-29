package com.kh.pack2.pre1;

import java.io.*;

public class FileReadWrite {
    //파일 바탕화면에 만들고 파일 안에 글자 작성
    public void method1(){
        System.getProperty("user.home");
        //"user.home" = C:/Users/user1/
        //C:/Users/user1/Desktop
        File file = new File(System.getProperty("user.home")+"/Desktop/ex1.txt");
//ctrl alt T -> 트라이캐치 감싸기
        try {
            if(file.exists()){  //파일 없으면 파일 생성
                System.out.println("파일존재");
            }else {
                file.createNewFile();
            }
        } catch (IOException e) {
           System.out.println(e); //에러출력
        }

        //파일에 문자 작성
        //글자 작성시 BufferedWriter FileWriter 사용
        try {
            FileWriter writer = new FileWriter(file); //파일 안에 글자 작성시 에러발생확률 높다 -> 트라이캐치 하기
            String content = "안녕 반갑 환영";
            writer.write(content); //파일쓰기 기능으로 파일 안에 글자쓸 기능호출 () 안에 작성할 내용 작성
            writer.close(); // 글자쓰고 닫기 = 파일에 작성한것 저장하기
            System.out.println("파일 안에 글자 작성 완료");
        } catch (IOException e) {
            System.out.println(e); //에러출력
        }finally {
            System.out.println("종료");

        }


    }

    //만든파일에 이어서 글자 작성하기 FileWriter writer = new FileWriter("파일명",true) 참은 이어쓰기, 거짓은 덮어쓰기
    public void method2(){
        System.getProperty("user.home");
        File file = new File(System.getProperty("user.home")+"/Desktop/ex1.txt");
        try {
            FileWriter writer = new FileWriter(file,true);
            String content2 = "이어서 작성한 내용";
            writer.write(content2);
            writer.close();
           System.out.println("이어적기 성공");

        } catch (IOException e) {
           System.out.println("이어적기 실패");
        } finally {
           System.out.println("종료");

        }
    }
    
    //FileReader = 파일에서 문자 데이터 한글자씩 읽는 클래스, 느리다
    // BufferedReader = 파일리더에 버퍼링기능 추가한 클래스
    //                   줄단위로 데이터 읽어 빠르다
    //버퍼 : 데이터 가져오기
    public void method3(){
        File file = new File(System.getProperty("user.home")+"/Desktop/ex1.txt");
        try {
            FileReader fr = new FileReader(System.getProperty("user.home")+"/Desktop/ex1.txt");
            BufferedReader br = new BufferedReader(file);
            //String line = br.readLine(); //무한루프
            String line; //while 문에 자료형 못써서 여기 쓴다
                            //글자를 담고 출력할 공간 생성

            while ((line= br.readLine()) != null) {  //line 이라는 공간에 한줄의 글자들 담고
                System.out.println(line);           //출력한다
            }
            br.close(); //br 먼저 닫기
            fr.close();
            
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

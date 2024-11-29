package com.kh.pack1.fileEx;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

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

//해당폴더에서 주소창에 cmd 치면 위치 나온다
    public void method3()  {
   // System.out.println(System.getProperty("user.home")+"/Downloads"); //확인할 폴더경로

        //특정폴더위치에 있는 파일,폴더 배열형태로 가져오기
        // 역슬래시는 슬래시로 바꾸기 ctrl + f
        File[] files = File.listRoots(); 
        // C:/Users/user1/Downloads> 에 있는것 목록으로 가져오기
        //향상된 for문 ->
        //폴더 열 때 이미지,동영상 파일 많을때 for 문 돌려서 시간이 걸린다
        for(File f : files){
            System.out.println(f.getName());
            System.out.println(f.length()); //파일크기
            System.out.println(f.lastModified());
            //마지막 수정날짜 1970년1월1일부터 지난 날짜수 = 1732772913147
            long lastModified = f.lastModified(); //f 아래 파일 많다 그 중 마지막 수정일 선택
            Date date = new Date(lastModified);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            //간단한 날짜 표기 객체
            String formatDate = sdf.format(date);
           // String formatDate = sdf.format(f.lastModified());
            //날짜형식을 문자열로 형변환
            System.out.println(date);
            //Cannot format given Object as a Date 에러발생
            //마지막 수정날짜를 최대한 큰 공간 long 으로 가져와서 변환해서 날짜 끝수 잘리지 않게 하기

        }
    }
}

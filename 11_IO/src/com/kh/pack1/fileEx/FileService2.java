package com.kh.pack1.fileEx;
/*
* System.getProperty() 는 자바에서 실행중인 시스템정보 가져온다
* 시스템 환경정보,설정값 얻기
* 변수명으로 값 담을때 변수명 앞에 String
* String 변수명 = System.getProperty(String 키);
*
* 키종류                   키에 해당하는 값
* java.version              자바버전확인
* java.home              자바설치경로
* os.name                윈도/리눅스/맥 확인
* user.name                 현재 컴퓨터 사용자 이름
* user.home                 현재 컴퓨터 사용자 홈폴더 경로
* user.dir                 현재 작업폴더 경로
*
* 위와 같은 내용 확인시
* System.out.print 로 출력
*
*
*
*
*
* */
public class FileService2 {
    public void method1(){
        System.getProperty("user.home"); // 유저홈 정보 가져오기
        System.out.println(System.getProperty("user.home"));

        //운영체제 정보
        String osName = System.getProperty("os.name");
        System.out.println(osName);

        //사용자 정보
        String userName = System.getProperty("user.name");
        System.out.println(userName);


    }
}















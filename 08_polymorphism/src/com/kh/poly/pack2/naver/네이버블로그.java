package com.kh.poly.pack2.naver;

public class 네이버블로그 extends 네이버회원 {
    private String 블로그닉네임;
    private String 블로그제목;
    //기본 생성자
    public 네이버블로그(){
        super(); //네이버회원 정보 기본으로 가져옴
    }
    //필수 생성자
    public 네이버블로그(String 유저이름, String 유저번호, String 유저주소, String 유저나이, String 블로그닉네임, String 블로그이름) {
        super(유저이름, 유저번호, 유저주소, 유저나이);
        this.블로그닉네임 = 블로그닉네임;
    }

    //세터

    public void set블로그닉네임(String 블로그닉네임) {
        this.블로그닉네임 = 블로그닉네임;
    }

    public void set블로그제목(String 블로그제목) {
        this.블로그제목 = 블로그제목;
    }

    //게터

    public String get블로그닉네임() {
        return 블로그닉네임;
    }

    public String get블로그제목() {
        return 블로그제목;
    }

    //toString

    @Override
    public String toString() {
        //네이버회원 기본정보 넣고 블로그닉네임 제목 출력
        return super.toString() + '\''+
                "네이버블로그{" +
                "블로그닉네임='" + 블로그닉네임 + '\'' +
                ", 블로그제목='" + 블로그제목 + '\'' +
                '}';
    }
}

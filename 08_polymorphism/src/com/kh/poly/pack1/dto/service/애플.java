package com.kh.poly.pack1.dto.service;
//단어 드래그후 ctrl + f 단어 한번에 바꾸기
public class 애플 extends 스마트폰{
    private int ios버전;
    //기본생성자
    public 애플(){
        //super(); //스마트폰 특성 그대로 가져온다. 항상 생략된채로 존재
    }
    //필수생성자
    public 애플(String 화면, String 통신사, String 성능, int ios버전) {
        super(화면, 통신사, 성능); //스마트폰 클래스에서 무조건 가져와서 super 안에 작성
        this.ios버전 = ios버전; //갤럭시 안이라서 this
    }
    //세터
    public void setios버전(int ios버전) {
        this.ios버전 = ios버전;
    }
    //게터
    public int getios버전() {
        return ios버전;
    }
    //toString
    @Override
    public String toString() {
        return "갤럭시{" +
                "ios버전=" + ios버전 +
                "/"+super.toString()+
                '}';
    }
}

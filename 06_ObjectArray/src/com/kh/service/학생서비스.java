package com.kh.service;
//서비스 클래스: 기능제공 클래스
//입력, 출력 빼고 나머지 모두 작성
//if, for문으로 데이터 가공,저장
//run에서 작성했던 사람을 추가,삭제,수정하는 추가기능을 서비스라는 폴더로 따로 빼서 작성
//기능모음폴더
import com.kh.dto.학생;

public class 학생서비스 {
    private 학생 s1; //dto에 만든 학생을 참조자료형으로 사용해서 학생에 등록된 정보를 저장
    //학생정보 추가
    public void 학생추가하기(String studentNumber, String studentName, char gender){
        s1 = new 학생(studentNumber, studentName, gender);
    }
    //학생정보반환
    public 학생 getS1(){
        return s1;
    }
}

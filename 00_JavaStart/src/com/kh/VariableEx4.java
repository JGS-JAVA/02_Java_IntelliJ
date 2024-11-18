
//com.ht 폴더 안에 작성된 파일
package com.kh;

//VariableEx4 파일명으로 코딩을 class 내부에 작성
public class VariableEx4 {

    //메인 메서드 : 자바 프로그램 실행용 기능
    /*
    * final 상수
    * 상수명은 전부 대문자로 작성(개발자간 약속), 단어사이 _ 넣기
    * 
    * */
    public static void main(String[] args) {
        final String NAME = "홍길동";

        final int MIN = 0;
        final int MAX = 100;

        System.out.println("최소 : " + MIN);
        System.out.println("최대 : " + MAX);

    }
}

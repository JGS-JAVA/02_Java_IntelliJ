package com.kh;

public class PrintEx1 {
    public static void main(String[] args) {
    /*
    * System.out == (eclipse 나 intellij 기준) console 창
    * System.out.printf("",변수\값);
    * 정해진 형식에 맞게 문자열 출력
    *
    *  첫 매개변수""
    *패턴 적용된 문자열 작성
    *
    * 패턴 종류
    * %d : 정수(byte short int)
    * %c : 문자(char)
    * %s : 문자열(String)
    * %b : 논리형(boolean)
    * %f : 실수형(float/double)
    *
    * 양수 : 오른쪽 정렬
    * 음수 : 왼쪽 정렬
    *
    * %숫자d : 정수가 출력된 칸을 숫자만큼 확보
    * 예) %-6d : 000000 여섯칸 확보
    * %.숫자f : 소숫점 아래 몇자리까지 표시할지 지정
    * (지정된 자리로 반올림)
    *
    * -두번째 매개변수
    * --첫번째 매개변수 문자열 중 패턴에 들어갈 변수\값을 순서대로 작성
    *
    *
    *
    * */
    System.out.print("이름 : ");
        System.out.print("kht");
        System.out.println("이다");
        System.out.println("오늘도 공부");

        String name = "홍길동";
        int age = 18;
        double height = 173.37;
        char gender = 'M';
        boolean study = true ;
        System.out.printf("%s %d세 %c성 키 %.1f cm 공부: #b",name,age,height,gender,study);
    }
}

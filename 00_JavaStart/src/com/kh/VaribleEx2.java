package com.kh;

public class VaribleEx2 {
    public static void main(String[] args) {
        /*
        * 컴퓨터 값 처리 원칙
        * 같은 자료형끼리 연산, 결과도 같은 자료형
        *
        * 형변환
        * 다른 자료형이면 같게 맞추기
        *
        * 자동 형변환
        * 작은 것을 -> 큰 것에 담기
        *
        * 강제 형변환
        * 큰 것을 -> 작은 것에 담기 (일부 버려지거나 문제발생)
        *
        * 자동 형변환 확인1
        *숫자 맨앞에 0 붙으면 0 제외한 수만 표기되거나, 10진수에서 8진수로 변환됨
        * 
        *
        *
        * */
        int num1 = 2909;

        byte result1 = (byte) num1;
     //   int result2 = num1 + num2;
        //int 보다 long 이 더 크다
        System.out.println(num1); //290
        System.out.println(result1); //34

    int 주민번호1 = 870101;
        System.out.println("주민번호 1번 : " + 주민번호1);

        int 주민번호2 = 000101;
        System.out.println("주민번호 2번 : " + 주민번호2);

        String 주민번호3 = "000101";
        System.out.println("주민번호 3번 : " + 주민번호3);
    }
}

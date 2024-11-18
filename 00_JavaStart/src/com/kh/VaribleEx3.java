package com.kh;

public class VaribleEx3 {
    public static void main(String[] args) {
    /*
    * 강제 형변환
    * 1. 값 범위 큰 자료형을 -> 작은 자료형으로 강제변환
    * 데이터 손실 가능
    *
    * 2. 의도적으로 변환하기
    * (자료형) 변수명 \\ 값; -> 지정된 자료형으로 변경
    *
    *
    * */
        int num1 = 290;
        byte result1 = (byte) num1;  // int 를 byte 로 강제변환
        System.out.println(num1);
        System.out.println(result1);

    }
}

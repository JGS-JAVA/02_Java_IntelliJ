package com.kh.oop.methodex;

public class Return메서드 {
    /*
    리턴은 자바 메서드에서 값 반환
    메서드가 작업수행후 결과 호출자에 전달시 리턴사용
    데이터베이스의 저장값 프론트엔드에 전달

    * public 자료형 메서드명(매개변수명){
    *     코드
    *     return (생략가능 변수명)
    * }
    *
    * */

//매개변수 없는 리턴 메서드
    public String method1(){
    return "안녕";
    }

    //매개변수 있는 리턴 메서드
    //메서드2에 숫자값 전달하기
    public int method2(int abc){
        return abc;


    }

    public String method3(int xyz){
        return "숫자가 들어왔음"; //public String 이어야 함
    }

    //아이디 찾기
    public int findId(String name, int phone){
        return 111111111;
    }

    public int 더하기(int a, int b) {
        return a + b;
    }
    public int 빼기(int c, int d){
        return c - d;
    }
}

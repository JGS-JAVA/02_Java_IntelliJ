package com.kh.poly.overloadingEx;
    //메서드(기능)명은 같아도 매개변수 개수,타입 다를때 적용
public class 계산기 {
    // 더하기
    // 1. 두 숫자 더하기
    public int add(int a, int b) {
        return a + b;
    }

    // 2. 세 숫자 더하기
    public int add (int a, int b, int c) {
        return a + b + c;
    }
    //3. 소수점 포함해 더하기
    public double add (double a, double b) {
        return a + b;
    }

    //4. 글자 이어붙여 완성하기
        public String add (String a, String b) {
        return a + b;
        }


}

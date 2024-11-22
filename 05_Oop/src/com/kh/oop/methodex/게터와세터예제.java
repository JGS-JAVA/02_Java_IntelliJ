package com.kh.oop.methodex;

public class 게터와세터예제 {
/*
*
* alt + insert 로 게터세터 만들기
* */
    private int age;
//값 저장 -> 유효성 검사같은 if문 금지 -> @Setter 로 요약사용
    public void setAge(int age) {
        
        this.age = age;
    }
//값 전달                          -> @getter 로 요약사용
    public int getAge() {
        return age;
    }
}

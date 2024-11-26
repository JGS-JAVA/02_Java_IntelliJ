package com.kh.poly.pack3.interfaceEx;

public abstract class Animal {
    //공통 필드,메서드
    private String type;

    public Animal(){}
    public Animal(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }

    /*
    * Animal 클래스를 상속받는 자식클래스가 각자에 맞춰 재정의(Overriding)
    * 하도록 강제화시킴
    * 추상메서드는 뒤에 중괄호 없음 -> 기능 세부설정 필요없어서
    * */
    public abstract void eat();
    public abstract void sleep();
}

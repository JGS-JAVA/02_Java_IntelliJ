package com.kh.poly.pack3.interfaceEx;
//Animal 상속받는 Snake 는 eat, sleep 반드시 구현해야함
public class Snake extends Animal {
    private int poison;


    public Snake(int poison) {
        this.poison = poison;
    }

    public Snake(String type, int poison) {
        super(type);
        this.poison = poison;
    }

    public int getPoison() {
        return poison;
    }

    public void setPoison(int poison) {
        this.poison = poison;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPoison: " + poison;

    }

    //extends에 커서 올리고 alt shift enter
    @Override
    public void eat() {
    System.out.println("한번에 삼킨다");
    }

    @Override
    public void sleep() {
    System.out.println("똬리 튼 자세로 잔다");
    }
}

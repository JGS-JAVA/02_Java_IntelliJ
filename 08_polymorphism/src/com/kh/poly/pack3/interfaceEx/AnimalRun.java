package com.kh.poly.pack3.interfaceEx;

public class AnimalRun {
    public static void main(String[] args) {
        //추상클래스는 미완성되어 객체생성 불가
        Snake snake = new Snake();
        snake.eat();
        snake.sleep();

    }
}

package com.kh.poly.pack2.animalPre;

public class Dog extends Animal {
    private String 품종;
    private int 펀치횟수;

    public void set품종(String 품종) {
        this.품종 = 품종;
    }

    public void set펀치횟수(int 펀치횟수) {
        this.펀치횟수 = 펀치횟수;
    }

    public String get품종() {
        return 품종;
    }

    public int get펀치횟수() {
        return 펀치횟수;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "품종='" + 품종 + '\'' +
                ", 펀치횟수=" + 펀치횟수 +
                '}';
    }
}

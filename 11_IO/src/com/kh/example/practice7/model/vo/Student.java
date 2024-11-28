package com.kh.example.practice7.model.vo;

public class Student {
    private String 이름;
    private String 과목;
    private int 점수;

    public Student() {
    }

    public Student(String 이름, String 과목, int 점수) {
        this.이름 = 이름;
        this.과목 = 과목;
        this.점수 = 점수;
    }

    public String get이름() {
        return 이름;
    }

    public void set이름(String 이름) {
        this.이름 = 이름;
    }

    public String get과목() {
        return 과목;
    }

    public void set과목(String 과목) {
        this.과목 = 과목;
    }

    public int get점수() {
        return 점수;
    }

    public void set점수(int 점수) {
        this.점수 = 점수;
    }

    @Override
    public String toString() {
        return
                "이름='" + 이름 +
                ", 과목='" + 과목 +
                ", 점수=" + 점수;
    }
}

package com.kh.oop.field.privatePack;

public class PrivateEx1 {
    private String 계좌번호;
    private double 계좌잔액;
    //private 변수 사용시 getter(불러서 사용) setter(저장) 필요
    //alt + insert 해서 목록에서 선택하기

    public String get계좌번호() {
        return 계좌번호;
    }

    public void set계좌번호(String 계좌번호) {
        this.계좌번호 = 계좌번호;
    }

    public double get계좌잔액() {
        return 계좌잔액;
    }

    public void set계좌잔액(double 계좌잔액) {
        this.계좌잔액 = 계좌잔액;
    }
}

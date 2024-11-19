package com.kh.condition;

import java.util.concurrent.locks.Condition;
/*
* ConditionEx 의 기능 불러오기
* */
public class ConditionRun {
    public static void main(String[] args) {
        ConditionEx c = new ConditionEx();
//        c.scannerAge();
//        c.methodAge();
//    c.methodMonth();
        c.switchMonth();
    }
}

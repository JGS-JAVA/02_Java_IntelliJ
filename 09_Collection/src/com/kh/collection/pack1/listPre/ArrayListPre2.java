package com.kh.collection.pack1.listPre;

import java.util.ArrayList;

public class ArrayListPre2 {
    //method1 정수형
    public void method1(){
        ArrayList<Integer> list =  new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("초기값"+list);
        //삭제 1. remove("값")
        //삭제 2. remove(int indexNumber)
        //indexNumber 30이 아니라 30이란 값을 삭제할때
        list.remove(Integer.valueOf(30));
    }

    //method2 실수형

}

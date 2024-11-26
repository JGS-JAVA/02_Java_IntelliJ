package com.kh.collection.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class 학생기능 {
    public void addStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("학생이름: ");
        String name = sc.nextLine();
        System.out.println("학년: ");
        int age = sc.nextInt();
        System.out.println("취미: ");
        String hobby = sc.nextLine();


        학생 s1 = new 학생(name, age, hobby); //학생 하나 새로등록
        학생 s2 = new 학생("홍길동", 20, "음악"); //학생 하나 새로등록
        학생 s3 = new 학생("강길찬", 30, "독서"); //학생 하나 새로등록
        /*
        *
        * 메모리에 무작위로 퍼져있는 학생 3명을 배열로 정렬시킴
        *
        *
        * */
        ArrayList<학생> std1 = new ArrayList<학생>(); //등록한 학생들목록표 생성
        std1.add(s1);
        std1.add(s2);
        std1.add(s3);

        System.out.println("학생리스트");
        for(int i = 0; i < std1.size(); i++){

            System.out.println(std1.get(i).toString());
        }
        //향상된 for문
        //for(    배열에 들어있는 값 전달받을 변수명            : 배열에 있는 변수명)
        //for(    배열에 들어있는 값 전달받을 변수명            : 배열에 있는 변수명)
        for(학생 s : std1){
            System.out.println(s.toString());

        }
    }
}

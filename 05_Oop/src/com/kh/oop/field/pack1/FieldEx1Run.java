package com.kh.oop.field.pack1;

public class FieldEx1Run {
    public static void main(String[] args) {

        FieldEx1 f1 = new FieldEx1();  // FieldEx1 객체생성
        f1.method1();
        
        //변수에 무엇이 있나 출력문으로 확인
        System.out.println(f1.퍼블릭필드);
        System.out.println(f1.프로텍트필드);
        System.out.println(f1.디폴트필드);
        //System.out.println(f1.프라이빗필드); 접근불가
    }

}

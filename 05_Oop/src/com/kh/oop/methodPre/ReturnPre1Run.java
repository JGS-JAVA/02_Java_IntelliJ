package com.kh.oop.methodPre;

public class ReturnPre1Run {
    public static void main(String[] args) {
        ReturnPre1 r1 = new ReturnPre1();
//        System.out.println(r1.findId("감길식",5678));
//        System.out.println(r1.findId("홍길동",1234));

        int x = 1;
        int y = 2;
        r1.add(x,y);
        r1.sub(x,y);
        r1.mul(x,y);
        r1.div(y,x); //계산값 가진 상태, a b 에 전달한다, 출력 안함

        System.out.println(r1.add(x,y));
    }
}

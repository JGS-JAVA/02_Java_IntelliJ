package com.kh.exceptionPre;

public class ExceptionService {
    public void method1() {
        String name1 = "홍길동";
        int health1 = 50; //체력 100 만점
        String name2 = "강길자";
        int health2 = 80; //체력 100 만점

        //둘의 평균체력
        try {
            System.out.println(name1 + "와" + name2 + "의 평균");

            int avgHealth = (health1 + health2) / 0;
            System.out.println(avgHealth);
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage()); //발생에러 출력하되 프로그램 진행가능
            System.out.println("예상한 에러");
        }catch (Exception e) {
            //에러 예상못할때 작성, 마지막에 프로그램 원활하게 진행되도록 작성
            System.out.println(e.getMessage()); //발생에러 출력하되 프로그램 진행가능
            System.out.println("예상못한 에러, 해결바람");
        }
    }

    public void method2() {
        try {
            int arr[]={1,2,3,4,5};
            for(int i=0;i<=arr.length;i++) {
                System.out.println(arr[i]);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

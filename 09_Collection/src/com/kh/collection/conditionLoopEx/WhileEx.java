package com.kh.collection.conditionLoopEx;

/*
 * while 조건이 참인동안 코드 반복실행
 * while(조건 true){
 * 참일때 실행할 코드
 * }
 *
 * while 은 거짓 나오거나 return 처리로 종료함
 *
 * 1.while문 false로 만들기
 * boolean isTure = true
 * while(isTrue){
 * if(조건1){
 * 조건1 실행 코드
 * }else{
 * 조건1 아닐때 실행코드
 * isTrue = false  //while문 종료
 * }
 * }
 *
 * 2.return 처리
 * while(true){
 * if(조건1){
 * 조건1 실행 코드
 * }else{
 * 조건1 아닐때 실행코드
 * return;  //while문 포함 모든기능 종료
 * }
 * }
 * */
public class WhileEx {
    int abcd = 1;
    boolean isTrue = true;

    public static void main(String[] args) {
        WhileEx ex = new WhileEx();
        ex.method1();
        ex.method2();
    }

    public void method1() {
        while (isTrue) {
            switch (abcd) {
                case 1:
                    System.out.println("1");
                    break;
                default:
                    System.out.println("default");
                    isTrue = false;
            }
        }
    }

    public void method2() {
        while (true) {
            int a = 1;
            switch (a) {
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                default:
                    System.out.println("default");
                    return;
            }
        }
    }

}



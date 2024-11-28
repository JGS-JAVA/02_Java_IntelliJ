package com.kh.exceptionEx;

/*
* 익셉션: 코드로 처리가능 에러
* 익셉션 핸들링: 익셉션 발생시 예외처리 구문
*
*
*
* */
public class ExceptionService {
    //method1 에서 문제 발생
    public void method1(){
        int[] arr={1,2,3,4,5};

        for(int i=0;i <= arr.length;i++){ //i 는 0~5
            System.out.println(arr[i]);
        }
        /*
        * 에러발생결과를 개발자에 메시지로 전달
        * 예외발생구문을 try-catch 로 처리(예외처리)
        * 
        * -try{} : 예외가 발생할 코드 시도
        * -catch(예외){} : try안 코드 실행중 에러발생,에러가 예상했던 문제면
        * catch 하고 catch 중괄호 안의 코드 실행
        * -> 처리해서 정상실행함
        * 캐치는 여러개 작성가능
        * 예상못한 에러는
        * catch(Exception e){} 로 작성시 모든 문제 잡힌다
        * 
        * Exception = 자바에서 만든 에러목록
        * 
        * */
    }

    public void method2(){
        int[] arr={1,2,3,4,5};
        try { //에러가 예상돼도 실행
            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (Exception e) {
            //e 는 에러내용 저장공간(변수)
            System.out.println(e);
        }
    }
}

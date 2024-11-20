package com.kh.ex;

import java.util.Scanner;

public class ArrayExRun {
    public static void main(String[] args) {
        ArrayEx ex = new ArrayEx();
        //  new ArrayEx(); 를 ex 라고 부르기
        //ex.method3();
       // ex.method4();
        ex.method5();
    }

    /*
    *
    * 필드
    *
    * 배열 (자료구조)
    * 자바의 배열
    * 같은 자료형 변수 하나의 묶음으로 다룸
    * 생성한 배열요소는 인덱스로 이용해 구분
    * 배열 활용시 참조형 변수 이용
    *
    * 참조형 변수
    * 주소저장
    * 변수 사용시 그 주소에 위치한 배열,객체 참조
    * 기본 자료형 8개 제외한 나머지 모두 참조형 변수
    * 기본자료형 (소문자 시작) = byte, short, int, long, char, boolean, double
    * 대표 참조자료형 (대분자 시작) = String, Scanner, ..
    *
    *동일타입
    * 자바배열은 같은 자료형으로 맞추기
    *
    * 배열선언, 할당, 초기화
    * */
    public static class ArrayEx {
        Scanner sc = new Scanner(System.in);
        public void method1(){
            int num;
            int[] arr;
            //stack 에 int[]자료형 참조할 변수 생성
            arr = new int[4];
            //heap 에 int 4개짜리 배열 할당
            //arr 로 배열참조
            /*
            * 1. 초기화 전 -> 0 대입여부 확인
            * debug = 프로그램 실행중 특정시점에 어떤 값을 지니는지 확인함. 코드상태,오류 분석
            * 2. 인덱스로 초기화
            *
            * */
            arr[0] = 100;
            arr[1] = 200;
            arr[2] = 300;
            arr[3] = 400;


            System.out.println("초기화 후");
            /*
            <초기화 전>
            int[] arr; 실행시
            Stack 에 arr 변수 생성 (현재 주소 없는 상태)
            arr = new int[4]; 실행시
            Heap 크기 4짜리 배열생성, 초기값 0 설정
            Heap 에 생성된 배열 시작주소가 Stack 의 arr 에 저장
            이제 arr 은 heap 배열 참조 가능
            결과로
            Stack : arr 변수는 Heap 베열의 주소 가짐

            Heap : 배열생성돼 초기화된 상태

            arr[0] = 100;
            arr[1] = 200;
            arr[2] = 300;
            arr[3] = 400;   값 넣으면
            Heap 에 있는 배열 각 인덱스에 값 저장
            Stack : arr 변수에 Heap 에 있는 배열 주소값 저장
            Heap : 주소가 가리키는 배열이 각 인덱스에 할당된 값 포함





            * [Stack]                             [heap]
            * +-----------------+           +-----------------------+
            * |  arr(주소)  |  ----------->   |  [0] [1] [2] [3]  |
            * +-----------------+            |   0   0   0   0   |
            *                               +-----------------------+
            *
            *
            *  [Stack]                             [heap]
             * +-----------------+           +-----------------------+
             * |  arr(주소)  |  ----------->   |  [0] [1] [2] [3]  |
             * +-----------------+            |  100 200 300 400  |
             *                               +-----------------------+
            *
            * 배열은 js처럼
            * index = 0 부터
            * length = 1 부터
            *
            * */
        }

        /*
        * 배열로 Stack Heap 비교
        * 스택 : 메모장
        * 간단메모하고 지우는 공간
        * 프로그램 끝나면 자동삭제됨
        * 힘: 창고
        *
        * */
        public void method2(){
            int x = 10; //스택에 저장
            int[] arr = new int[x]; //힙에 저장
            arr[0] = x; // 힙 공간의 첫째칸에 x 값 저장
        }

        /*배열선언,할당

        int 나 변수명 앞뒤에 [] 붙여서 값 담을 공간이 배열형태임을 알려준다
        int 등 자료형 앞에는 못붙임
        int[] arr = new int[4]; 가능
        int []arr = new int[4]; 가능
        int arr[] = new int[4]; 가능
        []int arr = new int[4]; 불가능
        int arr = new int[4]; 불가능

        배열이름.length : 배열길이


         */
        public void method3(){
            int[] arr = new int[4];

            for(int i = 0; i < arr.length; i++){
                arr[i] = i;
                System.out.println(arr[i]);
            }
        }

        /*
        * 배열 역순출력
        * */
        public void method4(){
            int[] arr = {4,6,7,3,9};

            System.out.print("역순출력 : ");
            for(int i = arr.length -1; i>=0; i--){
                System.out.print(arr[i] + " ");
            }

            System.out.println(arr[0]);
            System.out.println(arr[1]);
            System.out.println(arr[2]);
            System.out.println(arr[3]);
            System.out.println(arr[4]);
         //   System.out.println(arr[5]); 여섯번째는 없어서 에러발생
        }

        public void method5(){
            String[] days = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};

            for(int i = 0; i < days.length; i++){
                System.out.println(days[i]);
            }
        }


    }
}

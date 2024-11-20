package com.kh.practice.condition;

public class ArrayEx3 {
    public void method1() {
        /*
         * 이차원 배열은 배열 안에 배열 있음
         * 행row 열column 구성
         * 표,행렬로 데이터 저장
         *
         * 배열 차원:
         * 1차원: 값 단순 일렬 배열
         * 2차원: 여러 1차원 모인 하나의 큰 배열
         *
         * 배열 선언:
         * 선언 및 초기화: 타입[][] 배열명 = new 타입[행개수][열개수];
         * int[][] arr = new int[3][4];
         * 3개 행, 4개 열 이차원 배열
         * */
    }

    public void method2() {
        int[][] grades = {
                //국 영 수 과
                {90, 85, 88, 92},
                {78, 82, 79, 85},
                {88, 90, 92, 85}
        };
        System.out.println("학생1 성적 : ");
        System.out.println("학생1 국어성적 : " + grades[0][0]);
        System.out.println("학생1 영어성적 : " + grades[0][1]);
        System.out.println("학생1 수학성적 : " + grades[0][2]);
        System.out.println("학생1 과학성적 : " + grades[0][3]);

        System.out.println("학생2 성적 : ");
        System.out.println("학생2 국어성적 : " + grades[1][0]);
        System.out.println("학생2 영어성적 : " + grades[1][1]);
        System.out.println("학생2 수학성적 : " + grades[1][2]);
        System.out.println("학생2 과학성적 : " + grades[1][3]);

        System.out.println("학생3 성적 : ");
        System.out.println("학생3 국어성적 : " + grades[2][0]);
        System.out.println("학생3 영어성적 : " + grades[2][1]);
        System.out.println("학생3 수학성적 : " + grades[2][2]);
        System.out.println("학생3 과학성적 : " + grades[2][3]);

    }

    public void method3() {
        String[][] fruits = {
                {"사과", "빨강", "단맛", "중형"},
                {"귤", "주황", "새콤", "소형"},
                {"포도", "보라", "단맛", "소형"},


        };
        System.out.println("과일 1 : " + fruits[0][0]  + "색상 : " + fruits[0][1]  + ", 맛 : " + fruits[0][2] + ", 크기 : " + fruits[0][3] );
        System.out.println("과일 2 : " + fruits[1][0]  + "색상 : " + fruits[1][1]  + ", 맛 : " + fruits[1][2] + ", 크기 : " + fruits[1][3] );
        System.out.println("과일 3 : " + fruits[2][0]  + "색상 : " + fruits[2][1]  + ", 맛 : " + fruits[2][2] + ", 크기 : " + fruits[2][3] );
    }
    //마음대로 바꿀 수 없다, 입력값 없으면 0 이 입력됨
}

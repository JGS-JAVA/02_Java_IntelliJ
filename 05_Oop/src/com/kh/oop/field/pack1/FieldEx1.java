package com.kh.oop.field.pack1;

/*
* 필드 속성값에 대한 정리
* 필드:객체속성, 멤버변수
* 
* 작성법
* [접근제한자] [예약어] 자료형 변수명 (=초기값); 접근제한자,예약어,초기값 생략가능
*
* 접근제한자 종류
* public 어디서든 불러오기 가능
* protected 외부클래스에서 사용불가
* default 접근제한자 미작성시 기본값,같은 패키지 안에서만 접근가능,
*           다른 패키지에서 접근불가
* private 클래스 파일명 안에서만 접근 가능
*         외부 클래스에서 접근시 getter setter 메서드 사용
*
* */
public class FieldEx1 {
        public String 퍼블릭필드 = "공개필드";
        protected String 프로텍트필드 = "보호된필드";
        String 디폴트필드 = "기본접근필드";
        private String 프라이빗필드 = "비공개필드";

        public void method1(){
            System.out.println(퍼블릭필드);
            System.out.println(프로텍트필드);
            System.out.println(디폴트필드);
            System.out.println(프라이빗필드);

        }
}

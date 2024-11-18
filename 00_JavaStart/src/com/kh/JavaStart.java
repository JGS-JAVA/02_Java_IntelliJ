

package com.kh;
/*
 * package = 자바 파일 작성된 폴더들 나열한 이름
 * .은 폴더 안에 폴더로 들어간다는 뜻
 * com.kh -> com 폴더 안에 kh 폴더
 * 변수: 메모리에 값 저장하는 공간 (js의 let,var)
 * 자료형(data type): 변수 또는 값의 크기와 형식
 * java 기본자료형(primitive types)
 * [논리형]-맞는지 유무
 * boolean (1byte) - true / false 기본값은 false
 *
 * [정수형]-숫자
 * byte (1byte)
 * short (2byte)
 * int (4byte)
 * long (8byte) 숫자뒤에 L l
 *
 * [실수형]-실수
 * float (4byte) 숫자 뒤에 f 붙이기
 * double (8byte) *실수 기본형태*
 *
 * [문자형]-문자
 * char (2byte) 문자 1개, ' ' 붙이기
 *
 * 기본자료형이 아닌 자바에서 제공하는 객체
 * [문자열]-문자
 * String 메모리무제한, 저장하는 변수는 객체 대신 주소를 저장해서
 * 참조형이라함, " "붙이기
 * 변수 선언: 메모리에 공간할당 선언, 보라색인 예약어
 * 예약어(자료형,참조형) 변수명=리터럴;
 * boolean, char, String 단독으로 예약어 존재해서 상관없음
 * 정수랑 실수는 여러개라서 상관있다
 *
 * byte = -128~127
 * byte 변수명 = int
 * byte 1번 = 123 가능
 * byte 2번 = 1234 불가능
 *
 * [정수형]-리터럴 int 기본설정
 * int 안에 더작은 short, byte로 리터럴 변경시  * 자동타입변환,
 *  더큰 리터럴로 변경시 오류
 * long 변수명 = int
 * long 롱1번 = 10000000000; 불가능하나 강제형변환으론 가능
 * 더 큰 수를 담기위해 뒤에 L 또는 l 쓰기
 * long 변수명 = long
 * long 롱2번 = 10000000000L;
 *
 * [실수형]-리터럴 double 기본설정
 * float 은 소수점 7자리까지 표기, 그 뒤로는 버린다
 * double 은 넉넉히 담아서 버리는게 없다
 * 소수점 8자리 이상이 아닌 경우 f 뒤에 붙여서 float 으로함
 * 자료형  변수명 = 리터럴
 * double 변수명 = double
 * float 변수명 = float
 * double 더블1번 = 3.14;
 * float 플롯1번 = 3.14F; F 뒤에 안쓰면 실수는 double 로
 * 인식해 공간보다 큰 메모리가 온다 인식하고 오류발생
 * 앞에 float 쓰면 뒤에 f 쓰기
 * L F 같은 리터럴 표기법은 컴퓨터가 자료형 구분에 필요, 출력시 안보임
 * 왼쪽에 만든 파일명과 public class 뒤의 파일명이 같아야함
 * ctrl + shift + F10 -> 출력
 *
 *
 * */
public class JavaStart {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        boolean 진실혹거짓 = true;
        System.out.println("진실혹거짓=>"+ 진실혹거짓);
        double 실수1번;
        진실혹거짓 = false; //변수에 값 대입,덮어쓰기
        String 문자열1번 = "만들어진 객체로 예약어처럼 사용";
        String 문자열2번 = "대문자로 시작, 보라색X";
        System.out.println("노란밑줄은 변수명 선언하고 사용안한 변수명");

        char 문자1번 = '가'; // 숫자로 44032 로 저장
        char 문자2번 = 'a'; // 숫자로 97 로 저장
        char 문자3번 = 'A'; //" " 사용불가
        float 소수1번 = 3.14f;
        System.out.println(문자1번 + 문자2번 + 문자3번 + 소수1번);

    }

}

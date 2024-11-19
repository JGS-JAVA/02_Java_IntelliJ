package kh.com.ex;

public class 비교 {
}
/*
*  .equals()
* String 으로 비교한 문자열 값이 같은지 비교
*
*  ==
* 두 객체의 메모리 주소 같은지 비교
* 주소 다르면 값이 같아도 false
*
* 택배상자 속 내용물
* 값 : 문자열 실제내용
* 메모리 주소 : 객체 위치
* 변수에 값 저장시 컴퓨터는 그 값을 메모리에 저장하고 그 위치 기억
*
* equalsIgnoreCase()
* 영문 대소문 구분없이 문자열 비교하는 메서드
* 예) 사용자가 yEs, YeS, yeS 등 모두 동일하게 처리
* 
* String a = "Hello";
* String b = "hello";
* a.equalsIgnoreCase(b); //true
* b.equalsIgnoreCase("hi"); //false
* 
*  .equals() = 대소문 구분해서 일치하기 
* 예) 아이디 비번 확인
* .equalsIgnoreCase() = 대소문 구분없이 일치하기
* 예)이메일주소, 응답 등
*
*
* */
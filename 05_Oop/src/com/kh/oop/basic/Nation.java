package com.kh.oop.basic;
/*
* 클래스 : 객체가 가질 속성(값),기능(메서드)을 코드로 작성한 문서(설계도)
*       ==객체를 정의한 것
*
* 필드=속성=값
* 클래스 밖에 변수입력시 에러발생
* 클래스 안에 전역변수
* 퍼블릭보이드 안에 지역변수
*
* */
public class Nation {
    String name;
    int age;
    char gender;
    String juminNumber;  //사용안함 가비지컬렉션이 메모리 자동삭제
    String tel;          //사용안함
    String address;      //사용안함
        public void speak(){
            System.out.println("가나다 한국어 가능");

        }
        public void 납세의무(){
            if(age >= 19){
                System.out.println(name + "님 세금납부대상이다");
            }else{
                System.out.println(name + "님" + age + "세금납부대상 아니다");
            }
        }
        public void introduce(){
            System.out.println("이름은" + name + "이고" + age + "세" + gender + "성 이다");
        }
}

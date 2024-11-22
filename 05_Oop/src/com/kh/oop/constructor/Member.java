package com.kh.oop.constructor;

public class Member {
    //필드
    private String name;
    private int age;
    private String gender;



    //메서드
    //기본생성자
    public Member() {}

    //필수생성자
    public Member(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
    
    //기본/필수생성자, 게/세터 이외 기능 추가 가능
    //작성된 정보 불러오기 기능
    //toString 메서드: 객체 변수명에 저장된 정보를 문자열로 전달해서 보여줌
    //자바 자체에서 만든 기능
    @Override  //   다른사람이 만든 기능을 재사용한다는 의미로 붙인다(불필요)
    public String toString() {
        return "Member [name=" + name + ", age=" + age + ", gender=" + gender + "]";
    }
}

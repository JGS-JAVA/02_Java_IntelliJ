package com.kh.oop.methodPre;
/*
* 필드=속성
*
* */
public class Student {
    private String name;
    private int age;
    private String gender;
    private String major;

    //기본 생성자
    public Student() {

    }
    
    //필수 생성자 All Constructor : 모든 파라미터값을 필수로 가져와 넣는다
    public Student(String name, int age, String gender, String major) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.major = major;
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

    public void setMajor(String major) {
        this.major = major;
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

    public String getMajor() {
        return major;
    }
}

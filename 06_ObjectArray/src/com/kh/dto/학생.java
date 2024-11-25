package com.kh.dto;
//dto : data transfer object (값 전달용 객체)
public class 학생 {
    //필드 인스턴스 변수(스테텍 없음) 멤버변수
    private String studentNumber;
    private String studentName;
    private char gender;
    //메서드(기본 생성자, 필수 생성자, 세터, 게터, toString)

    //기본 생성자
    public 학생() {
    }

    //필수 생성자

    public 학생(String studentNumber, String studentName, char gender) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.gender = gender;
    }
    //세터

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    //게터

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "학생{" +
                "studentNumber='" + studentNumber + '\'' +
                ", studentName='" + studentName + '\'' +
                ", gender=" + gender +
                '}';
    }
}

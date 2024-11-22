package com.kh.oop.constructor;
import com.kh.oop.constructor.Student;

public class StudentRun {
    public static void main(String[] args) {
   Student student1 = new Student();
   student1.setName("홍길동");
   student1.setAge(21);
   student1.setGender("남자");
   student1.setMajor("컴퓨터공학");
   student1.setGpa(3.8);
   student1.setPhoneNumber("010-2345-6789");
   student1.setEmail("hong123@gmail.com");
   student1.setAddress("서울");

        System.out.println(student1.toString());

        Student student2 = new Student("김영희",22,"여자","자바공학",3.9,"010-8888-7777","aaa@gmail.com","경기도");
        System.out.println(student2.toString());
        System.out.println("학생1전공 : " + student1.getMajor());
        System.out.println("학생2학점 : " + student2.getGpa());
    }

}

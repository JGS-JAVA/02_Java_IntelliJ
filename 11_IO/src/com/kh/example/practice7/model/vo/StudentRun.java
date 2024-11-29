//package com.kh.example.practice7.model.vo;
//
//public class StudentRun {
//    public static void main(String[] args) {
//
//        StudentController sc = new StudentController();
//
//        System.out.println("학생정보출력");
//        for(Student s : sc.printStudent()){
//            System.out.println(s);
//        }
//
//        System.out.println("학생성적출력");
//        double[] scores = sc.avgScore();
//        System.out.println("학생점수합계" + (int)scores[0]);
//        System.out.println("학생점수평균" + (int)scores[1]);
//
//        System.out.println("성적결과");
//        for(Student s : sc.printStudent()){
//            String result = s.get점수()>=StudentController.CUT_LINE?"통과":"재시험";
//            System.out.println(s.get이름()+s.get과목()+s.get점수());
//        }
//
//    }
//}

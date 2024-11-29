//package com.kh.example.practice7.model.vo;
//
//public class StudentController {
//   private Student[] sArr=new Student[5];
//    public static final int CUT_LINE = 60;
//
//    public StudentController() {
//        sArr[0]=new Student("김길동","자바",100);
//        sArr[1]=new Student("박길동","자바",50);
//        sArr[2]=new Student("이길동","자바",85);
//        sArr[3]=new Student("정길동","자바",60);
//        sArr[4]=new Student("홍길동","자바",20);
//    }
////학생정보출력
//    public Student[] printStudent(){
//        return sArr;
//    }
//
//    //점수합계 반환
//    public int sumScore(){
//        int sum=0;
//        for(Student s:sArr){
//            sum += s.getScore();
//        }
//        return sum;
//    }
//    public double[] avgScore(){
//        int sum = sumScore();
//        double[] avgScore=(double) sum/ (double) sArr.length;
//        return new double[]{avg,sum};
//    }
//}

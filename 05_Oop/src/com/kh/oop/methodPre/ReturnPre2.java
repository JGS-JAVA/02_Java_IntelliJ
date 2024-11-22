//package com.kh.oop.methodPre;
//
//public class ReturnPre2 {
//    public String method1(String name, int age) {
//        return "안녕 내 이름은 " + name + "이고 나이는 " + age + "살이야";
//    }
//
//    public String method2(String name, int age) {
//        if (num1 > num2) {
//            return num2 + "보다" + num1 + "이 큰 숫자다";
//        } else {
//            return num1 + "보다" + num2 + "이 큰 숫자다";
//        }
//
//    }
//
//    public String method3(int score) {
//        String grade = "";
//        if (score >= 90) {
//            grade = 'A';
//        } else if (score >= 80) {
//            grade = 'B';
//        } else if (score >= 70) {
//            grade = 'C';
//        } else if (score >= 60) {
//            grade = 'D';
//        } else {
//            grade = 'F';
//        }
//        return grade;
//    }
//
//    public String method4(double price, double discountRate) {
//        double totalPrice = price - (price * discountRate / 100);
//        return "원래가격 : " + price + "원 할인을 " + discountRate + "% 최종금액 : " + totalPrice + " 원";
//
//    }
//
//    public String method6(int age) {
//        String result (age >= 19) ? "성인" : "미성년";
//        return "나이 : " + age + "결과 : " + result;
//
//    }
//
//    public String method7(String str1, String str2) {
//        return "첫 입력문자열 : " + str1 + "\n둘째 입력문자열 : "
//                + str2 + "\n 두 문자 이어붙인것 : " + result;
//    }
//
//    public String method8(String[] arr, String target ) {
//        boolean found = false;
//        for (String str : arr) {
//            if (str.equals(target)) {
//                found = true;
//                break;
//            }
//        }
//        if (found) {
//            return "배열에 " + target + "존재";
//        }else
//            return "배열에 " + target + "부존재";
//    }
//
//    public String method9(double radius) {
//        double area = Math.PI * radius * radius;
//        return "반지름 : " + radius + "원 넓이 : " + area;
//    }
//
//}
//
//
//
//

package com.kh.view;

import com.kh.dto.학생;
import com.kh.service.학생서비스;

import java.util.Scanner;

//사용자가 정보입력, 출력하는 클래스
//추후 프론트엔드 연결시 view 폴더 사라지고 html에 연결해서 예쁜화면으로
//입출력정보 보여줄 예정
public class 학생기능출력 {
    private Scanner scanner = new Scanner(System.in);
    private 학생서비스 service = new 학생서비스();
    //학생정보입력하는 기능 작성
    public 학생 inputStudent(){
        System.out.print("학번 입력: ");
        String studentNumber = scanner.nextLine();

        System.out.print("이름 입력: ");
        String studentName = scanner.nextLine();

        System.out.print("성별(M/F) 입력: ");
       char studentGender = scanner.nextLine().charAt(0);
       //학생에 입력된 학번, 이름, 성별 한번에 전달하기
       return new 학생(studentNumber, studentName, studentGender);
       

    }
    //학생정보 출력
    public void display(학생 student){
        System.out.println(student.toString());
    }
}

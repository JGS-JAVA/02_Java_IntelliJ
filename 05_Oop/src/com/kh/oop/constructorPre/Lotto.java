package com.kh.oop.constructorPre;

public class Lotto {
//필드
    private int[] lotto = new int[10];

    //기본 생성자
    public Lotto() {

    }
    //6자리 숫자 + 보너스 1문제
    //로또 번호 랜덤생성 6자리 담기
    public void randomNumber(){
        //6개 맞나 카운트
        int count = 0; //0~5
        while(count < 6){
            //랜덤으로 1~45자리 수 만들기, 총6자리
            //double -> int 실수부분 자동 버림
            //강제 형변환
            int num = (int)(Math.random() * 45) + 1; //1~45
            boolean 중복확인 = false; //비교전이라 중복이 존재하는지 몰라서 false

            //카운트는 현재까지 저장된 유효한 번호 갯수 나타냄
            //기존 번호와 새 번호가 중복여부 확인
            //배열에서 채워진 부분만 새 번호와 비교한다
            for (int i = 0; i < count; i++);{
                if (num == lotto[i]){
                    중복확인 = true;
                    break; // 기존수와 랜덤수 같으면 돌려보내기
                }
            }
    //중복 없으면 배열에 추가
            if(!중복확인) {
                lotto[count] = num;
                count++;
            }
        }
    }
    //
    public void info(){
        if(lotto == null){
            System.out.println("로또번호 미생성");
            return;
        }
            System.out.println("로또번호 확인");
        for (int i = 0; i < 6; i++){
            System.out.println(lotto[i] + " ");
        }
    }
}

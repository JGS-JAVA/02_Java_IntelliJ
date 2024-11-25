package com.kh.view;

import com.kh.dto.과자;

public class 과자정보출력 {
    public void 과자리스트출력(String companyName, 과자[] snacks, int count){
        System.out.println("==="+companyName"과자목록===");
        //과자 존재시 가장 마지막에 들어가는 갯수 세고 모두 for문으로 출력
        for(int i=0; i<count; i++){
            System.out.println(snacks[i]);

        }
    }
    public void 추가결과(boolean isAdd){
        if(isAdd){
            System.out.println("추가 성공");
        }else{
            System.out.println("더이상 추가 불가");
        }
;    }
}

package com.kh.run;

import com.kh.view.과자정보출력;

public class 과자기능실행 {
    public static void main(String[] args) {
        //회사명 추가
        String companyName = "맛나 과자";
        int maxSnacks = 5;

        과자정보출력 view = new 과자정보출력();
        과자추가기능 service = new 과자추가기능(maxSnacks);

        //과자 추가됐는지 결과 넣기
        view.추가결과 (service.addSnack("초코칩쿠기", 1500, "달콤한 초코맛"));
        view.추가결과 (service.addSnack("허니버터칩", 1500, "달콤한 초코맛"));
        view.추가결과 (service.addSnack("새우깡", 1500, "달콤한 초코맛"));
        view.추가결과 (service.addSnack("고구마칩", 1500, "달콤한 초코맛"));
        view.추가결과 (service.addSnack("감자칩", 1500, "달콤한 초코맛"));
        view.추가결과 (service.addSnack("치즈볼", 1500, "달콤한 초코맛"));

        view.과자리스트출력(companyName, service.getSnacks(),service.getCount());

    }
}

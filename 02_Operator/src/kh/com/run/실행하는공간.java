package kh.com.run;

import kh.com.ex.OperatorEx;

/*
OperatorEx 로 만든 기능중 원하는 기능만 선택해 실항한다
OperatorEx 파일 안의 public void 기능명(){} 으로 작성된 기능중 원하는것만
선택해서 최종적으로 사용한다. 원하는 기능 원하는 횟수만큼 사용가능, 사용안해도 됨
        new OperatorEx().삼의배수여부확인(); 라고 매번 쓰기 불편하니
        ex.삼의배수여부확인(); 라고 쓴다

*/
public class 실행하는공간 {
    public static void main(String[] args) {

       OperatorEx ex = new OperatorEx();
       ex.삼의배수여부확인();
       ex.이의배수여부확인();
    }
}

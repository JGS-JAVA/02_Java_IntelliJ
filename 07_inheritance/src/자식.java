
//자식이 상속받음
public class 자식 extends 부모 {
    //추가필드
    private String 취미;

    //기본생성자
    public 자식(){
        super(); // 부모의 기본 생성자 무조건 호출
    }
    //필수생성자
    public 자식(String 성씨, String 주소, int 돈, String 차, String 취미){
        super(성씨, 주소, 돈, 차); //부모한테 무조건 물려받아서
        //부모클래스의 필수생성자 호출
    }
    //세터

    public void set취미(String 취미) {
        this.취미 = 취미;
    }


    //게터

    public String get취미() {
        return 취미;
    }
    //오버라이드

}

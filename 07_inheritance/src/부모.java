

public class 부모 /*extends Object*/ {
    public String 성씨 = "김";
    public String 주소 = "서울 강남 역삼";

    private int 돈 = 100_000_000;
    private String 차 = "제네시스";

    //메서드
    //1. 기본생성자

    public 부모() {
    }
    //2. 필수생성자
    public 부모(String 성씨, String 주소, int 돈, String 차) {
        this.성씨 = 성씨;
        this.주소 = 주소;
        this.돈 = 돈;
        this.차 = 차;
    }

    //세터

    public void set돈(int 돈) {
        this.돈 = 돈;
    }

    public void set차(String 차) {
        this.차 = 차;
    }


    //게터


    public int get돈() {
        return 돈;
    }

    public String get차() {
        return 차;
    }
}

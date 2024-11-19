package loof;

import java.util.Scanner;

public class LoofEx2 {
    Scanner sc = new Scanner(System.in);

    //while (조건식) : 조건이 참이면 코드 반복실행
    public void while1(){
        int i = 1;
        while (i <= 5){
            System.out.println(i);
            i++;
        }
    }

    public void while2(){
        boolean xyz = true;

        while (xyz){
            System.out.println("현재값:"+xyz);
            System.out.println("xyz값 false로 변경시 'no' 입력");
            String input = sc.nextLine();

            //equalsIgnoreCase : 대소문자 구분없이 문자열 비교가능
            if(input.equalsIgnoreCase("no")){
                xyz = false;
            }
        }
            System.out.println("xyz가 false 로 설정되어 반복종료함");


    }

    public void while3(){
        System.out.println("0 이 되면 종료됨");

        int input = 1;

        while (input != 0){
            System.out.println("숫자입력 (0 입력시 종료) : ");
            input = sc.nextInt();
            System.out.println("입력된 숫자: " + input);
        }
        System.out.println("프로그램종료");
    }

    public void while4(){
        System.out.println("음수가 되면 종료됨");

        int abc = 100;

        while (abc >= 0){
            System.out.println("숫자입력 (음수 입력시 종료) : ");
            abc = sc.nextInt();
            System.out.println("입력된 숫자: " + abc);
        }

        System.out.println("프로그램종료");
    }


}

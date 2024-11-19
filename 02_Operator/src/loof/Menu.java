package loof;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        public void order(){
            boolean is = true;
            int price = 0;

           System.out.println("메뉴판");
           System.out.println("1. 아메리카노");
           System.out.println("2. 카페라떼");
           System.out.println("3. 카푸치노");
           System.out.println("4. 주문종료");
           while (true) {
               case 1:
                   System.out.println("아메리카노 선택");
                   price += 3000;
               break;
               case 2:
                   System.out.println("카페라떼 선택");
                   price += 4000;
                   break;
               case 3:
                   System.out.println("카푸치노 선택");
                   price += 4500;
                   break;
               case 4:
                   System.out.println("주문 종료");
                   is = false;
                    break;
               default :
                   System.out.println("입력 오류");
                   break;
           }
            System.out.println("총금액: " + price);
        }
    }
}

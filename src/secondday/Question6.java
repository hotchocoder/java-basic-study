package secondday;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----자판기 프로그램-----");
        System.out.println("금액:");
        int money = scanner.nextInt();

        while (true) {
            System.out.println("1)오렌지주스: 1500원, 2)파워에이드: 1800원, 3)생수: 1000원, 4)미선택");
            int answer = scanner.nextInt();
            if (answer == 1){
                int price = 1500;
                if((money - price) < 0){
                    System.out.println("돈이 부족합니다. ㅠㅠ");
                } else {
                    System.out.println("오렌지주스 주문하셨습니다.");
                    System.out.println("남은 잔액: " + (money - price));
                    money -= price;
                }
                continue;
            }
            if (answer == 2) {
                int price = 1800;
                if ((money - price) < 0) {
                    System.out.println("돈이 부족합니다. ㅠㅠ");
                } else {
                    System.out.println("파워에이드 주문하셨습니다.");
                    System.out.println("남은 잔액: " + (money - price));
                    money -= price;
                }
                continue;
            }
            if (answer == 3){
                int price = 1000;
                if((money - price) < 0){
                    System.out.println("돈이 부족합니다. ㅠㅠ");
                } else {
                    System.out.println("생수 주문하셨습니다.");
                    System.out.println("남은 잔액: " + (money - price));
                    money -= price;
                }
                continue;
            }
            if (answer == 4){
                int a = money / 1000;
                int b = (money - a*1000) /500;
                int c = (money - a*1000 - b*500) /100;
                System.out.println("잔돈 반환 - 1000원: " + a +"개, " + "500원 " + b +"개 ," + "100원 " + c +"개");
                break;
            }
        }
    }
}

package secondday;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------ 소수 구하기 프로그램 ------");

        while (true) {
            System.out.println("");
            System.out.println("숫자를 입력하세요.");
            int num = scanner.nextInt();
            if (num < 2) {
                System.out.println(num + "은(는) 소수가 아닙니다.");
            }
            if (num == 2) {
                System.out.println(num + "은(는) 소수입니다.");
            }
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println(num + "은(는) 소수가 아닙니다.");
                    break;
                } else {
                    System.out.println(num + "은(는) 소수입니다.");
                    break;
                }
            }
            System.out.println("");
            System.out.println("계속 하시겠습니까? 1:예 2:아니오");
            int answer = scanner.nextInt();
            if (answer == 1){
                continue;
            }
            if (answer == 2){
                System.out.println("종료하겠습니다.");
                break;
            }
        }
    }
}

package secondday;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----369게임----");
        System.out.println("마지막 숫자를 입력하세요.");
        int num = scanner.nextInt();
        if (num > 100) {
            System.out.println("100이상은 입력할 수 없습니다.");
        } else {
            for (int i = 1; i <= num; i++) {
                int a = i / 10, b = i % 10;
                if (a == 3 || a == 6 || a == 9) {
                    if (b == 3 || b == 6 || b == 9) {
                        System.out.print("짝짝 ");
                        continue;
                    }
                    System.out.print("짝 ");
                } else if (b == 3 || b == 6 || b == 9)
                    System.out.print("짝 ");
                else {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
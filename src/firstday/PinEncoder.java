package firstday;

import java.util.Scanner;

public class PinEncoder {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("-----암호 구현하기-----");
        System.out.println("남친 생일(MMDD): ");
        int num1 = scan.nextInt();
        System.out.println("내 생일(MMDD): ");
        int num2 = scan.nextInt();

        System.out.println("암호: " + ((num1 *8) - (num1) + (num2) + (num2/100) + (num1%100)));
    }
}

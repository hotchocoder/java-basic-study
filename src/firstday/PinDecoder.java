package firstday;

import java.util.Scanner;

public class PinDecoder {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("-----암호 풀어보기-----");
        System.out.println("암호: ");
        int num1 = scan.nextInt();
        System.out.println("딸의 생일: ");
        int num2 = scan.nextInt();

        System.out.println("남자친구 생일: " + (((num1) - (num2) - (num2/100))/7));
    }
}

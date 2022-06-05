package firstday;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height;
        int weight;
        String name;

        System.out.println("---BMI 계산기---");
        System.out.print("이름: ");
        name = input.next();
        System.out.print("키: ");
        height = input.nextInt();
        System.out.print("몸무게: ");
        weight = input.nextInt();
        System.out.println(name + "님의 BMI는 " + weight/((height/100.0)*(height/100.0)) + " 입니다.");
    }
}


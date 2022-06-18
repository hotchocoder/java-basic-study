package secondday;

import java.util.Scanner;
import java.util.Arrays;

public class Question5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("학생은 몇명인가요?");
        int n = scanner.nextInt();

        int arr[] = new int[n];
        for (int i=1; i<n+1; i++) {
            System.out.println(i + "번째 학생 키 :");
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}

package fifthday;

import java.util.Scanner;

public class Singing {
    public static void main(String[] args) {
        Person person = new Person();
        String name;
        int age;
        String sex;

        Scanner scanner = new Scanner(System.in);
        String lyrics = scanner.nextLine();
        System.out.println(person.sing. (lyrics));

        String sing (String lyrics){
            return "저는" + name + "이고 나이는" + age + "살 " + sex + "입니다. 노래 시작하겠습니다. \n" + lyrics;
        }
    }   
}
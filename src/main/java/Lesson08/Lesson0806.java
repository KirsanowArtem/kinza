package Lesson08;

import java.util.Scanner;

public class Lesson0806 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 0 && number < 8) {
            switch (number) {
                case 1:
                    System.out.println("понедельник");
                    break;
                case 2:
                    System.out.println("вторник");
                    break;
                case 3:
                    System.out.println("среда");
                    break;
                case 4:
                    System.out.println("четверг");
                    break;
                case 5:
                    System.out.println("пятница");
                    break;
                case 6:
                    System.out.println("субота");
                    break;
                case 7:
                    System.out.println("воскресенье");
                    break;
            }
        } else {
            System.out.println("oschibka");
        }
    }
}

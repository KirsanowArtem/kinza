package Lessons.Lesson08;

import java.util.Scanner;

public class Lesson0805 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (number2 > number)
            if (number2 % 2 == 1) {
                System.out.println("chet");
            }
    }
}
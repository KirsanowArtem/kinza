package Lesson08;

import java.util.Scanner;

public class Lesson0804 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 ==0) {
            System.out.println("chet");
        } else {
            System.out.println("netchet");
        }
    }
}

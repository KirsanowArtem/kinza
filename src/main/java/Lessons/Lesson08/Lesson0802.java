package Lessons.Lesson08;

import java.util.Scanner;

public class Lesson0802 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 0 || number > 24) {
            System.out.println("oschibka");
        } else {
            System.out.println("norm");
        }
    }
}
package Lesson08;


import java.util.Scanner;

public class Lesson0803 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number < 0 || number2 < 0) {
            System.out.println("oschibka");
        } else {
            if (number > 10 || number2 > 10) {
                System.out.println("norm");
            } else {
                System.out.println("oschibca");
            }
        }
    }
}
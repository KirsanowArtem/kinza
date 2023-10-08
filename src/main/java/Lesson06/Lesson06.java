package Lesson06;

import java.util.Scanner;

public class Lesson06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        if (i <= 24 && i >= 0) {
            if (i >= 6 && i < 12) {
                System.out.println("moning");
            } else if (i >= 12 && i < 18) {
                System.out.println("day");
            } else if (i >= 18 && i < 24) {
                System.out.println("vetcher");
            } else if ((i >= 0 && i < 6) || i == 24) {
                System.out.println("night");
            }
        } else {
            System.out.println("" +
                    "vi baran!!!! peschite pravilnoe vrema pchostalusta, ya ne durak!!!!!!");
        }
    }

}

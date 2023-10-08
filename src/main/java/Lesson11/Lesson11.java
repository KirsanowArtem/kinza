package Lesson11;

import java.util.Random;

public class Lesson11 {
    public static void main(String[] args) {
        int mass[] = new int[10];
        for (int i = 0; i < 10; i++) {
            mass[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(mass[i]);
        }

        for (int i = 0; i < 10; i++) {
            if (mass[i] % 2 == 0) {
                System.out.println(mass[i]);
            }
        }

    }
}

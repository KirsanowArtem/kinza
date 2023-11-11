package Lessons.Lesson09;

import java.util.Scanner;

public class Lesson0903 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int[] i = new int[15];
        for(int o = 0; o < i.length;o++){
            i[o]=o*2+2;
        }
        for(int o = 0; o < i.length;o++){
            System.out.println(i[o]);
            o = o + 1;
        }
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        if (number >= 0 && number < 15){
            System.out.println(i[number]);
        }


    }
}

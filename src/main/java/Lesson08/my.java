package Lesson08;

import java.util.Scanner;

public class my {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int schotchic = 0;

        for(int n = (int) Math.ceil(number/2); n > 1; n--){
            if (number % n == 0){
                schotchic++;
                System.out.println(n);
            }
        }
        if(schotchic == 0){
            System.out.println("простое");
        }else {
            System.out.println("не простое");
        }
    }
}

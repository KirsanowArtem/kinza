package Lessons.Lesson02;

import java.util.Scanner;

public class Lesson02 {
    //                                          КАЛЬКУЛЯТОР2.0

    public static void main(String[] args) {
        int perezapusk = 0;
        do {
            try {
                //начало моего кода
                Scanner scanner = new Scanner(System.in);
                double rezultat = 1;
                System.out.print("Vvedite chislo1 : ");
                double chislo1 = scanner.nextDouble();
                System.out.print("Vvedite operator : ");
                boolean proverkaNaDuraka = true;
                String operator;
                operator = scanner.next();
                if (operator.equals("!")) {
                    for (int q = 1; q <= chislo1; q++) {
                        rezultat = rezultat * q;
                    }
                    System.out.println(chislo1 + " " + operator + " = " + rezultat);
                } else {
                    System.out.print("Vvedite chislo2 : ");
                    double chislo2 = scanner.nextDouble();
                    switch (operator) {
                        case "+":
                            rezultat = chislo1 + chislo2;
                            break;
                        case "-":
                            rezultat = chislo1 - chislo2;
                            break;
                        case "*":
                            rezultat = chislo1 * chislo2;
                            break;
                        case "/":
                            if (chislo2 == 0) {
                                System.out.println("Oshibka, na nol delit nelzya!");
                                proverkaNaDuraka = false;
                            } else {
                                rezultat = chislo1 / chislo2;
                            }
                            break;
                        default:
                            System.out.println("Oshibka!, libo etoy funktsii net, libo vy nepravil'no napisali operator");
                            proverkaNaDuraka = false;
                    }
                    if (proverkaNaDuraka) {
                        System.out.println(chislo1 + " " + operator + " " + chislo2 + " = " + rezultat);
                    }
                }
                //конец моего кода
                System.out.print("\n\n\n");
            } catch (Error e) {
                perezapusk = 1;
            }
        } while (perezapusk == 0);
    }
}
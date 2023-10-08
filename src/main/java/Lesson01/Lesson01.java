package Lesson01;//                                          КАЛЬКУЛЯТОР

import java.util.Scanner;

public class Lesson01 {
    public static void main(String[] args) {
        int perezapusk = 0;
        do {
            try {
                //начало моего кода
                Scanner scanner = new Scanner(System.in);
                double rezultat = 1;
                System.out.print("Vvedite chislo1 : ");
                String chislo01 = scanner.nextLine();
                double chislo1 = Double.parseDouble(chislo01.replace(",", "."));
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
                    String chislo02 = scanner.nextLine();
                    double chislo2 = Double.parseDouble(chislo02.replace(",", "."));
                    if (operator.equals("+")) {
                        rezultat = chislo1 + chislo2;
                    } else if (operator.equals("-")) {
                        rezultat = chislo1 - chislo2;
                    } else if (operator.equals("*")) {
                        rezultat = chislo1 * chislo2;
                    } else if (operator.equals("/")) {
                        if (chislo2 == 0) {
                            System.out.println("Oshibka, na nol delit nelzya!");
                            proverkaNaDuraka = false;
                        } else {
                            rezultat = chislo1 / chislo2;
                        }
                    } else {
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
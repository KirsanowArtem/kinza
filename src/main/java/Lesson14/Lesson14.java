package Lesson14;

import java.util.Scanner;

public class Lesson14 {
    public static void main(String[] args) {
        int perezapusk = 0;
        do {
            try {
                //начало моего кода
                Scanner scanner = new Scanner(System.in);
                double rezultat = 1;
                System.out.print("Vvedite chislo1 : ");
                String chislo01 = scanner.next();
                double chislo1 = Double.parseDouble(chislo01.replace(",", "."));
                System.out.print("Vvedite operator : ");
                boolean proverkaNaDuraka = true;
                String operator;
                operator = scanner.next();
                operator = operator.replace("\\", "/");
                if (operator.equals("!")) {
                    System.out.println(chislo1 + " " + operator + " = " + Do.factorial(chislo1));
                } else {
                    System.out.print("Vvedite chislo2 : ");
                    String chislo02 = scanner.next();
                    double chislo2 = Double.parseDouble(chislo02.replace(",", "."));
                    switch (operator) {
                        case "^":
                            rezultat = Do.degree(chislo1, chislo2);
                            break;
                        case "+":
                            rezultat = Do.summa(chislo1, chislo2);
                            break;
                        case "-":
                            rezultat = Do.subtraction(chislo1, chislo2);
                            break;
                        case "*":
                            rezultat = Do.multiplication(chislo1, chislo2);
                            break;
                        case "/":
                            rezultat = Do.division(chislo1, chislo2);
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

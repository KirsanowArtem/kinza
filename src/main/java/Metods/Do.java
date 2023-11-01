package Metods;

public class Do {

    public static double degree(double n1, double n2) {
        return Math.pow(n1,n2);
    }// n1^n2
    public static double summa(double n1, double n2) {
        return n1 + n2;
    }// n1+n2

    public static double subtraction(double n1, double n2) {
        return n1 - n2;
    }// n1-n2

    public static double multiplication(double n1, double n2) {
        return n1 * n2;
    }// n1*n2

    public static double division(double n1, double n2) {
        if (n2 == 0) {
            System.out.println("Oshibka, na nol delit nelzya!");
            return 0;
        } else {
            return n1 / n2;
        }
    }// n1/n2

    public static double factorial(double n1) {
        double rezultat = 1;
        if (n1 == 0) {
            return rezultat;
        } else {
            for (int q = 1; q <= n1; q++) {
                rezultat = rezultat * q;
            }
            return rezultat;
        }
    }// n1!

    public static double doubleSumMass(double[] n)  {
        double sum = 0;
        for (int i =0; i < n.length; i++){
            sum = sum + n[i];
        }
        return sum;
    }// сумма чисел с плаваюшей запятой в масиве

    public static double intSumMass(int[] n)  {
        int sum = 0;
        for (int i =0; i < n.length; i++){
            sum = sum + n[i];
        }
        return sum;
    }// сумма чисел в масиве
}
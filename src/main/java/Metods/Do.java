package Metods;

public class Do {

    public static double degree(double n1, double n2) {
        return Math.pow(n1, n2);
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

    public static double doubleSumMass(double[] n) {
        double sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum = sum + n[i];
        }
        return sum;
    }// сумма чисел с плаваюшей запятой в масиве

    public static int intSumMass(int[] n) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum = sum + n[i];
        }
        return sum;
    }// сумма чисел в масиве

    public static double doubleMaxMass(double[] n) {
        double max = n[0];
        for (int i = 0; i < n.length; i++) {
            if (max < n[i]) {
                max = n[i];
            }
        }
        return max;
    }// большее число с плаваюшей запятой в масиве

    public static int intMaxMass(int[] n) {
        int max = n[0];
        for (int i = 0; i < n.length; i++) {
            if (max < n[i]) {
                max = n[i];
            }
        }
        return max;
    }// большее число в масиве

    public static double doubleMinMass(double[] n) {
        double min = n[0];
        for (int i = 0; i < n.length; i++) {
            if (min > n[i]) {
                min = n[i];
            }
        }
        return min;
    }// меньшее число с плаваюшей запятой в масиве

    public static int intMinMass(int[] n) {
        int min = n[0];
        for (int i = 0; i < n.length; i++) {
            if (min > n[i]) {
                min = n[i];
            }
        }
        return min;
    }// меньшее число в масиве

    public static String replaceDivision(String operator) {
        operator = operator.replace("\\", "/");
        return operator;
    }// замена \ на /

    public static String replaceDouble(String chiislo) {
        chiislo = chiislo.replace(",", ".");
        return chiislo;
    }// замена , на .


    public static int intSumMasslllllllllllllllllllllllllll(int[] n) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] >= 5 && n[i] <= 10) {
                sum = sum + n[i];
            }
        }
        return sum;
    }// сумма чисел в масиве

    public static int intSumProstMass(int[] n) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            for (int j = 2; j <= (n[i]); j++) {
                double ostatok = (n[i]) / j;
                if (ostatok - (int) ostatok == 0) {
                    j = n[i];
                }
            }
            sum = sum + n[i];
            System.out.println("     "+n[i]);
        }
        return sum;
    }// сумма простых чисел в масиве

}
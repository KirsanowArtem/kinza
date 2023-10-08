//package Lesson03;
//
//import java.util.Scanner;
//
//public class AlgorithmLunaCode {
//
//    private static int[] parseStringToIntegerMassive(String str1) {
//        int[] ints = new int[16];
//        for (int i = 0; i < 16; i++) {
//            char simvol = str1.charAt(i);
//            //       System.out.println(simvol);
//            String temp = String.valueOf(simvol);
//            int temp2 = Integer.parseInt(temp);
//            ints[i] = temp2;
//            // numbers[i]=Integer.parseInt(String.valueOf(cleanCardNumber.charAt(i)));
//        }
//        return ints;
//    }
//
//    public static String enterCardNum() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter card number: ");
//        String cardNumber = scanner.nextLine();
//        System.out.println(cardNumber);
//        String cardNumberTwo = cardNumber.replace(" ", "");
//        System.out.println(cardNumberTwo);
//        return cardNumberTwo;
//    }
//
//    private static String getSystemName(int firstNumber) {
//        String PlatijnaSistema2 = "";
//        String PlatijnaSistema3 = "";
//        String PlatijnaSistema4 = "";
//        int PlatijnaSistema1 [] = new int[4];
//        for (int i = 0; i < 4; i++) {
//            String tempThree = String.valueOf(firstNumber);
//            int tempTwo = Integer.parseInt(tempThree);
//            PlatijnaSistema1[i] = tempTwo;
////            PlatijnaSistema1[i]=Integer.parseInt(String.valueOf(CardNumber.charAt(i)));
//            PlatijnaSistema2 = PlatijnaSistema2 + String.valueOf(PlatijnaSistema1[i]);
//        }
//        PlatijnaSistema3 = String.valueOf(PlatijnaSistema2.charAt(0));
//        PlatijnaSistema4 = PlatijnaSistema2.substring(1,5);
//        switch(PlatijnaSistema3){
//            case "4":
//                return "Payment system of your card: VIZA";
//            break;
//            case "5":
//                return "Payment system of your card: MasterCard";
//                break;
//            case "9":
//                return "Payment system of your card: Простір";
//                break;
//            default:
//                return "Payment system of your card: #@*&%$!";
//        }
//        if (PlatijnaSistema4.equals())
//        }
//    }
//
//    private static int[] firstStep(int[] mass) {
//        for (int i = 0; i < mass.length; i++) {
//            if (i % 2 == 0) {
//                mass[i] = mass[i] * 2;
//            }
//        }
//        return mass;
//
//    }
//
//    private static int[] secondStep(int[] resStep1) {
//
//        for (int t = 0; t < resStep1.length; t++) {
//            if (resStep1[t] > 9) {
//                resStep1[t] = resStep1[t] - 9;
//            }
//        }
//        return resStep1;
//    }
//
//    private static void chek(int[] resStep2, int control) {
//        int sum = 0;
//        for (int i = 0; i < resStep2.length; i++) {
//            sum = sum + resStep2[i];
//        }
//        if (sum % 10 != 0) {
//            if ((sum / 10) + 1 == control) {
//                System.out.println("Card number is checked true");
//            } else {
//                System.out.println("ERROR OPlease destroy this card");
//            }
//        } else {
//            if (sum / 10 == control) {
//                System.out.println("Card number is checked true ");
//            } else {
//                System.out.println("ERROR OPlease destroy this card " + sum);
//            }
//        }
//    }
//
//    public static void cardCheck() {
//        int[] numbers = AlgorithmLunaCode.parseStringToIntegerMassive(AlgorithmLunaCode.enterCardNum());
//        System.out.println(AlgorithmLunaCode.getSystemName(numbers[0]));
//        int[] resStep1 = AlgorithmLunaCode.firstStep(numbers);
//        int[] resStep2 = AlgorithmLunaCode.secondStep(resStep1);
//        AlgorithmLunaCode.chek(resStep2, numbers[numbers.length - 1]);
//    }
//
//    public static void cardCheck(String number) {
//        int[] numbers = AlgorithmLunaCode.parseStringToIntegerMassive(number.replace(" ", ""));
//        System.out.println(AlgorithmLunaCode.getSystemName(numbers[0]));
//        int[] resStep1 = AlgorithmLunaCode.firstStep(numbers);
//        int[] resStep2 = AlgorithmLunaCode.secondStep(resStep1);
//        AlgorithmLunaCode.chek(resStep2, numbers[numbers.length - 1]);
//    }
//}
package homeWork_06;

import java.util.Scanner;

public class HomeWork_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ваше 4х значное число: ");
        String num = scanner.nextLine();
        System.out.println(num);

        if (num.length() == 4) {
            int lSum = num.charAt(0) + num.charAt(1);
            int rSum = num.charAt(2) + num.charAt(3);

            if (lSum == rSum) {
                System.out.println("Верное число");
            } else {
                System.out.println("Не повезло");
            }
        }  else {
            System.out.println("Ваше число не 4х значное");
        }
    }
}

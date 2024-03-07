package lesson_06;

import java.util.Locale;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // меняем локализацию нашего сканера

        System.out.println("Введите ваше имя: ");
        String name =  scanner.nextLine(); // метод позволяющий читать строку ввода включая пробелы до символа перевода коретки
        System.out.println("Ваше имя: : " + name);

        System.out.println("Введите ваш возраст: ");
        int age = scanner.nextInt(); // считывает введённое число из консоли
        System.out.println("Ваш возраст: : " + age);

        scanner.nextLine();

        System.out.println("Введите число с запятой: ");
        double dbl = scanner.nextDouble(); // число с плавающей точкой
        System.out.println("Дабл: : " + dbl);







    }
}

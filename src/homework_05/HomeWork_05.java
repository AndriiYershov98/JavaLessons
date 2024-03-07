package homework_05;

import java.util.Random;

public class HomeWork_05 {
    public static void main(String[] args) {

        // Задание 1
        String name = "Andrii";
        int nameLength = name.length();
        System.out.println("Длина имени : " + nameLength);

        char ch1 = name.charAt(0);
        char ch2 = name.charAt(name.length() -1);

        System.out.println("Первый символ: " + (int)ch1);
        System.out.println("Последний символ: " + (int)ch2);
        System.out.println("=====================");

        // Задание 2

        String st1 = "Java";
        String st2 = "is";
        String st3 = "a";
        String st4 = "powerful";
        String st5 = "language";

        String result1;
        String result2 = String.join(" ", st1, st2, st3, st4, st5);

        result1 = st1.concat(" ").concat(st2).concat(" ").concat(st3).concat(" ").concat(st4).concat(" ").concat(st5);


        System.out.println("Первый способ: " + result1);
        System.out.println("Второй способ: " + result2);
        System.out.println("Длина строки: " + result1.length());
        System.out.println("=====================");

        boolean contains = result2.contains("age");
        result2 = result2.replace(st4, "super");
        System.out.println(result2 + "\n" + "Содержит слово age: " + contains);
        System.out.println("===========================");

        // Задание 3

        String hw1 = "string";
        String hw2 = "code";
        String hw3 = "Practice";

        String ml1 = getMiddleLetters(hw1);
        String ml2 = getMiddleLetters(hw2);
        String ml3 = getMiddleLetters(hw3);

        int middle1 = hw1.length() / 2;
        int middle2 = hw2.length() / 2;
        int middle3 = hw3.length() / 2;

        String sstr1 = hw1.substring(middle1 -1, middle1 + 1);
        String sstr2 = hw2.substring(middle2 -1, middle2 +1);
        String sstr3 = hw3.substring(middle3 -1, middle3 + 1);


        System.out.println("Первое слово: "+ ml1 + "\n" + "Второе слово: " + ml2 + "\n" + "Третье слово: " + ml3);
        System.out.println("========================");
        System.out.println("Первое слово: "+ sstr1 + "\n" + "Второе слово: " + sstr2 + "\n" + "Третье слово: " + sstr3);
        System.out.println("========================");

        // Задание 4

        Random random = new Random();

        int rand1 = random.nextInt(26);

        boolean even = rand1 % 2 == 0;
        boolean dev3 = rand1 % 3 == 0;
        boolean both = even & dev3;
        System.out.println("Число: " + rand1 + "\n" + "Кратно 2: " + even + "\n" + "Делится на 3: " + dev3 + "\n" + "Четное и кратное: " + both );
        System.out.println("========================");








    }

    private static String getMiddleLetters (String input) {
        int length = input.length();
        int middle = length / 2;
        return input.substring(middle - 1, middle + 1);
    }
}

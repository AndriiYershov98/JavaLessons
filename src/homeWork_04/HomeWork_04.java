package homeWork_04;

public class HomeWork_04 {
    public static void main(String[] args) {

        //Задание 1

        char ch1 = 'a';
        char ch2 = 'n';
        char ch3 = 'd';
        char ch4 = 'r';
        char ch5 = 'i';
        char ch6 = 'i';

        String name;

        char nm1 = 'A';
        char nm2 = 'i';
        int decimalCode1 = (int) nm1;
        int decimalCode2 = (int) nm2;





        name = ("" + ch1 + ch2 + ch3 + ch4 + ch5 + ch6);

        System.out.println("Name: " + name.toUpperCase());

        System.out.println("Десятичный код символа 'A': " + decimalCode1);
        System.out.println("Десятичный код символа 'i': " + decimalCode2);

        System.out.println("===========================");

        // Задание 2.1

        String st1 = "Java";
        String st2 = "is";
        String st3 = "a";
        String st4 = "powerful";
        String st5 = "language";

        String result1;
        String result2 = String.join(" ", st1, st2, st3, st4, st5);

        result1 = (st1.concat(st2).concat(st3).concat(st4).concat(st5));


        System.out.println("Первый способ: " + result1);
        System.out.println("Второй способ: " + result2);
        System.out.println("===========================");


        // Задание 2.2

        boolean contains = result2.contains("age");
        result2 = result2.replace(st4, "super");
        System.out.println(result2 + "\n" + "Содержит слово age: " + contains);
        System.out.println("===========================");

        // Задание 3*

        String hw1 = "string";
        String hw2 = "code";
        String hw3 = "Practice";

        String ml1 = getMiddleLetters(hw1);
        String ml2 = getMiddleLetters(hw2);
        String ml3 = getMiddleLetters(hw3);

        System.out.println("Первое слово: "+ ml1 + "\n" + "Второе слово: " + ml2 + "\n" + "Третье слово: " + ml3);






    }

    private static String getMiddleLetters (String input) {
        int length = input.length();
        int middle = length / 2;
        return input.substring(middle - 1, middle + 1);
    }
}

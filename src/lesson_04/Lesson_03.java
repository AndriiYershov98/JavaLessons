package lesson_04;

public class Lesson_03 {
    public static void main(StringExample[] args) {
        char a = 'A';//симфолом
        char a1 = 65;// десятиричная система исчесления
        char a2 = 0x0041;// шестнадцатиричная система исчесления
        a2 = 0x41;
        char a3 = '\u0041';// код в шестнадцатиричной системе исчесления


        System.out.println("a2: " + a2);
        System.out.println("a: " + a);
        System.out.println("a1: " + a1);
        System.out.println("a3: " + a3);

        char digit0 = 48;
        digit0++;
        digit0 += 4;
        System.out.println("digit0: " + digit0);

        char symbolZ = 90;
        System.out.println("symbolZ: " + --symbolZ );

        char smallA = 97;
        System.out.println("smallA: " + smallA);

        smallA = (char)(smallA + 10);
        System.out.println("smallA+: " + smallA);

        /*
        48...57 цифры от нуля до 9
        65...90  большие буквы латинского алфавита
        97...122 маленькие буквы латинского алфавита
         */

        char ch = 13008;
        System.out.println(ch);

        // Переполнение данных -> рбаотает по кругу

        byte bt = 127;
        System.out.println("bt: " + bt);
        //bt++;
        bt += 10;
        System.out.println("bt: " + bt);
        bt -= 128;
        System.out.println("bt: " + bt);






    }
}

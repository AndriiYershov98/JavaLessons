package Lesson_03;

public class MathOperations {
    public static void main(String[] args) {
        int var1 = 20;
        int var2 = 7;

        int result;

        result = var1 + var2;
        System.out.println("result: " + result);
        result = 15 + 6;
        System.out.println("result: " + result);

        int result2 = var1 + var2;
        System.out.println("result2: " + result2);

        result2 = var1 - var2;
        System.out.println("result- : " + result2);

        result2 = var1 * var2;
        System.out.println("result*: " + result2);

        result = var1 / var2;
        System.out.println("result/: " + result);

        result = var1 % var2;
        System.out.println("resResult: " + result);

        double doubleVar = 20.0d; // указатель того что число записано в формате double
        double doubleSeven = 7.0;

        double doubleResult = doubleVar / doubleSeven;

        System.out.println("doubleResult dev - " + doubleResult);

        // форматированный вывод
        int a = 20;
        int b = 7;
        int intResult = a / b;

        System.out.println("Результат деления " + a + " на " + b + " равен " + intResult);
        System.out.printf("Результат деления  %d на %d равен = %d\n", a, b, intResult);
        System.out.println("Что нибудь!");

        System.out.printf("Округление результата деления %f\n" , doubleResult);

    }
}

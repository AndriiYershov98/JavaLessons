package lesson_05;

public class BooleanExample {
    public static void main(String[] args) {
        int x = 10;
        int y =5;

        boolean bol1;
        //bol1 = true;
        //bol1 = false;

        // сравнение на равенство
        bol1 = x == y;
        System.out.println("Pавенство: " + bol1);
        System.out.println("===============");

        bol1 = x == 10;
        System.out.println("Pавенство 10: " + bol1);
        System.out.println("===============");

        // сравнение на неравенство

        boolean bol2 = x != y;
        System.out.println("Неравенство: " + bol2);
        System.out.println("===============");

        bol2 = 10 != x;
        System.out.println("Неравенство: " + bol2);
        System.out.println("===============");



        // сравнение на больше чем

        boolean bol3 = x > y;
        System.out.println("x > y: " + bol3);
        System.out.println("===============");

        bol3 = x > 10;
        System.out.println("x > 10: " + bol3);
        System.out.println("===============");

        boolean bol4 = x >= y;
        System.out.println("x >= y: " + bol4);
        System.out.println("===============");

        bol4 = x >= 10;
        System.out.println("x >= 10: " + bol4);
        System.out.println("===============");

        // меньше чем <=

        boolean bol5 = x < y;
        System.out.println("x < y: " + bol5);
        System.out.println("===============");

        // <= меньше или равно

        bol5 = x <= 10;
        System.out.println("x <= 10: " + bol5);
        System.out.println("===============");

        // ! логическое отрицание - меняет значение на противополоное
        boolean bol6 = true;
        System.out.println("!true: " + bol6);
        bol6 = !true;
        System.out.println("!false: " + !false);
        System.out.println("===============");

        System.out.println("! (4==5) -> " + !(4==5));
        System.out.println("===============");

        // & логический оператор "и" возваращает true если все утверждения верны
        boolean bol7 = (2 < 5) & (11 == 10);
        System.out.println("& (2 < 5) & (11 == 10) : " + bol7);
        System.out.println("===============");

        bol7 = (2 < 5) & (11 != 10);
        System.out.println("& (2 < 5) & (11 != 10) : " + bol7);
        System.out.println("===============");

        // | возвращает тру если хотябы одна часть выражения правдива

        boolean bol8 = (2 < 5) | (11 == 10);
        System.out.println("(2 < 5) | (11 == 10) : " + bol8);
        System.out.println("===============");
        bol8 = (2 > 5) | (11 == 10);
        System.out.println("(2 > 5) | (11 == 10) : " + bol8);
        System.out.println("===============");











    }
}

package lesson_06;

public class BooleanExample_2 {
    public static void main(String[] args) {
        boolean bl = true ^ false;
        System.out.println("true ^ false: " + bl);
        System.out.println("false ^ true: " + (false ^ true));
        System.out.println(" true ^ true: " + (true ^ true));
        System.out.println("false ^ false: " + (false ^ false));

        int a = 5;
        int b = 10;

        //a = 0;
        a= 1;

        boolean b2 = (a != 0) && (b / a > 5); // если в левой стороне будет false то неважно что будет с правой стороны
        System.out.println("(a != 0) && (b / a > 5): " + b2);

        // Логиское сокращенное ИЛИ || (OR)

        boolean b3 = (a == 0) || (b / a > 5);

        System.out.println("(a == 0) || (b / a > 5): " + b3);
        System.out.println("=======================");

        System.out.println(true ^ true & false);

        // Порядок выполнения логических операций

        /*
        1 - !;
        2 - &;
        3 - ^;
        4 - |;
        5 - &&;
        6 - ||;
         */

        System.out.println("==================================\n");

        boolean aa = true;
        boolean bb = false;
        int cc = 25;
        int qq = 2;

        System.out.println(aa | bb | cc < 100 & !aa ^ qq == 5);
        System.out.println(true | false | 25 < 100 & !true ^ 2 == 5);
        System.out.println(true | false | true & !true ^ false);
        System.out.println(true | false | true & false ^ false);
        System.out.println(true | false | false ^ false);
        System.out.println(true | false | false);
        System.out.println(true | false);
        System.out.println(true);
        System.out.println("===========================");








    }
}

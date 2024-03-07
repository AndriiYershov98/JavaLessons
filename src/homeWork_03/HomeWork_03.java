package homeWork_03;

public class HomeWork_03 {
    public static void main(String[] args) {
        // Задание 0

        System.out.println("===============");
        String name = "Andrii Yershov";

        int age = 25;

        double price = 1.49;


        System.out.println(name + "\n" + age + "\n" + price);
        System.out.println("===============");

        // Задание 1

        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int e = 4;
        int f = 5;
        int g = 6;
        int h = 7;
        int i = 8;
        int j = 9;

        int summ = (a + b + c + d + e + f + g + h + i + j) / 10;
        System.out.println("Среднее арифметическое чисел: " +  summ);
        System.out.println("===============");

        // Задание 2

        double A = 1000;
        double B = 500;
        int discount = 10;

        System.out.println("Цена со скидкой: " + ((A+B)-(A+B) * discount / 100));
        System.out.println("===============");

        // Задание 3

        int monday = 4;
        int tuesday = 4;
        int wednesday = 4;
        int thursday = 5;
        int friday = 5;
        int saturday = 4;
        int sunday = 4;

        double averageTemp = (monday + tuesday + wednesday + thursday + friday + saturday + sunday) / 7;
        System.out.printf("Средняя температура за неделю: %.1f \n" , averageTemp);
        System.out.println("===============");

        // Задание 4

        int digit1 = 4;
        int digit2 = 8;
        int exmap1 = digit1 % 2;
        System.out.println("Остаток от деления на 2: " + exmap1);
        int examp2 = digit2 % 3;
        System.out.println("Остаток от деления на 3: " + examp2);
        System.out.println("===============");

        // Задание 5

        int x = 3;
        x += x++;
        System.out.println(x);



    }
}

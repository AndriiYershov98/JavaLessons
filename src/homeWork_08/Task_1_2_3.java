package homeWork_08;

import java.util.Random;
import java.util.Scanner;

public class Task_1_2_3 {
    public static void main(String[] args) {
        // Задание 1

        int i = 1;

        do {
            if (i % 5 == 0)
            {
                System.out.println(i);
            }
            i++;
        } while (i <= 100);
        System.out.println("===============================");

        // Задание 2

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите числа:");
        String input = scanner.nextLine();

        int sum = 0;
        int j = 0;
        while (j < input.length()) {
            char digitChar = input.charAt(j);
            if (digitChar == '0') {
                break;
            }

            sum += (digitChar - '0');

            j++;


        }

        System.out.println("Сумма введенных чисел: " + sum);
        System.out.println("===============================");


        // Task 2 от преподавателя



        // Задание 3

        /*
        Дан массив целых чисел. *Выберите произвольную длину. Заполните случайными значениями.

            Вывести на экран:

            1. минимальное значение, хранящееся в массиве
            2. максимальное
            3. среднее арифметическое всех значений в массиве
         */
        Random random = new Random();

        int size = random.nextInt(13) + 1;
        int[] arrayNum= new int[size];
        int d = 0;

        while (d < arrayNum.length){
            arrayNum[d] = random.nextInt(1000);
            System.out.print(arrayNum[d] + ", ");
            d++;
        }

        d = 0;
        int min = arrayNum[0];
        while (d < arrayNum.length){
            if (arrayNum[d] < min ) {
                min = arrayNum[d];
            }
            d++;

        }

        System.out.println("Минимальное значение массива: " + min);

        d = 0;
        int max = arrayNum[0];
        while (d < arrayNum.length){
            if (arrayNum[d] > max ) {
                max = arrayNum[d];
            }
            d++;

        }

        System.out.println("Максимальное значение массива: " + max);

        d = 0;
        int mid = 0;
        while (d < arrayNum.length){

            mid += arrayNum[d];
            d++;
        }
        int average = (int) mid / arrayNum.length;
        System.out.println("Среднее арифметическое значение массива: " + average);
        System.out.println("===============================");












    }
}

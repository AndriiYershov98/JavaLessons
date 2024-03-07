package lesson_08;

import java.util.Random;

public class ArraysExample {
    public static void main(String[] args) {
        // обьявление массива

        int[] array;
        int numbers[]; // Альтернативный сопособ обьявление массива. НЕ рекомендуем к использованию.

        // Инициализация массива.

        array = new int[5]; // При ключевом слове new создается массив как обьект в памяти. При инициализации мы должны указать размер массива.
        // 5 - размер массива (Колличество ячеек)

        String[] strings = new String[7]; // Обьявление и инициализация массива
        // Мы создали переменную которая будет хранить ссылку на массив строк
        // Мы создали обьект в памяти (сам обьект будет хранится в Heap)
        // Каждую ячейку массива мы заполнили значениями "по умолчанию"
        // Значения по умолчанию --- для всех числовых типов данных это 0, для плавающих 0.0 в том числе и для char, boolean - false, для всех ссылочных типов значение - null

        // Явная инициализаци массива
        int[] digits = new int[] {56, -98, 14 ,1004 , 1443};
        String[] strings1 = {"Str", "hello", "Java", "JS", "Orange"};

        // Доступ к значениям в ячейках массива осуществляется по индексам

        int value = digits[0]; // в переменную value было записано значение ячейки с индексом 0
        System.out.println("value: " + value);

        System.out.println("В ячейке под номером 2 в массиве strings1 хранится: " + strings1[2]);
        System.out.println("В ячейке под номером 3 в массиве digits хранится: " + digits[3]);
        System.out.println("Мы можем производить с получннеми значения допустимые типы: " + (digits[3] / 2 - 15));

        System.out.println(digits);

        // Размер массива
        int arrayLength = digits.length;
        int i = 0;
        while (i < arrayLength) {
            System.out.print(digits[i] + ", ");
            i++;
        }
        System.out.println();

        System.out.println("array[2]: " + array[2]);
        System.out.println("strings[5]: " + strings[5]); // попытка вызова у null какиз либо методов вызовет исключение(аварийное завершение программы)


        // Изменение значения в ячейке массива

        digits[2] = 5000;
        i = 0;
        while (i < digits.length){
            System.out.print(digits[i] + ", ");
            i++;
        }
        System.out.println(digits[2]);

        // Создать маасив из 10 эдементов и заполните его случайными числами от 0 до 100

        Random random = new Random();
        int[] array1 = new int[10];


        int k = 0;
        while (k < array1.length){
            array1[k] = random.nextInt(101);
            System.out.print(array1[k] + ", ");
            k++;
        }
        System.out.println("]");

        k = 0;
        int min = array1[0];
        while (k < array1.length){
            if (array1[k] < min);
            k++;
        }
        System.out.println("Minimum: " + min);












    }
}

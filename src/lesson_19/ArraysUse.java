package lesson_19;

import lesson_15.Cat;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicStampedReference;

public class ArraysUse {
    public static void main(String[] args) {
        int[] ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};



        String stringArray = Arrays.toString(ints);

        System.out.println(stringArray);
        System.out.println(Arrays.toString(ints));



        // copyOf()
        // Создает массив, указанной длинны при этом копирует элементы из указанного массива

        int[] newInts = Arrays.copyOf(ints, 20);
        System.out.println("copy of Array: " + Arrays.toString(newInts));

        // скопировать диапазон значение старого массива
        int[] intsRange = Arrays.copyOfRange(ints, 2, 7);
        System.out.println("ints Range: " + Arrays.toString(intsRange));

        // Метод заполняющий массив значениями FILL

        int[] fillArray = new int[10];
        Arrays.fill(fillArray, 10);
        System.out.println("fill Array: " + Arrays.toString(fillArray));

        int[] number = {1, 2, 3, 4};
        int[] digits = {1, 2, 3, 4};
        System.out.println(number == digits);

        // Arrays.equals - сравнивает два массива по значениям эдементов
        System.out.println(Arrays.equals(number, digits));

        //deepToString - позволяет получать строковое представление многомерных массивов
        int[][] matrix = new int[8][8];

        System.out.println(Arrays.toString(matrix));

        // Сортировка, поиск, System.arraycopy

    }
}

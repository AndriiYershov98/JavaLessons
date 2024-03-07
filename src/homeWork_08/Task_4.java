package homeWork_08;

public class Task_4 {
    public static void main(String[] args) {
        //Задание 4

        /*
        Дан массив целых чисел. Поменять местами элемент с максимальным и минимальным значением

        Пример:

        { 5, 6, -25, 0, 31, -15 }  ->  { 5, 6, 31, 0, -25, -15}
         */

        int[] arr1 = new int[]{5, 6, -25, 0, 31, -15};
        int i = 0;
        int maxIndx = 0;
        int minIndx = 0;

        while (i < arr1.length){
            if (arr1[i] > arr1[maxIndx]) {
                maxIndx = i;
            }
            if (arr1[i] < arr1[minIndx]){
                minIndx = i;
            }
            i++;
        }

        int replacing = arr1[maxIndx];
        arr1[maxIndx] = arr1[minIndx];
        arr1[minIndx] = replacing;

        System.out.print("[ ");
        i = 0;
        while (i < arr1.length) {
            System.out.print(arr1[i]);
            if (i < arr1.length - 1) {
                System.out.print(", ");
            }
            i++;
        }
        System.out.println(" ]");







    }
}

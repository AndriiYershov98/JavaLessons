package lesson_11;

import java.util.Random;

public class Overloads {
    public static void main(String[] args) {

        // Сигнатура метода
        // Совокупность названия метода и его параметров. Последовотельность параметров важна
        //

        sayHello();
        printNumber(10);
        System.out.println();
        printNumber(5, 12);
        printNumber(6, "ABC");
        System.out.println();

        int[] ints = new int[10];

        printArray1(ints);

        fillArray(ints);

        printArray1(ints);





    }

    public static void printArray1(int[] ints) {
        System.out.print("[");
        for (int i = 0; i < ints.length; i++) {

            System.out.print(ints[i] + ((i < ints.length -1) ? "; " : "]\n"));

        }

    }

    public static void fillArray(int[] ints) {
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(1001);

        }
    }

    public static void printNumber(int start, int end){
    for (int i = start; i <= end; i++) {
        System.out.print(i + " ");
    }
    System.out.println();
}
    //Метод который выводит числа на экран. От 1 до числа N.
    public static void  printNumber(int number) {

        for (int i = 1; i <= number ; i++) {
            System.out.print(i + " ");


        }
    }



    public static void sayHello(){
        System.out.println("Hello");
    }

    public static void  printNumber(int num, String str) {
        for (int i = 1; i <=num ; i++) {
            System.out.print(i + num + str + " ");

        }
    }



public static void fillArray(int secStart, int secEnd){
    for (int i = 0; i <= secEnd; i++) {


    }
}


}

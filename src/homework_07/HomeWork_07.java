package homework_07;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class HomeWork_07 {
    public static void main(String[] args) {

        // Задание 1


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");

        int inpNum = scanner.nextInt();

        switch (inpNum){
            case 1:
                System.out.println("Вы ввели число 1: ");
                break;
            case 2:
                System.out.println("Вы ввели цифру 2: ");
                break;
            case 3:
                System.out.println("Вы ввели цифру 3: ");
                break;
            default:
                System.out.println("Вы ввели неверное число");


        }
        System.out.println("=======================");

        // Задание 2



        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Введите ваш день недели: ");
        int dayInput = scanner1.nextInt();


        switch (dayInput){
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            default:
                System.out.println("Сегодня выходной");
        }
        System.out.println("=======================");


        // Задание 3

        Random random = new Random();

        int childNote = random.nextInt(13);
        int time = 45;

        System.out.println("Получена оценка: " + childNote);

        switch (childNote){
            case 12:
            case 11:
            case 10:
                System.out.println("Ураааа!!!");
                time += 60;
                break;
            case 9:
            case 8:
            case 7:
                System.out.println("Умница: ");
                time += 45;
                break;
            case 6:
            case 5:
            case 4:
                System.out.println("Ничего страшного, старайся больше: ");
                time += 15;
                break;
            case 3:
            case 2:
            case 1:
                System.out.println("Тебе нужно больше учится!!: ");
                time -= 30;
                break;
            default:
                System.out.println("Такой оценки нет: ");

        }

        if (time > 60){
            time = 60;
        } else if (time < 0) {
            time = 0;

        }

        System.out.println("Оставшееся время: " + time + " минут.");
        System.out.println("=======================");

    }
}

package homework_07;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {

//        int count = 5
//
//        while (count < 5){
//            System.out.println("Тело while loop: ");
//            count++;
//        }
//
//        count = 5;
//
//        do {
//            System.out.println("Тело цикла do-while: ");
//            count++;
//
//        } while (count < 5);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слово hello: ");
        String hello = scanner.nextLine();

        while (!hello.equalsIgnoreCase("hello")){
            System.out.println("Введите слово hello: ");
            hello = scanner.nextLine();
        }

        System.out.println("Спасибо, до свидания!");

        String helloDo;
        do {
            System.out.println("Введите hello");
            helloDo = scanner.nextLine();
        } while (!helloDo.equalsIgnoreCase("hello"));
        System.out.println("Спасибо!!");


    }
}

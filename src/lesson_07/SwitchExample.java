package lesson_07;

import java.util.Random;

public class SwitchExample {
    public static void main(String[] args) {

        int x = 8;

        if (x == 5) {

            System.out.println("if x = 5");
        } else if (x == 7){
            System.out.println("if x == 7");
        } else {
            System.out.println("else x имеет другое значение");
        }


        switch (x) {
            case 5:
                System.out.println("swiеch x == 5");
            break;
            case 7:
            case 8:
                System.out.println("switch x == 7");
            break;
            default:
                System.out.println("switch x имеет другое значение");

        }

        System.out.println("===========================");


        Random random = new Random();
        int note = random.nextInt(5) + 1;

        int ammount = 100;
        System.out.println("Получена оценка: " + note);

        //byte, short, char, int
        //Byte, Short, Character, Integer
        // String (начиная с 7й версии Java)
        // Перечесления Enum

        switch (note){
            case 5:
                ammount += 20;
                System.out.println("Ребёнок получает: " + ammount);
                break;
            case 4:
                ammount += 10;
                System.out.println("Ребёнок получает: " + ammount);
                break;
            case 3:
                System.out.println("Ребёнок ничего не получает: " + ammount);
                break;
            case 2:
                ammount -= 20;
                System.out.println("У ребёнка отнимают 20: " + ammount);
                break;
            case 1:
                ammount = 0;
                System.out.println("У ребёнка отнимают всё: " + ammount);
                break;
            default:
                System.out.println("Ребенок не получил оценку");

        }
        System.out.println("Оставшиеся деньги: " + ammount);
        System.out.println("===========================");











    }
}

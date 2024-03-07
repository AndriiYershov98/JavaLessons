package lesson_09;

import java.util.Random;

public class ForLoop {
    public static void main(String[] args) {


       /* for ( <инициализация>;<блок проверок> ;<блок изменения счетчиков> ){
            //тело цикла
        }

        */


        // Распечатать числа от 0 до 10

        int k = 0;
        while (k < 10){
            //то-то делать
            k++;
        }


        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
        //System.out.println(i); // Область видимости переменных только внутри тела и блоков цикла for.

        System.out.println("=====================");
        // 1. Выполняется блок инициализации 1 раз в самом начале.
        // 2. Делается проверка(проверки) условий.
        // 3. Если проверка true выполняется тело цикла. Если false выходим из цикла, тело не выполняется.
        // 4. По окончании выполения тела цикла, переходим в блок изменений.
        // 5. Проверка условий. Если true - выполнаяем тело, по кругу.

        // В цикле for ни один из блоков не явлается обязательным.

//        for (int i = 0 ; ;i++ ){ // Бесконечный цикл
//            System.out.println("Hello " + i);
//        }

        int j =15;

        for (j = 0;j < 20; j++){
            System.out.println(j + " ");
        }
        System.out.println();
        System.out.println(j);

        for (int i = j ;i < 20; i++){
            System.out.println(i + " ");
        }
        System.out.println();

        for (int i = 0; i >=0; i += 10000){ // цикл завершится при выполнении типа int (мы получим отрицательный результат при превышении лимита int)

           // System.out.println(i);
        }


        for (String str = "Hello"; str.length() < 10; str += "$"){
            System.out.println(str);
        }

    // мы можем инициализировать несколько переменных. Проверят составные условия. Изменять несколько переменных в блоке изменений.
        int k1 = 0;

        k1 = 15;

        for (int a =0, f = 1; k1 >= 0 && f < 10; k1--, a = ++a + k1, f++){
            System.out.println(k1 + " : " + a + " :" + f);
        }


        // Создать массив случайной длинны (от 5 до 15) целых случайныъ чисел
        // заполнит массив случайными числами от -50 до 50

        Random random = new Random();
        int size = 5 + random.nextInt(11);
        int[] num = new int[size];

        System.out.print("[");

        for (int i = 0; i < num.length; i++){
            num[i] = (-50 + random.nextInt(101));
            System.out.print(num[i] + ((i < num.length -1) ? ", " : "]\n"));

        }








    }
}

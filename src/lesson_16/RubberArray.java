package lesson_16;

public class RubberArray {


    int[] array;

    int cursor; // Присвоено значение 0

    public RubberArray(){
        array = new int[10];
    }


    void add(int number){
        // Добавлять значение в наш массив



        if (cursor > array.length * 0.9){
            expandArray(); //метод расширяющий массив
        }
        array[cursor] = number;
        cursor++;
    }

    void add(int... ints){
        // ints - я могу с ним обращатся точно так же как с сылкой на массив
        for (int i = 0; i < ints.length; i++) {
            add(ints[i]);
        }


    }

    void expandArray(){
        System.out.println("Expanding Array");
        // Создать новый массив большего размера
        // переписать значения из старого массива в новый
        // перебросить ссылку

        int[] newArray = new int[array.length * 2]; // создаем массив в два раза большем чем предыдущий

        for (int i = 0; i < cursor; i++) {

            newArray[i] = array[i]; // переписываем старый массив в новый

        }

       array = newArray; // переменная array теперь хранит ссылку на новый массив

    }


    public String toString(){
        if (cursor == 0) return "[]";

        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result += array[i] + ((i < cursor - 1) ? ", " : "]");

        }
        return result;
    }

    /*
    1. Динамическое изменение размера массива
    2. Добавлять в массив элементы
    3. Добавлять в массив сразу несколько элементов
    4. Вывод в консоль значений массива
     */


}

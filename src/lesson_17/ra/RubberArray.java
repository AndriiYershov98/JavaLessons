package lesson_17.ra;

public class RubberArray {


   private int[] array;

   private int cursor; // Присвоено значение 0

    public RubberArray(){
        array = new int[10];
    }

    public RubberArray(int[] ints){
        array = new int[ints.length * 2];

        for (int i = 0; i < ints.length; i++) {
            add(ints[i]);

        }



    }


    void add(int number){
        // Добавлять значение в наш массив



        if (cursor > array.length * 0.9){
            expandArray(); //метод расширяющий массив
        }
        array[cursor] = number;
        cursor++;
    }

   public void add(int... ints){
        // ints - я могу с ним обращатся точно так же как с сылкой на массив
        for (int i = 0; i < ints.length; i++) {
            add(ints[i]);
        }


    }

   private void expandArray(){
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


    public int size (){ // текущее колличество элементов в массиве
        return cursor;
    }


    // Возвращение значения по индексу
    public int get(int index){
        if (index >= 0 && index < cursor){
            return array[index];
        } else {
            return Integer.MIN_VALUE;
            //TODO Поправить когда появится больше знаний
        }
    }

    // Поиск элемента по значению (у нас есть значение, нужно узнать есть ли такое значение в массиве)
    public int indexOf(int value){
        // так как мы получаем int в качестве значения а не идекса - проверять нам его не нужно
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) return i;

        }
        return -1;
    }

    public void showCursor(){
        System.out.println(array[cursor -1]);
        System.out.println(array[cursor]);
    }

    // Удаление элемента по индексу

    public int removeFromIndex(int index) {
        //1. проверка
        if (index < 0 && index >= cursor){
            // такого индекса в массиве нет
            return Integer.MIN_VALUE;
        }

        int value = array[index];

        for (int i = index; i < cursor - 1; i++) {
                array[i] = array[i + 1];
        }

        cursor--;

        return value;
    }

    public boolean removeByValue(int value){

        int index = indexOf(value);
        if (index == -1) return false;

        removeFromIndex(index);
        return true;
    }




    /*
    1. Динамическое изменение размера массива
    2. Добавлять в массив элементы
    3. Добавлять в массив сразу несколько элементов
    4. Вывод в консоль значений массива
     */


}

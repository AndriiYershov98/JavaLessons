package lesson_06;

public class IfStatements {
    public static void main(String[] args) {


        // Оператор блок. Определет область видимости переменных

       int x = 10;


        {
            int y = 5;
            x = x + y;
        }





        //x = x + y;
        int y = 25; // Вне зоны видимости блока
        System.out.println("x: " + x);

       // if (условие) если условие равно тогда выдает true
        int num = 11;

       // if (num > 10) System.out.println("X > 10: ");

        if (num > 10) {
            System.out.println("Всем привет");
            System.out.println("Сейчас х больше 10");
        } else if (num > 7){
            System.out.println("Else-If: ");
            System.out.println("x > 7");
        } else {
            System.out.println("Я ушел");
            System.out.println("x !> 10");
        }






        System.out.println("Конец программы");







    }
}

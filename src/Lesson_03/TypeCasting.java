package Lesson_03;

public class TypeCasting {
    public static void main(String[] args) {
// Неявное преобразование
        byte byteV = 123;
        int intV;
        intV = byteV;
        System.out.println(intV);

        double doubleV;
        doubleV = intV;
        System.out.println(doubleV);

// Явное преобразование
        doubleV = 125.65;
        intV = (int) doubleV;
        System.out.println("intV: " + intV);

        int x = 20;
        int y = 7;
        double result;
        result = x / (double) y;
        System.out.println(result);




    }
}


package lesson_04;

public class StringExample {
    public static void main(String[] args) {


        //исчисление длины строки
        String name = "Andrii";
        System.out.println(name.length());
        int length = name.length();
        System.out.println(length);

        //привести в верхний регистр
        System.out.println(name.toUpperCase());
        System.out.println(name);

        //приветсти в нижний регистр
        System.out.println(name.toLowerCase());
        System.out.println("name: " + name);



    }
}

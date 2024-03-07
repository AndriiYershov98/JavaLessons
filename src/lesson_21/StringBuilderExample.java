package lesson_21;

public class StringBuilderExample {

    public static void main(String[] args) {
       // StringBuilder - класс для работы с последовательностью символов
        // в отличии от String обьекты SB можно изменять после их создания.
        // Это делает его особенно полезным в ситуациях,
        // когда нам требуется много операций по изменению строк
        // (Конкатенация, вставка, вырезание...)
        // Существенно уменьшает нашрузку на память и повышает производительность

        StringBuilder sb = new StringBuilder();

        //append - метод добавляет строковое представление типа данных( строка, число, символ) к текущему обьекту

        sb.append("Hello").append(", ").append("World!");
        sb.toString();


        String result = sb.toString();
        System.out.println(result);

        System.out.println(sb.toString());
        sb.insert(3, "JAVA");

        sb.delete(3, 6);
        System.out.println(sb.toString());



        sb.deleteCharAt(3);
        System.out.println(sb.toString());

        sb.reverse();
        System.out.println(sb.toString());

        sb.reverse();
        System.out.println(sb.length());

        sb.setLength(14);
        System.out.println(sb.toString());


        StringBuffer stringBuffer = new StringBuffer();


    }
}

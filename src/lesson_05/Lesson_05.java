package lesson_05;

public class Lesson_05 {
    public static void main(String[] args) {

        String str1 = "One";
        String str2 = " ";
        String str3 = "hello";
        String str4 = "string 4";


        //Варианты конкатенации
        // 1.
        String concatStr = str1 + str2 + str3; // конкатенация строк
        System.out.println(concatStr);
        concatStr = str1 + " " + str3 + " " + "String";
        System.out.println(concatStr);

        // 2 .concat
        String concatStr2 = str1.concat(str3);
        System.out.println(concatStr2);
        concatStr2 = str1.concat(str3).toUpperCase();
        System.out.println(concatStr2);
        concatStr2 = str1.concat(str3);
        concatStr2 = concatStr2.toUpperCase();
        System.out.println(concatStr2);


        String concatsStr3 = str1.concat(str2).concat(str3).concat(" ").concat(str4);
        System.out.println("Concat3: " + concatsStr3);

        // 3 .join
        String concatJoin = String.join("_", str1,str3 ,str4);// Разделитель может быть любым
        System.out.println("ConcatJoin: " + concatJoin);

        int int1 = 1;
        int int2 = 2;
        System.out.println("Сумма: " + (int1 + int2));
        System.out.println(int1 + int2 + " Сумма: " + int1 + int2);

        int age = 26;


        System.out.println("My age: " + age);
        System.out.println("=====================");


        String digits = "0123456789";// символы всегда начинаются с 0
        System.out.println("Длина строки: " + digits.length());

        // Взятие символа по его порядковому номеру

        int len = digits.length();
        System.out.println("String length: " + len);

        char firstChar = digits.charAt(0);
        digits = "eqreqrgtreqweqwqG";
        System.out.println("firstChar" + firstChar);
        char lastChar = digits.charAt(digits.length() - 1);
        System.out.println("lastChar: " + lastChar);

        //Выделение подстроки из строки

        String subString = digits.substring(5);
        System.out.println("subString: " + subString);
        System.out.println(digits); // digits остается не изменённым
        subString = digits.substring(5, 8);
        System.out.println("substring: " + subString);

        // Index вхождения
        digits = "0123456789-10";
        // ищет индекс с начала строки если оно встречается единожды
        int index = digits.indexOf('4');
        System.out.println("index: " + index);
        index = digits.indexOf("45");
        System.out.println("index: " + index);
        index = digits.indexOf("1");
        System.out.println("indexOf1: " + index);
        index = digits.lastIndexOf("1"); // ищет индекс с конца строки
        System.out.println("indexOf1: " + index);

        boolean isContains = digits.contains("01");
        System.out.println(isContains);

        System.out.println("====================");

        String target = "abcabeabd";
        // заменяем подстроку
        String output = target.replace("ab", "_"); //если не было найдено таргета то ничего изменено не будет
        System.out.println("outPut: " + output);
        output = target.replaceFirst("ab", "AB"); // заменяет только первое значение
        System.out.println("outPut: " + output);
        output = target.replaceAll("ab", "AB");
        System.out.println("outPut1: " + output);

        System.out.println("====================");














    }
}

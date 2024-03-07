package homeWork_14;

public class Task_0 {
    public static void main(String[] args) {
String testString = "dwHADjwKAHKJDHwkjadwa21314 -321+ !";
        System.out.println(testString);
        System.out.println(stringUpperCase(testString));





    }


    public static String stringUpperCase(String string) {
        if (string == null) return null;
        String var2 = "";

        char[] chars = string.toCharArray(); // Преобразование строки в массив char
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z'){
                chars[i] = (char) (chars[i] - 32);
            }



        }
        // return new String.valueOf(chars);
        if (true) return new String(chars); // Формируем строку из массива char.

        for (int i = 0; i < string.length(); i++) {
            char forThisChar = string.charAt(i);

            if (forThisChar >= 97 && forThisChar <= 122){
                var2 += String.valueOf((char) (forThisChar -32));
            } else {
                var2 += String.valueOf(forThisChar);
            }

        }
            return var2;
    }






}

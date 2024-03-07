package homeWork_12;

public class Task_1 {
    public static void main(String[] args) {
     String[] strings = {"One", "Java", "Python", null, "Kotlin", "JS" };

        String[] res = arraSmallLongStrings(strings);


        System.out.println("=== null in array =======");

        String[] testArray = null;
        res = arraSmallLongStrings(testArray);
        printArray(res);

        System.out.println("=== null in array =======");
        testArray = new String[]{"One", "Java", "Python", null, "Butterfly", "JS" };
        res = arraSmallLongStrings(testArray);
        printArray(res);

    }


 // Проверить а существует ли обьект масиива = ли он NULL.
  // Найти строку с найменьшей и с найбольшей строкой.
    // Создать массив из 2х строк. Записать туда найденные строки
    public static String[] arraSmallLongStrings(String[] strings){

        if (strings == null){
            return new String[2];
        }
        String minLength = notNullValue(strings);
        String maxLength = minLength;

        for (int i = 0; i < strings.length; i++) {
            if (strings[i]!= null && minLength != null && minLength.length() > strings[i].length()){
                minLength = strings[i];

            }
            if (strings[i] != null && maxLength != null && maxLength.length() < strings[i].length()){

            }

        }

        return new String[]{minLength, maxLength};

    }

    private static String notNullValue(String[] strings) {
        String res = null;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null){
                return strings[i];
            }
        }
        return null;
    }

    public static void  printArray(String[] strings){
        System.out.print("[ ");
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ((i < strings.length -1) ? "; " : " ]\n"));


        }
    }

}

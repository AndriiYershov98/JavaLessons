package homeWork_08;

public class Task_5 {
    public static void main(String[] args) {
        /*
        Дан массив строк. Вывести на экран все символы из самой длинной строки массива

            { “One”, “Two”, “Twenty” } -->

            T
            w
            e
            n
            t
            y
         */
    String[] arrayStrings = new String[]{"One", "Two", "Twenty"};
        int i = 1;
    String maxStr = arrayStrings[0];

    while (i < arrayStrings.length){
        if (arrayStrings[i].length() > maxStr.length()){
            maxStr = arrayStrings[i];
        }
        i++;
    }

        System.out.println("Самое большое значение массива у строки: " + maxStr);
    int x = 0;
    while (x < maxStr.length()){
        System.out.println(maxStr.charAt(x));
        x++;
    }








    }
}

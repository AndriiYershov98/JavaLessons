package homeWork_19;

public class SearchEngine {

    public static void main(String[] args) {

    }





    public int searchString(String[] strings, String findStr) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(findStr)){
                return i;
            }

        }
        return -1;
    }




}

package homeWork_14;

public class Task_3 {
    public static void main(String[] args) {
        String[] strings = {"Java", "Python", "JS", "hello"};
                System.out.println(searchString(strings, "Java"));



    }


    public static int searchString(String[] strings, String findMe){
        if (strings == null || findMe == null) return -1;

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(findMe)) return i;
        }
        return -1;
    }
}

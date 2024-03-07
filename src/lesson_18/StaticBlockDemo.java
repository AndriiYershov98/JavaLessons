package lesson_18;

public class StaticBlockDemo {
    private static String[] colours;
    private static int number = 10;



    private String title = "Str1";

    static {
        System.out.println("Static init block start!");
        colours = new String[3];
        colours[0] = "Red";
        colours[1] = "Yellow";
        colours[2] = "Cyan";
    }

    {
        System.out.println("Non static init block!");
    }

    static {
        System.out.println("Second static!");
    }
    public StaticBlockDemo(){
        System.out.println("Constructor start!");
    }

public void printColours() {
    for (int i = 0; i < colours.length; i++) {
        System.out.println(colours[i]);

    }
}



}

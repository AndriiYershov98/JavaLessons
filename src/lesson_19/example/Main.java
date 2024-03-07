package lesson_19.example;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();

        Test.setTest(10000);
        System.out.println(test.getTest());

    }
}

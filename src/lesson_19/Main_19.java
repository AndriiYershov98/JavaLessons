package lesson_19;

public class Main_19 {
    public static void main(String[] args) {
        FinalExamples finalExamples = new FinalExamples(15);

        finalExamples.printArray();

        finalExamples.setNewValues();
        finalExamples.printArray();

        System.out.println(FinalExamples.PI); // констатанты не изменяемы

        FinalExamples.INTS[0] = 150;



    }

}

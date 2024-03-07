package lesson_17.ra;

public class ArrayTest {
    public static void main(String[] args) {
        RubberArray ra = new RubberArray();

        ra.add(10, 15, -6, 41, -16, 99, 0, 15);

        System.out.println(ra.toString());

        System.out.println("size: " + ra.size());
        System.out.println(ra.get(8));

        int[] ints = {10, 56, -53, 0, 1, 77, 43};
        RubberArray rubberArray = new RubberArray(ints);
        System.out.println("array from array: " + rubberArray.toString());
        System.out.println(rubberArray.indexOf(-53));
        System.out.println(rubberArray.indexOf(500000000));

        rubberArray.showCursor();

        rubberArray.removeFromIndex(2);
        System.out.println(rubberArray.toString());


        rubberArray.showCursor();


        System.out.println(rubberArray.removeByValue(77));




    }
}

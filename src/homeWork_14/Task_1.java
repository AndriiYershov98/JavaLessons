package homeWork_14;

public class Task_1 {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6};

        printArray(numbers);
        change(numbers, 1, 5);
        printArray(numbers);
    }

    public static void  change (int[] ints, int idx1, int idx2) {
        if (ints == null || idx1 < 0 || idx1 >= ints.length || idx2 < 0 || idx2 >= ints.length);
        // оператор return мгновенно прекращает работу метода.
        int temp = ints[idx2];
        ints[idx1] = ints[idx2];
        ints[idx2] = temp;


    }
    public static void printArray(int[] ints) {
        System.out.print("[ ");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + ((i < ints.length - 1) ? "; " : " ]\n"));


        }
    }
}

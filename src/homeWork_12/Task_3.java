package homeWork_12;

public class Task_3 {
    public static void main(String[] args) {
        int[] testArray = {0, 1, 2, 3, 4, 5, 6};

        copyOfArray(testArray, 10);


    }

    public static void copyOfArray(int[] ints, int newLength) {
        int[] result = new int[newLength];


        for (int i = 0; i < ints.length && i < ints.length; i++) {
            result[i] = ints[i];
        }
        printArray(result);

    }

    public static void printArray(int[] ints) {
        System.out.print("[ ");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + ((i < ints.length - 1) ? "; " : " ]\n"));


        }
    }
}

package homeWork_12;

public class Task_2 {
    public static void main(String[] args) {
    int[] ints = {0, 13, -25, 11, 31, 55, 98, 11, 5};
    int[] primeVal = arrayPrimeOnly(ints);
        printArray(primeVal);
        primeVal = arrayPrimeOnly(ints);
        printArray(primeVal);

    }

    public static boolean isPrime(int number){
         if (number <= 1) return false;
        if (number == 2 || number == 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;

            for (int i = 5; i <= Math.sqrt(number); i+= 6) {
            if (number % i == 0 || number % (i + 2) == 0){

            }

            }
        return false;
    }
    public static int[] arrayPrimeOnly(int[] ints){
        if (ints == null) return new int[0];
        int counter = 0;
        for (int i = 0; i < ints.length; i++) {
            if (isPrime(ints[i])){
                counter++;
            }

        }

        int[] result = new int[counter];

        for (int i = 0, k = 0; i < ints.length; i++) {
            if (isPrime(ints[i])){
                result[k] = ints[i];
                k++;
            }
        }
        return result;
    }
    public static void  printArray(int[] ints){
        System.out.print("[ ");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + ((i < ints.length -1) ? "; " : " ]\n"));


        }
    }
}

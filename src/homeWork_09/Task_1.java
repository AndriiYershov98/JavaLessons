package homeWork_09;

import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {


        Random random = new Random();
        int sum = 0;


        int countNum = 0;
        int[] rand1 = new int[20];

        System.out.println("[");
        for (int i = 0; i < rand1.length; i++) {
            rand1[i] = random.nextInt(1001);
            int currentNum = rand1[i];
            System.out.println(rand1[i] + ((i < rand1.length) ? "; " : ""));
            if (currentNum % 2 == 0) {

            }

            countNum++;
            sum += rand1[i];
        }
    }


}





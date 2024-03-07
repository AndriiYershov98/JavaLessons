package lesson_18;

public class MathUnils {

    public static int sumOfInts(int num, int...nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

        }
        return sum;
    }

}

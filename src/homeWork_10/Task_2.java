package homeWork_10;

public class Task_2 {
    public static void main(String[] args) {
        addPow(64);
    }

    public static void  addPow(int pow){
        int subPow = (pow > 0) ? pow : pow * -1;
        int res = 1;

        for (int i = 0; i < subPow; i++) {
            res *= 2;
        }
        if (pow >= 0){
            System.out.println(res);
        } else {
            System.out.printf("1/%d\n", res);
            System.out.printf("%.2f\n", (double) 1 / res);
        }
    }







}

package homework_07;

public class Task_4 {
    public static void main(String[] args) {
        int i = 1; // счетчики цикла называют любой буквой латинского алфавита

        int numCount = 0;

        while (i <= 100 && numCount < 7){
            if ( i % 5 == 0){
                System.out.println(i);
                numCount++;
            }

//            System.out.println(i);
            i++;
        }
    }
}

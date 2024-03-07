package lesson_10;

public class MethodsExample2 {
    public static void main(String[] args) {
    sayHello();

    char ch = 'A';



    }

    public static void  sayHello (){
        int x = 5;
        int y = 10;
        int z = x + y;
        System.out.println("Hello");
        System.out.println(z);
    }

public static void printArray(int array1){
        int[] array = {1, 45, 76, 37, 90, 5432, 397, 0, 45};
        System.out.print("[");
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] +((i < array.length -1 ) ? ", " : "] " ));

        }

}
public static void  changeVar(int number){
        number = number + 15;
    System.out.println("number from method");
}


}

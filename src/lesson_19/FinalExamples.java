package lesson_19;

public class FinalExamples {

    private final int x;
    private final int[] ints;
    public static final double PI = 3.141519;

    public static final int[] INTS = new int[10]; // массив не является константой так как значение элементов обьекта внутри можно изменить


    public FinalExamples(int x) {
        ints = new int[10];
        this.x = x;
    }


    public void setX(int newValue) {
//        this.x = newValue; // оператор final может инициализировать значение только 1 раз, изменить значение в этой переменной нельзя


    }



public void setNewSize(int size){
//        ints = new int[size]; нельзя переписать ссылку для final переменой ссылочного типа
 }


 public void setNewValues(){
     for (int i = 0; i < ints.length; i++) {
         ints[i] = i * 10 * (int)PI;

     }
 }


 public void printArray() {
     System.out.print("[");
     for (int i = 0; i < ints.length; i++) {
         System.out.print((ints[i]) + ((i < ints.length -1) ? ", " : "]\n"));

     }
 }




}

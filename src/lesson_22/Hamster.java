package lesson_22;

public class Hamster extends Animal{


    @Override // Аннотация.
    public void voice() {
        System.out.println("Hamster squeaks!");

    }

    public void voice(String string){
        System.out.println("Hamster squeaks: " + string);
    }

    @Override // переопределяем метод toString класса Object
    public String toString() {
        return "Hamster";
    }
}

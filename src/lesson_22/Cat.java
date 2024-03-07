package lesson_22;

public class Cat extends Animal{


    @Override
    public void voice() {
        System.out.println("Cat said Meow!");
    }

    public void eat() {
        System.out.println("Cat is eating!");
    }
}

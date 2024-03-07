package lesson_22;

public class AnimalsMain {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.voice();

        Cat cat = new Cat();
        cat.voice();

        Dog dog = new Dog();
        dog.voice();

        Hamster hamster = new Hamster();
        hamster.voice();

        // Переопределение мотодов - процесс в котором подкласс предоставляют
        // @Override Method
        // Статический полиморфизм (компиляционный) - перегрузка методов


        System.out.println(animal);
        System.out.println(hamster);




    }
}

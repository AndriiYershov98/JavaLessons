package lesson_16;

public class Lesson_16 {
    public static void main(String[] args) {

        Cat emptyCat = new Cat();
        emptyCat.whoAmI();

        Cat cat = new Cat("Max");

        Cat cat1 = new Cat("Bear", "black");

        cat1.whoAmI();

        Cat cat2 = new Cat("Freddy", "white", 5);
        cat2.whoAmI();

        System.out.println("============================");



        Dog dog = new Dog("Пирожок", 11);
        dog.run();

        System.out.println(dog.whoAmI());

        Dog dog1 = new Dog("Чебурек", 9);
        dog1.eat();
        dog1.eat();
        dog1.run();

        System.out.println(dog1.whoAmI());

        Dog dog2 = new Dog("Колобок", 21);
        dog1.run();

        System.out.println(dog2.whoAmI());

        Dog dog3 = new Dog("Бисквит", 7);
        dog3.run();
        dog3.run();
        dog3.run();
        dog3.run();
        System.out.println(dog3.whoAmI());


    }
}

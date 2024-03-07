package lesson_22;

public class Casting {

    // Восходящее преобразование (UpCasting) и низходящее (DownCasting)
    public static void main(String[] args) {

        Animal animal = new Hamster();
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        Animal[] animals = new Animal[3];
        animals[0] = animal;
        animals[1] = animal1;
        animals[2] = animal2;


        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Cat) {
                System.out.println(animals[i] + "Can be downcasted to Cat");

                Cat catTest = (Cat) animals[i];
                catTest.eat();
            } else {
                System.out.println(animals[i] + "Cannot be downcasted to Cat");
            }
            System.out.println(animals[i]);
            animals[i].voice();

            System.out.println("================================");
        }

        Cat cat1 = (Cat) animal2;
        cat1.voice();
        cat1.eat();

    }
}

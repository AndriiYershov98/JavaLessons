package homeWork_18;

public class DogMain {
    public static void main(String[] args) {

        Dog dog = new Dog("Bone", 50);
        dog.info();

        dog.takeBarrier(30);

        System.out.println("dog.takeBarrier(30): " + dog.takeBarrier(30));
        System.out.println("dog.takeBarrier(70): " + dog.takeBarrier(70));
        System.out.println("dog.takeBarrier(120): " + dog.takeBarrier(120));


        System.out.println("============================");


        Dog dog1 = new Dog("Bim", 44);
        dog1.info();
        System.out.println(dog1.takeBarrier(85));


    }
}

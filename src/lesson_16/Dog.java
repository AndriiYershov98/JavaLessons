package lesson_16;

public class Dog {
    String name;
    int weight;


    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    void eat(){
        System.out.println("I'm eating tasty bone");
        weight++;
    }

    void run(){
        System.out.println("I'm running");
        weight -= 2;

        while (weight < 3){
            System.out.println("Soory i'm too hungry for running");
            System.out.println("My weight is: " + weight + ". I need to eat");
            eat();
        }


    }

    String whoAmI(){
        return "I'm Dog: " + this.name + "  my weight is: " + weight;
    }

}

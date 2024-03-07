package lesson_24.transport;

public class Airplane extends Transport implements Flyable{
    public Airplane(int capacity) {
        super(capacity);
    }









    @Override
    void takePassenger() {
        System.out.println("Самолёт берет на борт пассажиров");
    }


    @Override
    public void fly() {
        System.out.println("Самолет летит с пассажирами");
    }
}

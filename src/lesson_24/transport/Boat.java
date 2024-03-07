package lesson_24.transport;

public class Boat extends Transport implements Sailable{
    public Boat(int capacity) {
        super(capacity);
    }

    @Override
    void takePassenger() {
        System.out.println("Корабль берет пассажиров на борт");

    }

    @Override
    public void sail() {
        System.out.println("Корабль идёт с пассажирами");
    }
}

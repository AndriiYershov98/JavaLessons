package lesson_24.transport;

public class Duck implements Flyable, Sailable{


    public String getColor() {
        return color;
    }

    public Duck(String colour) {
        this.color = colour;
    }

    private String color;

    @Override
    public void fly() {
        System.out.println("Утка " + color + " летит");
    }

    @Override
    public void sail() {
        System.out.println(color + " утка плывёт по озеру");
    }
}

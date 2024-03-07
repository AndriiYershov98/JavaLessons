package lesson_21;

public class Passenger {
    private String name;

    private static int counterId;
    private final int id;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public Passenger(String name) {
        this.name = name;
        this.id = ++counterId;
    }

    public int getId() {
        return id;
    }

    public String toString(){
        return name;
    }
}

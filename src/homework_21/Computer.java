package homework_21;

public class Computer {

    private String model;
    private Proccesor proccesor;
    private Memory  memory;
    private Storage storage;

    public Computer(String model) {
        this.model = model;
        proccesor = new Proccesor("AMD", "Ryzen-7", 3800);
        memory = new Memory("HyperX", "X-treme", 16000);
        storage = new Storage("Samsung", "Pro EVO", 2000);

    }



//    public String toString(){
//
//    }

    public static void main(String[] args) {
        Computer computer = new Computer("Horizon");
        System.out.println(computer.toString());
    }
}

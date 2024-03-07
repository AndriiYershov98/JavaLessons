package lesson_20;

public class Train extends Vehicle{ // обязательна связь IS-A

    public int getWagonCounter() {
        return wagonCounter;
    }

    public void setWagonCounter(int wagonCounter) {
        this.wagonCounter = wagonCounter;
    }

    private int wagonCounter;

    public Train(String model, int manufacturingYear, int wagonCounter) {
        super(model, manufacturingYear);
        this.wagonCounter = wagonCounter;
    }
}

package lesson_20;

public class Bus extends Vehicle{

  private int capacity;
  private int passengerCount; // колличество пассажиров в автобусе в настоящий момент

  private int totalPassengerCounter; // общее количество пассажиров перевезённых конкретным автобусом

    public int getTotalPassengerCounter() {
        return totalPassengerCounter;
    }

    public Bus(String model, int manufacturingYear, int capacity) {
        super(model, manufacturingYear); // вызовк конструктора родителя
        System.out.println("Bus constructor started");
        this.capacity = capacity;

    }

    public boolean takePassengers() {
        if (passengerCount < capacity) {
            passengerCount++;
            System.out.println("Passenger entered the bus " + this.getModel());
            return true;
        }
        System.out.println("Bus is overloaded");
        return false;
    }

    public void getOutPassenger() {
        if (passengerCount > 0) {
            passengerCount--;
            System.out.println("Passenger left the bus" + this.getModel());
        } else {
            System.out.println("Bus is empty - there's no passengers inside");
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        //TODO проверять есть ли лишние пассажиры в автобусе
        this.capacity = capacity;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }
}

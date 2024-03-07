package lesson_20;

public class SpecialBus extends Bus{
    public int example(){
        return super.getCapacity();
    }


    private int bicyclePlaces;

    private int bicyclesCount; // по дефолту инициализируется 0

    public int getBicyclePlaces() {
        return bicyclePlaces;
    }

    public int getBicyclesCount() {
        return bicyclesCount;
    }

   public boolean takePassengerWithBicycle(){


       if (bicyclesCount < bicyclePlaces && takePassengers()) {
           boolean isPassengerEntered = takePassengers();
            if (isPassengerEntered) {
                bicyclesCount++;
                System.out.println("Passenger and bicycle got their places: " + getModel());
                return true;
            }
        }
       System.out.println("Passenger and bicycle cannot sit, the bus is overloaded: " + getModel());
        return false;
   }

    public SpecialBus(String model, int manufacturingYear, int capacity, int bicyclePlaces) {
        super(model, manufacturingYear, capacity);
        this.bicyclePlaces = bicyclePlaces;
    }
    public void takePassengersWithBicycle(){

    }

}

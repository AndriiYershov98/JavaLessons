package lesson_21;

public class AutoParkMain {
    public static void main(String[] args) {
        BusDriver busDriver = new BusDriver("RZ-1354531");
        Autobus bus = new Autobus(busDriver, 25);
        System.out.println(bus.toString());
        BusDriver busDriver1 = new BusDriver("BT-3121575");
        bus.setDriver(busDriver1);

        System.out.println(bus.toString());

        System.out.println("==========================");

        Passenger passenger = new Passenger("John");
        Passenger passenger1 = new Passenger("Margot");
        Passenger passenger2 = new Passenger("Peter");
        Passenger passenger3 = new Passenger("Hanna");
        Passenger passenger4 = new Passenger("Sebastian");


        bus.takePassenger(passenger);
        bus.takePassenger(passenger1);
        bus.takePassenger(passenger2);
        bus.takePassenger(passenger3);
        bus.takePassenger(passenger4);
        bus.takePassenger( new Passenger("Test"));

        System.out.println("==========================");
        System.out.println(bus.getStringPassengersList());

        System.out.println(bus.toString());

    }
}

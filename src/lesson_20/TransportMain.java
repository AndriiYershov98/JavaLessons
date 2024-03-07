package lesson_20;

import java.sql.SQLOutput;

public class TransportMain {
    public static void main(String[] args) {


        Vehicle vehicle = new Vehicle("Cart", 1910);
        System.out.println(vehicle.toString());
        vehicle.drive();
        vehicle.stop();

        System.out.println("==========================");


        Bus bus = new Bus("Man", 2020, 3);
        System.out.println(bus.toString());
        bus.drive();
        bus.stop();

        System.out.println("Bus, getCapacity: " + bus.getCapacity());

        System.out.println("==============================");


        bus.getOutPassenger();
        bus.takePassengers();
        bus.takePassengers();
        bus.takePassengers();
        System.out.println("bus.getPassengerCount(): " + bus.getPassengerCount());
        bus.takePassengers();


        System.out.println("==============================");

        Train train = new Train("ICE-1046", 2024, 3);

        train.drive();
        train.stop();

        System.out.println(train.getWagonCounter());


        System.out.println("==============================");

        SpecialBus specialBus = new SpecialBus("Icarus", 1978, 30, 3);
        specialBus.drive();
        specialBus.stop();
        System.out.println(specialBus.toString());

        specialBus.takePassengers();
        specialBus.getOutPassenger();
        specialBus.getOutPassenger();

        System.out.println(specialBus.example());


    }
}

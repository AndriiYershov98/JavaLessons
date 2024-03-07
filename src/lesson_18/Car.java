package lesson_18;

import javax.swing.plaf.PanelUI;

public class Car {
    public static void main(String[] args) {
        Car car = new Car("BMW", 200);

        Car car1 = new Car("VW", 300);
        Car car2 = new Car("AUDI", 75);

        car.info();
        car1.info();
        car2.info();

        System.out.println("Autos created: " + Car.countCar);
    }


    public void info(){
        System.out.println("Car: " + this.model + " | HP: " + horsePower);
    }

   private static int countCar;

    private String model;

    private int horsePower;


    public Car(String model, int horsePower) {
        this.model = model;
        this.horsePower = horsePower;
        countCar++;

    }


public static int getCountCar(){
        return countCar;
}
















}

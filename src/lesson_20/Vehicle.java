package lesson_20;

public class Vehicle {
    private String model;
    private int manufacturingYear;

    public Vehicle(String model, int manufacturingYear) {
        System.out.println("Vehicle constructor started");
        this.model = model;
        this.manufacturingYear = manufacturingYear;
    }

    public String toString(){
        return "Vehicle " + model + "; year: " + manufacturingYear;
    }

    public void drive(){
        System.out.println("Vehile " + model + " started driving");
    }

    public void stop(){
        System.out.println("Vehile " + model + " stopped");
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }
}

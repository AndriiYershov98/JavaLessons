package lesson_21;

public class Autobus {

// для создания связи типа HAS-A мы определяем поле класса которое будет хранить ссылку на обьект другого класса
// Кардинальность связи - определяет, сколько обьектов одного класса
    // может быть ассоциировано с обьектом другого класса.

    private BusDriver driver;
    private AutoPilot autoPilot;

    private int capacity;
    private final Passenger[] passengers; // List of passengers already onboard
    int countPassengers;

    // One-to-Many connection

    public Autobus(BusDriver busDriver, int capacity){
        this.driver = busDriver;
        autoPilot = new AutoPilot("AP-005");
        this.capacity = capacity;
        this.passengers = new Passenger[capacity];
    }

    public boolean takePassenger(Passenger passenger) {
        if (countPassengers < capacity) {
            passengers[countPassengers] = passenger;
            countPassengers++;
            System.out.println(passenger.getName() + " took his sit");
            return true;
        } else {
            System.out.println("No free space left, " + passenger + " cannot be boarded");
            return false;
        }
    }

    public void setDriver(BusDriver driver) {
        this.driver = driver;
    }

    public AutoPilot getAutoPilot(){
        return autoPilot;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("Autobus: { driver: ");
        sb.append(driver.getLicenseNum()).append(" autopilot: ").append(autoPilot.getSoftWareVersion()).append(";");
        sb.append(" passengers: ").append(getStringPassengersList()).append(" }");
        return sb.toString();
    }



    public String getStringPassengersList() {
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] != null) {
                Passenger current = passengers[i];

                sb.append("Passenger: {id: ").append(current.getId()).append("; name: ").append(current.getName()).append("}");
                sb.append("; ");
            }

        }
        if (sb.length() > 1) {
            sb.setLength(sb.length() -2);
        }

        sb.append("}");
        return sb.toString();
    }

}

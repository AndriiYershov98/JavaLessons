package lesson_24.transport;

public class MainApp {
    public static void main(String[] args) {

        Airplane airplane = new Airplane(150);
        Boat boat = new Boat(30);
        Duck duck = new Duck("Yellow");

        Flyable[] flyers = new Flyable[2];
        flyers[0] = airplane;
        flyers[1] = duck;

        for (Flyable flyer : flyers) {
            flyer.fly();

            if (flyer instanceof Airplane) {
                Airplane airplaneCurrent = (Airplane) flyer;
                System.out.println("Вместисомть самолёта: " + airplaneCurrent.getCapacity());
                airplaneCurrent.takePassenger();
            }






        }

        System.out.println("===============================");

        Sailable[] sailables = new Sailable[3];
        sailables[0] = boat;
        sailables[1] = duck;
        sailables[2] = new Duck("Green");

        for (Sailable sailable : sailables) {

            sailable.sail();

            if (sailable instanceof Duck) {
                Duck duck1 = (Duck) sailable;
//                System.out.println("Я утка цвета: " + ((Duck) sailable).getColor());
                System.out.println("Я утка цвета: " + duck1.getColor());
            }

        }










    }
}
